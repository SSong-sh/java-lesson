package com.test.question;

public class MyHashMap {

	//key + value
	//Case 1.
	private String[] keys;
	private String[] values;
	private int index;
	
	
	public MyHashMap() {
		
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	
	@Override
	public String toString() {

		String temp = "";
		
		temp += "\r\n";
		temp += String.format("lenght: %d\r\n", this.keys.length);
		temp += String.format("index: %d\r\n", this.index);
		temp += "[\r\n";
		for (int i = 0; i < this.keys.length; i++) {
			temp += String.format("   %s: %s,\r\n", i, this.keys[i],this.values[i]);
		}
		temp += "]\r\n";

		return temp;
	}
	
	public void put(String key, String value) {
		
		if(getIndex(key)== -1) { //key가 현재 배열에 없는 경우
			
			if (checkLength()) {

				doubleList();
			}
			
			this.keys[this.index] = key;
			this.values[this.index] = value;
			this.index++;
			
		}else { //key가 배열에 이미 존재하는 경우 => 수정 put
			this.values[getIndex(key)] = value;
		}

	}

	private void doubleList() {
		// 기존 배열 > (복사 + 교체) > 새로운 배열

		String[] temp = new String[this.keys.length * 2];// 새로운 베열

		// 깊은 복사
		for (int i = 0; i < this.keys.length; i++) {
			temp[i] = this.keys[i];
		}

		// ** 교체
		this.keys = temp; // 주소값 복사
		
	}

	private boolean checkLength() {
		// 배열의 길이를 체크하는 메소드
		if (this.index == this.keys.length) { // 배열의 방이 꽉참
			// 방이 꽉 착다.
			return true;
		}
		// 방이 남아있다.
		return false;
	}
	

	private int getIndex(String key) {
		
		for(int i=0; i<this.index;i++) {
			if(this.keys[i].equals(key)) {
				return i; //키 배열에서 인덱스 값이 키와 동일한 걸 찾으면 그 인덱스를 반환
			}
		}
		return -1;
	}

	public String get(String key) { 
		
		int index = getIndex(key); //getIndex에서 찾은 키를 인덱스에 초기화
		
		if(index != -1) { //인덱스가 있다면 
			return this.values[index]; //값 배열의 해당 인덱스의 값을 출력
		}else {
			return null;
		}
		
		
	}

	public int size() {
		
		return this.index;
	}

	public void remove(String key) {
		
		int index = getIndex(key); //getIndex에서 찾은 키를 인덱스에 초기화
		
		if(index > -1) { //index가 있으면 아래 반복
			for (int i=index; i<= this.keys.length-2; i++) { //키 배열 옮기고
				this.keys[i] = this.keys[i+1];
			}
			
			for(int i=index; i<=this.values.length-2;i++) { //값 배열도 옮겨야함
				this.values[i] = this.values[i+1];
			}
			
			this.index--;
		}
		
	}

	public boolean containsKey(String key) {
		if (getIndex(key)>-1) { //키 배열에서 인덱스 값이 키와 동일한 걸 찾으면 참 거짓 반환
			return true;
		}
		return false;
	}

	public boolean containsValue(String value) {
		for(int i=0; i<this.index;i++) {
			if(this.values[i].equals(value)) { //값 배열에서 인덱스 값이 값과 동일한 걸 찾으면 참 거짓 반환
				return true;
			}
		}
		return false;
	}

	public void clear() {
		
		this.index =0;
		
	}
	
	
	

//	public String get(String s) {
//
//		String keyValue = "";
//		
//		if(this.keys[this.index] == s) {
//			keyValue = this.key;
//		}
//
//		return "";
//	}
	
	
	//Case 2/
//	private Entry[] list;
//	private int index;

}

//class Entry {
//	private String key;
//	private String value;	
//}
