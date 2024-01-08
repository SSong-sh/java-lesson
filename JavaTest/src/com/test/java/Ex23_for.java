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
		//m6();
		//m7();
		
		//m8();
		//m9();
		//m10();
		
		//m11();
		//m12();
		m13();
		
		
	} //main

	private static void m13() throws NumberFormatException, IOException {
		//요구사항] 숫자 5개 입력(1~10사이) > 가장 큰 수?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0; //입력받을 숫자 중 가장 작은 숫자로 초기화 => 최소값을 넣어주셈
		int min = 10; //최솟값
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			int num =Integer.parseInt(reader.readLine());
			
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
		}
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}
	//백스페이스
	private static void m12() {
		//1 + 2 + 3 = 6
		int sum = 0;
		
		for(int i=1; i<=3; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.println("\b\b= " + sum);
	}

	private static void m11() {
		
		//난수 만둘기
		//- 임의의 수 ㅁ나들기
		
		//1. Math 클래스
		//2. Random 클래스 
		
//		System.out.println(Math.random());//double값 리턴( 0이상~1.00 값)
		
		for(int i=0;i<10;i++) {
			
			//난수 가공
			//0.0 > 0 > 0
			//0.1 > 1.0 > 1
			//0.5 > 5.0 > 5
			//System.out.println((int)(Math.random()*10)); //0~9사이
			
			//주사위(1~6)
			//System.out.println((int)(Math.random()*6) + 1); // 0~5사이 값 리턴
			
			
		}
	}

	private static void m10() {
		//학교 > 선생님 + 학생 상담(30)명
		for(int i=1; i<=30; i++) {
			
//			if(i >= 16) {
//				break; //15번 학생까지 상담하고 쉬는 시간
//			}
			
			if(i==10) {
				continue; //10번학생 결석처리
			}
			
			System.out.println(i + "번 학생 상담중...");
		}
	}

	private static void m9() {
		
		//break > 현재 자신이 속한 제어문을 탈출해라!!
		//		> if문 제외
		
		//break > 루프 완전 중단
		//continue > 이번만 건너뛰기
		
		for(int i =1; i<=10; i++) {
			if(i == 5) {
				break; //for문을 탈출함
			}
			System.out.println(i);
		}
		System.out.println();
		
		
		
		// continue > 이번 반복을 중단하고 다시 시작으로 이동해라!!
		for(int i =1; i<=10; i++) {
			if(i == 5) {
				continue; //하던 일을 멈추고 꼭대기로 올라가라
			}
			System.out.println(i);
		}
		System.out.println();
		
		
	}

	private static void m8() throws NumberFormatException, IOException {
		//무한 루프, Infinite loop
		//1. 사용자의 실수
		//2. 사용자 의도 > 일부러
		
//		for (int i=0; i<10; i++) {
//			System.out.println("실행문"); //-21억 정도에서 -1을 뺴면 비트 연산 오류로 21억이 되면서 루프를 빠져나감 => 진정한 무한 루프는 아님 
//		}
		
		//무한 루프 생성하기
//		for(int i=0; true; i++) {
//			System.out.println("실행문");//진정한 무한루프
//		}
//		for(int i=0; ;i++) {
//			System.out.println("실행문"); //진정한 무한루프
//		}
		
//		for(;;) {
//			System.out.println("실행문");
//		}
		
		//회전을 몇번할지 모를 때? > 무한 루프 사용
		//사용자 숫자 입력 > 합?
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		for(;;) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if(num ==0) {
				break;
			}
			
			
			sum += num;
		}
		
		System.out.println(sum);
		
	}

	private static void m7() throws NumberFormatException, IOException {
		//요구사항] 구구단 출력
		
		for(int i=1;i<=9;i++) {
			System.out.printf("5 x %d = %2d\n", i ,5*i);
		}
		
		System.out.println();
		
		//요구사항] 사용자가 원하는 단을 출력 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("단: ");
		int dan = Integer.parseInt(reader.readLine());
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d x %d = %2d\n", dan , i ,dan*i);
		}

		
		
		
		
	}

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
