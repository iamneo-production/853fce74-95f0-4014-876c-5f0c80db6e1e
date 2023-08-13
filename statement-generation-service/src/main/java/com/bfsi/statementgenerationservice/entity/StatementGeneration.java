package com.bfsi.statementgenerationservice.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatementGeneration {

    @Id
    @GeneratedValue
    private Long generationId;

    private Long customerId;

    private Long accountId;

    private String name;

    private Long accountNumber;

    private BigDecimal balance;

    private Date timeStamp;

    @OneToMany(mappedBy = "statementGeneration", fetch = FetchType.LAZY)
    private List<TransactionHistory> transactionHistoryList = new ArrayList<>();
}
