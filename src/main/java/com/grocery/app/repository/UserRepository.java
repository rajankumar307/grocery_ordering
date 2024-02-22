package com.grocery.app.repository;

import com.grocery.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Product,Long> {
}
