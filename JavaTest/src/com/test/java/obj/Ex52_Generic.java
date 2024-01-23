package com.test.java.obj;

import java.security.PublicKey;

public class Ex52_Generic {
	
	public static void main(String[] args) {
		
		//무조건 문자열만 넣어야 함
		Item<String> s1 = new Item<String>();
		s1.c = "홍길동";
		
		System.out.println(s1.c);
		
		//무조건 정수형만 넣어야 함 => Object와 차이점
		Item<Integer> s2 = new Item<Integer>();
		s2.c = 100;
		
		System.out.println(s2.c);
		
//		Pen<Boolean> p1 = new Pen<>(true);
//		Pen<Boolean> p2 = new Pen<Boolean>();
//		Pen<Boolean> p3 = new Pen(); // Pen에 기본 생성자가 있다고 가정합니다


		
		Desk<String> d1 = new Desk<String>();
		
		d1.setType("사무용");
		System.out.println(d1.getType());
		
		LapTop<String,Integer> macbook = new LapTop<String,Integer>("맥북",30000000 );
		System.out.println(macbook.getA());
		System.out.println(macbook.getB());
		
		LapTop<String,String> galaxy = new LapTop<>("갤럭시북","최고사양");
		System.out.println(galaxy.getA());
		System.out.println(galaxy.getB());
		
		
		
	}

}

//제네릭 클래스
//-T : 타입 변수(매개변수 역할) => 참조형만 쓸 수 있음 //한글자로 의미없는 걸로 적는게 관례
//-데이터를 담는것이 아니라 자료형을 담는 것
//-<> : 인자 리스트
class Item<T>{
	public int a;
	public int b;
	public T c; //클래스 선언시 c의 자료형이 결정되지 않음, 객체를 생성할 때 결졍
	
}

class Pen<T>{
	public T a;
	public T b;
	public T c; 
	
}

class Desk<T>{
	
	private T type;
	
	public void setType(T type) {
		this.type = type ;
	}
	
	public T getType() {
		return this.type;
	}
}


class LapTop<T,U>{
	
	public T a;
	public U b;
	
	public LapTop(T a,U b) {
		this.a=a;
		this.b=b;
	}

	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}
	
	
}
