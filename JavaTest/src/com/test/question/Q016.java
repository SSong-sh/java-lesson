package com.test.question;

import javax.naming.spi.DirStateFactory.Result;

public class Q016 {
	public static void main(String[] args) {
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
		
	}//main
	
	public static void sum(int num1) {
		int result = 0;
		result = num1;
		System.out.printf("%d = %d\n",num1 ,result);
	}
	
	public static void sum(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		System.out.printf("%d + %d = %d\n",num1, num2 ,result);
	}
	
	public static void sum(int num1, int num2, int num3) {
		int result = 0;
		result = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d\n",num1, num2, num3, result);
	}
	
	public static void sum(int num1, int num2, int num3, int num4) {
		int result = 0;
		result = num1 + num2 + num3 + num4;
		System.out.printf("%d + %d + %d + %d = %d\n",num1, num2, num3, num4, result);
	}
	
	public static void sum(int num1, int num2, int num3, int num4, int num5) {
		int result = 0;
		result = num1 + num2 + num3 + num4 + num5;
		System.out.printf("%d + %d + %d + %d + %d = %d\n",num1, num2, num3, num4, num5, result);
	}
}
