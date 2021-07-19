package com.javaex.basics;

import java.util.Scanner;	// java.util 패키지의 Scanner 로드 
public class ConsoleEx {

	public static void main(String[] args) {
	//	consoleInputEx();
		consoleInputPractice();
	}
	
	private static void consoleInputPractice() {
		// 표준 입력에서 이름과 니이를 입력 받아 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		String name = scanner.next();
		System.out.print("나이:");
		int age = scanner.nextInt();
		
		System.out.println("당신의 이름은, " + name + 
				"나이는 " + age+ "입니다");
		
		scanner.close();
		
	}
	
	private static void consoleInputEx() {
		// 표준 입력: stdin -> System.in
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		System.out.print("이름:");
		
		String name = scanner.next();
		System.out.println("당신의 이름은 " + name + "입니다");
		
		//	중요: 시스템 자원을 사용하는 Class는 사용 이후에 반드시 닫아야함
		scanner.close();
	} 
}
