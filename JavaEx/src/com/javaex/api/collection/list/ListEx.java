package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// 다형성: 다른 코드에 손을 대지 않고 로직을 바꿀 수 있다
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();

		// 객체 추가: add -> 맨 뒤에 새로운 요소 추가
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");

		System.out.println("lst:" + lst);

		lst.add("Java"); // Append

		System.out.println("append:" + lst);
		// List는 순서가 있고, 중복 요소를 허용한다

		lst.add(3, "C#"); // Insert: 3번 인덱스에 C#을 삽입
		System.out.println("insert:" + lst);

		// 요소의 개수
		System.out.println("size:" + lst.size());
		// 버퍼 기반이 아니라 capacity는 없다
		lst.remove(3);
		System.out.println("remove:" + lst);
		lst.remove("Python"); // 객체로 삭제
		System.out.println("객체 삭제, remove" + lst);

		// 반복자: List에서는 Iterator를 이용
		Iterator<String> iter = lst.iterator();
		while (iter.hasNext()) { // 뒤에 남은 요소가 있는가 ?
			String item = iter.next(); // 요소를 받아오고 다음으로 이동
			System.out.print(item + " ");
		}
		System.out.println();

		// 리스트 비우기 
		lst.clear();
		System.out.println(lst);
	}

}
