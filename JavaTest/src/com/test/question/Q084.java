package com.test.question;

public class Q084 {
	
	public static void main(String[] args) {
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		
		int count = 0;
		int index = -1;
		
		
		//index는 길동이 시작하는 위치 값
		while((index = content.indexOf(word,index))> -1) {
			count++;
			index = index + word.length(); //인덱스 값에 길동(2글자) 포함시킨 뒤부터 다시 시작
		
		}
		
		System.out.printf("'%s'을 총 %d회 발견했습니다.\n",word,count);
	}
}
