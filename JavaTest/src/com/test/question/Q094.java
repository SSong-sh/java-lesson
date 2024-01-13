package com.test.question;

public class Q094 {

	public static void main(String[] args) {

		
		Bugles Q_snacK = new Bugles();

		Q_snacK.setSize(500);
		Q_snacK.setCreationTime("2024-01-09");
		System.out.println("가격 : " + Q_snacK.getPrice() + "원");
		System.out.println("유통 기한이 " + Q_snacK.getExpiration() + "일 남았습니다.");

		Q_snacK.eat();


		Bugles snack2 = new Bugles();

		snack2.setSize(300);
		snack2.setCreationTime("2024-01-01");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");

		snack2.eat();
	}

}
