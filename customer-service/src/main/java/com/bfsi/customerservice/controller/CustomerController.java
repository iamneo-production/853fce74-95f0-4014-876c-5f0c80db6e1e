package com.bfsi.customerservice.controller;


import com.bfsi.customerservice.dto.StatementResponseDto;
import com.bfsi.customerservice.entity.Customer;
import com.bfsi.customerservice.service.AccountServiceConsumer;
import com.bfsi.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CustomerController {

    private final AccountServiceConsumer accountServiceConsumer;
    private final CustomerService customerService;

    @GetMapping("/customers/{customer_id}")
    public StatementResponseDto fetchAccountInfo(@PathVariable("customer_id") Long customerId) {
        // Fetch the customer info
        Customer customerResponse = customerService.fetchCustomer(customerId);

        // Fetch the customer account info
        return accountServiceConsumer.fetchAccountInfo(customerId);
    }

}
