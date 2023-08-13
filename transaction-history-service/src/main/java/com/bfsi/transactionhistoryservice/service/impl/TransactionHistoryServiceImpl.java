package com.bfsi.transactionhistoryservice.service.impl;

import com.bfsi.transactionhistoryservice.entity.TransactionHistory;
import com.bfsi.transactionhistoryservice.repository.TransactionHistoryRepository;
import com.bfsi.transactionhistoryservice.service.TransactionHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionHistoryServiceImpl implements TransactionHistoryService {

    private final TransactionHistoryRepository transactionHistoryRepository;

    @Override
    public List<TransactionHistory> fetchTransactionHistory(Long accountId) {
        return transactionHistoryRepository.findAllByAccountId(accountId);
    }
}
