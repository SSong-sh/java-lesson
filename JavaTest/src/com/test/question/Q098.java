package com.test.question;

public class Q098 {
	
	public static void main(String[] args) {
		
		
		/*
		 
		    조건..
			생성자 오버로딩을 구현하시오.
			Student
			학생 클래스
			상태
			name: 이름
			age: 나이
			grade: 학년
			classNumber: 반
			number: 번호
			행동
			public Student()
			기본 생성자
			이름("미정"), 나이(0), 학년(0), 반(0), 번호(0)
			public Student(String name, int age, int grade, int classNumber, int number)
			생성자 오버로딩
			public Student(String name, int age)
			생성자 오버로딩
			public Student(int grade, int classNumber, int number)
			생성자 오버로딩
			String info()
			이름(나이 : 0세, 학년 : 0, 반 : 0, 번호 : 0)
		 
		 */
		
		//학생 1
		Q_Student s1 = new Q_Student(); //기본 생성자 호출
		System.out.println(s1.info());

		//학생 2
		Q_Student s2= new Q_Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());

		//학생 3
		Q_Student s3= new Q_Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());

		//학생 4
		Q_Student s4= new Q_Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
		
		

	}

}
