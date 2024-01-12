package com.test.question;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Q088 {
	
	public static void main(String[] args) {
		
		//요구사항] 금지어 마스킹 처리
		//- 조건 : 금지어(바보,멍청이)
		
		/*
		 
		 1. 문자열 금지어 초기화
		 2. 금지어 카운트 초기화
		 3. 문장 입력 스캐너 생성
		 4. 금지어 대체 replace
		 
		 */
		
		String statement = "";
		String[] words = {"바보","멍청이"};
		
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		
		statement = scan.nextLine();
		
		//금지어 찾기
		for(int i=0; i<words.length;i++) { //배열문 길이(2)만큼 돌면서  => 이것 때문에 2번밖에 못 찾음 ㅜ
			
			if(statement.indexOf(words[i])>-1){ //배열1,2 금지어가 있는지 확인
				 statement = statement.replace(words[i],"***");
				
				count++;	
			}
			
		}
		
		System.out.print("출력: " + statement);
		System.out.println();
		System.out.printf("금지어를 %d회 마스킹했습니다.",count);
	}

}
