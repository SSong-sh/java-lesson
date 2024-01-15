package com.test.question;

public class Q_Espresso {
	
	private int bean;
	
	public Q_Espresso(int bean) {
		this.bean = bean;
	}
	
	public int getBean() {
		return bean;
	}
	
	public void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.\n",bean);
	}

}
