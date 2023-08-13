package com.bfsi.statementgenerationservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TransactionHistory {

    @Id
    @GeneratedValue
    private Long transactionId;

    private Long accountId;

    private Date occuredDate;

    private String description;

    private BigDecimal withdrawalAmount;

    private BigDecimal depositAmount;

    @ManyToOne(targetEntity = StatementGeneration.class, optional = false)
    @JoinColumn(name = "statement_gen_id", nullable = false, referencedColumnName = "generationId")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private StatementGeneration statementGeneration;

}
