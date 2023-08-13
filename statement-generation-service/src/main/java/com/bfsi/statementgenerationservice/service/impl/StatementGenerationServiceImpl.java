package com.bfsi.statementgenerationservice.service.impl;

import com.bfsi.statementgenerationservice.dto.StatementGenerationRequestDto;
import com.bfsi.statementgenerationservice.dto.TransactionHistoryDto;
import com.bfsi.statementgenerationservice.entity.StatementGeneration;
import com.bfsi.statementgenerationservice.entity.TransactionHistory;
import com.bfsi.statementgenerationservice.repository.StatementGenerationRepository;
import com.bfsi.statementgenerationservice.repository.TransactionHistoryRepository;
import com.bfsi.statementgenerationservice.service.StatementGenerationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StatementGenerationServiceImpl implements StatementGenerationService {

    private final StatementGenerationRepository statementGenerationRepository;
    private final TransactionHistoryRepository transactionHistoryRepository;

    @Override
    public StatementGeneration generateStatement(@RequestBody StatementGenerationRequestDto statementGenerationRequestDto) {

        StatementGeneration statementGeneration = new StatementGeneration();
        statementGeneration.setCustomerId(statementGenerationRequestDto.getCustomerId());
        statementGeneration.setAccountId(statementGenerationRequestDto.getAccountId());
        statementGeneration.setAccountNumber(statementGenerationRequestDto.getAccountNumber());
        statementGeneration.setName(statementGenerationRequestDto.getName());
        statementGeneration.setBalance(statementGenerationRequestDto.getBalance());
        statementGeneration.setTimeStamp(new Date());
        StatementGeneration save = statementGenerationRepository.save(statementGeneration);

        for(TransactionHistoryDto transactionHistory : statementGenerationRequestDto.getTransactionHistoryList()) {
            TransactionHistory transactionHistory1 = new TransactionHistory();
            transactionHistory1.setTransactionId(transactionHistory.getTransactionId());
            transactionHistory1.setAccountId(transactionHistory.getAccountId());
            transactionHistory1.setDepositAmount(transactionHistory.getDepositAmount());
            transactionHistory1.setDescription(transactionHistory.getDescription());
            transactionHistory1.setWithdrawalAmount(transactionHistory.getWithdrawalAmount());
            transactionHistory1.setOccuredDate(transactionHistory.getOccuredDate());
            transactionHistory1.setStatementGeneration(save);
            transactionHistoryRepository.save(transactionHistory1);
        }

        return statementGenerationRepository.findTopByAccountIdOrderByTimeStamp(statementGenerationRequestDto.getAccountId());
    }
}
