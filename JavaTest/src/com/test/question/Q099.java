package com.test.question;

public class Q099 {
	
	public static void main(String[] args) {
		
		//시간 1
		Q_Time t1 = new Q_Time(); //기본 생성자 호출
		System.out.println(t1.info());

		//시간 2
		Q_Time t2 = new Q_Time(2, 30, 45); //오버로딩 생성자 호출
		System.out.println(t2.info());

		//시간 3
		Q_Time t3 = new Q_Time(1, 70, 30); //오버로딩 생성자 호출
		System.out.println(t3.info());

		//시간 4
		Q_Time t4 = new Q_Time(30, 10); //오버로딩 생성자 호출
		System.out.println(t4.info());

		//시간 5
		Q_Time t5 = new Q_Time(90, 10); //오버로딩 생성자 호출
		System.out.println(t5.info());

		//시간 6
		Q_Time t6 = new Q_Time(50); //오버로딩 생성자 호출
		System.out.println(t6.info());

		//시간 7
		Q_Time t7 = new Q_Time(10000); //오버로딩 생성자 호출
		System.out.println(t7.info());
	}

}
