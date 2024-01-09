package com.test.java;

import java.util.Arrays;
import java.util.Calendar;

public class Ex27_Array {
	public static void main(String[] args) {

		// 배열, Array
		// - 자료구조 > 데이터 저장하는 물리적 구조
		// - 데이터의 집합 > 변수들을 모아 놓은 집합
		// - 같은 자료형을 저장하는 데이터의 집합

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();

		// m6();

		// m7();
		// m8();
		//m9();
		
		//m10();
		m11();
	}// main

	private static void m11() {
		
		// 배열 초기화 리스트
		
		int[] nums1 = new int[5];
		
		nums1[0] = 95;
		nums1[1] = 88;
		nums1[2] = 67;
		nums1[3] = 89;
		nums1[4] = 64;
		
		System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = new int[] {95, 88, 67, 89, 64};
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = {95, 88, 67, 89, 64};
		System.out.println(Arrays.toString(nums3));
		
		String[] names1 = new String[3];
		
		names1[0] = "홍길동";
		names1[1] = "임꺽정";
		names1[2] = "도깨비";
		
		String[] names2 = {"홍길동" , "임꺽정", "도깨비"};
		
		System.out.println(Arrays.toString(names1));
		System.out.println(Arrays.toString(names2));
		
	}

	private static void m10() {
		//배열 자동 초기화
		//-배열은 생성 직후 모든 요소(방)가 초기화 된다.
		
		//초기회 규칙
		//1.정수 배열 >0
		//2. 실수 배열 > 0.0
		//3. 문자열 > \0(\u0000)
		//4. 논리배열 > false
		///5. 참조형 배열 > null
		
		int[] list1 = new int[3];
		System.out.println(Arrays.toString(list1));
		
		byte[] list2 = new byte[3];
		System.out.println(Arrays.toString(list2));
		
		double[] list3 = new double[3];
		System.out.println(Arrays.toString(list3));
		
		char[] list4 = new char[3];
		System.out.println(Arrays.toString(list4));
		
		boolean[] list5 = new boolean[3];
		System.out.println(Arrays.toString(list5));
		
		String[] list6 = new String[3];
		System.out.println(Arrays.toString(list6));
	}

	private static void m9() {

		// Arrays 클래스
		// - 유틸리티 클래스
		// - 배열과 관련된 여러가지 기능을 구현한 클래스
		// - 배열을 조작하는 편리한 기능을 제공하는 역할

		int nums[] = new int[3];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		//배열의 상태를 확인?
		//- [I > int []
		//-@
		//-2ff4acdo > 메모리 주소
		System.out.println(nums); //쓸모없음
		
		printArray(nums);
		System.out.println(Arrays.toString(nums)); //dump(덤프)
		
		//*** C계열의 언어들은 범위를 나타날때
		//- 시작위치(inclusive) ~ 끝위치(exclusive) => 처음은 포함, 끝위치는 포함안됨
		
		int[] copy;
		
		//깊은 복사
		copy = Arrays.copyOfRange(nums, 0, nums.length);
		
		nums[0] = 100;
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
	}

	private static void printArray(int[] nums) {
		
		for (int i=0; i< nums.length; i++) {
			System.out.printf("%3d", nums[i]);
		}
		System.out.println();
	}

	private static void m8() {
		// 배열 복사
		// 1. 얕은 복사, Shallow Copy
		// - 주소값 복사
		// - Side Effect 발생

		// 2. 깊은 복사, Deep copy
		// - 실제 배열 복사
		// - Side Effect 발생 안함

		int nums[] = new int[3];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		int copy[] = new int[3];

		for (int i = 0; i < nums.length; i++) {

			// 방과 방끼리의 복사 > 요소끼리의 복사
			// int = int
			copy[i] = nums[i]; // 배열끼리 복사는 copy[] = nums[]

		}

		nums[0] = 100;
		System.out.println(copy[0]);

	}// main

	private static void m7() {

		int a = 10;
		chageValue(a);
		System.out.println(a);

		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 10;
		nums[2] = 30;

		chageArray(nums);
	}

