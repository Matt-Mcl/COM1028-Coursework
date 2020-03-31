package org.com1028.coursework;

public class Customer {
	private int customerNumber = 0;
	private String customerName = null;

	public Customer(int customerNumber, String customerName) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

}
