package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.ProductEntity;
import com.sda.onlinestore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductEntity getProduct(Integer id) {
        Optional<ProductEntity> productEntityOptional = productRepository.findById(id);
        ProductEntity productEntity = productEntityOptional.get();
        return productEntity;
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

    public List<ProductEntity> getProductByCategoryId(Integer categoryID){
        return productRepository.findByCategoryCategoryId(categoryID);
    }

}