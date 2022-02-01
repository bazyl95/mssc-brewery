package com.personalstudy.msscbrewery.services;

import com.personalstudy.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
