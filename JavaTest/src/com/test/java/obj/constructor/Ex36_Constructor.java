package com.test.java.obj.constructor;

public class Ex36_Constructor {

	public static void main(String[] args) {

		/*
		 * 
		 * 생성자, Constructor - (특수한 목적을 가지는) 메서드 - 객체의 멤버(변수)를 초기화 하는 역할(***)
		 * 
		 * 자료형 참조변수 = 객체생성연산자 생성자 Box b1 = new Box();
		 * 
		 */

		// ****
		// 1. 객체의 초기화 > 생성자
		// 2. 객체의 상태 수정 > Setter

		// b1 생성
		// Box b1 = new Box();
		Box b1 = new Box("소형", 2000); // 처음 만든 상자의 기본 값 => setter을 수정할 때 사용하자!

		// 생성자는 딱 한번만 호출됨
		// 생성자는 단독 호출이 불가능하다.
		// - 반드시 new와 함께 호출이 가능하다.
		// Box("소형",2000);

		// b1 초기화
//		b1.setSize("소형");
//		b1.setPrice(2000);

		// b1.setSize("대형"); => 생성자로 값을 넣어두고 set을 막아서 바꿀 수 없 음
		b1.setPrice(5000); // 초기화가 아니라 수정한 것

		System.out.println(b1.getSize());
		System.out.println(b1.getPrice());

	}// main

}

class Box {

	private String size;
	private int price;

	// 컴파일러가 컴파일을 할 떄 자동으로 생성하는 코드
	// > 생성자(Constructor)
	// - 접근 지정자 public
	// - 반환값 존재하지 않음 > void도 생략
	// - 메서드명 == 클래스명

	// 기본 생성자 => 내가 아무것도 안 만들었을 때만 자동생성 (오버로딩 하면 안 생김)
//	public Box() {
//		this.size = null;
//		this.price = 0;
//		
//	}

	// 생성자 오버로딩
	public Box() {
//		this.size = "";
//		this.price = 0;
		
		this(""); //생성자간의 호출 => 유효성 검사할 떄 한 쪽으로 몰면 편하기 떄문에 사용

	}

	public Box(String size) {
//		this.size = size;
//		this.price = 0;
		
		this(size,0); 
		
	}

	public Box(String size, int price) {
		
		this.size = size;
		this.price = 0;

	}

	public String getSize() {
		return size;
	}

//	public void setSize(String size) {
//		this.size = size;
//	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}


class Cup {
	
	private String color;
	private int size;
	
	public Cup(String color, int size) {
	
		this.color = color;
		this.size = size;
	}

	public Cup(String color) {
		
		this.color = color;
	}

	public Cup(int size) {
		super();
		this.size = size;
	}
	
}

