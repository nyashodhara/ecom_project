package com.example.ecom.Adapter;

import com.example.ecom.Dto.CustomerDto;
import com.example.ecom.Dto.ProductDto;
import com.example.ecom.Entity.CustomerEntity;
import com.example.ecom.Entity.ProductEntity;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class ProductAdapter {
    public ProductDto productEntityToDto(ProductEntity productEntity){
        return ProductDto.builder()
                .productId(productEntity.getProductId())
                .name(productEntity.getName())
                .images(productEntity.getImage())
                .price(productEntity.getPrice())
                .category(productEntity.getCategory()).build();
    }

    public List<ProductDto> getProductDtoList(List<ProductEntity> productEntities){
        return productEntities.stream().map(ProductAdapter::productEntityToDto).collect(Collectors.toList());
    }
}
