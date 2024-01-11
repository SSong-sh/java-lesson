package com.test.question;

import java.util.Scanner;

public class Q086 {
	
	
	/*
	 요구사항] 숫자를 입력받아 3자리마다 ,를 붙이시오
	 
	 예시: 1234 => 1,234
	 
	 1. 숫자를 받을 문자열을 초기화
	 2. 컴마를 찍을 문자열을 초기화
	 3. 숫자를 받을 스캐너 생성
	 
	 //반복 될 부분
	 4. 숫자 끝자리 3자리에 comma 추가
	 = 숫자 끝에서부터 3개 = ***.substring(***.length()-3,***.length())
	 5. ,앞에 나머지 숫자들을 num에 다시 저장 
	 
	 
	 */

	public static void main(String[] args) {
		
		String num = "";
		String comma = "";
		

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자:");
		
		num = scan.nextLine();
		
		while(num.length()>= 3) {
			
			comma = "," + num.substring(num.length()-3,num.length()) + comma; // 다시 comma에 저장 해줘야 함
			
			num = num.substring(0, num.length()-3);			
		}
		
		System.out.println("결과: " + num + comma);
	}

}
