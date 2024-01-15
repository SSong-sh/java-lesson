package com.test.java.obj;

public class Ex47_Interface {
	
	public static void main(String[] args) {
		
		/*
		 
		 인터페이스, Interface
		 - 클래스의 일정
		 - 자료형
		 
		 */
		
		//Cannot instantiate the type Phone
		//Phone p1 = new Phone();
		
		
		Iphone14 p1 = new Iphone14();
		
		p1.powerOn();
		p1.powerOff();
		p1.call();
		
		
		S23 s1 = new S23();
		s1.powerOn();
		s1.powerOff();
		s1.call();
		
		
	}

}


//일반 클래스
//- 구현된 멤버 (o)
//- 추상 멤버(x)

//추상 클래스
//- 구현된 멤버 (o)
//- 추상 멤버(x)

//인터페이스
//- 구현된 멤버 (x)
//- 추상 멤버(o)



//인터페이스 선언
//- 전화기 인터페이스 > 모든 실제 전화기들이 가지는 행동에 대해서 표준안을 만들기 위한 역할 
// - 다른 클래스의 부모 클래스 역할을 한다.
// - 인스턴스를 생성할 수 없다.

interface Phone{
	
	//인터페이스 멤버 선언
	//- 추상 멤버만 선언할 수 있다.
//	public abstract void aaa();
//	public void bbb(); //모두 추상 메서드이기 때문에 abstract 생략 가능
//	void ccc();//모두 접근지정자가 public이기 때문에 public 생략 가능 
	
	//인터페이스는 구현된 멤버를 선언할 수 없다.
//	public int a;
//	public int b;
//	
//	public void ccc() {
//		
//	}
	
	void powerOn();
	void powerOff();
	void call();
	
}

class Iphone14 implements Phone  {

	@Override
	public void powerOn() {
		System.out.println("전원 on");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 off");
		
	}

	@Override
	public void call() {
		System.out.println("전화 걸기");
		
	}
	

}


class S23 implements Phone{
	
	@Override
	public void powerOn() {
		System.out.println("전화기를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("전화기를 끕니다.");
		
	}

	@Override
	public void call() {
		System.out.println("통화를 겁니다");
		
	}
	
}
