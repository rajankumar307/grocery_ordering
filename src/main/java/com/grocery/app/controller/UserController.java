package com.grocery.app.controller;

import com.grocery.app.model.Order;
import com.grocery.app.model.Product;
import com.grocery.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/groceryItem")
    public List<Product> getAllGroceryItem(){
       return userService.getAllGroceryItem();
    }

    @PostMapping("/order")
    public ResponseEntity<String> placeOrder(@RequestBody Order order){

        List<Long> itemIds=order.getItemIds();
        //check for validation if the order ids are correct or not

        for(Long itemId:itemIds){
            //validate the existance of item
            //update the invertory level
        }
        return ResponseEntity.ok("Orders placed successfully");
    }

}
