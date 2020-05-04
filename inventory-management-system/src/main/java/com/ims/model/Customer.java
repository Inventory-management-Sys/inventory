package com.ims.model;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerPassword;
	private String emailId;
	private int number;
	private String address;
	public Customer() {
		
	}
	public Customer(int customerId, String customerName, String customerPassword, String emailId, int number, String address) {
		super();
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerPassword=customerPassword;
		this.emailId=emailId;
		this.number=number;
		this.address=address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id= " +customerId+ ", name= "+customerName+ ", password= " +customerPassword+ ", emailId= " +emailId+ ", number= " +number+ ", address= " +address+ "]";
	}

}
