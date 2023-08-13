package com.bfsi.accountservice.repository;

import com.bfsi.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByCustomerId(Long customerId);
}
