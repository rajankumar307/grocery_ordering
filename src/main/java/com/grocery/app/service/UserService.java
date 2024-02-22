package com.grocery.app.service;

import com.grocery.app.model.Product;
import com.grocery.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<Product> getAllGroceryItem(){
        return userRepository.findAll();
    }

}
