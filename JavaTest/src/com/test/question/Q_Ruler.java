package com.test.question;


public class Q_Ruler {
	
	private int length;
	private String shape;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
		
	}

	
	public String info() {
		return String.format("%dcm %s입니다.\n", this.length, this.shape);
	}
	

}
