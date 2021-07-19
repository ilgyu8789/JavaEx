package com.javaex.quiz02;

public class quiz01_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		
		// a는 짝수인가?
		System.out.println(a % 2 == 0);
		
		// b는 3의 배수입니까?
		System.out.println(b % 3 == 0);
		
		// 'a는 짝수이다'와 'b는 3의 배수이다'를 논리곱(&&)으로 연산하여 r1 변수로 저장 후 결과값 출력
		boolean r1 = a % 2 == 0 && b % 3 == 0;
		System.out.println(r1);
		
		// c의 4글자 뒤의 문자는 무엇인지 r2 변수에 저장하여 결과값을 출력해라
		char r2 = (char)(c + 4);
		System.out.println(r2);
	}
}
