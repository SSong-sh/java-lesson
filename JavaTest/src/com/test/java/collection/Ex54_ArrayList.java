package com.test.java.collection;

import java.util.ArrayList;

import java.util.Random;

import javax.crypto.EncryptedPrivateKeyInfo;
import javax.print.DocFlavor.STRING;

import org.w3c.dom.ls.LSOutput;

public class Ex54_ArrayList {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 배열 + 컬렉션 + 제어문 + 클래스
		 
		 
		 컬렉션, collection
		 - JCF, Java Collection Framework
		 - (향상된) 배열
		 - 향상?
		 	1. 성능 향상
		 	2. 사용법 향상
		 	3. 길이 가변 > 배열의 길이가 늘었다 줄었다 가능 
		 	
		 
		 컬렉션 종류
		 1. List 계열
		 	- ArrayList(*****)
		 	- LinkedList
		 	- Queue
		 	- Stack
		 	- Vector(-)
		 	
		 2. Set 계열
		 	- HashSet(***)
		 	- TreeSet
		 	
		 
		 3. Map 계열
		 	- HashMap(*****)
		 	- TreeMap
		 	- Properties(-)
		 	- HashTable(-)
		 
		 
		 ArrayList 클래스
		 - Iterable<E>, Collection<E>, List<E>
		 - Resizable-array implementation of the List interface. // 배열 길이 조정 가능 
		 - 순수 배열하고 구조가 가장 유사함
		 
		 
		 
