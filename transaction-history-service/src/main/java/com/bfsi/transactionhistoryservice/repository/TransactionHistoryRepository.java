package com.bfsi.transactionhistoryservice.repository;

import com.bfsi.transactionhistoryservice.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long> {
    List<TransactionHistory> findAllByAccountId(Long accountId);
}