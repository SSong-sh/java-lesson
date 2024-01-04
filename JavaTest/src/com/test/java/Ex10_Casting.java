package com.test.java;

public class Ex10_Casting {
	public static void main(String[] args) {
		
		/*
		 + 변수 이름을 바꾸고 싶을 때 단축키 ctrl+1 하나만 고칠꺼냐, 다 고칠꺼냐를 선택할 수 있음
		 
		 
		 
		 형변환, 자료형변환
		 - Promotion, Casting
		 - 하나의 자료형을 다른 자료형으로 변환하는 작업
		 - 코드 작성을 유연하게 하기 위해서 사용
		 - int > double 
		 - float > short
		 
		 
		 1. 암시적 형변환(자동 형변환), Promotion
		 	- 큰형 = 작은형
		 	- 100% 안전
		 
		 2. 명시적 형변환(강제 형변환), Casting
		 	- 작은형 = 큰형
		 */
		
		byte b1;
		short s1;
		
		b1 = 10; //원본
		
		
		//LValue = RValue
		//***** LValue = RValue의 자료형은 반드시 동일
		
		//(자료형) : 형변환 연산자
		
		//Short = Byte
		//s1 = b1;
		s1 = (short)b1;
		
		
		System.out.println(s1); //복사본
		
		
		byte b2;
		short s2;
		
		s2 = 10; //원본
		
		//Byte(1) = Short(2)
		//자동으로 형변환 해주지 않음. 꼭 직접 써줘야함
		b2 = (byte)s2;
		
		System.out.println(b2); //복사본
		
		//기업 은행 > 계좌
		int m1;
		long m2 = 3000000000L;
		
		//계좌 이체
		
		m1 = (int)m2;
		
		System.out.printf("계좌이체결과: %,d원\n" , m1);
		
		
		//큰형 = 작은형
		//long = int
		//long = short
		//long = byte
		//int = short
		//int = byte
		//short = byte
		
		//작은형 = 큰형
		//byte = long
		//byte = int
		//byte = short
		//short = long
		//short = int
		//int = long
		
		
		//정수형 리터럴은 int이다.
		//실수형 리터럴은 double이다.
		
		//정수 > 정수
		//실수 > 실수
		//실수 > 정수
		//정수 > 실수
		
		
		int n1 = 100; //원본(4)
		float n2; //복사본(4)
		
		//float = ing
		//암시적 형변환 > 안전
		n2 = n1;
		
		System.out.println(n2);
		
		int n3; //복사본(4)
		float n4 = 30000000000F; //원본(4)
		
		//암시적 형변환이 안됨. float를 큰형으로 봄 (byte값이 같더라도 float의 값의 범위가 훨씬 큼)
		n3 = (int)n4;
		
		System.out.println(n3);
		
		
		long n5;
		float n6 = 10;
		
		//long(8) = float(4)
		n5 = (long) n6;
		
		System.out.println(n5);
		
		//*** 정수와 실수간의 크기 비교는 단순한 메로리 크기가 아닌, 실제 저장하는 수의 범위로 비교한다.
		
		//byte(1) < short(2) < int(4) < long (8) <<< float(4) < double(8) 
		
		//char 형변환
		char c1 = 'A'; //내부는 숫자 데이터
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println((char)65);
		
		char c2; //2byte - 원본
		short t2; //2byte
		
		c2 = '가';
	
		//short(2) = char(2) => 오른쪽을 큰 값으로 인식 = 명시적 형변환
		t2 = (short)c2; //문자 코드 값으로 변환
		
		System.out.println(c2);
		
		char c3;
		short t3;
		
		t3 = 65;
		
		c3 = (char)t3; //이상하게 또 오른쪽을 큰 값으로 인식 (둘의 자리를 바꿨는데도)
		//char는 음수가 없어서 short와 char의 같은 범위가 적음 => 그래서 명시적으로 하라고 하는 것
		//***** char는 반드시 int로만 형변환한다.
		
		System.out.println(c3);
		
		// ***** 값형과 참조형간에는 형변환이 절대 불가능하다.
		//System.out.println((int)"A");
		
		
		//"100" -> 100
		String txtString = "100";
		int result;
		result = Integer.parseInt(txtString);
		//이건 형변환이 아님. 그냥 할 수 있게 만드는 도구일뿐
		
		
		//100 -> "100"
		String txt2 = String.valueOf(100); //정석
		
		String txt3 = 100 + ""; //숫자와 문자를 더하면 연산이 안되고 두개가 붙은 문자열이 됨 = 편법
		String txt4 = "" + 100; 
		String txt5 = "" + 3.14; 
		String txt6 = "" + true; 
	}
}
