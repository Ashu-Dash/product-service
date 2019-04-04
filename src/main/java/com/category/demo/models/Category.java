package com.category.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Category {

	public Category() {
	}

	public Category(String categoryId, String categoryName, String description) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
	}

	@Id
	@Column(name = "id")
	private String categoryId;

	@Column(name = "name")
	private String categoryName;

	@Column
	private String description;

	@OneToMany(mappedBy = "category")
	@JsonManagedReference
	private List<Product> products;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
