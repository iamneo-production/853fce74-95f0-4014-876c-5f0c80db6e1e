package com.bfsi.customerservice.service;

import com.bfsi.customerservice.dto.AccountResponseDto;
import com.bfsi.customerservice.dto.StatementResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="account-service", path = "/api/v1")
public interface AccountServiceConsumer {

    @GetMapping("/accounts/{customer_id}")
    StatementResponseDto fetchAccountInfo(@PathVariable("customer_id") Long customerId);
}
