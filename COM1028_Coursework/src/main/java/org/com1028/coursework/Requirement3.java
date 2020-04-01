package org.com1028.coursework;

import java.util.ArrayList;
import java.util.List;

public class Requirement3 {

	public List<String> requirement3(BaseQuery bq) {
		List<String> data = new ArrayList<String>();
		CustomersTable cs = new CustomersTable(bq);
		OrdersTable os = new OrdersTable(bq);
		OrderDetailsTable ods = new OrderDetailsTable(bq);

		for (Customer c : cs.getCustomers()) {
			for (Order o : os.getOrders()) {

				double total = 0;
				if (c.getCustomerNumber() == o.getCustomerNumber()) {
					for (OrderDetails od : ods.getOrderDetailsList()) {
						if (o.getOrderNumber() == od.getOrderNumber()) {
							total += od.getPriceEach() * od.getQuantityOrdered();
						}
					}
				}
				if (total > 25000) {
					data.add("Customer Name: " + c.getCustomerName() + ", Order Number: " + o.getOrderNumber());
				}
			}
		}
		return data;
	}
}
