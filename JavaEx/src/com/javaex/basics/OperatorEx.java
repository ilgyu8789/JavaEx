package com.javaex.basics;

public class OperatorEx {
	public static void main(String[] args) {
//		arithOperEx();
//		logicOperEx();
//		bitOperEx();
//		bitShiftOperEx();
		conditionalOperEx();
	}
	
	// 3항 연산자
	private static void conditionalOperEx() {
		// 문법: 조건식 ? 참일 때의 값 또는 식: 거짓일 때의 값 또는 식;
		int a = 10;
		
		boolean result;

		
		int score = 60;
		// 만약 score >= 80 -> Good
		// 만약 score >= 50 -> Pass
		// 만약 score < 50 -> Fail
		
		String message = score >= 80 ? "Good":
							score >= 50 ? "Pass": "Fail";
		System.out.println("Score:" + score
				+ ", 결과:" + message);
							
		
	}
	
	// 비트 시프트 연산자
	private static void bitShiftOperEx() {
		// 비트 단위로 이동
		int val = 1;
		// 좌측 시프트(<<)
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val << 1)); // 왼쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val << 4)); // 왼쪽으로 4비트 이동
		
		System.out.println(Integer.toBinaryString(2021));
		// 우측 시프트(>>)
		val = -2021;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val >> 2)); // 우측으로 2비트 이동
		// 우측 시프트(>>>)
		System.out.println(Integer.toBinaryString(val >>> 2)); // 
	}
	
	// 비트 연산자
			private static void bitOperEx() {
				byte b1 = 0b1101;
				byte b2 = 0b0111;
//			@@
				System.out.println("b1:" + Integer.toBinaryString(b1));
				System.out.println("b2:" + Integer.toBinaryString(b2)); 
				
				int result = b1 & b2;
				System.out.println("b1 & b2 : " + Integer.toBinaryString(result));
				
				result = b1 | b2;	// 비트 논리합
				System.out.println("b1 | b2 : " + Integer.toBinaryString(result));
				
				result = ~b1;	// 비트 논리 부정
				System.out.println("~b1 :" + Integer.toBinaryString(result));
				
				result = b1 ^ b2;	// 배타적 논리합
				System.out.println("b1 ^ b2 :" + Integer.toBinaryString(result));
			}
	// 비교 연산과 논리 연산
	private static void logicOperEx() {
		int a = 7, b = 3;
	
		
		
		// 비교 연산자: >, >=, <, <=, ==(같다), !(같지 않다)
		System.out.println("a > b ?" + (a > b));
		System.out.println("a와 b가 같습니까? " + (a == b));
		System.out.println("a와 b가 다릅니까? " + (a != b));
		
		// 논리 연산자: 논리곱(AND:&&), 논리합(OR:||), 논리부정(NOT:!)
		int num = 5;
		
		// num: 0초과 10미만의 값인가?
		//		조건1: num > 0
		//		조건2: num <10
		// 결과: 조건1 and 조건2
		boolean r1 = num > 0;
		boolean r2 = num < 10;
		boolean r1Andr2 = r1 && r2;
		//	num > 0 && num < 10
		System.out.println("r1 && r2 => " + r1Andr2);
		
		// num: 0이하이거나 10이상의 값인가?
		// 		조건1 = num <= 0 ?
		//		조건2 = num >== 10 ?
		//	결과: 조건1 or 조건2(논리합: 합집합)
		boolean r3 = num <= 0;
		boolean r4 = num >=10;
		boolean r3Orr4 = r3 || r4;
		//	num가 <= 0 || num >= 10
		System.out.println("r3 || r4=> " + r3Orr4);
		
		//	논리 부정:
		//	num > 0 && num < 10 -> 논리 부정
		// 	num <== 0 || num >= 10
		
		boolean rNot = (num > 0 && num < 10);
		System.out.println("num가 0 초과, 10미만 이외의 값인가?" + rNot);
		
	}
	
	// 산술 연산
	private static void arithOperEx() {
		int a = 7, b = 3;
		
		// 부호 연산자: +, -
		System.out.println(-a);
		
		// 사칙연산: +, -, *, /
		System.out.println(a / b); // int / int = int
		System.out.println(a % b); // %는 정수 나눗셈의 나머지
		
		// 실제 해 구하기
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b); // 형 변환 -> 자동 타입 변환으로 float으로 표시
		
		// 증감 연산자: ++, --
		// 전치 증감(++a 등), 후치 증감(b--) 혼동하지 말 것
		int num = 10;
		// 전치 증감
		System.out.println("num:" + num);
		System.out.println("++num:" + ++num);
		System.out.println("num:" + num);
		
		// 후치 증감
		System.out.println("num:" + num);
		System.out.println("num++:" + num++);
		System.out.println("num:" + num);
		
		// 나눗셈 보충
//		System.out.println(4 / 0); // ArithmeticException
		System.out.println(4.0 / 0);	// Infinity
		System.out.println(4.0 / 0 + 10);	// Infinity가 포함된 연산값 = 항상 Infinity
		System.out.println(0.0 / 0.0); //	NaN (Not a Number) 
		
		//	우리의 연산식의 결과가 Infinity인지 확인을 할 수 있어야 함
		System.out.println(Double.isInfinite(4.0 / 0));	//Infinity인지 확인
		System.out.println(Double.isNaN(0.0 / 0.0));	//NaN인가 확인
		System.out.println("End of Code");
		
	}
	
	
}
