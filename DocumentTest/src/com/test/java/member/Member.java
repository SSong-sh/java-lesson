package com.test.java.member;

/**
 * 회원 클래스입니다. 
 */

public class Member {

	//private는 외부 노출이 안되기 때문에 만들 필요없음	
	private String name;
	private String level;
		
	/**
	 * 회원의 닉네임
	 */
	public String nick; //필드(field)
	
	/**
	 * 회원정보를 열람합니다.
	 */
	public void info() {
		
	}
	
	/**
	 * 회원의 등급을 확인합니다
	 * @return 회원의 등급
	 */
	public String check() {
		return this.level;
	}

	/**
	 * 회원의 등급을 상향시킵니다.
	 * @param point 등급 포인트
	 * @param part 등급 파트 
	 */
	public void upgrade(int point, String part) {
		
	}

}
