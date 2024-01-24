package com.test.java.member;

import com.test.java.view.View;

public class Logout {

	public static void logout() {
		
		//로그아웃
		
		Member.auth = null;
		System.out.println("로그아웃 성공");
		
		View.pause();
		
	}

}
