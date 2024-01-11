package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("문장 입력: ");

		String statement = scan.nextLine();

		// System.out.println(statement.length());

		System.out.print("역순 결과: ");
		for (int i = statement.length()-1; i >=0; i--) {

			System.out.print(statement.charAt(i));
		}

	}

}
