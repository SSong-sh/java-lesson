package com.test.java;

import java.io.IOException;

public class Ex07_Input {

	public static void main(String[] args) throws IOException {

		/*
		 	콘솔 입력 
		 	1.System.in.read() 
		 		- System.out.print()
		 		- 1문자 입력 가능
		 		- 문자 코드값을 반환
		 		- 한글 입력 불가능(2byte 문자 미지원, ASCII 문자만 지원)
		  	2.BufferedReader 클래스
		 	3. Scanner 클래스
		 */

		// 요구사항] 사용자에게 문자 1개를 입력 > 화면에 출력하시오.

		// 1. 라벨 출력
		// 2. 문자 입력
		// 3. 문자를 화면에 출력

		System.out.print("문자 입력: ");
		
		//사용자로부터 키보드 입력을 받아서 문자를 돌려준다.
		//- 현재 상태 > 사용자가 키를 입력하기를 대기하고 상태
		//- 사용자 입력을 해야 대기 상태가 해제된다.

		int code = System.in.read(); //사용자가 입력하면 버터로 이동하고, 이 명령어를 통해서 버퍼를 읽는 것이다.
		
		//A를 입력하고 엔터를 입력하면, 'A\r\n'이 입력되는 것이다. \r =13 , \n=10
		//따라서 3개를 읽고 4번째 read에 해당하는 내용을 입력받는 것이다.
		System.out.println("출력: " + code);
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		
	}

}
