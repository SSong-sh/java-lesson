package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q043 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int random = (int) (Math.random() * 10) + 1;

		System.out.print("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			if (num == random) {
				System.out.println("맞았습니다");
				System.out.println();
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", i);
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (num != random) {
				System.out.println("틀렸습니다.");
				System.out.println();
			} 

		}
		
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
		System.out.println("모든 기회를 실패하셨습니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
}
