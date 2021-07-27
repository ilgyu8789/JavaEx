package com.javaex.api.objectclass.v3;

public class CircleApp {

	public static void main(String[] args) {
		Circle x = new Circle(6, 4, 10);
		Circle y = new Circle(2, 12, 10);
		Circle r = new Circle(3, 3, 12);
		Circle z = r;
		
		System.out.println(x.equals(y));
		System.out.println(x.equals(r));
		System.out.println(x.equals(z));
		System.out.println(z.equals(r));
	}

}
