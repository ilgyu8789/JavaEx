package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//	Queue: 선입선출(First Input First Output: FIFO)
		Queue<Integer> queue = new LinkedList<>();
		
		//	데이터 제공
		for(int i = 0; i < 5; i++) {
			queue.offer(i);
			System.out.println("QUEUE:" + queue);
		}
		
		//	가장 먼저 입력된 데이터 확인 후 삭제는 안한다
		System.out.println("PEEK:" + queue.peek());
		System.out.println("QUEUE:" + queue);	//	0이 삭제되지 않고 출력
		
		//	poll 할 때는 반드시 비어있는지 확인!
		while(!queue.isEmpty()) {
			System.out.println("POLL:" + queue.poll());
			System.out.println("QUEUE:" + queue);
		}
		
	}

}
