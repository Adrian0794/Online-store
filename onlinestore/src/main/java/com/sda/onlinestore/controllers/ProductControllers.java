package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.ProductEntity;
import com.sda.onlinestore.servicies.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductControllers {
    @Autowired
    private ProductService productService;

    @GetMapping(path ="getProduct")
    public String getProduct( Model model) {
        List<ProductEntity> productList = productService.getAllProducts();
        model.addAttribute("products", productList);
        return "product";
    }

    @GetMapping(path = "add-product")
    public String addProductPage(Model model){
        model.addAttribute("newProduct", new ProductEntity());
        return "add-product";
    }

    @PostMapping(path = "product/add")
    public String addProduct(@ModelAttribute ProductEntity newProduct){
        productService.addProduct(newProduct);
        return "redirect:/getProduct";
    }

    @GetMapping(path ="edit-product/{id}")
    public String editProductPage(Model model, @PathVariable("id") Integer id) {
        ProductEntity productEntity = productService.getProduct(id);
        model.addAttribute("productToBeEdit", productEntity);
        return "edit-product";
    }

    @PostMapping(path = "product/edit")
    public String editProduct(@ModelAttribute ProductEntity productToBeEdit){
        productService.editProduct(productToBeEdit);
        return "redirect:/getProduct";
    }
    @GetMapping(path = "delete-product/{id}")
    public String deleteProduct(Model model, @PathVariable("id") Integer id){
        productService.deleteProduct(id);
        return "redirect:/getProduct";
    }

}
