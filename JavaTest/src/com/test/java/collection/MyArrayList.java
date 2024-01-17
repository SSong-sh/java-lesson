package com.test.java.collection;

import java.util.Arrays;

public class MyArrayList {

	private String[] list;
	private int index;

	public MyArrayList() {
//		this.list = new String[4];
//		this.index = 0; // 데이터를 추가할 방번호
		
		this(4);
		
	}
	public MyArrayList(int capacity) {
		this.list = new String[capacity];
		this.index = 0; // 데이터를 추가할 방번호
		
	}

	
	
	public boolean add(String s) {

		// 배열의 방이 모자란지 확인?
		if (checkLength()) {

			doubleList();
		}

		// append
		this.list[this.index] = s;
		this.index++;

		return true; // false가 나면 에러가 나기 때문에 대부분 true가 반환됨
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

	public String get(int index) {

		if (!checkIndex(index)) {
			// 강제 에러발생
			throw new IndexOutOfBoundsException();
		}

		return this.list[index];

	}

	private boolean checkIndex(int index) {

		// 사용 가능한 방번호?
		if (index >= 0 && index < this.index) { // index는 지역변수 , this.index는 멤버변수
			return true;
		}

		return false;
	}

	public int size() {

		return this.index; // index가 데이터의 개수와 같음
	}

	public void set(int index, String s) {

		if (!checkIndex(index)) {
			// 강제 에러발생
			throw new IndexOutOfBoundsException();
		}
		
		this.list[index] = s;

	

	}

	public void remove(int index) {

		//left Shift
		for (int i = index; i < this.list.length - 1; i++) {
			this.list[i] = this.list[i + 1];
		}

		this.index--;

	}

	public void remove(String s) {
		
		//삭제할 요소 검색
		int index =-1;
		
		index = indexOf(s); //검색에 인덱스 찾는거 응용 ! => 중복되는 코드 없애기
		
		this.remove(index);
	}
	
	public void add(int index, String s) {
		
		if (checkLength()) {

			doubleList();
		}
		
		//Right Shift
		for (int i = this.list.length - 2; i >= index; i--) {
			// System.out.println(i);
			list[i + 1] = list[i];
		}
		
		this.list[index] = s;
		this.index++;
		
	}
	
	public int indexOf(String s) {
		
//		for(int i=0; i<this.index;i++) {
//			if(this.list[i].equals(s)) {
//				return i; //찾으면 그 방번호 돌려줌 
//			}
//		}
		return indexOf(s,0);
	}



	public int lastIndexOf(String s) {
	
//		for(int i=this.index-1; i>=0;i--) {
//			if(this.list[i].equals(s)) {
//				return i; //찾으면 그 방번호 돌려줌 
//			}
//		}
//		
		return lastIndexOf(s,this.index-1); //리팩토링
	}



	public int indexOf(String s, int beginIndex) {
		
		for(int i=beginIndex; i<this.index;i++) {
			if(this.list[i].equals(s)) {
				return i; //찾으면 그 방번호 돌려줌 
			}
		}
		return -1;
		
	}



	public int lastIndexOf(String s, int beginindex) {
		
		for(int i=beginindex; i>=0;i--) {
			if(this.list[i].equals(s)) {
				return i; //찾으면 그 방번호 돌려줌 
			}
		}
		
		return -1;
	}



	public void clear() {
		
//		for(int i=0; i<this.index;i++) {
//			this.list[i]=null;
//		}
//		
//		this.index = 0;
		
		//기존 배열을 만들고 원래 배열크기인 4개로 바꾼 새로운 배열 만들기
//		this.list = new String[4];
//		this.index =0;
		
		
		//이게 가장 가볍고 좋은 방법, index를 제어하고 있기 때문에 인덱스만 0이고 안에 자료가 있어도 어차피 쓰레기 값 처리
		// 3번째 값을 출력하고 싶어도 index가 0이기 때문에 에러뜸 
		
		this.index = 0;
		
	}



	public void trimToSize() { //double 리스트랑 비슷함 
		
		//8크기의 배열을 > 6칸으로 줄일꺼야!
		
		String[] temp = new String[this.index];
		
		//깊은 복사
		for(int i=0; i<this.index;i++) {
			temp[i] =this.list[i];
			
		}
		
		this.list = temp;
		
	}

}
