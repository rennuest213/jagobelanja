package com.jagobelanja.service;

import com.jagobelanja.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(int id);
    Category createCategory(Category category);
    Category updateCategory(Category category);
    void deleteCategory(int id);
}
