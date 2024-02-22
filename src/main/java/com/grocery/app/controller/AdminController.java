package com.grocery.app.controller;

import com.grocery.app.model.Product;
import com.grocery.app.model.ProductRequest;
import com.grocery.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/products")
public class AdminController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<String> addProducts(@RequestBody ProductRequest productRequest){

        Product newProduct=new Product();
        newProduct.setName(productRequest.getName());
        newProduct.setPrice(productRequest.getPrice());
        newProduct.setStock(productRequest.getStock());
        productService.addProducts(newProduct);
        return ResponseEntity.ok("Product added successfully");
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<String> removeProducts(@PathVariable Long productId){
        productService.removeProduct(productId);
        return ResponseEntity.ok("Successfully deleted");

    }
    @PutMapping("/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable Long productId,
                                                @RequestBody ProductRequest productRequest){
        productService.updateProduct(productId,productRequest);
        return ResponseEntity.ok("successfully updated");
    }
}
