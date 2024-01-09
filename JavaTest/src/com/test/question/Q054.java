package com.test.question;

import java.awt.Checkbox;

public class Q054 {

	public static void main(String[] args) {

		boolean demical = false;// 기본값

		for (int i = 2; i <= 100; i++) { //2~100까지 반복 출력 
			
			demical = false; 

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					demical = true; //소수일 경우를 찾는 반복문
					break;
				}
			}

			if (!demical) { //소수면 출력
				System.out.print(i + ",");
			}
		}
	}

}
