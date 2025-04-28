package com.example.prodrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
