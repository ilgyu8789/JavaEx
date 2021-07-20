package Practice01.java;

public class Problem01 {
	public static void main(String[] args) {
	// 1에서 100까지의 수에서 5의 배수 이면서 7의 배수인 수를 출력 
		for (int i = 1;
				i <= 100;
				i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);}
				else {}	
			}
		}				
	}
	

// if 조건문 true일 때 {실행문}을 수행, false일 땐 수행하지 않음
// continue를 사용하고 싶을 땐 continue 이후에 오는 모든 코드가 수행되지 않으므로 continue의 위치 확인 
// continue는 반복문(while, for문)에서만 사용 가능한 문법이다