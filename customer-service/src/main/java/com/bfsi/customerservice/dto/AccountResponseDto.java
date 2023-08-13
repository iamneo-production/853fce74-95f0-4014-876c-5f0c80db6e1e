package com.bfsi.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDto {


    private Long customerId;

    private Long accountNumber;

    private String name;

    private BigDecimal balance;
}
