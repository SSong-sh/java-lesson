package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q021 {
	public static void main(String[] args) throws IOException {
		
		int year = 0;
		int age = 0;
		
		Calendar c1 = Calendar.getInstance();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도: ");
		String input1 = reader.readLine();	
		 year = Integer.parseInt(input1);
		 
		 age = c1.get(Calendar.YEAR) - year + 1;
		 
		 System.out.println(c1.get(Calendar.YEAR));
		 System.out.printf("나이 : %d세\n", age);
		
		
	}
}
