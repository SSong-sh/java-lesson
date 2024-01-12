package com.test.java.obj.inheritance;

import java.security.PublicKey;
import java.util.Calendar;
import java.util.concurrent.ForkJoinTask;

public class Ex43_final {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 final 키워드
		 - 한번 결정하면 바꿀 수 없다.
		 - 안정성이 높아진다. > 유연성이 떨어짐
		 
		 1. 변수 적용(지역 변수, 멤버 변수)
		 	- 초기화 이후 값을 변경할 수 없다.
		 	- 상수
		 
		 2. 메서드 적용
		 	- 상속 시 오버라이딩 방지
		 	
		 
		 3. 클래스 적용
		 	- 상속을 방지
		 
		 */
		
		//이름 대문자
		//final 변수는 되도록 선언과 동시에 초기화를 권장
		final int A = 10;
		
		final int B;
		B = 20;
		//B = 30
		
		System.out.println(Calendar.YEAR);//final 
		
		
//		final int MALE = 1;
//		final int FEMALE = 2;
//		
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.gender = Gender.MALE;
		
		Student s2 = new Student();
		s2.name = "호호호";
		s2.age = 22;
		s2.gender = Gender.FEMALE;
		
		
		
	}//main

}//Ex43
class Gender {
	
	public static int MALE = 1;
	public static final int FEMALE = 2;
	
	
}

class Student {
	
	public String name;
	public int age;
	
	//성별 > 남자(1), 여자(2)
	
	public int gender;
	
}


//The type FinalChild cannot subclass the final class FinalParent
//최종 클래스 = final이 붙으면 상속할 수 없음 (자식 클래스 만들 수 없음)
final class FinalParent  {
	final public String test () {
		return "성별";
	}
}

//class FinalChild extends FinalParent {
// @Override
//	public String test() {
//		return "나이";
//	}
//}