package com.test.java;

public class Ex18_Method {
	
	public static void main(String[] args) {
		
		/*
		 
		 메서드 오버로딩, Method Overloading
		 - 같은 이름의 메서드를 여러개 만드는 기술
		 - 메서드의 인자 리스트를 다양한 형태로 구성해서, 같은 이름의 메서드를 여러개 만드는 기술
		 
		 
		 메서드 오버로딩을 하는 이유?
		 - 성능 향상 > x 
		 - 개발자에게 도움> o => 메서드 하나의 이름만 알면 되기 떄문에 편리함

		 
		 메서드 오버로딩 구현 조건 기능
		 1. 매개변수의 개수가 다르면 인정해줌
		 2. 매개변수의 자료형
		
		 
		 메서드 오버로딩 구현 조건 불가능 
		 1. 매개변수의 이름
		 2. 반환값의 자료형
		 
		 
		 메서드 만드는 중..
		 1. public static void test() {} 			//o
		 2. public static void test() {} 			//x, 1번 때문에
		 3. public static void test(int n) {} 		//o => 매개변수의 개수가 다름 => 즉 호출 하는 방법이 다르기 때문에 다른 메서드로 인정해줌
		 4. public static void test(int m) {} 		//x,3번 땜에 => 매개변수의 이름이 다르다고 메서드가 다른게 아님 => 매개 변수를 넘길 때 이름을 지정하고 넘기는 것이 아님
		 5. public static void test(int n, int m) {}//o
		 6. public static void test(String) {}  	//0 => 인자의 자료형이 다르니 때문에 가능
		 7. public static int test () {}			//x,1번 땜에
		 
		 
		 */
		
		//요구사항] 선을 그리는 메서드를 선언하시오.
		//요구사항] ---- 을 그리는 메서드를 선언하시오.
		//요구사항] **** 선을 그리는 메서드를 선언하시오.
		
		
//		drawLine();
//		System.out.println("   성적표");
//		drawLine();
		
		//기본선
		drawLine(); //인자값이 없는거
		drawLine(); //인자값이 없는거
		drawLine(); //인자값이 없는거
		drawLine("+");
		drawLine("+");
		drawLine("+");
		
		
		
	}//main

	
//	public static void drawLine() {		
//		
//		System.out.println("==========");
//		
//	}
//	
//	public static void drawLine() {		
//		
//		System.out.println("---------");
//		
//	}
//	public static void drawLine() {		
//		
//		System.out.println("**********");
//		
//	}
	
	public static void drawLine() {		
		
		System.out.println("==========");
		
	}
	
	public static void drawLine(String c) {		
		
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);

		System.out.println();
		
	}
	//코드 컨벤션
	//네이밍 규칙 > 변수명, 메서드명, 클래스명 등..
	
	
	//K&R 스타일
	public static void m1() {
		
		
	}
	
	//Allman 스타일
	public static void m2() {
		
		
	}
	
}
