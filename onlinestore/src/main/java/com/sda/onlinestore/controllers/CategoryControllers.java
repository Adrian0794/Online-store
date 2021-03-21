package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.servicies.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryControllers {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "getCategory")
    public String getCategory(Model model) {
        List<CategoryEntity> categoryList = categoryService.getAllCategory();
        model.addAttribute("categories", categoryList);
        return "categories";
    }

    @GetMapping(path = "add-category")
    public String addCategoryPage(Model model) {
        model.addAttribute("newCategory", new CategoryEntity());
        return "add-categories";
    }

    @PostMapping(path = "category/add")
    public String addCategory(@ModelAttribute CategoryEntity newCategory) {
        categoryService.addCategory(newCategory);
        return "redirect:/getCategory";
    }

    @GetMapping(path = "edit-category/{id}")
    public String editCategoryPage(Model model, @PathVariable("id") Integer id) {
        CategoryEntity categoryEntity = categoryService.getCategory(id);
        model.addAttribute("categoryToBeEdit", categoryEntity);
        return "edit-category";
    }

    @PostMapping(path = "category/edit")
    public String editCategory(@ModelAttribute CategoryEntity categoryToBeEdit) {
        categoryService.editCategory(categoryToBeEdit);
        return "redirect:/getCategory";
    }

    @GetMapping(path = "delete-category/{id}")
    public String deleteCategory(Model model, @PathVariable("id") Integer id) {
        categoryService.deleteCategoryById(id);
        return "redirect:/getCategory";
    }
}
