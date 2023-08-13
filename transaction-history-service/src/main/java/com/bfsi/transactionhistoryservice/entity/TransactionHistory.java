package com.bfsi.transactionhistoryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionHistory {

    @Id
    @GeneratedValue
    private Long transactionId;

    private Long accountId;

    private Date occuredDate;

    private String description;

    private BigDecimal withdrawalAmount;

    private BigDecimal depositAmount;
}
