package com.test.question;

import java.beans.Statement;
import java.util.Scanner;

public class Q090 {

	public static void main(String[] args) {

		// 요구사항] 입력받은 문장에서 숫자를 찾아 그 합을 구하시오

		// 조건
		// -모든 숫자는 한자리 숫자로 처리한다.

		/*
		 * 
		 * 1. 점수 변수 초기화 
		 * 2. 누적 변수 초기화 
		 * 3. 입력 받을 스캐너 생성 
		 * 4. 숫자 찾아서 누적변수에 저장 후 출력
		 * 
		 * 
		 */

		String statement = "";

		int sum = 0;
		int score = 0;
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");

		statement = scan.nextLine();

		// 아스키코드 0 = 48, 9 = 57
		for (int i = 0; i < statement.length(); i++) {

			char c = statement.charAt(i);

			if (c >= '0' && c <= '9') { //c가 숫자인지 확인

				sum += c - 48;
			}

		}

		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다", sum);
	}

}
