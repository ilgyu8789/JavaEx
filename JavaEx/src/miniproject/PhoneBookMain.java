package miniproject;

import java.util.*;

public class PhoneBookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("******************");
		System.out.println("*전화번호 관리 프로그램*");
		System.out.println("******************");
		
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.print(">메뉴번호:");
		int num = scan.nextInt();
		
		PhoneNumberBook pb = new PhoneNumberBook();
		pb.PhoneBook();
		
		
			
	}

}
