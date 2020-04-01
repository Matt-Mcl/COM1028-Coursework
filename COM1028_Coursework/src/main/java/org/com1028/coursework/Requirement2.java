package org.com1028.coursework;

import java.util.ArrayList;
import java.util.List;

public class Requirement2 {

	public List<String> requirement2(BaseQuery bq) {
		List<String> data = new ArrayList<String>();
		EmployeesTable es = new EmployeesTable(bq);
		OfficesTable os = new OfficesTable(bq);

		for (Employee e : es.getEmployees()) {
			for (Office o : os.getOffices()) {
				if (e.getOfficeCode().equals(o.getOfficeCode()) && o.getCity().matches("Boston")) {
					data.add(e.toString());
				}
			}
		}
		return data;
	}
}
