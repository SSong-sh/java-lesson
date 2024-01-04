package com.test.java;

import java.nio.channels.InterruptedByTimeoutException;

public class Ex15_Method {
	
	public static void main(String[] args) {
		
		//public static void hello()
		
		//void > 반환타입
		//hello > 메서드명 > *** 메서드명은 캐멀 표기법
		//() > 인자리스트
		
		//메서드 인자리스트
		//- 파라미터(Parameters)
		//- 인자(Argument)
		//- 매개변수
		
		//요구사항] '홍길동'에게 인사를 하는 메서드를 구현하시오.
		//요구사항] '아무개'에게 인사를 하는 메서드를 구현하시오.
		//요구사항] '테스트'에게 인사를 하는 메서드를 구현하시오.
		//요구사랑] 우리 강의실의 모든 사람에게 각각...x26
		//요구사랑] 대한민국 사람 ~
		
		hello();
		hello2();
		hello3();
		
		helloEveryone("홍길동"); //실인자(Real Args)
		checkAge(25); //가인자와 실인자의 자료형을 맞춰줘야 함
		checkAge(10);
		
		long a = 25;
		checkAge((int)a);
		
		checkScore(100, 90, 80);
		
	}//main
	
	/**
	 * 성적을 평가합니다.
	 * @param kor 국어점수
	 * @param eng 영어점수
	 * @param math 수학점수
	 */
	public static void checkScore(int kor, int eng, int math) {		
		int total = kor + eng + math; //총점
		
		double avg = total / 3.0; 
		
		String resultString = avg >= 60 ? "합격" : "불합격";
		
		System.out.printf("평균 점수 %.1f점은 %s입니다.\n",avg,resultString);
		
	}
	
	
	public static void checkAge(int age) {
		
		String result = age >=18 ? "통과" : "거절";
		
		System.out.printf("입력한 나이 %d세는 %s입니다.\n", age, result);
	}
	
	public static void hello() {
		//구현부
		System.out.println("홍길동님. 안녕하세요.");
		
	}
	
	public static void hello2() {
		System.out.println("아무개님. 안녕하세요.");
		
	}
	
	public static void hello3() {
		System.out.println("테스트님. 안녕하세요.");
		
	}
	
	public static void helloEveryone(String name) { //가인자(Formal Args)
		//String name = "홍길동";
		System.out.println(name + "님. 안녕하세요.");
		
	}
}
