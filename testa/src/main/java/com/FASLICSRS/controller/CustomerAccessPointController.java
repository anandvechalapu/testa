package com.FASLICSRS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FASLICSRS.model.CustomerAccessPoint;
import com.FASLICSRS.service.CustomerAccessPointService;

@RestController
@RequestMapping("/api/accesspoint")
public class CustomerAccessPointController {

    @Autowired
    private CustomerAccessPointService customerAccessPointService;

    @PostMapping("/accept")
    public void acceptQuotation() {
        customerAccessPointService.acceptQuotation();
    }

    @GetMapping("/history")
    public void viewQuotationHistory() {
        customerAccessPointService.viewQuotationHistory();
    }

    @GetMapping("/invoice")
    public void downloadInvoice() {
        customerAccessPointService.downloadInvoice();
    }

    @GetMapping("/statement")
    public void viewRunningStatement() {
        customerAccessPointService.viewRunningStatement();
    }

    @PostMapping("/members")
    public void addOrDeleteMembers() {
        customerAccessPointService.addOrDeleteMembers();
    }

    @PostMapping("/request")
    public void raiseNonMonetaryRequest() {
        customerAccessPointService.raiseNonMonetaryRequest();
    }

    @GetMapping("/report")
    public void generateValuationReport() {
        customerAccessPointService.generateValuationReport();
    }

    @PostMapping("/conversion")
    public void requestConversion() {
        customerAccessPointService.requestConversion();
    }

    @PostMapping("/claim")
    public void intimateClaim() {
        customerAccessPointService.intimateClaim();
    }

    @PostMapping("/proof")
    public void uploadProofDocuments() {
        customerAccessPointService.uploadProofDocuments();
    }

    @GetMapping("/all")
    public List<CustomerAccessPoint> getAllCustomerAccessPoints() {
        return customerAccessPointService.getAllCustomerAccessPoints();
    }
}