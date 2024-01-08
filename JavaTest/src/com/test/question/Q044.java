package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q044 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int sum2 = 0;

		for (int i = 1;; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			if (num % 2 == 0) {
				sum += num;
			} else if(num % 2 !=0) {
				sum2 -= num;
			} else if(sum >= 100) {
				System.out.println("\b\b= " + (sum + sum2));
				break;
			}

		}

	}

}
