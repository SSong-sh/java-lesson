package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자입력: ");
		int input1 = reader.read();
		

		int capital = input1 - 32 ;
		
	
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다." , input1, capital);
	
		
	}

}
