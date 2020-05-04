package com.ims.model;

public class Supplier {
	private int id;
	private int name;
	private int contactNo;
	
	public Supplier() {
		
	}
	
	public Supplier(int id, int name, int contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", contactNo=" + contactNo + "]";
	}
	
	

}
