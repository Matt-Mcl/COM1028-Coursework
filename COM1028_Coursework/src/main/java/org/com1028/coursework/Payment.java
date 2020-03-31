package org.com1028.coursework;

import java.sql.Date;

public class Payment {
	private int customerNumber = 0;
	private String checkNumber = null;
	private Date paymentDate = null;
	private double amount = 0;

	public Payment(int customerNumber, String checkNumber, Date paymentDate, double amount) {
		super();
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Customer Number: " + this.customerNumber + ", Check Number: " + this.checkNumber + ", Payment Date: "
				+ this.paymentDate.toString() + ", Amount: " + this.amount;
	}

}
