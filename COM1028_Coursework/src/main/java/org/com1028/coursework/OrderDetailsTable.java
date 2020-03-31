package org.com1028.coursework;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailsTable {
	private List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();

	public OrderDetailsTable(BaseQuery bq) {
		super();
		try {
			ResultSet rs = bq.useTable("orderdetails");

			while (rs.next()) {
				int orderNumber = rs.getInt("orderNumber");
				int quantityOrdered = rs.getInt("quantityOrdered");
				int priceEach = rs.getInt("priceEach");
				OrderDetails od = new OrderDetails(orderNumber, quantityOrdered, priceEach);
				this.orderDetailsList.add(od);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<OrderDetails> getOrderDetailsList() {
		return orderDetailsList;
	}
}