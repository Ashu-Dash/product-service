package com.category.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.category.demo.dtos.CategoryDTO;
import com.category.demo.exception.APIException;
import com.category.demo.models.Category;
import com.category.demo.repositories.CategoryRepository;
import com.category.demo.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository categoryRepository;

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category addNewCategory(CategoryDTO categoryDTO) {
		Category category = new Category(categoryDTO.getCategoryId(), categoryDTO.getCategoryName(),
				categoryDTO.getDescription());
		return categoryRepository.save(category);
	}

	@Override
	public Category getCategoryById(String categoryId) {
		Optional<Category> category = categoryRepository.findById(categoryId);
		
		if (category.isPresent()) {
			return category.get();
		} else {
			throw new APIException("No category found for the given categoryId", HttpStatus.NOT_FOUND);
		}
	}

}
