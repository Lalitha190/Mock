package com.example.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer productId;
	private String productname;
	private String productColor;
	private double productCost;
	
	public Product() {
		super();
	}
	public Product(Integer productId) {
		this.productId=productId;
	}

	public Product(String productname, String productColor, double productCost) {
		super();
		this.productname = productname;
		this.productColor = productColor;
		this.productCost = productCost;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + ", productColor=" + productColor
				+ ", productCost=" + productCost + "]";
	}
	
	
}
