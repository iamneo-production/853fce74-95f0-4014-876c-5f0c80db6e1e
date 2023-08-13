package com.bfsi.statementgenerationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionHistoryDto {

    private Long transactionId;

    private Long accountId;

    private Date occuredDate;

    private String description;

    private BigDecimal withdrawalAmount;

    private BigDecimal depositAmount;
}
