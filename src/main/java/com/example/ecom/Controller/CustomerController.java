package com.example.ecom.Controller;

import com.example.ecom.Adapter.CustomerAdapter;
import com.example.ecom.Dto.CustomerDto;
import com.example.ecom.Entity.CustomerEntity;
import com.example.ecom.Service.CustomerService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/all")
    public CustomerDto getAll(){
        CustomerEntity customerEntities = customerService.getAll();
        return CustomerAdapter.customerEntityToDto(customerEntities);
    }

}
