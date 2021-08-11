package com.javaex.thread.synchronize;

//	쓰레드
public class User extends Thread {  // <- Thread를 상속받겠다는 표시
	private SharedMemory memory;
	private int data;
	
	public User(String name, SharedMemory memory, int data) {
		super(name);	//	쓰레드 생성자
		this.memory = memory;
		this.data = data;
	}

	@Override
	public void run() {
		if (memory != null) {
			memory.setMemory(data);
		}
	}
	
	
}
