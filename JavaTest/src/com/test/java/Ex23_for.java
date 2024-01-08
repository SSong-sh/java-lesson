package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23_for {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 
		 반복문
		 - 특정 코드를 개발자가 원하는 횟수만큼 반복한다.
		 - 생산성 향상 + 유지보수성 향성
		 
		 for(초기식; 조건식; 증감식){
		 	구현부;
		 }		 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
	} //main

	private static void m6() throws NumberFormatException, IOException {
		//요구사항] 사용자자가 입력한 숫자들의 합?(10개)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		for(int i=0;i<10;i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		System.out.println(sum);
		
	}

	private static void m5() throws NumberFormatException, IOException {
		//요구사항] 1~사용자가 입력한 숫자까지 합?
		int sum = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		
		int num = Integer.parseInt(reader.readLine());
		
		for(int i=1;i<=num;i++) {
			
			sum = sum + i ;
	
		}
		System.out.println(sum);
		
	}

	private static void m4() {
		
		//요구사항] 1~10까지의 합 > 누적 연산
		
		//누적 변수(0으로 초기화)
		
		int sum = 0;
		
		for(int i=1; i<11; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
		
	}

	private static void m3() {
		//반복문 > 루프 변수!!(*******************)
		//요구사항] 숫자를 1~10까지 출력
		
		int num =1;
		
		for(int i=0; i<10;i++) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		//루프변수 > 원하는 수열을 제공 (중요한 역할)
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//홀수만 출력
		for(int i=1; i<=10;i+=2) {
			System.out.println(i);
			
		}
		System.out.println();
		
		//짝수만 출력
		for(int i=2; i<=10;i+=2) {
			System.out.println(i);
			
		}
		System.out.println();
		
		for(int i=7; i<=100; i+=7) {
			System.out.println(i);
			
		}
		System.out.println();
		
	}

	private static void m2() {
		//반복문 > 회전수 제어>
		
		//i : 루프변수
		for(int i = 1; i<=5; i++) {
			System.out.println("실행문");
		}
		
		System.out.println();
		
		for(int i = 5; i<=9; i++) {
			System.out.println("실행문");
		}
		
		System.out.println();
		
		for(int i = 10; i>=6; i--) {
			System.out.println("실행문");
		}
		
		System.out.println();
		
		
		//가장 보편적인 형태
		for(int i = 0; i< 5; i++) {
			System.out.println("실행문");
		}
		
		System.out.println();
	}

	private static void m1() {
		//요구사항] "안녕하세요." x 5회 출력
		// 1. 하드코딩 2. hello()메소드 만들기
		
		
		//순서(***)
		//1. int i=1; > 초기식 실행
		//2. i<=5 > 조건식
		//3. 구현부 실행
		//4. i++ > 증감식
		//5. i<=5;
		//6. 구현부 실헹
		//7. i++ > 증감식
		//8. i<=5 > 조건식 실행 
		//9. i++ > 증감식 i=4
		//10. i=6이 되는 순간 조건식을 만족하지 못해서 for문 블럭을 빠져나옴
		
		
		for (int i=1; i<=5; i++ ) {
			System.out.println("안녕하세요.");
		}
		
	}
}
