package com.bfsi.customerservice.service;

import com.bfsi.customerservice.entity.Customer;

public interface CustomerService {
    Customer fetchCustomer(Long customerId);
}
