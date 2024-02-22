package com.grocery.app.repository;

import com.grocery.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}
