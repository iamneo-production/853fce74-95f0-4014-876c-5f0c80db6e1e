package com.bfsi.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatementResponseDto {
    private Long customerId;

    private Long accountId;

    private String name;

    private Long accountNumber;

    private BigDecimal balance;

    private List<TransactionHistoryResponseDto> transactionHistoryResponseList;

}
