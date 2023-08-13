package com.bfsi.accountservice.service.impl;

import com.bfsi.accountservice.dto.StatementRequestDto;
import com.bfsi.accountservice.dto.StatementResponseDto;
import com.bfsi.accountservice.dto.TransactionHistoryResponseDto;
import com.bfsi.accountservice.entity.Account;
import com.bfsi.accountservice.service.StatementGenerationServiceConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StatementGenerationService {

    private final StatementGenerationServiceConsumer statementGenerationServiceConsumer;

    public StatementResponseDto generateStatement(Account accountResponse, List<TransactionHistoryResponseDto> transactionHistoryList) {

        StatementRequestDto statementRequestDto = StatementRequestDto.builder()
                .customerId(accountResponse.getCustomerId())
                .accountId(accountResponse.getAccountId())
                .name(accountResponse.getName())
                .accountNumber(accountResponse.getAccountNumber())
                .balance(accountResponse.getBalance())
                .transactionHistoryResponseList(transactionHistoryList)
                .build();


        return statementGenerationServiceConsumer.generateStatement(statementRequestDto);
    }
}
