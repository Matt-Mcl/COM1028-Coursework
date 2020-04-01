package org.com1028.coursework;

import java.util.ArrayList;
import java.util.List;

public class Requirement1 {

	public List<String> requirement1(BaseQuery bq) {
		List<String> data = new ArrayList<String>();
		PaymentsTable ps = new PaymentsTable(bq);

		double total = 0;
		double count = 0;
		for (Payment p : ps.getPayments()) {
			total += p.getAmount();
			count++;
		}

		double average = (total / count) * 2;

		for (Payment p : ps.getPayments()) {
			if (p.getAmount() > average) {
				data.add(p.toString());
			}
		}
		return data;
	}
}
