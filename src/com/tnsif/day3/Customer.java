package com.tnsif.day3;

public class Customer {
	private String customerName;
	private String customerCity;
	private String customerId;
	
	// created def and para const, getter and setter methods and toString method
	
	
	public Customer() {
		System.out.println("def const");
	}




	public Customer(String customerName, String customerCity, String customerId) {
		System.out.println("para const");
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerId = customerId;
	}




	public String getCustomerName() {
		return customerName;
	}




	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




	public String getCustomerCity() {
		return customerCity;
	}




	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}




	public String getCustomerId() {
		return customerId;
	}




	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}




	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId="
				+ customerId + "]";
	}
	
	
	
	
}
