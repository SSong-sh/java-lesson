package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q049 {

	/*
	 * 요구사항] 별찍기
	 * 
	 * - 조건 : 행의 갯수를 입력받으시오.
	 * 
	 * - 입력 : 행: 5
	 * 
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행: ");
		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			for(int k=0; k<=i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}
}
