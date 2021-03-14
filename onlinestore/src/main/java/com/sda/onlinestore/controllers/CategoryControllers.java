package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.servicies.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryControllers {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "getCategory")
    public String getCategory(Model model) {
        List<CategoryEntity> categoryList = categoryService.getAllCategory();
        model.addAttribute("category", categoryList);
        return "category";
    }

    @GetMapping(path = "add-category")
    public String addCategory(Model model) {
        model.addAttribute("newCategory", new CategoryEntity());
        return "add-category";
    }
    @PostMapping(path = "category/add")
    public String addCategory(@ModelAttribute CategoryEntity newCategory){
        categoryService.addCategory(newCategory);
        return "redirect:/getCategory";
    }
}
