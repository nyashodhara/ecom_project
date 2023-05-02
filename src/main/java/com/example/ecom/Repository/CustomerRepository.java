package com.example.ecom.Repository;

import com.example.ecom.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

    @Query(nativeQuery = true,value = "SELECT * FROM customer_entity where mobile = :s")
    CustomerEntity findByMobile(String s);
}
