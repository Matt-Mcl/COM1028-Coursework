package org.com1028.coursework;

public class Order {
	private int orderNumber;
	private int customerNumber;

	public Order(int orderNumber, int customerNumber) {
		super();
		this.orderNumber = orderNumber;
		this.customerNumber = customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

}
