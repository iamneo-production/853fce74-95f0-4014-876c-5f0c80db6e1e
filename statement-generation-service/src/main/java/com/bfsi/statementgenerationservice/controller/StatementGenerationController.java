package com.bfsi.statementgenerationservice.controller;

import com.bfsi.statementgenerationservice.dto.StatementGenerationRequestDto;
import com.bfsi.statementgenerationservice.entity.StatementGeneration;
import com.bfsi.statementgenerationservice.service.StatementGenerationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class StatementGenerationController {

    private final StatementGenerationService statementGenerationService;

    @PostMapping("/statements/generate")
    public StatementGeneration generateStatement(@RequestBody StatementGenerationRequestDto statementGenerationRequestDto) {
        return statementGenerationService.generateStatement(statementGenerationRequestDto);
    }
}
