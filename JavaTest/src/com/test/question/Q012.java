package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.naming.spi.DirStateFactory.Result;

public class Q012 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		String input1 = reader.readLine();
		
		String result = "";
		int n = Integer.parseInt(input1);
		
		result = getNumber(n);
		
		System.out.printf("입력하신 숫자 '%d'는 '%s'입니다.\n",n, result);
		
	} //main
	
	public static String getNumber(int num) {
		
		String result = "";
		
		result = (num % 2 == 0) ? "짝수" : "홀수";
		
		return result;
		
	}
}
