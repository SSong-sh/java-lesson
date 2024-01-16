package com.test.java.collection;

public class Student {
	
	private int no; 	//번호
	private String name;//이름
	private int kor;	//국어
	private int eng;	//영어
	private int math;	//수학
	private int total;
	private double avg;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	//계산된 프로퍼티(가상 프로퍼티)
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	public double getAvg() {
		return this.getTotal() /3.0;
	}
	
	

}


