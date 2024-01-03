package com.test.java;

public class Ex04_Variable {
	
	public static void main(String[] args) {
		
		// + 연산자
		int a =10;
		int b = 20;
		
		// 10 + 20 = 30
		
		// A + B > 이항 연산자 (피연사자를 2개)
		// 연산자 우선순위 
		// 연산자 방향 (대다수는 왼쪽부터)
		System.out.println(a + " + " + b + " = " + (a + b));
		
		
		// 주민등록 번호 입력 > 출력
		// ex) 950105
		
		int jumin1 = 950105;
		System.out.println("주민번호: " + jumin1);
		
		jumin1 = 030711;
		System.out.println("주민번호: " + jumin1); // 8진수로 인식해 계산하고 10진수로 출력
		
		//자바의 기수법
		//- 10진수
		// - 8진수
		// - 16진수
		// - 2진수
		
		System.out.println(10); //10진수
		System.out.println(010); //8진수 => 출력은 기본적으로 10진수로 됨
		System.out.println(0x10); //16진수 => 웹에서 색상값을 표현할 때 사용됨
		System.out.println(0b10); //2진수
		
		
		// 실수 리터럴
		double d1 = 1200;
		double d2 = 1.2e+3;
		
		System.out.println(d1);
		System.out.println(d2);
		
		d1 = 0.012;
		d2 = 1.2e-2;
		
		System.out.println(d1);
		System.out.println(d2);
	}

}
	