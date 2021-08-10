package Practice01_2;

import java.util.*;

public class Problem08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); // 랜덤 객체 생성
		

		int answer = 10; // random.nextInt(100); // 100까지의 수만 랜덤
		System.out.println("====================");
		System.out.println(" [숫자 맞추기 게임 시작]");
		System.out.println("====================");

		int input_number = 0;
		while (true) {
			do {
				System.out.print(">> ");
				input_number = scanner.nextInt();
				if (input_number > answer) {
					System.out.println("더 낮게");
				}
				if (input_number < answer) {
					System.out.println("더 높게");
				}
			} while (input_number != answer);
			
			System.out.println("정답입니다");
			System.out.printf("게임을 종료하시겠습니까?(y/n)%n");
			System.out.println("====================");
			System.out.println(" [숫자 맞추기 게임 종료]");
			System.out.println("====================");
		}
	}
}