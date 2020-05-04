package com.ims.model;

public class Distributor {
	
	private int distributorId;
	private String distributorName;
	private int contactNo;
	
	
	public Distributor() {
	}
	
	public Distributor(int distributorId, String distributorName, int contactNo) {
		super();
		this.distributorId = distributorId;
		this.distributorName = distributorName;
		this.contactNo = contactNo;
	}
	public int getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(int adminId) {
		this.distributorId = adminId;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Distributor [distributorId=" + distributorId + ", distributorName=" + distributorName
				+ ", contactNo=" + contactNo + "]";
	}

}
