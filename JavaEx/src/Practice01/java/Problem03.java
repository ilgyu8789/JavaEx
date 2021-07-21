package Practice01.java;

public class Problem03 {
	public static void main(String[] args) {
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
//	세로버전		System.out.println(i + "*" + j + "=" + i * j);  
				
// 	가로버전				
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}	
	}
}


//	구구단 출력.