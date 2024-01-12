package com.test.question;

public class Q096 {
	public static void main(String[] args) {
		
		//난수 생성
		//- 숫자만
		//- 문자열 난수? + 배열
		
		String[] color = {"빨강","노랑","파랑","검정","보라","주황"};
		
		//난수 > 방번호
		System.out.println(color[(int)Math.random() * color.length]);
	}
}
