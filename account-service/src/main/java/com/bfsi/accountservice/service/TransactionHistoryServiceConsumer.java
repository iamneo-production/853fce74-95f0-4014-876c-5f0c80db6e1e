package com.bfsi.accountservice.service;

import com.bfsi.accountservice.dto.TransactionHistoryResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value="transaction-history-service", path = "/api/v1")
public interface TransactionHistoryServiceConsumer {

    @GetMapping("/transactions/{account_id}")
    List<TransactionHistoryResponseDto> fetchTransactionHistory(@PathVariable("account_id") Long accountId);
}
