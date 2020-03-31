package org.com1028.coursework;

public class Main {

	public static void main(String[] args) {
		BaseQuery bq = null;
		try {
			bq = new BaseQuery("root", "something8.chicken.bicycle");

			Requirement1 r1 = new Requirement1();

			System.out.println("Requirement1: ");
			r1.requirement1(bq);

			Requirement2 r2 = new Requirement2();

			System.out.println("\n\nRequirement2: ");
			r2.requirement2(bq);

			Requirement3 r3 = new Requirement3();

			System.out.println("\n\nRequirement3: ");
			r3.requirement3(bq);

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
