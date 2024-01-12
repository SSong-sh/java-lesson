package com.test.java.obj._static;

public class Ex37_Static {
	
	//1. 클래스 로딩, Class Loading
	//- 프로그램을 실행하기 전에 클래스 정의를 미리 읽어서 메모리에 얹는 작업 
	// > 설계도 인식 작업
	//**** 로딩 과정 중에 만나는 모든 static 요소를 메모리에 구현한다. 
	
	//2. main 메서드 실행
	public static void main(String[] args) {

		/*
		 * 
		 * static(정적) 키워드 - 지시자(제어자) 중 하나 - 클래스 or 클래스 맴버에 붙이는 키워드 => 클래스는 나중에 1. 멤버 변수
		 * 2. 멤버 메서드
		 * 
		 */

		// 상황] 학생 3명
		// - "역삼중학교"

		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15); //main 함수를 읽을 때 school은 이미 메모리에 있기 떄문에 만들어지지 않음
		
		//s1.setSchool("역삼중학교"); => 원래는 에러가 나는 코드 (찾아간 heap에 school이 없기 떄문, school은 method 메모리에)
		
		//static 메서드를 접근하는 방법(static way)
		Student.setSchool("역삼 중학교"); //클래스명을 지정하면 method 메모리를 찾아가서 school을 찾음

		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(14);
		
		//다시 초기화 할 필요없음 , 공통된 값이라 한번만 하면 됨 
		//s2.setSchool("역삼중학교");

		Student s3 = new Student();
		s3.setName("임꺽정");
		s3.setAge(16);
		
		
		//s3.setSchool("역삼중학교");

		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());

	}// main

	// 지역변수에는 못 씀
//	int a = 10;
//	static int b = 20;

}// EX37

class Student {

	private String name;
	private int age;

	// private String school;

	private static String school; //클래스를 읽는 과정에서 메모리에 저장 (main 실행 아직 안됨)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}

	public static String getSchool() { //클래스를 읽을 때 메모리에 저장됨
		return school;
	}

	public static void setSchool(String school) {
		
		//Cannot use this in a static context
		//this = 객체생성연산자 => 객체 안에서 객체 자신을 가리킬 때 사용
		//this.school = school;
		Student.school = school; //this.school 아님 school은 객체 아님
	}

	public String info() {

		// print()
		// String.format() => 또 다른 문자열로 반환

		return String.format("%s[%d세,%s]", this.name, this.age, Student.getSchool());

	}

}