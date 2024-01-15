package com.test.question;

public class Q_Student {
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Q_Student() {
		this.name = "미정";
		this.age = 0;
		this.grade =0;
		this.classNumber =0;
		this.number =0;
	}

	public Q_Student(String name, int age, int grade, int classNumber, int number) {
		
		this.name = name;
		this.age = age;
		this.grade =grade;
		this.classNumber =classNumber;
		this.number =number;
		

	}

	public Q_Student(String name, int age) {
		
		this.name = name;
		this.age = age;

	}

	public Q_Student(int grade, int classNumber,int number) {
		
		this.name = "미정";
		this.grade =grade;
		this.classNumber =classNumber;
		this.number =number;

	}
	
	//%s를 쓰면 정수형이든 소수형이든 모두 자동으로 문자열로 변환
	public String info() {
		 return String.format("%s(나이 : %s, 학년: %s, 반: %s, 번호: %s)",
				 this.name, 
				 this.age != 0 ? (this.age + "세") : "미정" ,
				 this.grade !=0 ? this.grade : "미정", 
				 this.classNumber !=0 ? this.classNumber : "미정",
				 this.number !=0 ? this.number : "미정");
	}
}


