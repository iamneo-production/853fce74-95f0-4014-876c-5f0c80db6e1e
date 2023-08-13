package com.bfsi.statementgenerationservice.repository;

import com.bfsi.statementgenerationservice.entity.StatementGeneration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatementGenerationRepository extends JpaRepository<StatementGeneration, Long> {

    StatementGeneration findTopByAccountIdOrderByTimeStamp(Long accountId);
}
