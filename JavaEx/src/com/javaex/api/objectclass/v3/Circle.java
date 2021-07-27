package com.javaex.api.objectclass.v3;

public class Circle {
	//	필드
	private int x;
	private int y;
	private int radius;
	
	//	생성자
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	
	
	@Override
	public String toString() {
		//	객체 출력 포맷을 리턴해주기
		return String.format("Point(%d, %d)", x, y);
	}

	@Override
	public boolean equals(Object obj) {
		//	전달 받은 obj가 Circle 클래스의 객체인가?
		if (obj instanceof Circle) {
			//	캐스팅 가능
			Circle other = (Circle)obj;
			return radius == other.radius;
		}
		return super.equals(obj);
	}
	
}
