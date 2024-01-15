package com.test.question;

public class Q_Latte {
	
	private int bean;
	private int milk;
	
	public Q_Latte(int bean,int milk) {
		this.bean = bean;
		this.milk = milk;
	}
	
	public int getBean() {
		return bean;
	}
	
	public int getMilk() {
		return milk;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라떼를 마십니다.\n",bean,milk);
	}

}
