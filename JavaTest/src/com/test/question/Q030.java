package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q030 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("문자: ");
		int input = reader.read();	
		
		if(input >=  'A' && input <= 'Z') {
			System.out.printf("'%c의 소문자는 '%c입니다.\n",input, input + 32);
		}else if (input >= 'a' && input <'z') {
			System.out.printf("'%c의 소문자는 '%c입니다.\n",input, input -32 );
		}else {
			System.out.println("영문자만 입력하시오.");
		}
	}
}
