package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		String input1 = reader.readLine();
		
		System.out.print("두번째 숫자: ");
		String input2 = reader.readLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.println();
		System.out.printf("%,d + %,d = %,d\n", num1, num2, num1 + num2);
		System.out.printf("%,d - %,d = %,d\n", num1, num2, num1 - num2);
		System.out.printf("%,d * %,d = %,d\n", num1, num2, num1 * num2);
		System.out.printf("%,d / %,d = %,.1f\n",num1, num2,(double)num1 / (double)num2);
		System.out.printf("%,d %% %,d = %,d", num1, num2, num1 % num2);
	}
}
