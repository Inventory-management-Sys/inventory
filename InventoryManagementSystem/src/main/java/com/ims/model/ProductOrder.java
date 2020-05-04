package com.ims.model;

import java.util.Date;

public class ProductOrder {
private int orderId;
private Date date;
private Customer customerId;
private double price;
private int quantity;


public ProductOrder(int orderId, Date date, Customer customerId, double price, int quantity) {
	super();
	this.orderId = orderId;
	this.date = date;
	this.customerId = customerId;
	this.price = price;
	this.quantity = quantity;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Customer getCustomerId() {
	return customerId;
}
public void setCustomerId(Customer customerId) {
	this.customerId = customerId;
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
	return "ProductOrder [orderId=" + orderId + ", date=" + date + ", customerId=" + customerId + ", price=" + price
			+ ", quantity=" + quantity + "]";
}


}
