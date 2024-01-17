package com.test.java.collection;

public class MyStack {
	
	private String[] list;
	private int index;
	
	public MyStack() {
		
		this.list = new String[4];
		this.index = 0;
	}
	
	@Override
	public String toString() {

		String temp = "";

		temp += String.format("lenght: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		temp += "[\r\n";
		for (int i = 0; i < this.list.length; i++) {
			temp += String.format("   %d: %s\r\n", i, this.list[i]);
		}
		temp += "]\r\n";

		return temp;
	}

	public boolean push(String s) {
		
		if (checkLength()) {

			doubleList();
		}
		
		this.list[this.index] = s;
		this.index++;
		
		return true;
	}
	
	private void doubleList() {

		// 기존 배열 > (복사 + 교체) > 새로운 배열

		String[] temp = new String[this.list.length * 2];// 새로운 베열

		// 깊은 복사
		for (int i = 0; i < this.list.length; i++) {
			temp[i] = this.list[i];
		}

		// ** 교체
		this.list = temp; // 주소값 복사

	}
	
	private boolean checkLength() {

		// 배열의 길이를 체크하는 메소드
		if (this.index == this.list.length) { // 배열의 방이 꽉참
			// 방이 꽉 착다.
			return true;
		}
		// 방이 남아있다.
		return false;
	}

	public String pop() {
		//후입선출
		String item = this.list[this.index-1];

		//꺼내면 사라짐 
		//left shift 발생
		
		for(int i=index-1; i<this.list.length-2;i++) {
			this.list[i] = this.list[i+1];
			
		}
		//인덱스도 줄여줘야 함
		this.index--;
		return item;
		
	}

	public int size() {
		
		return this.index;
	}

	public String peek() {
		String item = this.list[this.index-1];
		return item;
	}

	public void clear() {
		this.index = 0;
	}

}
