package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("섭씨(℃): ");
		String input1 = reader.readLine();
		
		double Celsius = Double.parseDouble(input1);
		
		double Fahrenheit = Celsius * 1.8 + 32 ;
		
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.\n",Celsius,Fahrenheit);

	}
}
