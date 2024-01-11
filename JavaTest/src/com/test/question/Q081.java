package com.test.question;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Q081 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int index = -1;
		
		System.out.print("이메일: ");
		
		String email = scan.nextLine();
		
	
			index = email.indexOf("@"); //@위치를 인덱스로 저장
			
			String username = email.substring(0,index); //문자열 추출
			System.out.println("아이디 "+ username);
			
			String address =email.substring(index+1);
			System.out.println("도메인: " + address);

	
	
	}
	
	
}
