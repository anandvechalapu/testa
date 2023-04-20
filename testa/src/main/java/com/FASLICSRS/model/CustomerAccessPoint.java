package com.FASLICSRS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerAccessPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quotationNumber;
    private String policyNumber;
    private String policyHolderName;
    private String quotationHistory;
    private String policyInvoice;
    private String runningStatement;
    private String policyMembers;
    private String nonMonetaryRequest;
    private String valuationReport;
    private String policyConversion;
    private String claimIntimation;
    private String proofDocuments;

    public CustomerAccessPoint() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuotationNumber() {
        return quotationNumber;
    }

    public void setQuotationNumber(String quotationNumber) {
        this.quotationNumber = quotationNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getQuotationHistory() {
        return quotationHistory;
    }

    public void setQuotationHistory(String quotationHistory) {
        this.quotationHistory = quotationHistory;
    }

    public String getPolicyInvoice() {
        return policyInvoice;
    }

    public void setPolicyInvoice(String policyInvoice) {
        this.policyInvoice = policyInvoice;
    }

    public String getRunningStatement() {
        return runningStatement;
    }

    public void setRunningStatement(String runningStatement) {
        this.runningStatement = runningStatement;
    }

    public String getPolicyMembers() {
        return policyMembers;
    }

    public void setPolicyMembers(String policyMembers) {
        this.policyMembers = policyMembers;
    }

    public String getNonMonetaryRequest() {
        return nonMonetaryRequest;
    }

    public void setNonMonetaryRequest(String nonMonetaryRequest) {
        this.nonMonetaryRequest = nonMonetaryRequest;
    }

    public String getValuationReport() {
        return valuationReport;
    }

    public void setValuationReport(String valuationReport) {
        this.valuationReport = valuationReport;
    }

    public String getPolicyConversion() {
        return policyConversion;
    }

    public void setPolicyConversion(String policyConversion) {
        this.policyConversion = policyConversion;
    }

    public String getClaimIntimation() {
        return claimIntimation;
    }

    public void setClaimIntimation(String claimIntimation) {
        this.claimIntimation = claimIntimation;
    }

    public String getProofDocuments() {
        return proofDocuments;
    }

    public void setProofDocuments(String proofDocuments) {
        this.proofDocuments = proofDocuments;
    }
}