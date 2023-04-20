package com.FASLICSRS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FASLICSRS.model.CustomerAccessPoint;

@Repository
public interface CustomerAccessPointRepository extends JpaRepository<CustomerAccessPoint, Long> {
    //Method to accept the quotation provided by the insurer
    void acceptQuotation();

    //Method to view the history of quotations received by the customer
    void viewQuotationHistory();

    //Method to download policy bond and GST invoice
    void downloadInvoice();

    //Method to view running statement
    void viewRunningStatement();

    //Method to add or delete members from policy
    void addOrDeleteMembers();

    //Method to raise non-monetary policy service requests
    void raiseNonMonetaryRequest();

    //Method to generate AS-15 valuation report
    void generateValuationReport();

    //Method to request policy conversion
    void requestConversion();

    //Method to intimate claim
    void intimateClaim();

    //Method to upload proof of documents
    void uploadProofDocuments();
}