package org.com1028.coursework;

public class Requirement1 {

	public void requirement1(BaseQuery bq) {
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
				System.out.println(p.toString());
			}
		}
	}
}
