package com.test.question;

import java.io.File;

public class Q113 {
	
	public static void main(String[] args) {
		/*
		 요구사항
		 음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.

		 조건..
		 '001'부터 3자리 형식으로 붙이시오.
		 
		 1. 폴더 경로 지정
		 2. 폴더 경로로 객체 만들기
		 3. 누적 변수 만들기
		 4. 폴더의 있는 파일로 배열 만들기
		 5. 파일 반복하면서 mp3로 끝나는 파일 있으면 새로운 이름을 붙여 객체 만들기
		 6. 그 객체로 이름 바꾸면서 누적변수 +1 증가
		 
		 
		 */
		
		String path = "C:\\class\\code\\파일 디렉토리 문제\\음악 파일";
		
		File dir = new File(path);
		
		int n = 1;
		
		File[] list = dir.listFiles(); //폴더인지 파일인지 확인해야하지만... 파일밖에 없음
		
		for (File file : list) {
			if(file.getName().substring(file.getName().lastIndexOf(".")+1).toLowerCase().equals("mp3")) {
				
				//새로운 파일 객체 만들기
				File temp = new File(path + "\\" + String.format("[%03d]%s", n, file.getName()));
				file.renameTo(temp);
				n++;
				
			}
		}
		
		System.out.println("완료");

	}

}
