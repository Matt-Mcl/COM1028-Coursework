package org.com1028.coursework;

public class Requirement2 {

	public void requirement2(BaseQuery bq) {
		EmployeesTable es = new EmployeesTable(bq);
		OfficesTable os = new OfficesTable(bq);

		for (Employee e : es.getEmployees()) {
			for (Office o : os.getOffices()) {
				if (e.getOfficeCode().equals(o.getOfficeCode()) && o.getCity().matches("Boston")) {
					System.out.println(e.toString());
				}
			}
		}
	}
}
