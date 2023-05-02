package com.example.ecom.Adapter;

import com.example.ecom.Dto.CustomerDto;
import com.example.ecom.Entity.CustomerEntity;
import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Service;

@UtilityClass
public class CustomerAdapter {

    public CustomerDto customerEntityToDto(CustomerEntity customerEntity){
        return CustomerDto.builder()
                .customerId(customerEntity.getCustomerId())
                .mobile(customerEntity.getMobile())
                .name(customerEntity.getName())
                .otp(customerEntity.getOtp())
                .otpExpiry(customerEntity.getOtpExpiry()).build();
    }
}
