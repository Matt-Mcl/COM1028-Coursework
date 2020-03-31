package org.com1028.coursework;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrdersTable {
	private List<Order> orders = new ArrayList<Order>();

	public OrdersTable(BaseQuery bq) {
		super();
		try {
			ResultSet rs = bq.useTable("orders");

			while (rs.next()) {
				int orderNumber = rs.getInt("orderNumber");
				int customerNumber = rs.getInt("customerNumber");
				Order o = new Order(orderNumber, customerNumber);
				this.orders.add(o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Order> getOrders() {
		return orders;
	}
}