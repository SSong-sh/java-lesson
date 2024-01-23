package com.test.java.collection;

import java.util.ArrayList;

import java.util.Random;


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
		m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8(); //컬렉션 만듥디
		
		
	}

	private static void m8() {
		
		//배열 생성
		MyArrayList list = new MyArrayList();
		

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
//		list.add("후후후");

		
//		list.add("후후후");
//		list.add("헤헤헤");
//		list.add("가가가");
//		list.add("나나나");
//		System.out.println(list);
//		
//		list.add("다다다");
		System.out.println(list);
		

		//읽기
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		System.out.println();

		//개수
		System.out.println(list.size());
		
		System.out.println();

		//탐색 + 읽기
//		for (int i=0; i<list.size(); i++) { //i의 범위가 배열의 길이가 아닌 배열의 데이터의 개수
//		      System.out.println(list.get(i));
//		}
//		
		System.out.println();

		//수정
		list.set(0, "우하하");
//		System.out.println(list.get(0));
		System.out.println("삭제전");
		System.out.println(list);

		//삭제
		list.remove(1);
		System.out.println("삭제 후");
		System.out.println(list);
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
//		System.out.println();
		
		list.add("가가가");
		System.out.println(list);
		
		
		list.remove("하하하");
		System.out.println(list);

		//삽입 => 배열방을 늘려주는 작업 필요 ! 데이터 손실 발생
		list.add(1, "호호호");
		list.add(1, "호호호");
		list.add(1, "호호호");
		list.add(1, "호호호");

//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
		System.out.println(list);
		
		System.out.println();

		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}
		if (list.indexOf("호호호") > -1) {
			System.out.println("호호호 있음");
		} else {
			System.out.println("호호호 없음");
		}
		
		System.out.println(list.lastIndexOf("호호호"));
		System.out.println(list.indexOf("호호호"));
		
		System.out.println(list.indexOf("호호호",2));
		System.out.println(list.lastIndexOf("호호호",2));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(list);

		//초기화 
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		
		
		//trimToSize() => 내가 확실하게 몇개의 데이터를 가질지 알면 사용 ! => 그래서 대부분 사용하지 않음
		list.add("홍길동");
		list.add("아무개");
		list.add("강아지");
		list.add("고양이");
		list.add("병아리");
		list.add("참새");
		System.out.println(list);
		
		list.trimToSize();
		System.out.println(list);
		
		
		MyArrayList list2 = new MyArrayList(100); //초기용량을 지정해주면 쓸모없는 더블링이 생기지 않고 length가 100으로 잡힘
		
		for(int i=0; i<100;i++) {
			list2.add(i+"");
		}
		System.out.println(list2); //MyArrayList() = length는 더블링 때문에 4,8,~,128까지 생김
		
		
		
	}

	private static void m7() {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		
		nums.add(50); //자리가 부족하면 원래 배열길이의 2배 길이로 새로운 배열을 만들어서 교체함 => 유연하게 늘어나는 것처럼 보임
		
		//size() :내부 배열의 길이(x) >  데이터의 개수
		System.out.println(nums.size());
		
//		for(int i=0;i<10000000;i++) {
//			nums.add(i);
//		}
//		
//		System.out.println(nums.size());
		//System.out.println(nums);
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
		System.out.println(list.size()); //결과 : 5

		// 3. 요소 읽기
		// - T get(int index)
		System.out.println(list.get(2)); //결과 : 사과
		// System.out.println(list.get(5));// IndexOutOfBoundsException

		System.out.println(list.get(list.size() - 1)); // 결과 : 귤

		// 4. 요소 수정
		// - T set(int index, T newValue)
		String temp = list.set(2, "파인애플");
		System.out.println(temp); //결과 : 사과 (해당 위치에 있던 값 반환)
		System.out.println(list.get(2)); //결과 : 파인애플

		// 5. 요소 삭제
		// 방 없애기 > 길이 줄어든다. => 배열은 안됨. 방 개수가 고정
		// - T remove(int index) > 방 번호를 찾아서 삭제
		// - boolean remove(T value) > 값을 찾아서 삭제
		// - 시프트 발생 > 삭제된 방 이후로 모든 요소의 방번호
		System.out.println(list.size()); // 5
		list.remove(2);
		System.out.println(list.size()); // 4
		System.out.println(list.get(3)); //귤

		// 6. 요소 추가
		// - 요소를 원하는 위치에 추가
		// - Insert Mode
		// - void add(int index, T value);
		// - 시프트 발생 > 삽입된 방 이후의 모든 요소는 방번호 + 1
		System.out.println(list.get(3)); //결과 : 귤
		list.add(2, "망고");
		System.out.println(list.get(3)); //결과 : 포도
		System.out.println(list.size()); //결과 :5
		
		//7. 요소 검색
		//- int indexOf(T value)
		//- int lastIndexOf(T value)
		//- boolean contains(T value)
		System.out.println(list.indexOf("사과")); //결과 : -1 (사과 없음)
		System.out.println(list.indexOf("파인애플")); //결과 : -1 (파인애플 없음)
		System.out.println(list.indexOf("포도")); //결과 : 3
		
		//요소 삭제시 이름으로도 날릴 수 있음
		list.remove(3); //이 형식을 많이 씀
		list.remove("포도"); //동일한 포도를 식별하지 못하고 맨 처음 포도만 지움
		System.out.println(list.indexOf("포도")); //결과 : -1
		
		
		//8. 요소 탐색
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//결과
		//바나나
		//딸기
		//망고
		//귤
		
		//for문
		//- 향상된 for문(Enhanced for statement)
		//- for(변수 : 배열)
		//- 루프 변수가 없음 
		// 무조건 처음부터 끝까지 가져오는 for문
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println();
		//결과
		//바나나
		//딸기
		//망고
		//귤
		
		//9. 초기화
		//- 모든 요소 삭제 > 모든방.remove()
		//- void clear()
		
		list.clear();
		
		System.out.println(list.size()); //결과 : 0
		
		//10. 빈배열 확인
		//- boolean isEmpty()
		System.out.println(list.isEmpty()); //true
		System.out.println(list.size()==0); //true
		
		list.add("사과");
		
		System.out.println(list.isEmpty()); //false
		System.out.println(list.size()==0); //false

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
