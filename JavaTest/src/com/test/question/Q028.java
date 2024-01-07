package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class Q028 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("근무 년수: ");
		String input = reader.readLine();	
		
		int workYear = Integer.parseInt(input);
		
		if(workYear >= 1 ) {
			
			if(workYear <=4) {
				System.out.printf("%d년차 초급 개발자입니다.\n", workYear);
				System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자입니다.\n", 5- workYear );
			}else if ( workYear <=9) {
				System.out.printf("%d년차 중급 개발자입니다.\n", workYear);
				System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자입니다.\n", 10- workYear );
			}else {
				System.out.printf("%d년차 고급 개발자입니다.\n", workYear);
				System.out.printf("당신은 %d년전까지 중급 개발자였습니다.\n", workYear -9 );
			}
			
			
		} else {
			System.out.println("입력한 값이 올바르지 않습니다. 1 이상의 값을 입력해주세요.");
		}
	}
}
