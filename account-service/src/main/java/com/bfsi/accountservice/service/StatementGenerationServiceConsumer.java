package com.bfsi.accountservice.service;

import com.bfsi.accountservice.dto.StatementRequestDto;
import com.bfsi.accountservice.dto.StatementResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value="statement-generation-service", path = "/api/v1")
public interface StatementGenerationServiceConsumer {

    @GetMapping("/statements/generate")
    StatementResponseDto generateStatement(@RequestBody StatementRequestDto statementRequestDto);
}
