package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q023 {
	public static void main(String[] args) throws IOException {
		
		int year1 = 0;
		int month1 = 0;
		int day1 = 0;
		
		int year2 = 0;
		int month2 = 0;
		int day2 = 0;
		
		long fatherLife = 0;
		long daughterLife = 0 ;
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
			
		System.out.print("아빠 생일(년): ");
		String input1 = reader.readLine();	
		year1 = Integer.parseInt(input1);
		
		System.out.print("아빠 생일(월): ");
		String input2 = reader.readLine();	
		month1 = Integer.parseInt(input2);
		
		System.out.print("아빠 생일(일): ");
		String input3 = reader.readLine();	
		day1 = Integer.parseInt(input3);
		
		System.out.print("딸 생일(년): ");
		String input4 = reader.readLine();	
		year2 = Integer.parseInt(input4);
		
		System.out.print("딸 생일(월): ");
		String input5 = reader.readLine();	
		month2 = Integer.parseInt(input5);
		
		System.out.print("띨 생일(일): ");
		String input6 = reader.readLine();	
		day2 = Integer.parseInt(input6);
		
		System.out.println();
		
		Calendar fBirth = Calendar.getInstance();
		fBirth.set(year1, month1 -1, day1);
		
		Calendar dBirth = Calendar.getInstance();
		dBirth.set(year2, month2 -1, day2);
		
		fatherLife =  fBirth.getTimeInMillis();
		daughterLife = dBirth.getTimeInMillis();
		
		System.out.printf("아빠는 딸 보다 총 %,d일을 더 살았습니다.\n", (daughterLife - fatherLife) /1000/60/60/24);
		//1초 1000밀리초, 1분 60초, 1시간 60분, 1일 24시간
	}
}
