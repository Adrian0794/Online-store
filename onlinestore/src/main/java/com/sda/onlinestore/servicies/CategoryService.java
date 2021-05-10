package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryEntity getCategory(Integer id) {
        Optional<CategoryEntity> categoryEntityOptional = categoryRepository.findById(id);
        CategoryEntity categoryEntity = categoryEntityOptional.get();
        return categoryEntity;
    }

    public List<CategoryEntity> getAllCategory() {
        return categoryRepository.findAll();
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void addCategory(CategoryEntity newCategory) {
        categoryRepository.save(newCategory);
    }


    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }

    public void editCategory(CategoryEntity editedCategory) {
        categoryRepository.save(editedCategory);
    }


}
