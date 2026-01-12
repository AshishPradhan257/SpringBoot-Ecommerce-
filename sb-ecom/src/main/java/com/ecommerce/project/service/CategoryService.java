package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

//to promote loose coupling and modularity, that's why using interface instead of class!

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
