package com.bfsi.accountservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatementRequestDto {

    private Long customerId;

    private Long accountId;

    private String name;

    private Long accountNumber;

    private BigDecimal balance;

    private List<TransactionHistoryResponseDto> transactionHistoryResponseList;
}
