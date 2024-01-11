package com.test.question;

import java.util.Scanner;

import javax.naming.directory.NoSuchAttributeException;
import javax.swing.plaf.ComponentInputMapUIResource;

public class Q087 {
	
	public static void main(String[] args) {
		
		//요구사항] 영단어를 입력받아 분리하기
		
		/*
		 1. 문자열 합성어 초기화
		 2. 문자열 공백 초기화
		 3. 합성어 받을 스캐너 생성
		 4. 글자 하나씩 보면서 => charAT => 대문자인지 검사 => 맞으면 엔터
		
		 
		 */
		
		String compound = "";
		String temp = "";
		
		int index = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어 : ");
		
		compound = scan.nextLine();
		
		for(int i=0;i<compound.length();i++) {
			
			char c = compound.charAt(i);
	
			//c가 대문자인지 검사 => 맞으면 한칸 뛰기
			if( c >= 'A' && c <='Z' && i != 0  ) {
				
				System.out.print(" ");

			}
			System.out.print(c);
		}
		
	}

}
