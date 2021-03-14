package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.ProductEntity;
import com.sda.onlinestore.servicies.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productControllers {
   @GetMapping(path = "getProduct")
    public void getProduct(ProductService productService){

       List<ProductEntity> productList = productService.getAllProducts();
    }
}
