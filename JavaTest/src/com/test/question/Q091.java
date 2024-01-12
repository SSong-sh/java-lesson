package com.test.question;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.Soundbank;

public class Q091 {
	
	public static void main(String[] args) {
		
		//요구사항] 연산식을 입력받아 실제 연산을 하시오
		
		//조건
		//-산술 연산자만을 구현하시오.(+,-,*,/,%)
		//-연산식의 공백은 자유롭게 입력 가능합니다.
		//-산술 연산자가 반드시 존재하는지 체크하시오
		//- 피연산자의 갯수가 2개인지 체크하시오
		
		/*
		 시나리오
			1. 변수 초기화
			2. 연산식의 공백 제거
			3. split 이용해서 연산자와 숫자 분리
			4. 연산자가 있으면 계산 실행 if
			5. 피연산자가 갯수가 2개인지 확인 => 배열로 넣기
			
		 */
		
		//변수 초기화
		String input = "";
		String op = "";

		int a = 0;
		int b = 0;
		int result = 0;

		// 피연산자의 갯수 2개
		String[] temp = new String[2];

		Scanner scan = new Scanner(System.in);

		// 스캐너 입력
		System.out.print("입력: ");

		input = scan.nextLine();

		// 공백 제거
		input = input.replace(" ", "");

		// 연산자 메서드를 이용해 가져오기
		op = getOperator(input);

		// return 받은 값이 ""이 아니면 => 연산자가 있는지 확인
		if (!op.equals("")) {

			// 피연산자를 두개로 공백을 기준으로 나눔
			temp = input.split("\\" + op);

			// temp의 길이가 2개인지 확인 => 피연산자가 2개인지 확인

			if (temp.length == 2) {

				// string 배열값을 int값으로 변환

				a = Integer.parseInt(temp[0]);
				b = Integer.parseInt(temp[1]);

				if (op.equals("+")) {

					result = a + b;

				} else if (op.equals("-")) {

					result = a - b;

				} else if (op.equals("*")) {

					result = a * b;

				} else if (op.equals("/")) {

					result = a * b;

				} else if (op.equals("%")) {

					result = a % b;

				}

			} else {
				System.out.println("피연산자가 부족합니다!!!!!");
			}

		} else {
			System.out.println("연산자가 올바르지 않습니다!!!!");
		}

		System.out.printf("%d %s %d = %d", a, op, b, result);

	}

	private static String getOperator(String input) {
		if (input.contains("+")) {
			return "+";
		} else if (input.contains("-")) {
			return "-";
		} else if (input.contains("*")) {
			return "*";
		} else if (input.contains("/")) {
			return "/";
		} else if (input.contains("%")) {
			return "%";
		}

		return "";
	}
}
