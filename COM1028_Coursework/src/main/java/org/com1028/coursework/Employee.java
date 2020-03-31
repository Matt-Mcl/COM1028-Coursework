package org.com1028.coursework;

public class Employee {
	private int employeeNumber = 0;
	private String lastName = null;
	private String firstName = null;
	private String extension = null;
	private String email = null;
	private String officeCode = null;
	private int reportsTo = 0;
	private String jobTitle = null;

	public Employee(int employeeNumber, String lastName, String firstName, String extension, String email,
			String officeCode, int reportsTo, String jobTitle) {
		super();
		this.employeeNumber = employeeNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.extension = extension;
		this.email = email;
		this.officeCode = officeCode;
		this.reportsTo = reportsTo;
		this.jobTitle = jobTitle;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	@Override
	public String toString() {
		return "Last Name: " + this.lastName + ", First Name: " + this.firstName;
	}

}
