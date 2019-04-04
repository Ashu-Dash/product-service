package com.category.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.category.demo.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

	public List<Product> findAll();
}
