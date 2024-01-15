package com.test.java.obj;

import javax.sound.midi.Soundbank;
import javax.sound.midi.VoiceStatus;

public class Ex46_Abstract {
	
	public static void main(String[] args) {
		/*
		 추상, Abstaract
		 
		 
		 구체적이다 <> 추상적이다.
		 
		 추상, Abstarct
		 
		 추상 클래스, Abstarct Class
		 
		 추상 메서드, Abstarct Method
		 
		 */
		
//		잠깐 예시로 보여준것 
//		//같은 패키지
//		//-Ex30_Class.java> Point 클래스
//		Point P1 = new Point();
		
		Keyboard k1 = new Keyboard();

		k1.a = 10;
		k1.aaa();
		// k1.bbb(); // 구현부가 정의되어 있지 않기 때문에 안됨

//		Mouse m1 = new Mouse();
//
//		m1.bbb();

	}
}

//추상 클래스
//- 추상 메서드를 가질 수 있다.
//- 객체를 생성할 수 없다.
//- 일반 클래스의 부모 클래스가 될 수 있다 > 자식 클래스들에게 강제로 추상 메서드를 구현하게 만든다.
// > 모든  객체들이 공통된 사용법(메서드)를 가지게 된다. > 일종의 규격을 만든다.
abstract class Mouse { //자식 클래스의 추상 메소드를 강제로 구현하게 만든다.
	
//	//구현된 멤버를 가진다.
//	public int a;
//	public void aaa() {
//
//	}
//	//추상 멤버를 가진다.
//	public abstract void bbb();
	
	
	public String model;
	public int price;
	
	public void info() {
		System.out.println("model: " + this.model);
		System.out.println("price: " + this.price);
	}
	
	public abstract void click(); //자식의 객체 클래스를 표준화 시켜줌

}

//The type G305 must implement the inherited abstract method Mouse.click()
//추상 멤버를 가져가야 하는데 일반 클래스는 추상 멤버를 가지지 못함
// > 그래서 가져가서 구현부를 만들어줌 > 일종의 오버라이딩 > 구현했다!고 표현하는게 다수
class G305 extends Mouse {
	
	public void click() {
		System.out.println("저렴한 스위치를 사용해서 클릭합니다.");
		
	}
	
	
}

class M410 extends Mouse {

	@Override
	public void click() {
		
		System.out.println("비싼 스위치를 사용해서 클릭합니다.");
		
	}
	
	
	
}

//일반 클래스는 추상 멤버를 가질 수가 없다.
class Keyboard {
	public int a;
	public void aaa() {
		System.out.println("타이핑을 합니다.");
		
	}
	//public abstract void bbb();// 구현부를 가지면 안되는 메소드
}