package com.test.java.collection;

public class Ex60_Anonymous {
	
	public static void main(String[] args) {
		
		/*
		 
		 익명 클래스, Anonymous Class
		 - 익명 객체, Anonymous Class
		 - 이름없는 클래스 => 호출을 못함 => 재사용 못함
		 
		 
		 프로젝트
		 - 수많은 클래스 > 평균 150~500개 내외
		 
		 
		 실명 클래스
		 - 객체를 여러 개 만들 수 있다.(클래스의 장점)
		 - 이름이 있는 클래스를 만들어야 한다. (단점)
		 
		 익명 클래스
		 - 객체를 딱 1개만 만들 수 있다. (클래스 단점)
		  - 이름이 없는 클래스를 만들어야 한다. (장점) => 관리를 하지 않아도 되기 때문에
		  
		  
		 */
		
		//요구사항] 인터페이스를 구현한 클래스 선언하기 > 객체를 생성하기
		
		//1. 본인 타입의 참조 변수를 만들기
		BBB b1 = new BBB();
		b1.test();
		
		//2. 부모 타입의 참조 변수를 만들기 -업캐스팅
		AAA b2 = new BBB(); 
		b2.test();
		
		//3.
		AAA b3 = new AAA() {
			
			//이름없는 클래스 , Anonymous => 인터페이스의 자식으로만 만들 수 있음 => 혼자 존재할 수 없기 때문에
			//이름이 없기 때문에 객체 재사용을 못함! 일회성 
			//코드의 길이를 줄일 수 있기 때문에 자주 사용됨 
			//b3가 익명 객체 
			
			@Override
			public void test() {
				System.out.println("익명 객체 메서드");
				
			}
			
		};
		
		b3.test();
	}

}

interface AAA {
	void test();
	
}

class BBB implements AAA{

	@Override
	public void test() {
		System.out.println("추상 메서드를 구현");
		
	}
	
}