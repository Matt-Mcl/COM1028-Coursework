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
				String lastName = rs.getString("lastName");
				String firstName = rs.getString("firstName");
				String officeCode = rs.getString("officeCode");
				Employee e = new Employee(lastName, firstName, officeCode);
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