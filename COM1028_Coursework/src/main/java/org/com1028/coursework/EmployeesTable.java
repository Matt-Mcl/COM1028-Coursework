package org.com1028.coursework;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeesTable {
	private List<Employee> employees = new ArrayList<Employee>();

	public EmployeesTable(BaseQuery bq) {
		super();
		try {
			ResultSet rs = bq.useTable("employees");

			while (rs.next()) {
				int employeeNumber = rs.getInt("employeeNumber");
				String lastName = rs.getString("lastName");
				String firstName = rs.getString("firstName");
				String extension = rs.getString("extension");
				String email = rs.getString("email");
				String officeCode = rs.getString("officeCode");
				int reportsTo = rs.getInt("reportsTo");
				String jobTitle = rs.getString("jobTitle");
				Employee e = new Employee(employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo,
						jobTitle);
				this.employees.add(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}
}