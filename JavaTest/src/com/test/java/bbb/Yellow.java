package com.test.java.bbb;

import com.test.java.aaa.Red;

public class Yellow {

	public void test() {

		// 현재 Yellow 클래스와 같은 패키지에 존재
		Red r1 = new Red();

		r1.a = 10; // public
//		r1.b = 20; //private
//		r1.c = 30; // default - 다른 패키지내에 있기 때문에 접근 할 수 없음. 비공개
		//r1.d = 40;
	}
}
