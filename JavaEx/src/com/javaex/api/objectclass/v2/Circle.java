package com.javaex.api.objectclass.v2;

public class Circle {
	
	private int x;
	private int y;
	private int r;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	@Override
	public String toString() {
		//	객체 출력 포맷을 리턴해주기
		return String.format("Point(%d, %d)", x, y);
	}

	@Override
	public boolean equals(Object obj) {
		//	전달 받은 obj가 Point 클래스의 객체인가?
		if (obj instanceof Point) {
			//	캐스팅 가능
			Point other = (Point)obj;
		}
		return super.equals(obj);
	}
	
}
