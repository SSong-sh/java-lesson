package com.test.java.file;

public class test {
	
	private int a =10;
	private static int b = 20;

	public void aaa() {
		System.out.println("객체");
		
		//객체 메서드 > 객체 멤버 접근 가능
		this.a = 10;
		this.aaa();
		
		//객체 메서드 > 정적 멤버 접근 가능
		test.b = 20;
		test.bbb();
		
	}
	
	public static void bbb(){
		
		System.out.println("동적");
		
		//this는 힙 메모리에 있는 객체에서만 사용 가능 ! 따라서 static은 따로 저장되기 때문에 사용이 안됨
		
		//정적 메서드 > 객체 멤버에 대한 접근이 안됨
		
		//정적 메서드 > 정적 메서드와 변수 접근 가능
		
	}
	
}
