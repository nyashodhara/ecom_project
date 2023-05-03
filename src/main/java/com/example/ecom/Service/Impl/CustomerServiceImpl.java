package com.example.ecom.Service.Impl;

import com.example.ecom.Adapter.CustomerAdapter;
import com.example.ecom.Dto.CustomerDto;
import com.example.ecom.Entity.CustomerEntity;
import com.example.ecom.ExceptionHandler.DuplicateException;
import com.example.ecom.Repository.CustomerRepository;
import com.example.ecom.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDto registerCustomer(CustomerDto customerDto) {
        CustomerEntity customerEntity = customerRepository.findFirstByMobile(customerDto.getMobile());
        if (Objects.isNull(customerEntity)){
            customerEntity = CustomerAdapter.customerDtoToEntity(customerDto);
            customerRepository.save(customerEntity);
        }else {
            throw new DuplicateException("Customer already exist");
        }
        return CustomerAdapter.customerEntityToDto(customerEntity);
    }
}
