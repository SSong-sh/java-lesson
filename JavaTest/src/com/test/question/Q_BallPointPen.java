package com.test.question;

public class Q_BallPointPen {
	
	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String info() {
		return String.format("%s색상 %.1fmm 볼펜입니다.\n", this.color, this.thickness);
	}
	
}
