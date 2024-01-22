package com.test.java.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Member;
import com.test.util.MyUtil;

public class Ex68_Stream {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 
		 자바 스트림
		 1. 입출력 스트림
		 	- 파일 입출력, 콘솔 입출력, 네트워크 입출력 등...
		 	
		 2. 스트림
		 	- Java 8(1.8) + 람다식과 같이 출시
		 	- 배열(컬렉션)의 탐색(조작) 기술 => 확실하게 자리 잡은 곳 (****)
		 	- 파일 입출력 지원
		 	- 디렉토리 탐색 지원
		 	- 기타 등등.. 여러곳에서 시도 중..
		 	- 익명 객체 (적극적으로) 사용 > 람다식 사용 + 함수형 인터페이스
		 
		 표준 API 함수형 인터페이스
		 1. Consumer
		 	- (매개변수) - > {}
		 	
		 2. Supplier
		 	 - () -> { return 값;}
		 
		 3. Function
		 	 -(매개변수) - > { return 값;}
		 	 
		 4. Operator
		 	 -(매개변수) - > { return 값;}
		 	 -매개변수와 반환값이 동일한 타입
		 	 
		 3. Function
		 	 -(매개변수) - > { return 값;}
		 	 - 반환값이 boolean
		 	 
		 	 
		 
