package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q024 {
public static void main(String[] args) throws IOException {
		
		int hour = 0;
		int minute = 0;
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
			
		System.out.println("음식을 받기 원하는 시각");

		System.out.print("시: ");
		String input1 = reader.readLine();	
		hour = Integer.parseInt(input1);
		
		System.out.print("분: ");
		String input2 = reader.readLine();	
		minute = Integer.parseInt(input2);
		
		System.out.println();
		
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY,hour);
		now.set(Calendar.MINUTE,minute);
	
		now.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면 : %d시 %d분\n", 
				now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE));
		
		now.add(Calendar.MINUTE, -8);
		System.out.printf("치킨 : %d시 %d분\n", 
				now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE));
		
		now.add(Calendar.MINUTE, -7);
		System.out.printf("피자 : %d시 %d분\n", 
				now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE));
	}
}
