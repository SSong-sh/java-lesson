package com.test.java;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class Ex03_Variable {
	public static void main(String[] args) {
		
		//정수
		byte b1;
		b1 = 100; //100 > 상수 (=데이터) > 정수형 상수, 정수형 리터럴
		System.out.println(b1);
		
		// b1 = 128; -> 범위를 벗어나는 값 넣을 수 없음
		
		b1 = Byte.MAX_VALUE; //JDK에서 제공하는 상수
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE; //JDK에서 제공하는 상수
		System.out.println(b1);
		
		short s1;
		s1 = 100;
		System.out.println(s1);
		
		s1 = 128;
		System.out.println(s1);
		
		
		int n1;
		n1 = 10000000;
		System.out.println(n1);
		
		n1 = Integer.MAX_VALUE;
		System.out.println(n1);
		
		
		long l1;
		//l1 = 3000000000; -> 상수를 int로 인식하기 때문에 메모리 용량이 부족해 에러 뜸
		l1 = 3000000000l; //대문자 소문자 상관없으나 대문자 쓰는 것이 좋음
		System.out.println(l1);
		
		//모든 상수들도 자료형을 가진다. => 정수형 상수는 int 타입이다.(*****중요)
		//정수의 기본은 int형으로 취급 => 메모리에서 4byte 메모리 할당
		
		//******* LValue와 RValue는 반드시 자료형이 동일해야 한다.
		//왼쪽(변수) = 오른쪽 (상수);
		//LValue = RValue
		
		
		//실수
		//***** 실수형 상수는 기본형이 double형이다.
		
		//단정도형
		float f1;
		f1 = 3.14F;
		
		//배정도형
		double d1;
		d1 = 6.28;
		
		//차이점
		f1 = 123.1234567890123456789012345678901234567890F;
		d1 = 123.1234567890123456789012345678901234567890D;
		
		System.out.println(f1);
		System.out.println(d1); //손실을 줄이고 정밀도 문제에서 실수를 저장할 땐 double을 사용하는 것이 좋음
		
		double d2 = 0.2;
		double d3 = 0.1;
		System.out.println(d2+d3); // 오차값 생김 -> 정수로 계산한 후 다시 원래 자릿수대로 돌리는 방법을 사용함 / 하지만 근사치로 허용하는 것이 대다수
		
		// 0.2 * 10 = 2 
		// 0.1 * 10 = 1
		// 2 + 1
		// 3 / 10 = 0.3
		
		//문자형
		char c1;
		c1 = 'A'; //데이터로써의 A임을 알려주기 위해 '' 사용 = 홑 따옴표 > 문자형 상수 (리터럴)
		
		c1 = '1'; //숫자 1과 무관. 문자로서의 1이다.
		
		
		//논리형
		//-boolean(불리언), bool(부울)
		boolean flag;
		flag = true; //논리형 상수(리터럴)
		flag = false;
		
		System.out.println(flag);
		
		//----------------------------------------------------------------
		
		
		
		//추가
		// - 참조형
		
		//String, 문자열
		//: 문자 열 > 문자들이 열을 지어 있는 형태 > 문자 집합 > char를 여러개 모아 놓은 자료형
		
		String name; //참조형은 대부분 class, 첫 문자는 대문자로
		name = "안녕하세요";  //문자열 상수 (리터럴)
		System.out.println(name);
		
		String m3 = ""; // 0개의 문자열 > 빈 문자열 , empty String 
		//- 문자열 변수를 초기화 할 때 많이 사용
		
		// 값형(기본형, 원시형) vs 참조형
		//- 메모리의 생성되는 규칙이 다르다.
		int a = 10; //값형
		String b = "홍길동"; //참조형
		
	}

}
