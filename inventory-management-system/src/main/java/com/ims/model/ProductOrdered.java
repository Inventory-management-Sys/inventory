package com.ims.model;

import java.util.Date;

public class ProductOrdered {
	private int productOrderedId;
	private Order orderId;
	private Product productId;
	private Distributor distributorId;
	private Date deliveryDate;
	private String status;
	private double price;
	private int quantity;
	
	public ProductOrdered() {
		
	}

	public ProductOrdered(int productOrderedId, Order orderId, Product productId, Distributor distributorId,
			Date deliveryDate, String status, double price, int quantity) {
		super();
		this.productOrderedId = productOrderedId;
		this.orderId = orderId;
		this.productId = productId;
		this.distributorId = distributorId;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.price = price;
		this.quantity = quantity;
	}

	public int getProductOrderedId() {
		return productOrderedId;
	}

	public void setProductOrderedId(int productOrderedId) {
		this.productOrderedId = productOrderedId;
	}

	public Order getOrderId() {
		return orderId;
	}

	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Distributor getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Distributor distributorId) {
		this.distributorId = distributorId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductOrdered [productOrderedId=" + productOrderedId + ", orderId=" + orderId + ", productId="
				+ productId + ", distributorId=" + distributorId + ", deliveryDate=" + deliveryDate + ", status="
				+ status + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

	
}
