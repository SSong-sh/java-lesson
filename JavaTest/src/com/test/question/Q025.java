package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q025 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("첫 번째 숫자: ");
		String input1 = reader.readLine();	
		int num1 = Integer.parseInt(input1);
		
		System.out.print("두 번째 숫자: ");
		String input2 = reader.readLine();	
		int num2 = Integer.parseInt(input2);
		
		if(num1 > num2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n",num1, num2, num1-num2);
		} else {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n",num2, num1, num2-num1);
		}
		
	}
}
