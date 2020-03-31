package org.com1028.coursework;

public class Main {

	/**
	 * public static void requirement1(BaseQuery bq) { double total = 0; double
	 * count = 0;
	 * 
	 * try { // Retrieve payments table ResultSet rs = bq.useTable("payments");
	 * ResultSetMetaData rsmd = rs.getMetaData(); int columnsNumber =
	 * rsmd.getColumnCount();
	 * 
	 * // Run through payments table adding up all payments and counting // how many
	 * there are while (rs.next()) { double amount = rs.getDouble("amount"); total
	 * += amount; count++; } // Calculate the doubled average double average =
	 * (total / count) * 2;
	 * 
	 * // Open the payments table again rs = bq.useTable("payments");
	 * 
	 * // Run through the payments table again while (rs.next()) { double amount =
	 * rs.getDouble("amount"); // Find whether the amount is greater than the
	 * doubled average if (amount > average) { // If it is, output the current row
	 * for (int i = 1; i <= columnsNumber; i++) { if (i > 1) System.out.print(", ");
	 * String columnValue = rs.getString(i); System.out.print(columnValue); }
	 * System.out.println(""); } }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } finally { try {
	 * bq.con.close(); } catch (Exception e) { e.printStackTrace(); } } }
	 * 
	 * public static void requirement2(BaseQuery bq) {
	 * 
	 * try { // Retrieve employees table ResultSet rsEmployees =
	 * bq.useTable("employees"); ResultSetMetaData rsEmd =
	 * rsEmployees.getMetaData(); int columnsNumberE = rsEmd.getColumnCount();
	 * 
	 * // Retrieve offices table ResultSet rsOffices = bq.useTable("offices");
	 * 
	 * // Run through employees table and retrieve their office code while
	 * (rsEmployees.next()) { String employeeOfficeCode =
	 * rsEmployees.getString("officeCode"); rsOffices = bq.useTable("offices"); //
	 * Run through offices table and retrieve the city and office code while
	 * (rsOffices.next()) { String city = rsOffices.getString("city"); String
	 * officeOfficeCode = rsOffices.getString("officeCode");
	 * 
	 * // Find whether the office is in Boston and the employee is within this
	 * office if (city.matches("Boston") &&
	 * employeeOfficeCode.equals(officeOfficeCode)) { // If it is, output the
	 * current row for (int i = 1; i <= columnsNumberE; i++) { if (i > 1)
	 * System.out.print(", "); String columnValue = rsEmployees.getString(i);
	 * System.out.print(columnValue); } System.out.println(""); }
	 * 
	 * } }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } finally { try {
	 * bq.con.close(); } catch (Exception e) { e.printStackTrace(); } } }
	 **/

	public static void main(String[] args) {
		BaseQuery bq = null;
		try {
			bq = new BaseQuery("root", "something8.chicken.bicycle");

			Requirement1 r1 = new Requirement1();

			r1.requirement1(bq);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bq.con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
