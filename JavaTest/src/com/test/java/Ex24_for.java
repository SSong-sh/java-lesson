package com.test.java;

public class Ex24_for {

	public static void main(String[] args) {
		
		//Ex24_for.java
		/*
		  
		  	중첩된 for문
		  	- 단일 for문
		  	- 2중 for문
		  	- 3중 for문
		  	
		  	for () {
		  		
		  	}
		  	
		  	for () {
		  		for () {
		  		
		  		}
		  	}
		
		*/
		
		//m1();
		//m2();
		//m3();
		m4();
		
		
	}//main

	private static void m4() {
		
		//별찍기(5x5)
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<5; i++) {
			for (int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	private static void m3() {
		
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				if (i == 5 || j == 5) {
					break; //continue;
				}
				
				System.out.printf("i: %d, j: %d\n", i, j);
				
			}
			
		}
		
	}

	private static void m2() {
		
		//구구단
		//- 2단 ~ 9단
		
		int dan = 2;
		
		for (int j=2; j<=9; j++) {
			
			System.out.println("==========");
			System.out.printf("    %d단\n", j);
			System.out.println("==========");
			
			for (int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %2d\n"
									, j, i, j*i);
			}
			System.out.println();
		}
		
	}

	private static void m1() {
		
		//단일 for문
		for (int i=0; i<10; i++) {
			System.out.println("i: " + i);
		}
		System.out.println();
		
		//2중 for문
		for (int i=0; i<10; i++) { //대회전
			for (int j=0; j<10; j++) { //소회전
				//System.out.println("안녕하세요."); //몇번실행?
				System.out.printf("i: %d, j: %d\n", i, j);
			}			
		}
		System.out.println();
				
		//3중 for문
		for (int i=0; i<24; i++) { //대회전 > 시침
			for (int j=0; j<60; j++) { //중회전 > 분침
				for (int k=0; k<60; k++) { //소회전 > 초침
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
				}
			}
		}
		System.out.println();
		
		//학교
//		for (학년) {
//			for (반) {
//				for (번호) {
//					
//				}
//			}
//		}
		
		//아파트
//		for (단지) {
//			for (동) {
//				for (층) {
//					for (호) {
//						
//					}
//				}
//			}
//		}
		
		
		
	}
	
}

















