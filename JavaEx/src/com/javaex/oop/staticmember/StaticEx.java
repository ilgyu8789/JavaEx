package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;	//	클래스 변수	
	public static String classVar;	//	클래스 변수
	public String instanceVar;	// 인스턴스 변수
	
	//	static 영역 초기화
	static {
		refCount = 0;
		classVar = "Static Member";
//		instanceVar = "Instance Member";	// static 영역이기 떄문에 instance사용 불가
		System.out.println("Static Block");
	
	
	}
	public StaticEx() {
		refCount ++;
		System.out.println("Instance Created!");
		System.out.println("현재 참조 카운트:" + refCount);
	}
	
	@Override
	protected void finalize() throws Throwable {
		refCount --;
		super.finalize();
		System.out.println("소멸자 호출");
	}
}
