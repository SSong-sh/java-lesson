package com.test.java.obj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex49_Object {
	
	public static void main(String[] args) {
		
		
		//Object 클래스
		//- 모든 클래스의 부모 클래스이다.
		//- 업캐스팅 적용 > 모든 자료형을 담을 수 있는 자료형
		
		//m1();
		m2();
		
	}

	private static void m2() {
		
		//참조형 = (형변환) 참조형
		//부모클래스 = 자식 클래스
		Object o1 = new AAA();
		
		//불가능 작업
		//눈에 안보이는 작업 > 박싱(Boxing) 발생 >
		Object o2 = 100; //아래 형식으로 자동으로 바뀜
		Object o3 = new Integer(100); //요즘 안쓰는거 써서 경고 주는 것
		
		
		int a1 =100; //값형
		Integer a2 = new Integer(100);//참조형
		System.out.println(a1 == a2); //Integer 클래스는 int 값형이 
		//가끔씩 참조 타입으로 사용해야하는 경우 대신 그 역할을 하기 위해 제공되는 클래스
		
		//Wrapper Class
		//- byte > Byte
		//- short > Short
		//- ... 
	
		Integer a3 =100; 
		System.out.println(a3 * 2); //a3 = 주소값 => 계산되면 안되는데 됨 => 언박싱이 일어나서 참조형을 다시 int형 값으로 변환시킴
		
		o2 = 100;
		//System.out.println(o2 * 2);//위에는 타입이 int라 자동 int값으로 바꿔주지만
		// 위에 예시는 o2가 오브젝토 자료형이라 int, byte, long인지 알 수 없기 때문에 자동으로 바꿔주지 않음
		
		System.out.println((Integer)o2 *2);
		System.out.println((int)o2 *2);
		
		
		//박싱(언박싱) > 비용 많이 발생!!
		
	}

	private static void m1() {
		AAA a1 = new AAA();
		AAA a2 = new BBB(); //부모 변수 = 자식 객체 > 업캐스팅
		AAA a3 = new CCC(); //할아버지 = 손자 > 업캐스팅

		Object o1 = new AAA();
		Object o2 = new BBB();
		Object o3 = new CCC();
		
		Object o4 = new Scanner(System.in);
		Object o5 = new BufferedReader(new InputStreamReader(System.in));
		Object o6 = new Employee();
		
		Object o7 = "홍길동";
		Object o8 = new int[3];
		
		//값형 <- (형변환 100% 불가능 ) -> 참조형
		//원래 아래 예시는 되면 안됨
		Object o9 = 100;
		Object o10 = true;
		
		
		//자료형을 신경 쓰지 않아도 되는 편리한 집합(********어마어마한 장점)
		//자료형을 신경 쓰지 않아도 되는 것이 단점 ㅜㅜㅜㅜㅜㅜ
		
		//*** Object배열에는 무엇이든 담을 수 있다!!
		//하지만 처음 담은 자료형을 나머지 방에도 담는다. int로 처음 담으면 끝까지 int형으로 넣어야 함
		Object[] list = new Object[5];
		
		list[0] = 100;
		list[2] = 200;
		list[3] = 300;
		list[3]	= "문자열";
		list[4] = true;
		
		for(int i=0; i<list.length; i++) {
			System.out.println((int)list[i] * 2);//예측 불가능 / 참조형일떄는 값형과 대입을 못하기 때문에 다시 다운캐스팅
			
		}
	}
	

}


class AAA { //extends Object
	
}

class BBB extends AAA {
	
}

class CCC extends BBB {
	
}

