package Practice01.java;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.print("숫자:");
	      int num1 = scanner.nextInt();
	      System.out.print("숫자:");
	      int num2 = scanner.nextInt();
	      System.out.print("숫자:");
	      int num3 = scanner.nextInt();
	      System.out.print("숫자:");
	      int num4 = scanner.nextInt();
	      System.out.print("숫자:");
	      int num5 = scanner.nextInt();
	      
	      int max = num1;
	      if (num2 > max) 
	         max = num2;
	      if (num3 > max) 
	         max = num3;
	      if (num4 > max) 
	         max = num4;
	      if (num5 > max) 
	         max = num5;
	               
	      scanner.close();
	      System.out.println("최대값은 " + max + "입니다.");
	      
	      
	   }
	}
//	문제:	정수 5개를 입력받아 가장 큰 수를 출력.