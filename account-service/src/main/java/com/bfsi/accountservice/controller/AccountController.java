package com.bfsi.accountservice.controller;

import com.bfsi.accountservice.dto.StatementResponseDto;
import com.bfsi.accountservice.dto.TransactionHistoryResponseDto;
import com.bfsi.accountservice.entity.Account;
import com.bfsi.accountservice.service.AccountService;
import com.bfsi.accountservice.service.TransactionHistoryServiceConsumer;
import com.bfsi.accountservice.service.impl.StatementGenerationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AccountController {

    private final TransactionHistoryServiceConsumer transactionHistoryServiceConsumer;
    private final AccountService accountService;
    private final StatementGenerationService statementGenerationService;

    @GetMapping("/accounts/{customer_id}")
    public StatementResponseDto fetchAccountInfo(@PathVariable("customer_id") Long customerId) {
        // Fetch the customer account info
        Account accountResponse = accountService.fetchAccountInfo(customerId);

        // Fetch the customer transaction history
        List<TransactionHistoryResponseDto> transactionHistoryList = transactionHistoryServiceConsumer.fetchTransactionHistory(accountResponse.getAccountId());

        // Generate statement -> save in database
        StatementResponseDto generatedStatement = null ; //statementGenerationService.generateStatement(accountResponse, transactionHistoryList);

        return generatedStatement;
    }

}
