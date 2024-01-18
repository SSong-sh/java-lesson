package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex57_HashSet {
	
	public static void main(String[] args) {
		/*
		 
		 
		 1. List
		 - 순서가 있는 집합
		 - 첨자 (방번호)
		 - 데이터 중복을 허용
		 
		 2. Map
		 - 순서가 없는 집합
		 - 키 (방이름)
		 - 데이터 중복을 허용
		 
		 3. Set
		 - 순서가 없는 집합
		 - 식별자가 없다.(방번호 x, 방이름 x) > 방을 구분할 수 없다.
		 - 데이터 중복을 허용하지 않음(중복)
		 
		 
		 */
		
		//m1();
		//m2();
		//m3();
		m4();
		//m5();

	}

	private static void m5() {

		HashSet<Integer> set = new HashSet<>();

		Random rnd = new Random();
		
		while(set.size() < 5) {
			set.add(rnd.nextInt(10));
		}
		
		System.out.println(set);
		
	}

	private static void m4() {
		
		//중요한 개념 !!!
		
		HashSet<Member> set = new HashSet<>(); //객체를 비교하기 위해 hashcode 사용
		
		Member m1 = new Member("홍길동",20); //기본생성자가 없으니 미리 값을 넣어줘야함
		
		//set은 출력되는 순서가 아무렇게 나옴. 내가 넣은 순서가 아님
		set.add(m1);
		
		set.add(new Member("아무개",25));
		set.add(new Member("강아지",3));
		set.add(new Member("고양이",2));
		
//		set.remove(m1);
//		System.out.println(set);
		
		
		System.out.println(set.add(m1)); //똑같은 게 들어갔다고 생각해 거부 당함
		
		//상태값은 같아도 다른 사람으로 취급 = 인스턴스 입장에서 다른 사람 = new로 만든 게 다름  = 객체의 주소값이 다름
		set.add(new Member("홍길동",20)); 
		
		//동일 인물로 처리하고 싶음!
		set.add(new Member("홍길동",20)); 
		
		System.out.println(set);
		System.out.println();
		
		Member m2 = new Member("유재석", 50);
		Member m3 = new Member("유재석", 50);
		
		//주소값 비교 
		System.out.println(m2==m3); //false - 건들릴 수 없음 > 사용 x
		System.out.println(m2.equals(m3)); //false > 사용 o
		System.out.println(m2.hashCode()); //메모리 주소
		System.out.println(m3.hashCode()); //메모리 주소
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		
		//마트 경품 추천
		//- 중복 당첨 허용o
		//- 중복 당첨 허용x
		
		String[] list = {"홍길동","아무개","강아지","고양이","병아리","호랑이","독수리","부엉이","까치","햄스터"};
		
		//List vs Set
		
		Random rnd = new Random();
		
		//당첨 명단
		ArrayList<String> result1 = new ArrayList<>();
		
		//중복 당첨 허용 o
		
		for(int i=0; i<5; i++) {
			result1.add(list[rnd.nextInt(list.length-1)]);
		}
		System.out.println(result1);
		
		
		//당첨 명단
		HashSet<String> result2 = new HashSet<>();

		// 중복 당첨 허용 x
		
		while(result2.size() <5) {
			result2.add(list[rnd.nextInt(list.length - 1)]);
		}
		System.out.println(result2);
	}

	private static void m2() {

		//로또 번호 > 난수 + 유일 숫자들로만(중복 안됨)
		
		//Case 1.
		Random rnd = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<>();
		
		//for(;lotto.size()<6;) 
		while(lotto.size()<6){ //while 문을 쓰는게 나음
			
			int n = rnd.nextInt(45)+1;
			
			//기존 요소들과 중복 검사
			if(check(lotto,n)) {
				//중복o => 버린 숫자만큼 한번 더 돌아야함
				//i--; 
			}else {
				//중복x
				lotto.add(n);
				
			}
			
			
		}
		
		System.out.println(lotto); //중복값 발생
		Collections.sort(lotto);
		System.out.println(lotto); 
		System.out.println();
		
		
		
		
		//Case 2.
		//중복값 배제를 할 필요가 없음 
		HashSet<Integer> lotto2 = new HashSet<>();
		
		while(lotto2.size() < 6) { //size = 0~5
			int n = rnd.nextInt(45)+1;
			lotto2.add(n);
		}
		System.out.println(lotto2); //결과: [5, 6, 38, 7, 41, 25]
		
		//Collections.sort(lotto2); //에러 => 순서가 없는데 정렬을 어떻게 하나요!! 못함!! 
		
		//그래도 정렬을 하고 싶으면
		//Set > (변환) > List
		
		ArrayList<Integer> lotto3 = new ArrayList<Integer>(lotto2); //생성자에 set(lotto2)을 넣을 수 있음 ! 
		//array와 set은 형제라 쌍뱡향으로 생성자에 사용가능! set을 만들때 array를 쓰면 중복 제거로 만들어 줌
		
		Collections.sort(lotto3);
		System.out.println(lotto3);
		
		//결과 : [5, 6, 7, 25, 38, 41]
	}

	private static boolean check(ArrayList<Integer> lotto, int n) {
		
		for(int i=0; i<lotto.size(); i++) {
			if(lotto.get(i)==n) {
				return true;
			}
		}
		
		return false;
	}

	private static void m1() {
		
		HashSet<String>set = new HashSet<>();
		
		//1. 요소 추가
		set.add("사과");
		System.out.println(set.add("딸기"));
		set.add("바나나");
		System.out.println(set.add("딸기")); //중복을 허용하지 않아 무시됨 = boolean 
		
		//2. 요소 개수
		System.out.println(set.size());
		System.out.println(set);
		System.out.println();
		
		//3. 요소 읽기 > 방을 구분 불가능 > 원하는 요소 추출 불가능;
		//- 읽기 도구 제공(중요*******) > iter == 향상된 for문
		
		Iterator<String> iter = set.iterator();
		
		System.out.println(iter.hasNext()); //true/false로 보여줌
		System.out.println(iter.next());//요소를 보여줌
		
		System.out.println(iter.hasNext()); //true/false로 보여줌
		System.out.println(iter.next());//요소를 보여줌
		
		System.out.println(iter.hasNext()); //true/false로 보여줌
		System.out.println(iter.next());//요소를 보여줌
		
		System.out.println(iter.hasNext()); //true/false로 보여줌
		System.out.println(iter.next());//요소를 보여줌
		
		while(iter.hasNext()) { //다음번에 데이터가 있는지 확인
			System.out.println(iter.next());
		}
		
		//루프 종료 == iterator 모두 소비 (끝까지 탐색)
		//System.out.println(iter.next()); //에러뜸 (소비가 다 끝나면 더이상 사용 못함)
		
		//더 읽고 싶다면?
		//새로운 반복기 생성
		iter = set.iterator();
		System.out.println(iter.next()); //사과 출력
		
		//몇번이고 재호출이 가능
		for(String item : set) {
			System.out.println(item);
		}
	}
}
