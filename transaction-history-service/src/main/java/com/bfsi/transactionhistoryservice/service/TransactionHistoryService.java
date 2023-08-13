package com.bfsi.transactionhistoryservice.service;

import com.bfsi.transactionhistoryservice.entity.TransactionHistory;

import java.util.List;

public interface TransactionHistoryService {

    List<TransactionHistory> fetchTransactionHistory(Long accountId);
}
