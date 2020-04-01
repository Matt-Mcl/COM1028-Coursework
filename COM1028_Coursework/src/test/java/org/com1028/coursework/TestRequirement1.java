package org.com1028.coursework;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class TestRequirement1 {

	@Test
	public void testRequirement1() {
		// Retrieve user database login to produce BaseQuery object.
		@SuppressWarnings("resource") // Added to suppress scanner.close() warning as closing the scanner causes the
										// AllTests class to fail when executing more than one test class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Username: ");
		String username = scanner.nextLine();
		System.out.print("Password: ");
		String password = scanner.nextLine();
		BaseQuery bq = new BaseQuery(username, password);

		// Create an ArrayList containing the requires rows for Requirement1
		Requirement1 r1 = new Requirement1();
		List<String> data = r1.requirement1(bq);
		// Create an ArrayList to hold data from the database
		List<String> databaseData = new ArrayList<String>();

		// SQL statement to retrieve the data directly from the database for comparison
		ResultSet rs;
		try {
			rs = bq.performQuery("SELECT * " + "FROM Payments "
					+ "WHERE Payments.amount > (SELECT AVG(Payments.amount) * 2 FROM Payments)");

			// Retrieve individual column data
			while (rs.next()) {
				int customerNumber = rs.getInt("customerNumber");
				String checkNumber = rs.getString("checkNumber");
				Date paymentDate = rs.getDate("paymentDate");
				double amount = rs.getDouble("amount");

				// Add retrieved item to an ArrayList in the same format as the requirement
				// class produces
				databaseData.add("Customer Number: " + customerNumber + ", Check Number: " + checkNumber
						+ ", Payment Date: " + paymentDate.toString() + ", Amount: " + amount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Compare the two ArrayLists
		assertEquals(databaseData, data);
	}
}
