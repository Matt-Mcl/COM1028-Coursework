package org.com1028.coursework;

public class Employee {
	private String lastName = null;
	private String firstName = null;
	private String officeCode = null;

	public Employee(String lastName, String firstName, String officeCode) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.officeCode = officeCode;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	@Override
	public String toString() {
		return "Last Name: " + this.lastName + ", First Name: " + this.firstName;
	}

}