		 */
		/*
		 
		 스트림, Stream
		 - 데이터 소스로부터 생성
		 - 사용 : list.stream().forEach()
		 
		 파이프, Pipe
		 - 스트림 객체 메서드
		 1. 중간 파이프
		 
		 2. 최종 파이프
		 
		 최종처리
		 - forEach()
		 - 최종 파이프
		 - 앞의 스트림으로부터 요소를 받아 최종 처리하는 메서드
		 
		 필터링
		 - filter()
		 - 중간 파이프
		 - 앞의 스트림으로부터 요소를 받아 조건에 맞는 요소만 남기고 맞지 않는 요소는 버림
		 
		 
		 중복제거
		 - distinct()
		 - 중간 파이프
		 - 앞의 스트림에서 중복 요소를 제거한다.
		 - 유일한 요소만 남아있는 스트림을 반환.
		 - Set 성질
		 
		 변환
		 - map(), mapXXX()
		 - 중간 파이프
		 - 앞의 스트림의 요소를 다른 형태로 변환 후 새로운 스트림을 반환한다.
		 
		 정렬
		 - sorted()
		 - 중간 파이프
		 - 사용법이 배열, 컬렉션의 sort() 메서드와 동일 > Comparator
		 
		 매칭
		 - allMatch(), anyMatch(), noneMatch()
		 - 최종 파이프
		 - boolean allMatch(Predicate) : 모든 요소가 조건을 만족하는지?
		 - boolean anyMatch(Predicate) : 일부 요소가 조건을 만족하는지?
		 - boolean noneMatch(Predicate): 모든 요소가 조건을 불만족하는지?
		 
		 
		 
		 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		m9();
	}

	private static void m9() {
		
		int[] nums = {2,4,6,8,10};
		
		//요구사항] 배열안에 짝수만 있는지?
		boolean result = false;
		
		for(int n : nums) {
			if(n%2 ==1) {
				result = true;
				break;
			}
		}
		
		if(!result) {
			System.out.println("짝수만 존재");
		}else {
			System.out.println("홀수가 발견");
		}
		
		result = Arrays.stream(nums).allMatch(n -> n % 2 == 0 );
		System.out.println(result);
		
		result = Data.getUserList()
					.stream()
					.filter(user -> user.getHeight() >=178)
					.allMatch(user -> user.getGender() ==1);
		System.out.println(result); //결과: true
		
		
		//nums> 홀수가 존재하는지?
		result= Arrays.stream(nums).anyMatch(n -> n%2 ==1);
		System.out.println(result);
		
		result = Data.getUserList().stream()
									.filter(user -> user.getHeight() >= 175)
									.anyMatch(user -> user.getGender() ==2);
		System.out.println(result);
		
		
		nums = new int[] {1,3,5,7,9};
		
		//모두가 짝수니?
		result = Arrays.stream(nums).allMatch(n->n%2==0);
		System.out.println(result);
		
		//짝수가 없니?
		result = Arrays.stream(nums).noneMatch(n->n%2==0);
		System.out.println(result);
		
		
		
	}

	private static void m8() {
		
		//오름차순 정리
		Data.getIntList(10).stream()
							.sorted()
							.forEach(n -> System.out.println(n));
		System.out.println();
		
		//내림차순 정리
		Data.getIntList(10).stream()
							.sorted((a,b) -> b-a)
							.forEach(n -> System.out.println(n));
		System.out.println();
		
		Data.getIntList(10).stream()
							//.sorted(Comparator.naturalOrder())//오름차순
							.sorted(Comparator.reverseOrder()) //내림차순
							.forEach(n -> System.out.println(n));
		System.out.println();
		
		Data.getIntList().stream()
							.distinct()
							.filter(n -> n %2 ==0)
							.sorted()
							.forEach(n -> System.out.println(n));
		
	}

	private static void m7() {
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		list.stream()
				.map(word -> word.length()>=5 ? "긴단어" : "짧은 단어")
				.forEach(word -> System.out.println(word));
		//결과 : 6 2 3 2 5 2 2 3 2 ..
		System.out.println();
		
		Data.getUserList().stream()
						  //.map(user -> user.getName())
						  //.map(user -> user.getAge())
						  .map(user -> user.getGender() == 1 ? "남자": "여자")
						  .forEach(temp -> System.out.println(temp));
		System.out.println();
		
		//names > Member(name,age) 객체 변환
		String[] names = {"홍길동", "아무개", "이순신", "하하하", "호호호"};
		
		Arrays.stream(names)
			  .map(name -> new Member(name,20)) //Stream<Member>을 만들어냄
			  .forEach(m -> System.out.println(m));
		System.out.println();
		
		
		//User > 변환 > Member
		Data.getUserList().stream()
							.map(user -> new Member(user.getName(),user.getAge()))
							.forEach(m -> System.out.println(m));
		System.out.println();
	}

	private static void m6() {
		
		List<Integer> list = Data.getIntList();
		System.out.println(list.size()); //100
		
		//위의 집합에서 중복값을 제거하시오. > Set 먼저 무조건 생각하기
		//Case 1.
		
		HashSet<Integer> set = new HashSet<Integer>();
		for( int n : list) {
			set.add(n); // set 성질로 중복값 추가 방지!!
		}
		
		System.out.println(set.size()); //61
		
		//Case 2.
		Set<Integer> set2 = new HashSet<Integer>(list);
		System.out.println(set2.size());
		
		//Case 3.
		System.out.println(list.stream().count()); //최종 파이프, 반환값 long 타입/결과 : 100
		System.out.println(list.stream().distinct().count()); //결과 : 61
		
		Data.getStringList().stream()
							.filter(word -> word.length() >=5)
							.distinct()
							.forEach(word -> System.out.println(word));
		System.out.println();
		System.out.println();
		
	}

	private static void m5() {
		
		Data.getStringList().stream()
							.filter(word -> word.length() >=5)
							.filter(word -> word.startsWith("애"))
							.forEach(word -> System.out.println(word));
		System.out.println();
		
		
		Data.getUserList().stream()
							.filter(user -> user.getGender() == 1)
							.filter(user -> user.getHeight() >=180)
							.filter(user -> user.getWeight() >=80)
							.forEach(user -> System.out.println(user));
		System.out.println();
		
		
		ArrayList<Member> mlist = new ArrayList<>();
		mlist.add(new Member("홍길동",20));
		mlist.add(new Member("아무개",25));
		mlist.add(new Member("강아지",5));
		mlist.add(new Member("고양이",3));
		mlist.add(new Member("홍갈동",20)); //주소값이 달라서
		
		System.out.println(mlist);
		System.out.println();
		
		mlist.stream()
				.distinct()	
				.forEach(m -> System.out.println(m));
		
	}

	private static void m4() {
		
		List<Integer> list = Data.getIntList();
		System.out.println(list);
		
		//요구사항] 짝수만 출력
		//1. for
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2 ==0) {
				System.out.printf("%4d", list.get(i));
			}
		}
		
		//2. 향상된 for문
		for( int n : list) {
			if(n%2 ==0) {
				System.out.printf("%4d",n);
			}
		}
		System.out.println();
		
		
		//3. stream
		list.stream().forEach(n -> {
			if (n%2 ==0) {
				System.out.printf("%4d",n);
			}
		});
		System.out.println();
		
		//filter에는 true만 남기고 다 버리기 때문에 짝수만 있는 stream을 반환함! 그 다음 파이프를 연결시킴 ! => 그래서 중간 파이프
		list.stream().filter(n -> {
			if(n % 2 ==0) {
				return true;
			}else {
				return false;
			}
		}).forEach(n -> System.out.printf("%4d",n));
		System.out.println();
		
		list.stream()
		.filter(n -> n%2 ==0)
		.forEach(n ->System.out.printf("%4d", n));
		System.out.println();
		
		list.stream()
		.filter(n -> n%2 ==0 && n>= 50)
		.forEach(n ->System.out.printf("%4d", n));
		System.out.println();

		//하나의 필터에 하나의 조건만 넣은 것이 좋음!
		list.stream()
		.filter(n -> n%2 ==0)
		.filter(n -> n >= 50)
		.forEach(n ->System.out.printf("%4d", n));
		System.out.println();
		
	}

	private static void m3() throws IOException {
		
		//스트림을 얻어오는 방법
		//- stream()메서드를 사용한다.
		//1. 배열로부터(****)
		//2. 컬렉션으로부터(******)
		//3. 숫자 범위
		//4. 파일로부터
		//5. 디렉토리부터
		
		//1. 배열로부터
		int[] nums1 = {10,20,30,40,50};
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		
		//2. 컬렉션으로부터
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		LinkedList<Integer>nums3 = new LinkedList<>();
		nums3.add(200);
		nums3.add(100);
		nums3.add(300);
		nums3.stream().forEach(num -> System.out.println(num));
		
		HashSet<Integer>nums4 = new HashSet<>();
		nums4.add(100);
		nums4.add(200);
		nums4.add(300);
		nums4.stream().forEach(num -> System.out.println(num));
		
		//3.
		//Stream<Integer>
		IntStream.range(1, 10).forEach(num->System.out.println(num));
		System.out.println();
		
		
		try {
			
			//4. 파일 > 읽기 작업만 가능
			Path path = Paths.get("dat\\score.txt");
			Files.lines(path).forEach(str ->System.out.println(str));;
			
			
		} catch (Exception e) {
			System.out.println("Ex68_Stream.m3");
			e.printStackTrace();
		}
		
		//5. 디렉토리 > dir.listFiles()
		Path dir = Paths.get("C:\\class\\dev\\eclipse");
		Files.list(dir).forEach(p -> {
			System.out.println(p.getFileName());
		});
	}

	private static void m2() {
		
		//배열(컬렉션) 탐색
		List<String>list = Data.getStringList(10);
		
		System.out.println(list);
		System.out.println();
		System.out.println();
		
		//1. for문(While문)
		for(int i=0;i<list.size();i++) {
			System.out.printf("%s\t",list.get(i));
		}
		System.out.println();
		System.out.println();
		
		//2. 향상된 for문 == foreach문
		for(String word : list) {
			System.out.printf("%s\t",word);
		}
		System.out.println();
		System.out.println();
		
		
		//3. iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.printf("%s\t",iter.next());
		}
		System.out.println();
		System.out.println();
		
		//4. stream
		
		//4.1 list.stream() > ArrayList로부터 스트림 객체를 생성해라
		//4.2 stream 객체 > ArrayList를 참조
		//4.3 forEach 실행
		//	- stream을 통해서 ArrayList 요소를 접근(하나씩 + 순서대로)
		Stream<String> stream = list.stream();
		
		stream.forEach(word -> System.out.println(word));
		
		List<Integer> nums = Data.getIntList(10);
		
		System.out.println(nums);
		
		Stream<Integer> stream2 = nums.stream();
		
		stream2.forEach(num -> System.out.println(num));
		stream2.close();
		
		//한번 다 돌고 나면 더이상 안됨 = iterator와 비슷
		//stream has already been operated upon or closed
		//stream2.forEach(num -> System.out.println(num));
		
		
		//배열.stream().메서드().메서드().메서드().메서드().메서드() == 메서드 체인
		nums.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println();
			});
	}

	private static void m1() {
		
		int[] nums1 = Data.getIntArray();
		//System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = Data.getIntArray(10);
		//System.out.println(Arrays.toString(nums2));
		
		//ArrayList 만들어 놓은거 가져다 쓰는 것
		List<Integer> nums3 = Data.getIntList();
		//System.out.println(nums3);
		
		List<Integer> nums4 = Data.getIntList(10);
		System.out.println(nums4);
		
		String[] txt1 = Data.getStringArray(5);
		System.out.println(Arrays.toString(txt1));
		
		User[] ulist = Data.getUserArray();
		System.out.println(Arrays.toString(ulist));
		
		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));
		
		MyUtil util = new MyUtil();
		
		System.out.println(util.sum(100, 200));
	}

}
