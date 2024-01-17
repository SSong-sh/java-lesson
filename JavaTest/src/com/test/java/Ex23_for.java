package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23_for {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex23_for.java
		/*
		
			반복문
			- 특정 코드를 개발자가 원하는 횟수만큼 반복한다.
			- 생산성 향상 + 유지보수성 향상
			
			for (초기식; 조건식; 증감식) {
				구현부;
			}
		  
		*/
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		
	}//main

	private static void m13() throws NumberFormatException, IOException {
		
		//요구사항] 숫자 5개 입력(1~10사이) > 가장 큰 수?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0; //입력받을 숫자 중 가장 작은 숫자로 초기화
		int min = 10;
		
		for (int i=0; i<5; i++) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num > max) {
				max = num;
			}
			
			if (num < min) {
				min = num;
			}
			
		}
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}

	private static void m12() {
		
		//1 + 2 + 3 = 6
		int sum = 0;
		
		for (int i=1; i<=3; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		
		System.out.println("\b\b= " + sum);
		
	}

	private static void m11() {
		
		//난수 만들기
		//- 임의의 수 만들기
		
		//1. Math 클래스
		//2. Random 클래스
		
		//System.out.println(3.14);
		//System.out.println(Math.PI);
		
		//Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.
		//0이상 ~ 1미만
		//System.out.println(Math.random());
		
		for (int i=0; i<10; i++) {
			
			//System.out.println(Math.random());
			
			//가공
			//0.0 > 0   > 0
			//0.1 > 1.0 > 1
			//0.5 > 5.0 > 5
			//0.567 > 5.67 > 5
 			//0.9 > 9.0 > 9
			//System.out.println((int)(Math.random() * 10)); //0~9
			
			//주사위(1~6)
			//System.out.println((int)(Math.random() * 6) + 1);
			
			//5~8
			System.out.println((int)(Math.random() * 4) + 5);
			
		}
		
		
	}

	private static void m10() {
		
		//학교 > 선생님 + 학생 상담(30명)
		for (int i=1; i<=30; i++) {
			
//			if (i >= 16) {
//				break;
//			}
			
			if (i == 10 || i == 12 || i == 20) {
				continue;
			}
			
			System.out.println(i + "번 학생 상담중..");
			
		}
		
	}

	private static void m9() {
		
		//break > 현재 자신이 속한 제어문을 탈출해라!!
		//      > if문 제외
		//continue > 이번 반복을 중단하고 다시 시작으로 이동해라!!
		
		//break > 루프 완전 중단
		//continue > 이번만 건너뛰기
		
		for (int i=1; i<=10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		
		
		for (int i=1; i<=10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		
	}


	private static void m8() throws NumberFormatException, IOException {
		
		//무한 루프, Infinite loop
		//1. 사용자 실수
		//2. 사용자 의도 > 일부러
		
//		int num = Integer.MIN_VALUE;
//		System.out.println(num);
//		
//		num--;
//		System.out.println(num);
		

		//21억 회전
//		for (int i=0; i<10; i--) {
//			System.out.println("실행문");
//		}
		
		
		//무한 루프 생성하기
//		for (int i=0; true; i++) {
//			System.out.println("실행문");
//		}
		
//		for (int i=0; ; i++) {
//			System.out.println("실행문");
//		}
		
//		for (;;) {
//			System.out.println("실행문");
//		}
		
		
		//회전을 몇번할지 모를때? > 무한 루프
		//사용자 숫자 입력 > 합? 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (;;) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num == 0) {
				break;
			}
			
			sum += num;
		}
		
		System.out.println(sum);
		
		
	}

	private static void m7() throws NumberFormatException, IOException {
		
		//요구사항] 구구단 출력
		/*
			5 x 1 = 5
			5 x 2 = 10
			5 x 3 = 15
			..
			5 x 9 = 45
		*/
		
		for (int i=1; i<=9; i++) {
			System.out.printf("5 x %d = %2d\n", i, 5*i);
		}
		System.out.println();
		
		//요구사항] 사용자가 원하는 단을 출력
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단: ");
		int dan = Integer.parseInt(reader.readLine()); 
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
		}
		System.out.println();
		
		
	}

	private static void m6() throws NumberFormatException, IOException {
		
		//요구사항] 사용자가 입력한 숫자들의 합?(10개)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		
		System.out.println(sum);
		
	}

	private static void m5() throws NumberFormatException, IOException {
		
		//요구사항] 1 ~ 사용자가 입력한 숫자까지 합?
		
		int sum = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		
		int num = Integer.parseInt(reader.readLine());
		
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}

	private static void m4() {
		
		//요구사항] 1~10까지의 합 > 누적 연산
		
		//누적 변수(0으로 초기화)
		int sum = 0;
		
		//sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		//System.out.println(sum);
		
		for (int i=1; i<11; i++) {
			
			sum = sum + i;
			//i(1) > 1 = 0 + 1
			//i(2) > 3 = (0 + 1) + 2
			//i(3) > 6 = (0 + 1 + 2) + 3
			//i(4) >10 = (0 + 1 + 2 + 3) + 4
			//..
			//i(10) > 55 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) + 10
			
		}
		System.out.println(sum);
		
	}

	private static void m3() {
		
		//반복문 > 루프 변수!!(*****************************)
		
		//요구사항] 숫자 1~10까지 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println();
		
		int num = 1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println();
		
		
		num = 1;
		
		for (int i=0; i<10; i++) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		
		//루프 변수 > 원하는 수열을 제공
		for (int i=1; i<11; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i=1; i<11; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i=2; i<11; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i=7; i<101; i+=7) {
			System.out.println(i);
		}
		System.out.println();
		
	}

	private static void m2() {
		
		//반복문 > 회전수 제어?
		
		//i: 루프변수
		for (int i=1; i<=5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for (int i=5; i<=9; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for (int i=10; i>=6; i--) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for (int i=1; i<=21; i+=5) {
			System.out.println("실행문");
		}
		System.out.println();
		
		
		//가장 보편적인 형태
		for (int i=0; i<5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		
	}

	private static void m1() {
		
		//요구사항] "안녕하세요." x 500회 출력
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//순서(***)
		//1. int i=1; > 초기식
		//2. i<=5; > 조건식
		//3. 구현부 실행
		//4. i++ > 증감식
		//5. i<=5;
		//6. 구현부 실행
		//7. i++
		//8. i<=5;
		
		for (int i=1; i<=5; i++) {
			//System.out.println("안녕하세요.");
			hello();
		}
		
		
		
	}

	private static void hello() {
		System.out.println("안녕하세요.");
	}
	
}














