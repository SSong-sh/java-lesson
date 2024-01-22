package com.test.java.collection;

import java.util.TreeMap;

public class Ex64_TreeMap {
	
	public static void main(String[] args) {
		
		/*
		 
		 
		 TreeMap
		 - 이진 탐색 트리 > 내부 정렬
		 - 키 + 값 
		 
		 
		 */
		
		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("white", "흰색");
		map.put("black", "검정색");
		map.put("red", "빨강색");
		map.put("blue", "파란색");
		map.put("yellow", "노랑색");
		
		//Key 자동 정렬
		System.out.println(map); //키를 정렬해서 알파벳 순으로 나옴
		
		//map 기능과 똑같음
		System.out.println(map.get("white"));
		
		//Tree구조 기능
		System.out.println(map.firstKey()); //black
		System.out.println(map.lastKey()); //yellow
		
		//요소 자체를 가져옴(key + value)
		System.out.println(map.firstEntry()); //black = 검정색
		System.out.println(map.lastEntry()); //yellow = 노랑색
		
		System.out.println(map.headMap("m")); //알파벳 m과 비교 결과 : {black=검정색, blue=파란색}
		System.out.println(map.tailMap("m")); //{red=빨강색, white=흰색, yellow=노랑색}
		System.out.println(map.subMap("r","w"));//{red=빨강색}
	}

}
