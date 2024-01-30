package com.test.java;

import com.test.java.member.Member;

/**
 * 메인 클래스입니다. 
 */
public class Main {
	
	/**
	 * 메인메서드입니다.
	 * @param args //매개변수 설명하는 곳 - 파라미터
	 */
	
	public static void main(String[] args) {
		
		//업무 코드...
		
		Member m = new Member() ;
		
		m.nick = "강아지";
		m.info();
		m.check();
		
	}

}
