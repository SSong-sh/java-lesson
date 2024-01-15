package com.test.question;

public class Q_Pencil {
	
	private String hardness;

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}
	
	public String info() {
		return String.format("%s 진하기 연필입니다.\n",this.hardness);
	}
	
}
