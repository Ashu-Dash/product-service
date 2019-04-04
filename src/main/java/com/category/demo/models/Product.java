package com.category.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Product {

	public Product() {
	}

	public Product(String productId, String productName, String description, int quantity, double price,
			Category category) {
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
	}

	@Id
	@Column(name = "id")
	private String productId;
	
	@Column(name = "name")
	private String productName;
	
	@Column
	private String description;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
	
	@ManyToOne
	@JsonBackReference
	private Category category;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
