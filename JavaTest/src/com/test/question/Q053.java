package com.test.question;

public class Q053 {

	// 구구단 출력

	public static void main(String[] args) {

		for (int k = 0; k <= 4; k += 4) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2 + k; j <= 5 + k; j++) {
					System.out.printf("%d X %d = %d\t", j, i, i * j);
				}
				System.out.println();

			}
			System.out.println();

		}
	}

}
