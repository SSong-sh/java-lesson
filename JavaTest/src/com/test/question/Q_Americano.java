package com.test.question;

public class Q_Americano {
	
	private int bean;
	private int water;
	private int ice;
	
	public Q_Americano(int bean,int water, int ice) {
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	
	public int getBean() {
		return bean;
	}
	
	public double getwater() {
		return water;
	}
	
	public int getIce() {
		return ice;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개으로 만들어진 아메리카노를 마십니다.\n",bean,water,ice);
	}

}
