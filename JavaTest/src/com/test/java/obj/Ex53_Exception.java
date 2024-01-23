package com.test.java.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex53_Exception {
	
	public static void main(String[] args) {
		
		/* 
		 
		 예외, Exception
		 - 런타임 오류
		 - 컴파일 발견(x) > 실행 중 발견(o)
		 > 개발자 미리 예측 > 사전 조치
		 
		 예외 처리, Exception Handling
		 1. 제어문 사용
		 
		 2. 전용 처리 > try catch문
		 
		 3. 
		 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		
		try {
			m5();
			//m6();
			
		} catch (Exception e) {
			System.out.println("에러처리");
		}
	
		//m7();
		
	
		
	}//main

	private static void m7() {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

		try {
			int input = Integer.parseInt(reader.readLine());
			
		} catch (Exception e) {
			System.out.println("Ex53_Exception.m7"); //클래스 이름. 메서드 이름 (어디서 에러가 났는지 확인 가능)
			e.printStackTrace();
		}
			

		
	}

	private static void m6() {
		
		//wrapping class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void m5() throws Exception{
		//예외 미루기
		//- 특정 메서드에 발생한 예외를 해당 메서드가 직접 처리하지 않고, 그 예외 처리의 책임을 메서드를 호출한 쪽으로 넘기는 기술
		
		int n =0 ;
		System.out.println(100/n);
		
	}

	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		int num = scan.nextInt();
		
		try {
			//비즈니스 코드 영역
			System.out.println(100 / num);
		} catch (Exception e) {
			//예외 처리 영역
			System.out.println("예외 처리");
			
		} finally {
			//자원 해제 영역
			//성공 or 실패 > 무조건 실행하는 영역
			System.out.println("finally");
			scan.close(); // 자원 해제 > clean-up code.
		}
		
	}

	private static void m3() {

		try {

			int num = 10;
			System.out.println(100 / num);

			int[] nums = { 10, 20, 30 };
			System.out.println(nums[1]);

			Random rnd = new Random();
			System.out.println(rnd.nextInt());
			
			//이 에러를 잡을 사람이 없으면 완전 에러가 나면서 프로그램을 중단시킴
			//그래서 맨 마지막에 catch (Exception e) 써줘야 함 , but 무슨 에러인지는 정확히 알 수 없음.
			Object object = new Object();
			Random temp = (Random) object;

		//중첩 catch문을 쓰면 어디서 어떤 에러가 났는지 알수 있음.
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누기 > 김대리 연락");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		}catch (NullPointerException e) {
			//System.out.println(e.getMessage());
			System.out.println("널 참조 > 최대리 연락");
		}
		catch (Exception e) { //모든 Exception으로 끝나는 것들의 부모역할
			System.out.println("예외처리");
		}

	}

	//실행중 에러가 나는 구문, 문법적으로는 에러가 없음
	private static void m2() {
		
		int num = 0;
		
		try {
		System.out.println(100/num);
		} catch (Exception e) {
			System.out.println("0으로 나누기 > 김대리 연락");
		}
		
		
		int[] nums = {10,20,30};
		
		try {
		System.out.println(nums[5]);
		}catch (Exception e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		}
		
		
		Random rnd = null;
		try {
			System.out.println(rnd.nextInt());
		} catch (Exception e) {
			System.out.println("널 참조 > 최대리 연락");
		}
		
		
		
		
	}

	private static void m1() {
		//요구사항] 숫자를 입력받아 처리를 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		//0이 들어가면 예외 발생
		int num = scan.nextInt();
		
		//예외 조건
//		if(num !=0) {
//			//비즈니스코드(업무코드)
//			System.out.printf("100 / %d = %d\n", num, 100/num);
//		} else {
//			//예외처리코드
//			System.out.println("0을 입력하지 마시오.");
//		}
		
		
		
		//*** try문 > 감시!!! > 에러가 발생하는지 계속 검사!! //에러가 발생하기 전까지만 try 실행 
		//*** catch문 > 예외처리!!!
		
		try { //에러가 발생해도 프로그램을 중단하지 않고 예외처리를 한 후 프로그램을 진행함
			//비즈니스코드(업무코드)
			System.out.println(111);
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println(222);
		} catch (Exception e) {
			
			//e: 예외 객체
			//- 발생한 예외에 대한 여러가지 정보를 제공하는 객체
			//System.out.println(e.getMessage());
			e.printStackTrace(); //에러 메세지를 보여줌
			
			//예외처리코드
			System.out.println("0을 입력하지 마시오.");
		}
		
		System.out.println("종료"); //위에서 에러가 발생하면 실행이 안됨.
		
	}

}
