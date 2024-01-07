package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q029 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("첫번 째 숫자: ");
		String input1 = reader.readLine();	
		int n1 = Integer.parseInt(input1);
		
		System.out.print("두번 째 숫자: ");
		String input2 = reader.readLine();	
		int n2 = Integer.parseInt(input2);
		
		System.out.print("연산자: ");
		String cal = reader.readLine();	
	
		
		
		if( cal.equals("+")) {
			System.out.printf("%d %s %d = %d\n",n1,cal,n2, n1 + n2);
		} else if(cal.equals("-")) {
			System.out.printf("%d %s %d = %d\n",n1,cal,n2, n1 - n2);
		} else if (cal.equals("*")) {
			System.out.printf("%d %s %d = %d\n",n1,cal,n2, n1 * n2);
		} else if (cal.equals("/")) {
			System.out.printf("%d %s %d = %.1f\n",n1,cal,n2, (double) n1 / n2);
		} else if (cal.equals("%")) {
			System.out.printf("%d %s %d = %d\n",n1,cal,n2, n1 % n2);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
	}

}
