package org.com1028.coursework;

public class Requirement3 {

	public void requirement3(BaseQuery bq) {
		CustomersTable cs = new CustomersTable(bq);
		OrdersTable os = new OrdersTable(bq);
		OrderDetailsTable ods = new OrderDetailsTable(bq);

		for (Customer c : cs.getCustomers()) {
			for (Order o : os.getOrders()) {
				int total = 0;
				if (c.getCustomerNumber() == o.getCustomerNumber()) {
					for (OrderDetails od : ods.getOrderDetailsList()) {
						if (o.getOrderNumber() == od.getOrderNumber()) {
							total += od.getPriceEach() * od.getQuantityOrdered();
						}
					}
				}
				if (total > 25000) {
					System.out.println(
							"Customer Number: " + c.getCustomerName() + " | Order Number: " + o.getOrderNumber());
				}
			}
		}
	}
}
