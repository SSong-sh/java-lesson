package com.test.question;

import java.io.File;
import java.util.Scanner;

import javax.naming.directory.DirContext;
import javax.naming.ldap.ExtendedRequest;


public class Q111 {
	
	public static void main(String[] args) {
		/*
		 
		요구사항
		지정한 폴더의 특정 파일(확장자)만을 출력하시오.
		
		조건..
		확장자 대소문자 구분없이 검색 가능
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("폴더: ");
		
		String folder = scan.nextLine();
		
		System.out.print("확장자: " );
		
		String ext = scan.nextLine(); //입혁한 확장자 소문자 통일
		
		File path = new File(folder);
		
		File[] list = path.listFiles(); //디렉토리 안에 있는 file 객체 배열 얻기
		
		//대소문자 구별x => 소문자나 대문자로 문자 통일
		
		for(File file : list) { //소문자로 통일시킨 파일 확장자가 입력받은 확장자인지 확인
			if(file.getName().toLowerCase().endsWith(ext.toLowerCase())) {
				System.out.println(file.getName());
				
			}
		}
		
	}

}
