package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q022 {
	public static void main(String[] args) throws IOException {
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		Calendar anniversary = Calendar.getInstance();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("남자이름: ");
		String mName = reader.readLine();	
		
		System.out.print("여자 이름: ");
		String wName = reader.readLine();	
		
		System.out.print("만난날(년): ");
		String input1 = reader.readLine();	
		month = Integer.parseInt(input1);
		
		System.out.print("만난날(월): ");
		String input2 = reader.readLine();	
		month = Integer.parseInt(input2);
		
		System.out.print("만난날(일): ");
		String input3 = reader.readLine();	
		day = Integer.parseInt(input3);
		
		System.out.println();
		
		anniversary.set(year, month-1, day);
		
		System.out.printf("'%s과(와) '%s의 기념일\n",mName,wName);
		
		anniversary.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n",anniversary);
		
		anniversary.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n",anniversary);
		
		anniversary.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n",anniversary);
		
		anniversary.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n",anniversary);
		
		anniversary.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n",anniversary);
		
	}
}
