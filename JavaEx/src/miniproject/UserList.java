package miniproject;

import java.util.ArrayList;
import java.util.HashMap;

public class UserList {

	ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
	
	public static void List() {
		System.out.println("<1.리스트>");

	}

	public static void Enrollment() {
		System.out.println("<2.등록>");
	}

	public static void Delete() {
		System.out.println("<3.삭제>");
	}

	public static void Search() {
		System.out.println("<4.검색>");
	}

	public static void End() {
		System.out.println("******************");
		System.out.println("*    감사합니다    *");
		System.out.println("******************");

	}

	public static void Other() {
		System.out.println("[다시입력해주세요]");
	}
}