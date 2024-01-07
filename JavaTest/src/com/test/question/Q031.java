package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q031 {
	public static void main(String[] args) throws IOException {
	
		number();
	}//main

	private static void number() throws IOException {
		// TODO Auto-generated method stub
		
		int odd = 0;
		int even = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력: ");
		String input = reader.readLine();
		int n = Integer.parseInt(input);
		
		if(n % 2 ==0) {
			even ++;
			
		}else {
			odd++;
		}
	}
	
	
}
