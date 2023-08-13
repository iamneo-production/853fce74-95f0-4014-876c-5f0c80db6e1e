package com.bfsi.statementgenerationservice.repository;

import com.bfsi.statementgenerationservice.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long> {
}
