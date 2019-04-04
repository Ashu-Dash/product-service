package com.category.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.category.demo.dtos.CategoryDTO;
import com.category.demo.models.Category;
import com.category.demo.services.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
	
	private CategoryService categroyService;
	
	public CategoryController(CategoryService categoryService) {
		this.categroyService = categoryService;
	}

	@GetMapping
	public List<Category> getAllCategories() {
		return categroyService.getAllCategories();
	}
	
	@PostMapping
	public Category addNewCategory(@RequestBody CategoryDTO categoryDTO) {
		return categroyService.addNewCategory(categoryDTO);
	}
	
	@GetMapping("/{categoryId}")
	public Category getCategoryById(@PathVariable String categoryId) {
		return categroyService.getCategoryById(categoryId);
	}
}
