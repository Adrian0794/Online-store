package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public void getCatedoryById(Integer id) {
        categoryRepository.findById(id);
    }

    public void addCategory(CategoryEntity newCategory) {
        categoryRepository.save(newCategory);
    }

    public List<CategoryEntity> getAllCategory() {
        return categoryRepository.findAll();
    }

    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }

    public void editCategory(CategoryEntity editedCategory) {
        categoryRepository.save(editedCategory);
    }

}
