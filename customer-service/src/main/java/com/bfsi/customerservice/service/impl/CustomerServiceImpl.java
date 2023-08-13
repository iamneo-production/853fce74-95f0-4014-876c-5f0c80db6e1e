package com.bfsi.customerservice.service.impl;

import com.bfsi.customerservice.entity.Customer;
import com.bfsi.customerservice.repository.CustomerRepository;
import com.bfsi.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer fetchCustomer(Long customerId) {
        return customerRepository.findByCustomerId(customerId);
    }
}
