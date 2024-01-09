package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.InterruptedByTimeoutException;
import java.security.KeyStore.TrustedCertificateEntry;

public class Ex22_switch {
	
	public static void main(String[] args) throws IOException {
		
		
		/* 
		 
		 switch문, switch case문
		 - 조건 : 값(데이터) > 정수, 문자열, 열거형
		 
		 
		 switch (조건) {
		 	case 값 :
		 		구현부;
		 		break;
		 	[case 값 :
		 		구현부;
		 		break;] * N
		 	[default: 
		 		구현부;
		 		break;]
		 */
		
		//m1();
		//m2();
		//m3();
		m4();
		
		//if문 문제 == switch문 문제
		
		} //main

	private static void m4() {
		int num = 10;
		
		if(num > 10) {
			System.out.println("양수");
		} //else {
			//System.out.println("음수");
		//}
	}
	
		
//		switch (num) {
//			case true:
//				System.out.println("양수");
//				break;
//			case false:
//				System.out.println("음수");
//				break;
//	
//		}
//		
//	} swith문은 조건에 비교연산자, boolean 사용 금지 => 에러 뜸

	private static void m3() {
		// 요구사항] 사용자 월 입력 > 해당 월의 마지막 일?
		int lastDay = 0; //마지막일
		
		int month = 5;
		
		//aaa: //Label > 코드의 위치를 설명하는 용도 > 표지판
		
		switch (month) {
		case 1: case 3:case 5:
		case 7:case 8:case 10:
		case 12:
			lastDay =31;
			break;
			
		case 4: case 6: case 9: case 11: 
			lastDay =30;
			break;
			
		case 2:
			lastDay =28;
			break;
		}
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDay);
		
	}

	private static void m2() throws IOException {
		// 요구사항] 자판기
		// - 메뉴 출력 > 음료 선택 > 가격 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("====================");
		System.out.println("      자판기");
		System.out.println("====================");
		System.out.println("1. 콜라");
		System.out.println("1. 사이다");
		System.out.println("1. 박카스");
		System.out.println("--------------------");
		System.out.print("번호선택: ");
		
		
		String input = reader.readLine();
		
//		if(input.equals("1")) {
//			System.out.println("700원입니다.");
//		} else if (input.equals("2")) {
//			System.out.println("670원입니다.");
//		} else if (input.equals("3")) {
//			System.out.println("500원입니다.");
//		} else {
//			System.out.println("선택하신 음료는 없습니다.");
//		}
		
		
		if(input.equals("1") && input.equals("2") ) {
			System.out.println("800원입니다.");
		} else if (input.equals("3")) {
			System.out.println("670원입니다.");
		} else {
			System.out.println("선택하신 음료는 없습니다.");
		}
		
		
		switch (input) {
		case "1": {
		} //1을 만났을 떄 그냥 흘러내려서 2번 실행
		case "2": {
			System.out.println("700원입니다.");
			break;
		}
		case "3": {
			System.out.println("500원입니다.");
			break;
		}
		default:
			System.out.println("음료 없음");
			break;
	}
		
		
	}
	
	

	private static void m1() {
		//요구사항] 숫자를 1개 입력받아 한글로 출력하시오.
		// 1 > "하나"
		// 2 > "둘"
		
		int num = 3;
		
		if (num == 1) {
			System.out.println("하나");
		}else if (num ==2) {
			System.out.println("둘");
		}else {
			System.out.println("셋");
		}
		
		
		switch (num) {
		case 1: {
			System.out.println("하나");
			break;
		}
		case 2: {
			System.out.println("둘");
			break;
		}
		case 3: {
			System.out.println("셋");
			break;
		}
		
		}
		
	}
	
	

}
