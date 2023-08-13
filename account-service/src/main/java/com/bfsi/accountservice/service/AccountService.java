package com.bfsi.accountservice.service;

import com.bfsi.accountservice.entity.Account;

public interface AccountService {
    Account fetchAccountInfo(Long customerId);
}
