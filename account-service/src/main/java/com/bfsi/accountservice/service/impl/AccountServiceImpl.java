package com.bfsi.accountservice.service.impl;

import com.bfsi.accountservice.entity.Account;
import com.bfsi.accountservice.repository.AccountRepository;
import com.bfsi.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    @Override
    public Account fetchAccountInfo(Long customerId) {
        return accountRepository.findByCustomerId(customerId);
    }
}
