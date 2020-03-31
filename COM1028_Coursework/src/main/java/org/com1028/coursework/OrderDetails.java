package org.com1028.coursework;

public class OrderDetails {
	private int orderNumber;
	private int quantityOrdered;
	private double priceEach;

	public OrderDetails(int orderNumber, int quantityOrdered, double priceEach) {
		super();
		this.orderNumber = orderNumber;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

}
