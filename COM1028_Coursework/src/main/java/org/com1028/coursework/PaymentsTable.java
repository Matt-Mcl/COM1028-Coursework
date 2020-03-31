package org.com1028.coursework;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaymentsTable {
	private List<Payment> payments = new ArrayList<Payment>();

	public PaymentsTable(BaseQuery bq) {
		super();
		try {
			ResultSet rs = bq.useTable("payments");

			while (rs.next()) {
				int customerNumber = rs.getInt("customerNumber");
				String checkNumber = rs.getString("checkNumber");
				Date paymentDate = rs.getDate("paymentDate");
				double amount = rs.getDouble("amount");
				Payment p = new Payment(customerNumber, checkNumber, paymentDate, amount);
				this.payments.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Payment> getPayments() {
		return payments;
	}
}
