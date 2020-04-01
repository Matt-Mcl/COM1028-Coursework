package org.com1028.coursework;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class TestRequirement3 {

	@Test
	public void testRequirement3() {
		// Retrieve user database login to produce BaseQuery object.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Username: ");
		String username = scanner.nextLine();
		System.out.print("Password: ");
		String password = scanner.nextLine();
		BaseQuery bq = new BaseQuery(username, password);
		scanner.close();

		// Create an ArrayList containing the requires rows for Requirement1
		Requirement3 r3 = new Requirement3();
		List<String> data = r3.requirement3(bq);
		// Create an ArrayList to hold data from the database
		List<String> databaseData = new ArrayList<String>();

		// SQL statement to retrieve the data directly from the database for comparison
		ResultSet rs;
		try {
			rs = bq.performQuery("SELECT customers.customerName, orders.orderNumber " + "FROM orderdetails "
					+ "INNER JOIN orders " + "ON orders.ordernumber = orderdetails.ordernumber "
					+ "INNER JOIN customers " + "ON customers.customerNumber = orders.customerNumber "
					+ "GROUP BY ordernumber HAVING SUM(orderdetails.priceeach * orderdetails.quantityordered) > 25000 ");

			// Retrieve individual column data
			while (rs.next()) {
				String customerName = rs.getString("customerName");
				int orderNumber = rs.getInt("orderNumber");

				// Add retrieved item to an ArrayList in the same format as the requirement
				// class produces
				databaseData.add("Customer Name: " + customerName + ", Order Number: " + orderNumber);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Both arrays must be sorted for requirement 3. The Java I wrote adds the
		// elements as the are found but the SQL finds all the data and then groups them
		// to satisfy the constraints, producing a different order.
		Collections.sort(data);
		Collections.sort(databaseData);
		// assertEquals(databaseData.size(), data.size());
		// Compare the two ArrayLists
		assertEquals(databaseData, data);
	}
}