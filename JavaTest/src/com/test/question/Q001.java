package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {
	
	public static void main(String[] args) throws IOException {
		
		//문제1. 만나이 계산
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print("태어난 년도: ");
		
		String year = reader.readLine();
		
		int codeyear = Integer.parseInt(year);
		
		int age =  2024 - codeyear;
		
        System.out.printf("나이: %d세",age);

	}
}