		 */

		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		
		
		
	}

	private static void m6() {
	
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("강아지");
		names.add("고양이");
		names.add("참새");
		
		//dump
		//-Array.toString(배열)
		//-toString() 재정의
		
		System.out.println(names);
		
	}

	private static void m5() {
		
		//선택? 데이터 집합? 
		//1. 배열      > 길이 고정 > 학생수 정확 > 순수배열이 컬렉션보다 더 빠름
		//2. ArrayList > 길이 가변 > 학생수 불명확
		
		
		//성적표
		ArrayList<Student> list = new ArrayList<Student>(); //학생 명단
		Random rnd = new Random();
		
		String[] names = {"홍길동","아무개","강아지","고양이","병아리"};
		
		for(int i=0; i<5;i++) {
			
			Student s = new Student();// 학생 1명
			s.setNo(i+1);
			s.setName(names[i]);
			
			//60~100
			//0~40 + 60 
			s.setKor(rnd.nextInt(41)+60);
			s.setEng(rnd.nextInt(41)+60);
			s.setMath(rnd.nextInt(41)+60);
			
			list.add(s); //학생 명단에 추가
		}
		
		//출력
		System.out.println("=======================================================");
		System.out.println("                        성적표");
		System.out.println("=======================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for(Student s : list) {
			System.out.printf("%5d\t%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
								, s.getNo()
								, s.getName()
								, s.getKor()
								, s.getEng()
								, s.getMath()
								, s.getTotal()
								, s.getAvg());
		}
		
		
		
		
	}

	private static void m4() {
		
		//객체 배열
		//Cup[] list = new Cup[5];
		
		ArrayList<Cup> list = new ArrayList<Cup>();
		
		Cup cup = new Cup("white",5000);
		list.add(cup);
		
		list.add(new Cup("blue",3000));
		list.add(new Cup("yellow",4500));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Cup c : list) {
			System.out.println(c);
		}
		
		
	}

	private static void m3() {
		
		int[] 	  ns1 = new int[3];
		int[][]   ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][4];
		
		//ns1
		ArrayList<Integer>ms1 = new  ArrayList<Integer>();
		ms1.add(10);
		
		//ns2
		ArrayList<ArrayList<Integer>>ms2 = new ArrayList<ArrayList<Integer>>();
		
		ms2.add(new ArrayList<Integer>());
		
		ms2.get(0).add(10);
		
		//ns3 // 가장 안 쪽이 1차원 배열
		ArrayList<ArrayList<ArrayList<Integer>>> ms3
			= new ArrayList<ArrayList<ArrayList<Integer>>>();
		
		
	}

	private static void m2() {

		ArrayList<String> list = new ArrayList<String>();

		// 1. 요소 추가하기
		// - boolean add(T value)
		// - 배열의 마지막에 추가 > Append Mode
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("포도");
		list.add("귤");

		// 2. 요소 개수
		// -int size()
		System.out.println(list.size());

		// 3. 요소 읽기
		// - T get(int index)
		System.out.println(list.get(2));
		// System.out.println(list.get(5));// IndexOutOfBoundsException

		System.out.println(list.get(list.size() - 1));

		// 4. 요소 수정
		// - T set(int index, T newValue)
		String temp = list.set(2, "파인애플");
		System.out.println(temp);
		System.out.println(list.get(2));

		// 5. 요소 삭제
		// 방 없애기 > 길이 줄어든다. => 배열은 안됨. 방 개수가 고정
		// - T remove(int index) > 방 번호를 찾아서 삭제
		// - boolean remove(T value) > 값을 찾아서 삭제
		// - 시프트 발생 > 삭제된 방 이후로 모든 요소의 방번호
		System.out.println(list.size()); // 5
		list.remove(2);
		System.out.println(list.size()); // 4
		System.out.println(list.get(3));

		// 6. 요소 추가
		// - 요소를 원하는 위치에 추가
		// - Insert Mode
		// - void add(int index, T value);
		// - 시프트 발생 > 삽입된 방 이후의 모든 요소는 방번호 + 1
		System.out.println(list.get(3));
		list.add(2, "망고");
		System.out.println(list.get(3));
		System.out.println(list.size());
		
		//7. 요소 검색
		//- int indexOf(T value)
		//- int lastIndexOf(T value)
		//- boolean contains(T value)
		System.out.println(list.indexOf("사과"));
		System.out.println(list.indexOf("파인애플"));
		System.out.println(list.indexOf("포도"));
		
		//요소 삭제시 이름으로도 날릴 수 있음
		list.remove(3); //이 형식을 많이 씀
		list.remove("포도"); //동일한 포도를 식별하지 못하고 맨 처음 포도만 지움
		System.out.println(list.indexOf("포도"));
		
		
		//8. 요소 탐색
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//for문
		//- 향상된 for문(Enhanced for statement)
		//- for(변수 : 배열)
		//- 루프 변수가 없음 
		// 무조건 처음부터 끝까지 가져오는 for문
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		//9. 초기화
		//- 모든 요소 삭제 > 모든방.remove()
		//- void clear()
		
		list.clear();
		
		System.out.println(list.size());
		
		//10. 빈배열 확인
		//- boolean isEmpty()
		System.out.println(list.isEmpty());
		System.out.println(list.size()==0);
		
		list.add("사과");
		
		System.out.println(list.isEmpty());
		System.out.println(list.size()==0);

	}


	private static void m1() {
		
		//배열
		//- 타입 명시(int)
		//- 길이 명시(3)
		int[] nums1 = new int[3];
		
		//요소 접근> 첨자(index) 사용
		nums1[0] = 10; //배열[index] > 인덱서(Indexer)
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		
		System.out.println(nums1.length);
		System.out.println();
		
		//컬렉션
		//- 타입 명시(x) > Object 배열을 가지고 있음 
		//- 길이 명시(x) > 가변
		//ArrayList nums2 = new ArrayList(); => 요즘은 이거 안 씀
		ArrayList<Integer> nums2 = new ArrayList<Integer>();	
		
		
		//요소 접근
		//- boolean add(T value)
		//- Append(차례대로 추가)
		nums2.add(100); //nums2[0] = 100
		nums2.add(200); //nums2[1] = 200
		nums2.add(300); //nums2[2] = 300
		
		System.out.println(nums2.get(0));
		System.out.println(nums2.get(1));
		System.out.println(nums2.get(2));
		
		System.out.println(nums2.size());
		
		nums2.add(500);
		nums2.add(600);
		
		System.out.println(nums2.size()); //길이가 3개에서 5개로 자동으로 늘어남 
		System.out.println();
		
		for(int i=0; i<nums2.size();i++) {
			System.out.println(nums2.get(i));
		}
		
		
		
		
	}

}

class Cup {
	
	private String color;
	private int price;
	
	public Cup(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", price=" + price + "]";
	}
}


class Parent {
	
	private int a;
	private int b;
	
//	public Parent() {
//		this.a = 0;
//		this.b = 0;
//	}
	
	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	@Override
	public String toString() {
		return "Parent [a=" + a + ", b=" + b + "]";
	}
	
	public void hello() {
		System.out.println("부모 인사");
	}
	
}

class Child extends Parent{
	
	private int c;
	private int d;
	
//	public Child() {
//		this.c = 0;
//		this.d = 0;
//	}
	
	public Child(int c, int d) { 
		//부모의 기본 생성자를 호출함 => super(); 기본 생성자가 없으면 따로 만든 생성자를 호출 해줘야함
		super(0,0); //부모의 생성자 호출(기본 생성자가 아닌 생성자가 인자값 2개를 받아서 0,0)
		this.c = c;
		this.d = d;
		
		//객체 접근 연산자
		//1. this > 자기 자신
		//2. super > 자기 부모
	}

	@Override
	public String toString() {
		return "Child [c=" + c + ", d=" + d + "]";
	}
	
	@Override
	public void hello() {
		//super.hello();
		System.out.println("자식 인사");
	}
	
	//부모 인사 임시 저장 
	public void temp() {
		super.hello();
	}
}
