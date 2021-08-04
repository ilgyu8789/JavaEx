package Practice01_2;

import java.util.*;

public class Problem07 {
	public static void main(String[] args) {
		
		int input = 0;
		int answer = 0;

		answer = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("====================");
		System.out.println(" [숫자 맞추기 게임 시작]");
		System.out.println("====================");
		
		do {
			System.out.print(">>");
			input = scanner.nextInt();

			if (input > answer) {
				System.out.println("더 작게");

			} else if (input < answer) {
				System.out.println("더 크게");

			} else {
				System.out.println("정답입니다");
				System.out.println("게임을 종료하시겠습니까?<y/n>");
			}

		} while (input != answer);

		
		System.out.println("====================");
		System.out.println(" [숫자 맞추기 게임 종료]");
		System.out.println("====================");
	}

}
