package com.example.ecom.Service.Impl;

import com.example.ecom.Entity.CustomerEntity;
import com.example.ecom.Repository.CustomerRepository;
import com.example.ecom.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerEntity getAll() {
        CustomerEntity cus = customerRepository.findByMobile("8197717210");
        return cus;
    }
}
