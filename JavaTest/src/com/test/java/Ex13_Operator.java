package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Operator {
	public static void main(String[] args) throws IOException {
		
		//요구사항] 사용자로부터 문자 1개 입력 > 영어 소문자인지 검사? =>유효성 검사
		
		/*
		 
		 시나리오] 
		 1. BufferedReader 생성
		 2. 안내 메시지 출력
		 3. 입력 > 문자 1개
		 4. 유효성 검사
		 5. 결과처리 + 출력

		 
		 
		 */
		//1. 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		
		//2. 
		System.out.print("문자 입력: ");
		
		//3. read(), readLine()
		//- read():1문자, 문자코드값이 필요한 경우
		//- readLine(): N문자, 문자코드값을 알아내기가 번거롭다.
		
		int code = reader.read();
		
		//4. 유효성 검사
		//- 영소문자(a~z)(97~122)
		//ex) 입력: d > 100
		
		
		//영대문자 + 영소문자
		String result = (code >= 'a') && (code <= 'z') || (code >= 'A') && (code <= 'Z') ? "올바른 문자" : "올바르지 않은 문자"; //한글은 가~힣
		
		//5.
		System.out.printf("입력한 문자 '%c'는 %s입니다.\n", code, result);
		
		
//		System.out.println(code >= 97); //code >=97
//		System.out.println(code >= (int)'a'); 
//		System.out.println(code >= 'a'); 
	}
}
