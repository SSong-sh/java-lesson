package com.test.java.board.adminboard;

import com.test.java.member.Member;
import com.test.java.view.View;

public class AdminBoard {

	public void list() 	{
		
		//현재 유저가 이 게시판을 접근할 권한을 가지고 있은지?
		if(Member.auth == null || Member.level.equals("1")) {
			System.out.println("관리자만 접근이 가능합니다.");
			View.pause();
			return;
		}
		
		System.out.println("관리자 게시판 목록");
		View.pause();
	}
}
