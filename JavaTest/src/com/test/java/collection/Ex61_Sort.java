package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex61_Sort {

	public static void main(String[] args) {
		
		//Ex61_Sort.java
		
		//배열 or 컬렉션(List)
		//- 순서가 있는 데이터 집합
		//- 정렬 사용
		
		//정렬
		//- 오름차순, 내림차순
		//1. 직접 구현 > 정렬 알고리즘
		//2. JDK 제공 기능 > Arrays.sort()
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
	}//main

	private static void m5() {
		
		//User u1 = new User("홍길동", 1, 2023, 10, 1, "서울");
		//System.out.println(u1);
		
		ArrayList<User> list = new ArrayList<User>();
		
		//서울(1), 인천(2), 광주(3), 부산(4), 제주(5)
		list.add(new User("홍길동", 1, 2023, 10, 1, "서울"));
		list.add(new User("아무개", 5, 2019, 3, 5, "부산"));
		list.add(new User("강아지", 2, 2020, 2, 12, "서울"));
		list.add(new User("고양이", 3, 2020, 7, 19, "광주"));
		list.add(new User("멍멍이", 1, 2018, 11, 21, "제주"));
		list.add(new User("망아지", 2, 2018, 12, 31, "부산"));
		list.add(new User("병아리", 5, 2022, 9, 11, "제주"));
		list.add(new User("송아지", 3, 2021, 1, 18, "인천"));
		list.add(new User("독수리", 5, 2020, 2, 22, "광주"));
		list.add(new User("햄스터", 4, 2019, 5, 25, "인천"));
		
		
		//Arrays.sort()
		//Collections.sort();
		
		Collections.sort(list, new Comparator<User>() {
			
			@Override
			public int compare(User o1, User o2) {
			
				//return o1.getLevel() - o2.getLevel();
				//return o1.getName().compareTo(o2.getName());
				//return o1.getRegdate().compareTo(o2.getRegdate());
				
//				if (o1.getLevel() > o2.getLevel()) {
//					return 1;
//				} else if (o1.getLevel() < o2.getLevel()) {
//					return -1;
//				} else {					
//					return o1.getName().compareTo(o2.getName());
//				}
				
				//지역순(city)
				//return o1.getCity().compareTo(o2.getCity());
				
				//서울(1), 인천(2), 광주(3), 부산(4), 제주(5)
				int city1 = -1; //첫번째 사람(User o1)의 지역
				int city2 = -1; //두번째 사람(User o2)의 지역
				
				city1 = getCityNumber(o1.getCity());
				city2 = getCityNumber(o2.getCity());
				
				return city1 - city2;
			}//comapre

			private int getCityNumber(String city) {
				
				if (city.equals("서울")) {
					return 1;
				} else if (city.equals("인천")) {
					return 2;
				} else if (city.equals("광주")) {
					return 3;
				} else if (city.equals("부산")) {
					return 4;
				} else {			
					return 5;
				}
				
			}
			
		});
		
		System.out.println(list);		
		
	}

	private static void m4() {
		
		Integer[] nums = { 5, 2, 4, 1, 3 };
		
		Arrays.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2 - o1;
			} 
		});
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m3() {
		
		//내림차순?
		String[] names = { "유재석", "홍길동", "박명수", "이순신", "강감찬" };
		
		//익명 객체
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//System.out.println(o1 + ", " + o2);
				return o2.compareTo(o1);
			}
			
		};
		
		Arrays.sort(names, c);
		
		System.out.println(Arrays.toString(names));
		
	}

	private static void m2() {
		
		//내림차순?
		String[] names = { "유재석", "홍길동", "박명수", "이순신", "강감찬" };
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		MyComparator my = new MyComparator();
		
		Arrays.sort(names, my);
		System.out.println(Arrays.toString(names));
		
	}

	private static void m1() {
		
		//정렬 대상
		//1. 숫자
		//2. 문자(열)
		//3. 날짜시간
		
		//A.1 숫자 + 배열
		int[] nums1 = { 1, 5, 3, 4, 2 };
		
		System.out.println(Arrays.toString(nums1));
		
		//오름차순 정렬
		Arrays.sort(nums1);
		
		//내림차순 정렬?		
		System.out.println(Arrays.toString(nums1));
		System.out.println();
		
		//A.2 숫자 + 컬렉션(List)
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		
		System.out.println(nums2);
		
		//오름차순
		Collections.sort(nums2);
		
		System.out.println(nums2);
		System.out.println();
		
		
		//B1. 문자열 + 배열
		String s1 = "Java";
		String s2 = "java";
		
		//System.out.println(s1 > s2);
		
		int result = compareString(s1, s2);
		System.out.println(result);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		String[] names = { "유재석", "홍길동", "박명수", "이순신", "강감찬" };
		
		Arrays.sort(names);		
		System.out.println(Arrays.toString(names));
		System.out.println();
		
		ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("유재석");
		names2.add("홍길동");
		names2.add("박명수");
		names2.add("이순신");
		names2.add("강감찬");
		
		Collections.sort(names2);
		
		System.out.println(names2);
		System.out.println();
		
		
		//C.1 날짜시간 + 배열
		
		Calendar[] clist = new Calendar[5];
		
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -5);
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 3);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -2);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 7);
		
		clist[4] = Calendar.getInstance();
		
		//System.out.println(Arrays.toString(clist));
		for (int i=0; i<clist.length; i++) {
			System.out.printf("%tF\n", clist[i]);
		}
		System.out.println();
		
		Arrays.sort(clist);
		
		for (int i=0; i<clist.length; i++) {
			System.out.printf("%tF\n", clist[i]);
		}
		System.out.println();
		
		//C.2 날짜시간 + 컬렉션
		ArrayList<Calendar> clist2 = new ArrayList<>();
		
		clist2.add(Calendar.getInstance());
		clist2.get(0).add(Calendar.DATE, -5);
		
		clist2.add(Calendar.getInstance());
		clist2.get(1).add(Calendar.DATE, 3);
		
		clist2.add(Calendar.getInstance());
		clist2.get(2).add(Calendar.DATE, -2);
		
		clist2.add(Calendar.getInstance());
		clist2.get(3).add(Calendar.DATE, 7);
		
		clist2.add(Calendar.getInstance());
		
		for (int i=0; i<clist2.size(); i++) {
			System.out.printf("%tF\n", clist2.get(i));
		}
		System.out.println();
		
		//List(I) <- ArrayList(C)
		Collections.sort(clist2);
		
		for (int i=0; i<clist2.size(); i++) {
			System.out.printf("%tF\n", clist2.get(i));
		}
		System.out.println();
				
		
	}//m1

	private static int compareString(String s1, String s2) {
		
		//문자열 우위비교
		//s1 = "홍길동"
		//s2 = "홍길동님"
		
		//int length = s1.length() > s2.length() ? s2.length() : s1.length();
		int length = Integer.min(s1.length(), s2.length());
		//System.out.println("길이: " + length);
		
		for (int i=0; i<length; i++) {
			
			char c1 = s1.charAt(i); //'홍'
			char c2 = s2.charAt(i); //'강'
			
			if (c1 > c2) {
				return 1;
			} else if (c1 < c2) {
				return -1;
			}
			
		}
		
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s2.length()) {
			return -1;
		}
		
		return 0;
	}
	
}


//T: 비교하려는 요소의 타입
class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}
















