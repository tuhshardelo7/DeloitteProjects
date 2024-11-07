package com.cloudthat.productsappv2.repository;


import com.cloudthat.productsappv2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByProductName(String productName);
}
