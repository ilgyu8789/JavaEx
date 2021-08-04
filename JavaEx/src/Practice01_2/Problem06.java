package Practice01_2;

import java.util.*;

public class Problem06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 입력 받은 숫자가 홀수(짝수)인 경우 입력 값까지 홀수(짝수)의 합?
		int even = 0;
		int odd = 0;
		
		System.out.println("숫자 입력");
		int s = scanner.nextInt();

		for (int i = 0; i <= s; i++) {
			if (i % 2 == 0) {
				even = even + (i);
			}
		}
		
		for (int i = 0; i <= s; i++) {
			if (i % 2 == 1) {
				odd = odd + (i);
			}
		}
		if(s%2==0)
		System.out.println("1부터 10까지 짝수의 합 = " + even + "입니다.\n");
		else if(s%2!=0)
		System.out.println("1부터 10까지 홀수의 합 = " + odd + "입니다.\n");
	}
}