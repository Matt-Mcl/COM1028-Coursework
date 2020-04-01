package org.com1028.coursework;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class TestRequirement2 {

	@Test
	public void testRequirement2() {
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
		Requirement2 r2 = new Requirement2();
		List<String> data = r2.requirement2(bq);
		// Create an ArrayList to hold data from the database
		List<String> databaseData = new ArrayList<String>();

		// SQL statement to retrieve the data directly from the database for comparison
		ResultSet rs;
		try {
			rs = bq.performQuery("SELECT employees.lastName, employees.firstName " + "FROM Employees, Offices "
					+ "WHERE Offices.city = \"Boston\" " + "AND Employees.officeCode = Offices.officeCode;");

			// Retrieve individual column data
			while (rs.next()) {
				String lastName = rs.getString("lastName");
				String firstName = rs.getString("firstName");

				// Add retrieved item to an ArrayList in the same format as the requirement
				// class produces
				databaseData.add("Last Name: " + lastName + ", First Name: " + firstName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Compare the two ArrayLists
		assertEquals(databaseData, data);
	}
}
