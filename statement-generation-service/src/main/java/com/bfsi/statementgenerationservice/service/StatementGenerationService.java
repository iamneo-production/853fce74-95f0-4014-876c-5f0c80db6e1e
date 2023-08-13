package com.bfsi.statementgenerationservice.service;

import com.bfsi.statementgenerationservice.dto.StatementGenerationRequestDto;
import com.bfsi.statementgenerationservice.entity.StatementGeneration;

public interface StatementGenerationService {
    StatementGeneration generateStatement(StatementGenerationRequestDto statementGenerationRequestDto);
}
