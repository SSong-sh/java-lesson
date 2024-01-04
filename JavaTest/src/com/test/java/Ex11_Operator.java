package com.test.java;

public class Ex11_Operator {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 연산자, Operator
		 - 수학 연산자 > 프로그래밍 연산자
		 - 피연산자를 대상으로 미리 정해진 연산(행동)을 한 후에 연산(행동)의 결과를 반환하는 역할
		 - 주로 기호를 사용 + 단어도 사용
		 
		 1. 문장, Statement
		 2. 표현식, Expression
		 3. 연산자, Operator
		 4. 피연산자, Operand
		 5. 연산자 우선순위
		 6. 연산자 연산방향

		 
		 1. 문장, Statement
		 - 1개 이상의 표현식이 모여서 문장을 만든다. 
		 ex) int sum = 10 +20;
		 
		 2. 표현식, Expression
		 - 문장을 구성하는 최소 단위
		 ex) int sum
		  	 10 +20 
		  	 sum = 30
		  	 10 
		  	 20
		  	 
		 3. 연산자, Operator
		 - +
		 - =
		 
		 4. 피연산자, Operand
		 - + : 10, 20 
		 - = : sum, 30
		 
		 5. 연산자 우선순위
		 - 하나의 문장에 속해있는 연산자들 중 누구를 먼저 실행해야 할 지 정해져있는 순서
		 
		 - 1 + 2 x 3 
		 
		 6. 연산자 연산방향
		 - 하나의 문장에 속해있는 연산자들이 모두 연산자 우선 순위가 동일 할 때 누구를 먼저 실행해야할지 정해져 있는 순서
		 - 1 + 2 + 3
		 
		 
		 연산자 종류 
		 1. 행동 (목적)
		 	a. 산술 연산자
		 	b. 비교 연산자
		 	c. 논리 연산자
		 	d. 대입 연산자
		 	e. 증감 연산자
		 	f. 조건 연산자
		 	g. 비트 연산자
		 	
		 
		 2. 형태 (피연산자 개수) 
		 	a. 1항 연산자, 단항 연산자
		 	b. 2항 연산자
		 	c. 3항 연산자
		 
		 
		 */
		
		//산술 연산자
		//- +, -, *, /, %(mod, 나머지)
		//- 이항 연산자
		//- 피연산자를 숫자형을 가진다. (정수,실수)
		
		int a = 10;
		int b = 3;
		
		//10 + 3 =13
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		System.out.printf("%d %% %d = %d\n",a,b,a%b);//%를 하나만 쓰면 스페이스와 %를 형식문자로 생각해서 에러가 남
	
		double c = 10;
		double d =3;
		
		System.out.printf("%.0f / %.0f = %f\n", c, d, c /d );
		
		//정수 / 정수 = 정수
		//실수 / 실수 = 실수
		//정수 / 실수 = 실수
		//실수 / 정수 = 실수
		
		//*** 모든 산술 연산자의 결과값의 자료형 > 두 피연산자의 자료형 중에서 더 크기가 더 큰 자료형으로 반환된다.
		//> 데이터 손실을 최소화하기 위해서
		
		int e = 1000;
		byte f = 10;
		System.out.println(e+f); //int + byte = int
		
		int g = 1000000000;
		int h = 2000000000;
		
		long i =(long)g+h;
		System.out.println(i); //int 30억을 표현할 수 없음. => 에러가 안 뜨고 이상한 값이 나오기 때문에 주의!!
		
		
		
		byte j =10;
		byte k = 20;
		
		System.out.println(j+k);
		
		// Type mismatch: cannot convert from int to byte 에러 발생
		// byte와 short의 연산의 결과는 항상 int이다.
		
		byte l = (byte)(j + k) ; //형 변환이 귀찮기 때문에 주로 int를 자주 사용함 
		//정수 > int 주로 사용. 가끔씩 long 사용
		//실수 > double 주로 사용 (정밀도 때문)
		
		
		
		//%(나머지)
		//-패턴 생성 (홀짝 패턴 등등)
		
		
		
		//달력 만들기
		//1. 년월 > 1일 > 무슨 요일?
		// - 서기 1년 1월 1일 > 월요일
		//2. 년월 > 마지막일?
		
	}

}
