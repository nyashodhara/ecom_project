package com.example.ecom.Service;

import com.example.ecom.Dto.CustomerDto;
import com.example.ecom.Entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    CustomerDto registerCustomer(CustomerDto customerDto);

    CustomerDto customerLogin(CustomerDto customerDto);
}
