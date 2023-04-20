trigger SurveyTrigger on Survey__c (after insert, before update) {
    Set<Id> surveyIds = new Set<Id>();
    List<Survey__c> surveysToSkip = new List<Survey__c>();
    List<Survey__c> surveysToComplete = new List<Survey__c>();
    
    // Get list of surveys to be processed
    if (Trigger.isInsert) {
        for (Survey__c survey : Trigger.new) {
            if (survey.Status__c == 'Active') {
                surveyIds.add(survey.Id);
            }
        }
    } else if (Trigger.isUpdate) {
        for (Survey__c survey : Trigger.new) {
            if (survey.Status__c == 'Active' &&
                Trigger.oldMap.get(survey.Id).Status__c != 'Active') {
                surveyIds.add(survey.Id);
            }
        }
    }
    
    // Get list of users for surveys
    if (!surveyIds.isEmpty()) {
        List<Survey_Participant__c> surveyParticipants = [
            SELECT Id, Survey__c, User__c, Completed__c, Skip__c
            FROM Survey_Participant__c
            WHERE Survey__c IN :surveyIds
        ];
        
        // Get list of surveys to skip/complete
        for (Survey_Participant__c participant : surveyParticipants) {
            if (participant.Skip__c) {
                surveysToSkip.add(new Survey__c(Id = participant.Survey__c));
            } else if (participant.Completed__c) {
                surveysToComplete.add(new Survey__c(Id = participant.Survey__c));
            }
        }
    }
    
    // Skip surveys
    if (!surveysToSkip.isEmpty()) {
        update surveysToSkip;
    }
    
    // Complete surveys
    if (!surveysToComplete.isEmpty()) {
        update surveysToComplete;
    }
    
    // Generate report
    if (!surveyIds.isEmpty()) {
        Survey_Report_Generator.generateReport();
    }
}