package com.test.java;

public class Ex17_LocalVariable {
	
	int b = 20; //맴버변수
	
	public static void main(String[] args) {
		
		/* 
		 
		 자바 변수 종류
		 -선언된 위치, 역할 차이
		 
		 
		 1. 멤버 변수 , Member Variable
		 	- 클래스 수업
		 
		 2. 지역 변수, Local Variable
		 	- 여태까지 사용한 변수
		 	- 메서드내에서 선언한 변수
		 	- 변수 스코프(Scope) > 변수의 사용 영역(범위) ***
		 	
		 	
		 	지역 변수의 생명주기, Life Cycle
		 	- 변수가 언제 태어나서(메모리에 생성) ~ 언제 죽는지 (메모리에 소멸)
		 	- 생성 > 변수 선언문이 실행될 때
		 	- 소멸 > 변수 선언문이 포함된 블럭을 빠져나갈 때
		 
		 
		 */
		
		int a = 10; //지역변수 = 지역은 메서드 지역을 의미
		int num = 100; //메인 메서드안에 있는 변수들이 오래 남기 때문에 메모리를 절약하기 위해서는 메인 메소드에는 변수 적게 만들기
		checkNumber(num);
		
		aaa();
		
	}//main
	
	public static void aaa() {
		int a = 10; //이 구문이 실행 될 때 a가 생김 
		bbb(a);
	}// 메서드가 사라질 때 지역변수 a가 사라짐
	
	public static void bbb(int a) {
		System.out.println(a);
	}
	
	public static void checkNumber(int num) { //매게변수도 지역변수의 일부분
		
		
	}
	
	public static void test1() {
		int c = 30;
	}
	
	public static void test2() {
		int d = 40;
		int c = 50; //지역이 다르기 때문에 int c라고 되어 있는 변수명 사용 가능
	}
	
	
	
}
