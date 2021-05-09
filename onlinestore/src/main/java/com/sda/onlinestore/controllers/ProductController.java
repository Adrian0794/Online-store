package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.entities.ProducatorEntity;
import com.sda.onlinestore.entities.ProductEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.servicies.CategoryService;
import com.sda.onlinestore.servicies.ProducatorService;
import com.sda.onlinestore.servicies.ProductService;
import com.sda.onlinestore.servicies.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProducatorService producatorService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserAccountService userAccountService;

    @GetMapping(path = "getProduct/{idCategory}")
    public String getProductByCategory(@PathVariable Integer idCategory, Model model) {
        List<ProductEntity> productListFiltred = productService.getProductsByCategoryId(idCategory);
        model.addAttribute("products", productListFiltred);


        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        UserAccountEntity userAccountEntity = userAccountService.getUserAccount(username);
        model.addAttribute("username", userAccountEntity.getUsername());
        return "product";
    }

    @GetMapping(path = "getProduct")
    public String getProduct(Model model) {
        List<ProductEntity> productList = productService.getAllProducts();
        model.addAttribute("products", productList);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        UserAccountEntity userAccountEntity = userAccountService.getUserAccount(username);
        model.addAttribute("username", userAccountEntity.getUsername());
        return "product";
    }

    @GetMapping(path = "getProductuser")
    public String getProductUser(Model model) {
        List<ProductEntity> productList = productService.getAllProducts();
        model.addAttribute("products", productList);
        return "productuser";
    }

    @GetMapping(path = "add-product")
    public String addProductPage(Model model) {
        model.addAttribute("newProduct", new ProductEntity());
        List<ProducatorEntity> producatorEntities = producatorService.producatorList();
        model.addAttribute("producatori", producatorEntities);
        List<CategoryEntity> categoryEntities = categoryService.getAllCategory();
        model.addAttribute("categories", categoryEntities);
        return "add-product";
    }

    @PostMapping(path = "product/add")
    public String addProduct(@ModelAttribute ProductEntity newProduct) {
        productService.addProduct(newProduct);
        return "redirect:/getProduct";
    }

    @GetMapping(path = "edit-product/{id}")
    public String editProductPage(Model model, @PathVariable("id") Integer id) {
        ProductEntity productEntity = productService.getProduct(id);
        model.addAttribute("productToBeEdit", productEntity);
        List<ProducatorEntity> producatorEntities = producatorService.producatorList();
        model.addAttribute("producatori", producatorEntities);
        List<CategoryEntity> categoryEntities = categoryService.getAllCategory();
        model.addAttribute("categories", categoryEntities);
        return "edit-product";
    }

    @PostMapping(path = "product/edit")
    public String editProduct(@ModelAttribute ProductEntity productToBeEdit) {
        productService.editProduct(productToBeEdit);
        return "redirect:/getProduct";
    }

    @GetMapping(path = "delete-product/{id}")
    public String deleteProduct(Model model, @PathVariable("id") Integer id) {
        productService.deleteProduct(id);
        return "redirect:/getProduct";
    }


}
