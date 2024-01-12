package com.test.question;

import java.util.Scanner;

public class Q089 {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 요구사항] 입력받은 금액을 한글로 출력하시오 => 진짜 못풀겠음 ㅜㅜ!
		 
		 조건
		 - 입력 범위(원) : 0 ~ 99,999,999
		 
		 입력
		 금액(원): 53216 
		 
		 출력
		 일금 오만삼천이백일십육원
		 
		 시나리오
		 1. 문자열 금액 초기화
		 2. 금액 입력받을 스캐너 생성
		 3. 스캐너에서 받은 값 금액에 넣기
		 4. 금액을 하나씩 char로 읽어 => char로 인자값 받아 =>string으로 한글로 바꿔서 리턴
		 5. 각 배열의 맞는 위치에 만,천,백,십,원을 넣어야 함 
		 - 배열의 인덱스 값, 길이, 값을 매개 변수로 주고 만,천,백,십,원을 string으로 리턴
		 
		 
		
		 */
		
		
		String money = "";
		
		String result = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액(원): ");
		
		
		money = scan.nextLine();
		
		for(int i=0; i<money.length();i++) {
			
			char c = money.charAt(i);
			
			result += getKorean(c);
			result += getNum(i,money.length(),getKorean(c));
			
		}
		
		System.out.println("일금 " + result);
		
		
		

		
	} //main
	
	private static String getNum(int i, int length, String korean) {
		
		return null;
	}

	public static String getKorean(char c) {
		
		if( c=='1') {
			return "일";
		}else if (c=='2') {
			return "이";
		}else if (c=='3') {
			return "삼";
		}else if (c=='4') {
			return "사";
		}else if (c=='5') {
			return "오";
		}else if (c=='6') {
			return "육";
		}else if (c=='7') {
			return "칠";
		}else if (c=='8') {
			return "팔";
		}else if (c=='9') {
			return "구";
		}
		return "";
	}
	


}
