package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q044 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		String cal = "";


		for (;;) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			
			if(num % 2 ==0 ) {
				sum += num;
				cal += " + " + num;

			} else {
				sum -= num;
				cal += " - " + num;
			}
			
			if (sum >= 100) {
				break;
			}

		}
		System.out.println(cal + " = " + sum );


	}

}
