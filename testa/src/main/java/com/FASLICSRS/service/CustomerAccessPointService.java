package com.FASLICSRS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FASLICSRS.model.CustomerAccessPoint;
import com.FASLICSRS.repository.CustomerAccessPointRepository;

@Service
public class CustomerAccessPointService {

    @Autowired
    private CustomerAccessPointRepository customerAccessPointRepository;

    public void acceptQuotation() {
        customerAccessPointRepository.acceptQuotation();
    }

    public void viewQuotationHistory() {
        customerAccessPointRepository.viewQuotationHistory();
    }

    public void downloadInvoice() {
        customerAccessPointRepository.downloadInvoice();
    }

    public void viewRunningStatement() {
        customerAccessPointRepository.viewRunningStatement();
    }

    public void addOrDeleteMembers() {
        customerAccessPointRepository.addOrDeleteMembers();
    }

    public void raiseNonMonetaryRequest() {
        customerAccessPointRepository.raiseNonMonetaryRequest();
    }

    public void generateValuationReport() {
        customerAccessPointRepository.generateValuationReport();
    }

    public void requestConversion() {
        customerAccessPointRepository.requestConversion();
    }

    public void intimateClaim() {
        customerAccessPointRepository.intimateClaim();
    }

    public void uploadProofDocuments() {
        customerAccessPointRepository.uploadProofDocuments();
    }

    public List<CustomerAccessPoint> getAllCustomerAccessPoints() {
        return customerAccessPointRepository.findAll();
    }
}