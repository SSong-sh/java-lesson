package com.test.java.lambda;

import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.test.java.collection.Member;

public class Ex67_Lambda {
	public static void main(String[] args) {
		
		/*
		  
		  
		  람다식 > 익명 객체의 추상 메서드 > 인터페이스 참조 변수에 저장
		  > 람다식을 사용하려면 반드시 인터페이스가 필요하다!!
		  
		  람다식의 가장 큰 장점 > 간단함(생산성)
		  람다식의 가장 큰 단점 > 인터페이스를 선언해야한다.
		  
		  *** 자바에서는 여러가지 형식의 람다식(추상메서드)를 저장할 수 있는 인터페이스를 미리 제공
		  > 함수형 인터페이스 (Functional Interface)
		  
		  함수형 인터페이스 (Functional Interface)
		  - 평범한 인터페이스
		  - 목적 > 람다식을 저장한다.
		  1. 표준 API 함수형 인터페이스 > JDK 제공
		  2. 사용자 정의 함수형 인터페이스 > 개발자 선언 => Ex65,66
		  
		  표준 API 함수형 인터페이스
		  //TODO 틈틈히 와서 볼것 - 표준 API 함수형 인터페이스
		  1. Consumer
		  	- Consumer<T>
		  	- Bicosumer<T,U>
		  	- ..
		  	- 매개변수 O , 반환값 X => 추상 메서드를 제공한다. 
		  
		  2. Supplier
		  	- Supplier<T>
		  	- 매개변수 X , 반환값 O => 추상 메서드를 제공한다.
		  
		  
		  3. Function
		  	- Function<T,R>
		  	- BiFunction<T,R>
		  	- 매개변수 O , 반환값 O => 추상메서드 제공
		  	
		  4. Operator
		  	- Function 하위셋
		  	- 매개변수를 연산 후 반환하는 행동
		  	- UnaryOperator<T>
		  	- BinaryOperator<T>
		  	- 매개변수 O , 반환값 O => 추상메서드 제공
		  
		  5. Predicate
		  	- Function 하위셋
		  	- 매개변수를 연산 후 반환하는 행동
		  	- Predicate<T>
		  	- BiPredicate <T,U>
		  	- 매개변수 O , 반환값 O => 추상메서드 제공
		  
		  
		  
		  
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
	}

	private static void m5() {
		
		//Predicate
		//- 매개변수를 전달하면 처리 후 반환 값을 돌려주는 업무를 구현하는 인터페이스
		//- testXXX() 추상 메서드 제공
		//- 논리 검사 > Boolean 반환
		
		Function<Integer, Boolean> f1 = num -> num >0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		//반환값이 무조건 boolean
		Predicate<Integer> p1 = num -> num >0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		BiPredicate<String, String> bp1 = (str1, str2) -> 
			str1.length() > str2.length();
			
			System.out.println(bp1.test("홍길동", "홍길동님"));

		
		
		
	}

	private static void m4() {
		
		//Operator
		//- 매개변수를 전달하면 처리 후 반환 값을 돌려주는 업무를 구현하는 인터페이스
		//- applyXXX() 추상 메서드 제공 
		//- 추상 메서드의 매개변수의 반환값이 자료형이 동일하다.
		
		BiFunction<Integer,Integer,Integer> bf1 = (a,b) -> a + b;
		System.out.println(bf1.apply(10, 20));
		
		//매개변수 2개 => 매개변수 무조건 integer, 반환값도 integer => 위에랑 똑같음
		//함수의 하위셋
		BinaryOperator<Integer> bo1 = (a,b) -> a + b;
		System.out.println(bf1.apply(10, 20));
		
		//매개변수 1개
		UnaryOperator<Integer> uo1 = a -> a*a;
		System.out.println(uo1.apply(2));
		
		
	}

	private static void m3() {
		
		//Function
		//- 매개변수를 전달하면 처리 후 반환 값을 돌려주는 업무를 구현하는 인터페이스
		//- applyXXX() 추상 메서드 제공 
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String, Integer> f2 = str -> str.length();
		System.out.println(f2.apply("홍길동입니다."));
		
		//앞에 두개는 매개변수, 마지막 리턴
		BiFunction<Integer,Integer,String> bf1 = (a,b) -> {
			if(a>b) {
				return "크다";
			}else if( a<b) {
				return "작다";
			}else {
				return "같다";
			}
		};
		System.out.println(bf1.apply(20,10));
		
		//double applyAsDouble(int value);
		IntToDoubleFunction id1 = num -> num /1.0;
		System.out.println(id1.applyAsDouble(10));
	}

	private static void m2() {
		
		//Supplier
		//- 매개 변수 없이 반환값을 돌려주는 업무를 구현하는 인터페이스
		//- getXXX() 추상 메서드 제공
		
		//반환타입 써주는 것
		Supplier<Integer> s1 = ( )-> {return 10;};
		System.out.println(s1.get());
		
		Supplier<Double> s2 = ( )-> Math.random();
		System.out.println(s2.get());
		
		Supplier<String> s3 = ( )-> "홍길동";
		System.out.println(s3.get());
		
		Supplier<Integer> s4 = ( )-> {
			Calendar c = Calendar.getInstance();
			return c.get(Calendar.HOUR_OF_DAY);
		};
		System.out.println(s2.get());
		
	}

	private static void m1() {
		
		//Consumer
		//- 매개변수를 받아서 소비하는 업무를 구현하는 인터페이스
		//- acceptXXX() 추상 메서드 제공
		
		MyConsumer m1 = num -> System.out.println(num);
		m1.test(100); //출력하는 소비를 하면서 끝남
		
		//java.util.function 패키지
		Consumer<Integer> c1 = num -> System.out.println(num);
		c1.accept(100);
		
		Consumer<Integer> c2 = num -> System.out.println(num * num);
		c2.accept(100);
		
		Consumer<String> c3 = str -> System.out.println(str.length());
		c3.accept("홍길동");
		
		Consumer<Integer> c5 = count -> {
			for(int i =0;i<count;i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c5.accept(10);
		
		Consumer<Member> c6 = m -> {
			System.out.println(m.getName());
			System.out.println(m.getAge());
		};
		
		c6.accept(new Member("홍길동",20));
		
		BiConsumer<String, Integer> bc1 = (name,age) -> {
			System.out.printf("이름: %s, 나이: %d세\n", name,age);
		};
		bc1.accept("아무개", 20);
		
		BiConsumer<Integer, Integer> bc2 = (a,b) -> System.out.println(a+b);
		bc2.accept(10, 20);
		
		
		//Consumer<T> : 범용
		//BiConsumer<T,U> : 범용
		
		//전용
		//Consumer<Integer> ic1;
		IntConsumer ic1 = num -> System.out.println(num *2);
		ic1.accept(100);
	}


}
//람다식을 저장하고 싶다. > 인터페이스 필요 > 인터페이스 선언
interface MyConsumer {
	//Input(o) , Output(x) == 소비
	void test(int num);
}
