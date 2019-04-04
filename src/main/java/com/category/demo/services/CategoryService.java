package com.category.demo.services;

import java.util.List;

import com.category.demo.dtos.CategoryDTO;
import com.category.demo.models.Category;

public interface CategoryService {

	public List<Category> getAllCategories();
	
	public Category addNewCategory(CategoryDTO categoryDTO);
	
	public Category getCategoryById(String categoryId);
}
