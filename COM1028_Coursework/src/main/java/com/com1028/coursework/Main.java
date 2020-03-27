package com.com1028.coursework;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Main {

	public static void main(String[] args) {
		BaseQuery bq = null;
		try {
			bq = new BaseQuery("root", "something8.chicken.bicycle");

			ResultSet rs = bq.useTable("customers");
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();

			for (int i = 1; i <= columnsNumber; i++) {
				System.out.print(rsmd.getColumnName(i) + " ");
			}
			System.out.println();

			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(columnValue);
				}
				System.out.println("");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bq.con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
