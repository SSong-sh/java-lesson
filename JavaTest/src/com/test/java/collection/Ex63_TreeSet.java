package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex63_TreeSet {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 컬렉션 이름
		 
		 [물리구조]	 [사용법 + 인터페이스]
		 Array 		+ List
		 Linked 	+ List
		 
		 Hash 		+ Set
		 Tree 		+ Set
		 
		 Hash 		+ Map
		 Tree 		+ Map
		 
		 
		 TreeSet
		 - 순서가 없고
		 - 중복값을 가지지 않는다.
		 - 이진 탐색 트리 구조, Binary Search Tree (노드를 2개 가짐)
		  : 루트와 비교해서 크면 오른쪽, 작으면 왼쪽에 자식 노드 추가
		  - 내부 데이터가 정렬이 된다. => 방번호가 없는데 정렬이 된다? => 내부데이터가 되어 있는 구조로 저장
		  
		 */
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(6);
		set.add(2);
		set.add(5);
		set.add(8);
		set.add(1);
		set.add(9);
		set.add(3);
		set.add(4);
		set.add(10);
		set.add(7);
		
		System.out.println(set);
		
		//범위 관련 기능 제공 (=List 계열이 할 수 있음)
		System.out.println(set.first());
		System.out.println(set.last());
		
		//범위 : 시작위치(포함) ~ 끝위치(미포함)
		System.out.println(set.headSet(3)); //3을 찾아서 전까지 가져오기
		System.out.println(set.tailSet(7)); //7을 찾아서 뒤에 값 가져오기
		System.out.println(set.subSet(3,7)); //끝에서 7을 찾아서 전까지 가져오기
		
		//HashSet & TreeSet > iterator, 향상된 for문
		
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(int n : set) {
			System.out.println(n);
		}
		
		//Set사용
		// - HashSet vs TreeSet > HashSet을 사용 (속도가 빠름)
	}
}
