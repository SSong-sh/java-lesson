package com.test.java;

public class Ex70_String {

	public static void main(String[] args) {

		// 문자열 성질
		// - "자바의 문자열은 불변이다(immutable)이다."
		// - 취급할 때는 값형처럼
		// 왜? => sideEffect가 안생김 (배열이나 객체와 다르게 예외)
		// 참조형의 성질상 똑같은 주소값을 가지고 있는 한 변수를 건들면 다른 변수도 바뀌어야 하나 문자열은 안바뀜!!!

		 m1();
		//m2();

	}

	private static void m2() {

//		//비쌈
//		String txt = "홍길동";
//		txt = txt + "님";
//		System.out.println(txt);
//		
//		//쌈
//		String txt1 = "홍길동님";
//		System.out.println(txt1);

		// 문제발생
		// 기존꺼에 점 하나 붙여서 새로운 인스턴스를 만들고 기존거를 버림!! => 낭비!!! 시간도 오래걸림
		// 이런 문자열의 잦은 조작은 > 다량의 Garbage를 생성 (메모리 낭비)
		long begin = 0, end = 0;

		begin = System.currentTimeMillis();

		String txt = "홍길동";

		for (int i = 0; i < 100000; i++) {
			txt += ".";
		}

		end = System.currentTimeMillis();

		System.out.printf("길이: %,d자\n시간: %,dms\n", txt.length(), end - begin); // 결과 :길이: 100,003자 ,시간: 1,243ms

		// 더 나은 방법! 시간이 훨씬 줄어든다.
		// 공간을 수정하는 방식으로 진행하기 때문에
		begin = System.currentTimeMillis();

		// String txt = "홍길동";
		StringBuilder sb = new StringBuilder("홍길동"); // 타입은 다르지만 문자열이라고 생각
		System.out.println(sb);
		// StringBuffer sb; 위에꺼랑 쌍둥이

		for (int i = 0; i < 100000; i++) {
			sb.append(".");

		}

		end = System.currentTimeMillis();

		System.out.printf("길이: %,d자\n시간: %,dms\n", sb.length(), end - begin); // 결과 :길이: 100,003자 ,시간: 4ms
	}

	private static void m1() {

		// 값형 = 메모리 크기 고정 (일정)
		int n1 = 10; // 크기 > 4바이트
		int n2 = 10000; // 크기 > 4바이트

		// 참조형 => 실제 인스턴스가 어떻게 만들어지는지에 따라 메모리가 변함
		int[] ns1 = { 10, 20, 30 }; // 12byte
		int[] ns2 = { 10, 20, 30, 40, 50 }; // 20byte

		String s1 = "홍길동"; // 6byte
		String s2 = "홍길동입니다."; // 14byte

		String s3 = "문자열문자열문자열문자열문자열";
		String s4 = "문자열문자열문자열문자열문자열";
		String s5 = "문자열문자열문자열문자열";
		s5 += "문자열";

		System.out.println(s3 == s4); // true
		System.out.println(s3 == s5); // false = > 다른 인스턴스이기 때문에
		System.out.println(s3.equals(s5)); // 오버라이딩 => 한글자씩 비교

		// 상수를 만들기 전에 같은 상수가 있는지 확인하고 있으면 메모리 주소를 줌! 그럼 같은 주소값을 가지게 됨
		System.out.println(s3.hashCode());// 784197788
		System.out.println(s4.hashCode());// 784197788

		// 주소값이 달라짐
		s4 = s4 + ".";
		// 점을 찍는 순간 점이 찍힌 새로운 객체를 다시 만듬 => 그래서 주소가 변경됨
		System.out.println(s3.hashCode());// 784197788
		System.out.println(s4.hashCode());// -1459672302

	}

}

class Test {


	@Override
	public String toString() {
		return String.format("Test []");
	}

	/*
	 * private int num; private String type;
	 * 
	 * @Override public String toString() { StringBuilder builder = new
	 * StringBuilder();
	 * builder.append("Test [num=").append(num).append(", type=").append(type).
	 * append("]"); return builder.toString(); }
	 */
	
	/*
	 * @Override public String toString() { return "Test [num=" + num + ", type=" +
	 * type + "]"; }
	 */

	/*
	 * @Override public String toString() { StringBuilder builder = new
	 * StringBuilder(); builder.append("Test [num="); builder.append(num);
	 * builder.append(", type="); builder.append(type); builder.append("]"); return
	 * builder.toString(); }
	 */
	
	

}
