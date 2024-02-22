package com.grocery.app.service;

import com.grocery.app.model.Product;
import com.grocery.app.model.ProductRequest;
import com.grocery.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProducts(Product product){
        productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void removeProduct(Long productId){
        productRepository.deleteById(productId);
    }

    public void updateProduct(Long productId,ProductRequest productRequest){

    }


}
