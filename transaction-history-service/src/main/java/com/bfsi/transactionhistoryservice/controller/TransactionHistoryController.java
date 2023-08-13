package com.bfsi.transactionhistoryservice.controller;

import com.bfsi.transactionhistoryservice.entity.TransactionHistory;
import com.bfsi.transactionhistoryservice.service.TransactionHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TransactionHistoryController {

    private final TransactionHistoryService transactionHistoryService;

    @GetMapping("/transactions/{account_id}")
    public List<TransactionHistory> fetchTransactionHistory(@PathVariable("account_id") Long accountId) {
        return transactionHistoryService.fetchTransactionHistory(accountId);
    }
}
