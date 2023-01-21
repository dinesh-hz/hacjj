package org.static_fu;

public class Tese_case {

	int x = 1;

	static int y = 1;

	void counting() {

		x++;
		y++;
		
		System.out.println("x non static value :"+x+"y static value :"+y);
	}

	public static void main(String[] args) {

		Tese_case d = new Tese_case();

		d.counting();
		d.counting();
		d.counting();
		System.out.println("kjnjsb");
		Tese_case d1 = new Tese_case();
		
		d1.counting();
		d1.counting();
		d1.counting();

	}

}
