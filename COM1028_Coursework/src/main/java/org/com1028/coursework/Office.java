package org.com1028.coursework;

public class Office {
	private String officeCode = null;
	private String city = null;
	private String phone = null;
	private String addressLine1 = null;
	private String addressLine2 = null;
	private String state = null;
	private String country = null;
	private String postalCode = null;
	private String territory = null;

	public Office(String officeCode, String city, String phone, String addressLine1, String addressLine2, String state,
			String country, String postalCode, String territory) {
		super();
		this.officeCode = officeCode;
		this.city = city;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.territory = territory;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public String getCity() {
		return city;
	}

}
