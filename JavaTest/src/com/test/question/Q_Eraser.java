package com.test.question;


public class Q_Eraser {
	
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public String info() {
		return String.format("%s 사이즈 지우개입니다.\n", this.size);
	}
	
}
