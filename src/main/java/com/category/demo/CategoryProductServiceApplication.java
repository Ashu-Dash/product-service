package com.category.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.category.demo.models.Category;
import com.category.demo.models.Product;
import com.category.demo.repositories.CategoryRepository;
import com.category.demo.repositories.ProductRepository;

@SpringBootApplication
public class CategoryProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryProductServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDataInDatabase(CategoryRepository categoryRepository, ProductRepository productRepository) {
		return args -> {
			Category category1 = categoryRepository.save(new Category("cat1", "category1", "desc1"));
			Category category2 = categoryRepository.save(new Category("cat2", "category2", "desc2"));
			
			productRepository.save(new Product("pro1", "product1", "desc", 15, 20.0, category1));
			productRepository.save(new Product("pro2", "product2", "desc", 25, 30.0, category1));
			productRepository.save(new Product("pro3", "product3", "desc", 35, 40.0, category1));
			productRepository.save(new Product("pro4", "product4", "desc", 45, 50.0, category2));
			productRepository.save(new Product("pro5", "product5", "desc", 55, 60.0, category2));
			productRepository.save(new Product("pro6", "product6", "desc", 65, 70.0, category2));
		};
	}
}