	private static void chageValue(int a) {
		a = 20;
		System.out.println(a);

	}

	private static void chageArray(int[] nums) {

		nums[0] = 123;
		System.out.println(nums[0]);

	}

	private static void m6() {
		// 배열 복사(=참조형)
		// 값형 복사

		int a = 10;
		int b;
		b = a;

		// 값형 > 원본을 수정해도 복사본에 영향을 주지 않는다.
		// > Sise effect가 발생하지 않는다.
		a = 20; // 원본 수정
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();

		int[] nums = new int[3];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		int[] copy;

		// int[] = int[]
		copy = nums;

		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);

		// 원본을 수정하면 복사본도 수정된다.
		// 복사본을 수정하면 원본도 수정된다.
		// > Side effect 발생

		nums[0] = 100;
		System.out.println(copy[0]);


		copy[1] = 200;
		System.out.println(nums[1]);
	}

	private static void m5() {

		// 값형 vs 참조형
		// - 값형 > 변수에 데이터를 직접 저장
		// - 참조형 > 데이터는 따로 생성 + 변수에 메모리 주소 저장

		// *** 원인
		// - 데이터 크키가 일정 > 값형
		// - 데이터 크기가 일정하지 않음 > 참조형
		// - *** 변수만 보고 데이터의 길이를 추측 가능> 값형
		// - *** 변수만 보고 데이터의 길이를 추측 불가능> 참조형

		int a1 = 10;
		// a1의 메모리 크기? 4byte

		int a2 = 2000000000;
		// a2의 메모리 크기? 4byte

		String s1 = "홍길동";
		// s1의 메모리 크기? 6byte (자바는 2byte 입력)

		String s2 = "안녕하세요";
		// s2의 메모리 크기 ? 10byte

		int[] nums1 = new int[3];
		// 12byte

		int[] nums2 = new int[5];
		// 20byte
	}

	private static void m4() {

		// 각 자료형 > 배열

		// 정수 배열(byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);

		// 실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);

		// 문자 배열(char) == String
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);

		// 논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);

		// 참조형 배열
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);

		Calendar c1 = Calendar.getInstance(); // getInstance가 현재 날짜를 만들어줌

		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.println(list6[0]);

	}

	private static void m3() {

		// 참조형의 특징
		// - 모든 참조형들은 공간를 초기화하지 않아도 자동으로 초기화가 된다. / but 존재하지 않는 방 번호는 에러
		int[] nums = new int[10];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);

		// 배열의 길이 = 10
		// 첨자의 범위 = 0 ~ 9
		// 첨자의 범위 = 0 ~ 길이-1

		// ArrayIndexOutOfBoundsException:
		// Index 10 out of bounds for length 10
		// System.out.println(nums[10]); //없는 방의 번호 => 에러

		// 배열 탐색 > for문 사용
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}

	}

	private static void m2() {
		// 요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항] 학생수 증가 > 300명

		// 배열 선언하기
		// - 자료형[] 변수명 = new 자료형 [길이];
		// - 배열타입 배열명 = new 배열타입[배열의길이];

		int[] kors = new int[3];

		// 배열의 방(요소, Element)에 접근 > 방 번호(첨자,index) 사용
		kors[0] = 100; // == kor1
		kors[1] = 90;
		kors[2] = 80;

		// int total = kors[0] + kors[1] + kors[2];

		int total = 0;

		for (int i = 0; i < kors.length; i++) {
			total += kors[i];

		}

		double avg = (double) total / kors.length; // 속성, 필드, 프로퍼티
		System.out.printf("총점 : %d점, 평균 :%.1f점\n", total, avg);
	}

	private static void m1() {
		// 요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항] 학생수 증가 > 300명

		int kor1;
		int kor2;
		int kor3;
		// +297 추가 선언

		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		// +297

		int total = kor1 + kor2 + kor3; // +kor4 + kor5 + ... + kor300

		double avg = total / 3.0; // >300.0

		System.out.printf("총점 : %d점, 평균 :%.1f점\n", total, avg);

	}

}
