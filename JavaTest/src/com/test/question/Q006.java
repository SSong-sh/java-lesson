package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("한달 수입 금액(원): ");
		String input1 = reader.readLine();
		
		int salary  = Integer.parseInt(input1);

		double taxSalary = salary * 0.033 ;
		
		System.out.printf("세후 금액(원): %,.0f원\n",salary-taxSalary);
		System.out.printf("세금(원): %,.0f원",taxSalary);
	}

}
