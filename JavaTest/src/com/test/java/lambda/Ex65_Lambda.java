package com.test.java.lambda;

public class Ex65_Lambda {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 람다식, Lambda Expression
		 - 함수형 프로그래밍 방식을 지원하는 표현식
		 - 람다식을 사용하면 코드가 간결해진다.(호불호)
		 - 자바 > 컬렉션(배열) 조작을 위해서 제공
		 
		 - 자바의 메서드 표현
		 - 람다식은 매개변수를 가지는 코드블럭이다.
		 - 자바의 람다식은 인터페이스를 사용해서 만든다.
		 - 자바의 람다식은 익명 객체를 만드는 표현을 간소화시킨 기술이다.
		 
		 
		 람다식 형식
		 - 인터페이스 변수 = 람다식;
		 ex) MyInterface m1 = () -> {};
		 
		 (매개변수) -> {구현부};
		 a. (매개변수) : 추상 메서드의 인자리스트
		 b. -> 화살표(Arrow), 구현부 호출하는 역할(연결)
		 c. {구현부} : 추상 메서드의 구현부
		 		 
		 */
		
		
		//요구사항] MyInterface를 구현한 객체를 생성하시오.
		
		//Case 1. 클래스 선언 + 객체 생성
		MyInterface m1 = new MyClass();
		m1.test();
		
		//Case 2. 익명 객체 생성
		MyInterface m2 = new MyInterface() {
			@Override
			public void test() {
				System.out.println("실명 클래스에서 구현한 메서드");
			}
		};
		m2.test();
		
		
		//Case 3. 람다식
		MyInterface m3 = () -> {
			System.out.println("람다식으로 구현한 메서드");
		}; //() = test이지만 생략됨
		
		m3.test();
		
		
//		TestInterface t1 = new TestInterface() {
//
//			@Override
//			public void aaa() {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void bbb() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
		
//		//메서드 이름을 표시하지 않기 때문에 메서드가 2개일 경우 구현 불가
//		TestInterface t2 = ()->{
//			
//		};
		
		
		//추상 메서드의 형식에 따라
		//- 매개변수 유/무
		//- 반환값 유/무
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {

			@Override
			public void call() {
				System.out.println("pr1");
				
			}
			
		};
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		
		pr2.call();
		
		
		//***람다식 구현부 > 문장 1개 > {} 생략가능
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();
		
		
		
		ParameterNoReturn pr4 = (int n) -> {
			System.out.println(n);
		};
		pr4.call(10);
		
		//부모의 매개변수는 상속 받지 않음, 매개변수는 지역변수이기 때문에 이름은 내 마음대로 지을 수 잇음, => 똑같이 하는게 덜 햇갈릴 뿐
		//*** 람다식의 매개변수 자료형을 생략할 수 있다.
		ParameterNoReturn pr5 = (n) -> {
			System.out.println(n);
		};
		pr5.call(20);
		
		
		//***람다식의 매개변수 ()을 생략할 수 있다.
		ParameterNoReturn pr6 = n -> {
			System.out.println(n);
		};
		pr6.call(30);
		
		ParameterNoReturn pr7 = n -> System.out.println(n);
		pr5.call(40);
		
		
		MultiParameterNoReturn pr8 =(String name, int age) -> {
			System.out.println(name + "," + age);
		};
		pr8.call("홍길동", 20);
		
		MultiParameterNoReturn pr9 =(name, age) -> {
			System.out.println(name + "," + age);
		};
		pr9.call("홍길동", 30);
		
		//*** 매개변수의 ()는 매개변수가 1일 때만 생략이 가능하다.
//		MultiParameterNoReturn pr10 =name, age -> {
//			System.out.println(name + "," + age);
//		};
//		pr10.call("홍길동", 40);
		
		MultiParameterNoReturn pr11 =(name, age) -> System.out.println(name + "," + age);
		pr9.call("홍길동", 50);
		
		
		NoParameterReturn pr12 = () -> {
			return 10;
		};
		System.out.println(pr12.call());
		
		
		//*** 구현부에 return문이 유일하면 {}와 return을 생략할 수 있다.
		NoParameterReturn pr13 = () -> 10;
		System.out.println(pr13.call());
		
		ParameterReturn pr14 = (int a, int b) -> {
			return a + b;
		};
		System.out.println(pr14.call(10, 20));
		
		ParameterReturn pr15 = (a, b) -> a + b;
		System.out.println(pr14.call(200, 20));
		
	}//main

}


@FunctionalInterface
//람다식을 저장할 수 있는 인터페이스라는 뜻
interface MyInterface {
	void test();
}

class MyClass implements MyInterface{

	@Override
	public void test() {
		System.out.println("실명 클래스에서 구현한 메서드");
		
	}
	
}


interface TestInterface {
	void aaa(); //추상메서드
	void bbb();
}


interface NoParameterNoReturn {
	void call();
	
}

interface ParameterNoReturn{
	void call(int n);
	
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface NoParameterReturn {
	int call();
}

interface ParameterReturn{
	int call(int a, int b);
}