package com.test.java.collection;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {

		this.name = name;
		this.age = age;
	
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		
		return String.format("%s(%d)",this.name,this.age);
	}


	@Override
	public int hashCode() {
		
		//이름 + 나이
		//홍길동20
		//아무개25
		//홍길동20
		
		//자바는 문자열이 같으면 주소값이 같다고 취급
		return (this.name + this.age).hashCode(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();
	}

	
	

}
