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
				String phone = rs.getString("phone");
				String addressLine1 = rs.getString("addressLine1");
				String addressLine2 = rs.getString("addressLine2");
				String state = rs.getString("state");
				String country = rs.getString("country");
				String postalCode = rs.getString("postalCode");
				String territory = rs.getString("territory");
				Office o = new Office(officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode,
						territory);
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
