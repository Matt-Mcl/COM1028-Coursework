package org.com1028.coursework;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OfficesTable {
	private List<Office> offices = new ArrayList<Office>();

	public OfficesTable(BaseQuery bq) {
		super();
		try {

			ResultSet rs = bq.useTable("offices");

			while (rs.next()) {
				String officeCode = rs.getString("officeCode");
				String city = rs.getString("city");
				Office o = new Office(officeCode, city);
				this.offices.add(o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Office> getOffices() {
		return offices;
	}

}
