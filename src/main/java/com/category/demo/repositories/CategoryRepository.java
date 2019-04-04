package com.category.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.category.demo.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

	public List<Category> findAll();
}
