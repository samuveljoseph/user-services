package com.eccomerce.userservices.model;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private long pincode;
	private long mobileNumber;
	public String getAddressLine1() {
	return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
	return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
	}
	public String getCity() {
	return city;
	}
	public void setCity(String city) {
	this.city = city;
	}
	public String getState() {
	return state;
	}
	public void setState(String state) {
	this.state = state;
	}
	public long getPincode() {
	return pincode;
	}
	public void setPincode(long pincode) {
	this.pincode = pincode;
	}
	public long getMobileNumber() {
	return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
	}
	public Address(String addressLine1, String addressLine2, String city, String state, long pincode,
	long mobileNumber) {
	super();
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
	this.mobileNumber = mobileNumber;
	}
	public Address() {
	super();
	}
}
