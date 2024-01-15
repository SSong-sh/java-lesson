package com.test.java.obj;

import javax.swing.event.TableColumnModelListener;

public class Ex48 {
	
	public static void main(String[] args) {
		
		// 1. 추상 클래스 or 인터페이스를 사용하는 이유
		// 2. 업캐스팅 or 다운캐스팅을 사용하는 이유
		
		
		//상황] 프린터 대리점 운영
		//1. LG100모델 * 5대, HP200 모델 * 3대
		//2. 하루 1번씩 > 제품 점검 > 모델과 상관없이 출력 기능 확인!!
		
		
		//추가 상황] 
		//1. 프린터 재고 증가
		// 	- LG100 > 500대
		// 	- HP200 > 300대
		//2. 프린터 종류 증가
		// 	- Dell300
		//	- BenQ400
		//3. 각 브랜드별 고유기능 점검
		// 	- LG100 > selfTest()
		// 	- HP200 > call()
		
		
		//m1();
		//m2();
		m3();
		
		
	}//main

	private static void m3() {
		//Case 3.
		//- 배열 사용 + 업/다운 캐스팅
		
		LG100 lg1 = new LG100("lg100", 300000, "black", 100);
		Printer p1;
		
		
		//업캐스팅
		//Printer = LG100
		//부모클래스 = 자식클래스
		//100% 안전
		p1 = lg1;
		
		//자식 객체를 부모 변수에 넣을 수 있다.
		Printer p2 = (Printer) new LG100("lg100", 300000, "black", 100); //printer 앞 형변환 생략 해야함
		Printer p3 =  new HP200("hp200", 350000, "white");
		
		//서로 다른 자료형이 하나의 배열에 들어가 있다. => 업 캐스팅 이용
		Printer[] plist = new Printer[3];
		plist[0] = new LG100("lg100", 300000, "black", 100);
		plist[1] =new HP200("hp200", 350000, "white");
		
		
		//Case 3.
		//- 배열 사용 + 업/다운 캐스팅 => 형재들을 하나의 집합안에 넣을 수 있음
		Printer[] list = new Printer[8]; //LG(5) + HP(3)
		
		for(int i=0; i<list.length;i++) {
			
			if(i<5) {
				list[i] = new LG100("lg100", 300000, "black", 100);
			}else if( i< 7){
				list[i] = new HP200("hp200", 350000, "white");
			}else {
				list[i] = new Dell300("dell300", 400000);
			}
		}
		
		//점검 
		for(int i=0; i<list.length;i++) {
			list[i].print();
			//list[i].selfTest();
			//list[i].call();
			
			//다운 캐스팅
			//- 평소엔 형재 객체끼리 하나의 집합에서 관리 > 업캐스팅 사용
			//- 특별히 자신만의 멤버를 호출해야할 때 > 다운캐스팅 사용
			if(list[i] instanceof LG100) {
				LG100 lg = (LG100)list[i];
				lg.selfTest();
			} else if(list[i] instanceof HP200) {
				HP200 hp = (HP200)list[i];
				hp.call();
			}
			
			//연산자
			//-객체 instanceof 자료형(클래스이름) => boolean 반환
			//System.out.println(list[i] instanceof LG100); //이 객체가 이 자료형에 속합니까? 바꿔서 속해도 true(업캐스팅)
		}
		
	}

	private static void m2() {
		//Case 2.
		//- 같은 종류의 프린터를 조작 > 아주 가성비 높은 방식
		//- 다른 종류의 프린터가 증가 > 같은 패턴이 증가
		LG100[] lg = new LG100[5];
		HP200[] hp = new HP200[3];
		Dell300[] dell = new Dell300[5];
		
		for(int i=0; i<lg.length;i++) {
			lg[i] = new LG100("lg100", 300000, "black", 100);
		}
		for(int i=0; i<hp.length;i++) {
			hp[i] = new HP200("hp200", 350000, "white");
		}
		
		//점검
		for(int i=0; i<lg.length;i++) {
			lg[i].print();
			lg[i].selfTest();
		}
		
		for(int i=0; i<hp.length;i++) {
			hp[i].print();
			hp[i].call();
		}
		
		
		
	}

	private static void m1() {
		//Case 1. 
		//- 가장 비효율적인 방식
		//- 대당 비용 동일 
		
		LG100 lg1 = new LG100("lg100", 300000, "black", 100);
		LG100 lg2 = new LG100("lg100", 300000, "black", 100);
		LG100 lg3 = new LG100("lg100", 300000, "black", 100);
		LG100 lg4 = new LG100("lg100", 300000, "black", 100);
		LG100 lg5 = new LG100("lg100", 300000, "black", 100);
		LG100 lg6 = new LG100("lg100", 300000, "black", 100);
		
		HP200 hp1 = new HP200("hp200", 350000, "white");
		HP200 hp2 = new HP200("hp200", 350000, "white");
		HP200 hp3 = new HP200("hp200", 350000, "white");
		
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();

		System.out.println();
		
		hp1.print();
		hp2.print();
		hp3.print();
	}

}



//클래스의 부모 역할을 선택해야 함
//1. 일반 클래스 -> 공통 기능을 강제로 넣어야 하기 때문에 탈락
//2. 추상 클래스 -> 구현부가 있으면 선택
//3. 인터페이스  -> 구현부가 없으면 선택


abstract class Printer {
	
	private String model;
	private int price;
	
	public Printer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	
	
	//제품의 종류와 상관없이 공통된 기능 선언 > 출력 기능 > void print()
	
	// 부모세대에서 구현부를 쓰면 자식도 똑같은 구현부를 쓰기 때문에 자식의 특별한 기능이 사라짐 
	// 그래서 구현부 없이 껍데기만 물려줌
	// 오버라이딩을 해도 되는데 그러면 각자 다시 재정의하게 되니 의미가 사라짐 
	public abstract void print();
	
	
}



class LG100 extends Printer{
	

	private String color;
	private int size; //A4,A5
	
	public LG100(String model, int price, String color, int size) {
		super(model, price);
		this.color = color;
		this.size = size;
	}
	
	public void print() {
		System.out.printf("%d 사이즈로 출력합니다.\n", this.size);
	}
	
	public void selfTest() {
		System.out.println("자가 진단을 합니다.");
	}
	
}

class HP200 extends Printer {
	
	private String type; //터치, 비터치
	
	public HP200 (String model, int price, String type) {
		super(model, price);
		this.type = type;
	}
	
	
	
//	public void output() {
//		System.out.printf("%d 사이즈로 출력합니다.\n", this.type);
//	}
	
	public void call() {
		System.out.println("상담원과 연결합니다.");
	}

	@Override
	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n", this.type);
		
	}
	
}

class Dell300 extends Printer {

	public Dell300(String model, int price) {
		super(model, price);
	}

	@Override
	public void print() {
		System.out.println("Dell 방식으로 출력합니다.");
	}
	
	
}
