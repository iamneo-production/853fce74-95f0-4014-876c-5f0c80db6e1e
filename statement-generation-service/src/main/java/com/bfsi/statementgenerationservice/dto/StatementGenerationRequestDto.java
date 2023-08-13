package com.bfsi.statementgenerationservice.dto;

import com.bfsi.statementgenerationservice.entity.TransactionHistory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatementGenerationRequestDto {

    private Long customerId;

    private Long accountId;

    private String name;

    private Long accountNumber;

    private BigDecimal balance;

    private Date timeStamp;

    private List<TransactionHistoryDto> transactionHistoryList;
}
