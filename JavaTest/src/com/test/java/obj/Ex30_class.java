package com.test.java.obj;

import java.nio.channels.NonWritableChannelException;

public class Ex30_class { //public이 붙은 클래스가 파일명 => 대표 클래스 
	
	public static void main(String[] args) {
		/*
		 
		 자바, Java
		 - 객체 지향 프로그래밍 언어
		 - Object Oriented Programming Language >OOP
		 - 객체를 중심으로 프로그램을 만드는 방식
		 - 클래스라는 설계도를 사용해서,
		   객체라는 것을 만들고,
		   만들어긴 객체를 사용해서,
		   내가 원하는 행동을 구현하는 것. 
		   
		   클래스, Class
		   1. 클래스, Class
		   		- 객체를 만들기 위한 설계도
		   		- 객체를 분류하는 기준
		   		- 붕어빵 틀
		   		
		   2. 객체(개체), Object
		   		- 붕어빵
		   	
		   3. 인스턴스, Instance
		   		- 붕어빵
		   		- 메모리에 실체화된 객체
		   
		   4. 추상화
		   		- 실존하는 객체들의 공통점을 모아서 정의
		   		- 단순화
		   
		   5. 정보은닉
		   		- 객체의 내부를 외부에 노출시키지 않는 작업
		   		- 내부를 외부로부터 보호하는 역할
		   		- 외부에 객체를 봤을 때 행동을 단순화 시키는 역할
		   
		   6. 캡슐화
		   		- 외부로부터 내부를 보호하는 작업
		   
		   7. 인터페이스
		   		- 케이스의 구멍 + 버튼
		   		
		   		
		   		객체 = 데이터(변수) + 행동(메서드)
		   		
		   
		   8. 프로퍼티(Property), 속성(Attribute)
		   		- 데이터(변수)
		   		- 객체가 가지는 정보
		   		
		   	
		   9. 행동(Behavior)
		   		- 매서드
		   		- 객체가 가지는 행동
		   
		   	
		   10. 상속(Inheritance)
		   		- 클래스간의 상속
		   		
		   		
		   + 자바가 클래스를 인식하는 방법
		   //패키지 별로 인식
		   		
		   
		 
		 */
		
		//요구사항] 지도 > 우리집 > 좌표 저장
		
		//Case 1.
		//- 가장 간단한 방법
		//- 식별자 문제 > 같은 성질의 식별자가 서로 다른 이름을 사용
		//				> 구조를 물리적으로 보장 안함
		//- 구조적 문제 > 규칙(x), 조작 불편
		
		//우리집 좌표
		
		int x = 100;
		int y = 200;
		
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n",x,y);
		
		//마트 좌표
		int x2 = 300;
		int y2 = 400;
		
		System.out.printf("마트는 [%d,%d]에 위치합니다.\n",x2,y2);
		
		
		//Case 2.
		//- 배열 사용
		//- 데이터 저장 가능한 구조가 생성 > 집합 > 관리 용이 + 가독성 
		//- 배열 단점 > 요소의 성질 차이를 구분 불가능 > 배열은 요소를 첨자로 구분한다. > 방번호는 의미를 가질 수 없음
		
		//우리집 좌표
		//- 정수 x 2개
		int[] a1 = {100,200};
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n",a1[0],a1[1]);
		
		//마트 좌표
		int[] a2 = {300,400};
		System.out.printf("마트는 [%d,%d]에 위치합니다.\n",a2[0],a2[1]);
		
		
		//Case 3.
		//- 클래스 사용
		//- 데이터 저장 구조 > 관리 용이
		//- 각 멤버의 이름을 지정 가능 > 데이터 성질 구분 용이
		//- 초기 비용 발생
		
		
		//설계한 클래스로부터 객체(인스턴스)를 만드는 방법
		//- 자료형(클래스이름) 변수명 = new 생성자();
		//- 자료형 객체(명,변수)= 객체생성연산자 생성자();
		
		//붕어빵 틀을 사용해서 붕어빵을 1개 만들었다.
		Point p1 = new Point(); //heap(집합처럼 저장된 데이터) => 자료형(point)이 만들어짐 = > 똑같은 자료형(point)로,  p1이라는 이름으로 저장해줌
		
		
		//우리집 좌표
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n",p1.x,p1.y);
		
		//마트 좌표
		Point p2 = new Point();
		
		p2.x = 300;
		p2.y = 400; 
		
		System.out.printf("마트는 [%d,%d]에 위치합니다.\n",p2.x,p2.y);
		
		
		//모니터
		Size monitor = new Size();
		
		monitor.name = "LG 모니터";
		monitor.width = 1920;
		monitor.height = 1080;
		
		System.out.println(monitor.name + ": " + monitor.width + "X" + monitor.height);
		
		
		//성적
		Score s1 = new Score();
		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		

	
	}//main

}//Ex30_Class

// 클래스 선언하기(= 붕어빵 틀 만들기)
//- 클래스명 : 파스칼 표기법 (무조건 대문자로 시작)
class Point {
	
	//구현부
	//- 클래스 맴버 선언하기
	//	1. 변수
	//	2. 메서드
	
	//맴버 변수
	public int x;
	public int y;
	
	
}


//사이즈 클래스
class Size {
	
	public String name;
	public int width;
	public int height;
	
}


//성적 클래스
class Score {
	
	public String name; //학생명
	public int kor;
	public int eng;
	public int math;
}

