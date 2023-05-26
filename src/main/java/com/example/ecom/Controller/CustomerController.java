package com.example.ecom.Controller;

import com.example.ecom.Adapter.CustomerAdapter;
import com.example.ecom.Dto.CustomerDto;
import com.example.ecom.Dto.ProductDto;
import com.example.ecom.Dto.ProductSearchDto;
import com.example.ecom.Entity.CustomerEntity;
import com.example.ecom.Service.CustomerService;
import com.example.ecom.Service.ProductService;
import com.example.ecom.Utility.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/register")
    public ResponseWrapper<CustomerDto> customerRegister(@RequestBody CustomerDto customerDto){
        customerDto = customerService.registerCustomer(customerDto);
        return new ResponseWrapper<>("Success","Success",200,customerDto);
    }

    @PostMapping("/login")
    public ResponseWrapper<CustomerDto> customerLogin(@RequestBody CustomerDto customerDto){
        customerDto = customerService.customerLogin(customerDto);
        return new ResponseWrapper<>("Success","Success",200,customerDto);
    }

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/list")
    public ResponseWrapper<List<ProductDto>> searchProducts(@RequestBody ProductSearchDto productSearchDto){
        List<ProductDto> productDtos = productService.searchProducts(productSearchDto);
        return new ResponseWrapper<>("Success","Success",200,productDtos);
    }
}
