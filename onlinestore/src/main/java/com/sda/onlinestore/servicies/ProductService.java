package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.entities.ProducatorEntity;
import com.sda.onlinestore.entities.ProductEntity;
import com.sda.onlinestore.repositories.ProducatorRepository;
import com.sda.onlinestore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void getProduct(ProductEntity newProduct) {
        this.productRepository = productRepository;
    }

    public void addProduct(ProductEntity newProduct) {
        this.productRepository.save(newProduct);
    }

    public void getProductById(Integer id) {
        productRepository.findById(id);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    public void editProduct(ProductEntity editProduct) {
        productRepository.save(editProduct);
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
}