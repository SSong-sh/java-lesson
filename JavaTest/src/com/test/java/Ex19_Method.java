package com.test.java;

public class Ex19_Method {
	
	public static void main(String[] args) {
		
		
		//재귀 메서드, Recursive Method
		//- 재귀 구조를 가진 메서드
		//- 메서드 구현부에서 자기 자신을 호출하는 메서드
		//- 어렵다. > 머리속으로 상상하기 힘들다.
		//- 파일 디렉토리 구조 or 트리 구조 > 많이 사용
		
		
		//m1();
		
		
		//팩토리얼 예제

		//요구사항] 팩토리얼 메서드를 구현하시오.
		
		int n = 4;
		int result = factorial(n);
		
		System.out.printf("%d! = %d\n", n, result);
		
		//같은 코드가 두 군데 이상 만들지 않기!!! 주의!!!
		

		
	}//main


	public static int factorial(int n) {
		
		
		return (n==1) ? 1 : n * factorial(n-1);
	}
	
	
	public static void m1() { //재귀 매서드
		
		System.out.println("메서드1");
		m1(); //재귀호출
	}

}
