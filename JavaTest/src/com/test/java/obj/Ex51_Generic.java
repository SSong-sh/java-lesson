package com.test.java.obj;




public class Ex51_Generic {
	
	public static void main(String[] args) {
		
		
		//제네릭, Generic => object 클래스의 가독성이 떨어지는 단점을 보완하기 위함
		//1. 제네릭 클래스 > 0
		//2. 제네릭 메서드
		
		
		//*** 제네릭 클래스
		//-JDK에서 제공되는 기능 중 일부가 제네릭으로 제공
		//- 컬렉션의 기능들
		
		
		//요구사항] 클래스 설계중...
		//1. 멤버 변수 > int 1개
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드를 선언
		
		//전용 클래스
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1);
		System.out.println(n1.getData()*2);
		System.out.println();
		
		
		//범용 클래스
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2);
		System.out.println((int)n2.getData()*2);
		System.out.println();
		
		//제네릭
		Wrapper<Integer>n3 = new Wrapper(300);
		System.out.println(n3);
		System.out.println(n3.getData() *3);
		System.out.println();
		
		
		
		//추가사항] String을 중심으로 하는 클래스를 추가 설계 
		//추가사항] boolean을 중심으로 하는 클래스를 추가 설계 
		//추가사항] double을 중심으로 하는 클래스를 추가 설계 
		//추가사항] byte을 중심으로 하는 클래스를 추가 설계 
		//추가사항] float을 중심으로 하는 클래스를 추가 설계 
		//추가사항] Employee을 중심으로 하는 클래스를 추가 설계 
		//추가사항] 무한대...
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		System.out.println();
		
		WrapperString s2 = new WrapperString("아무개");
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("문자열");
		System.out.println(s3);
		System.out.println((s3.getData()).length());
		System.out.println();

		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		WrapperBoolean b2 = new WrapperBoolean(true);
		System.out.println(b2);
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println();
		
		//Wrapper<Boolean> b3 = new Wrapper<>(true);
//		System.out.println(b3);
//		System.out.println(b3.getData() ? "참" : "거짓");
//		System.out.println();
	
	}//main

}

class WrapperInt{
	
	private int data; //1. 클래스 중심
	
	//2. data를 중심 > 메서드
	
	//ctrl + space +enter => 기본 생성자
	public WrapperInt(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	//dump 메서드
	public String toString() {
		return "[data=" + data + "]";
	}
	
}


class WrapperString{
	
	private String data; //1. 클래스 중심
	
	//2. data를 중심 > 메서드
	
	//ctrl + space +enter => 기본 생성자
	public WrapperString(String data) {
		this.setData(data); //this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	//dump 메서드
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperBoolean{
	
	private boolean data; //1. 클래스 중심
	
	//2. data를 중심 > 메서드
	
	//ctrl + space +enter => 기본 생성자
	public WrapperBoolean(boolean data) {
		this.setData(data); //this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	//dump 메서드
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperObject{
	
	private Object data; //1. 클래스 중심
	
	//2. data를 중심 > 메서드
	
	//ctrl + space +enter => 기본 생성자
	public WrapperObject(Object data) {
		this.setData(data); //this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	//dump 메서드
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

//제네릭 클래스
class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	//dump 메서드
	public String toString() {
		return "[data=" + data + "]";
	}
	
}
