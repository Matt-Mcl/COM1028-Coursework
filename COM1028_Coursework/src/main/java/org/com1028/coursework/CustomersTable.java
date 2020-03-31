package org.com1028.coursework;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomersTable {
	private List<Customer> customers = new ArrayList<Customer>();

	public CustomersTable(BaseQuery bq) {
		super();
		try {
			ResultSet rs = bq.useTable("customers");

			while (rs.next()) {
				int customerNumber = rs.getInt("customerNumber");
				String customerName = rs.getString("customerName");
				Customer c = new Customer(customerNumber, customerName);
				this.customers.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}
}