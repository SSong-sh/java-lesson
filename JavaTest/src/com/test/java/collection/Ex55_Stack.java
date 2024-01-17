package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex55_Stack {
	
	public static void main(String[] args) {
		
		/*
		 
		 ADT, Abstract Data Tye(추상적 자료형)
		 - 배열 + 사용법 용도에 맞게 구현
		 - Stack
		 - Queue
		 
		 Stack
		 - 후입선출
		 - LIFO ,Last Input First Output
		 - 저장소에 나중에 들어간 요소가 먼저 나온다.
		 ex) 메모리 구조(Stack(
		 ex) 되돌리기(Ctrl+Z), 다시하기(Ctrl+Y)
		 ex) 브라우저 > 뒤로가기, 앞으로 가기
		 
		 
		 Queue 
		 - 선입선출
		 - FIFO ,First Input First Output
		 - 저장소에 먼저 들어간 요소가 먼저 나온다.
		 ex) 모든 줄 서기 = 먼저 줄 선 사람이 먼저 들어감
		 ex) 주문 리스트
		 ex) 순서가 있는 모든 목록 
		 
		 */
		
		//m1();
		//m2();
		//m3(); = queue 과제
		m4();
	}

	private static void m4() {
		//배열 생성
		MyStack stack = new MyStack();

		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");
		System.out.println(stack);

		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);

		//개수
		System.out.println(stack.size());

		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());

//		//크기 조절
//		stack.trimToSize();

		//초기화
		stack.clear();
		System.out.println(stack.size());
		
	}

	private static void m3() {
		
		//배열 생성
		MyQueue queue = new MyQueue();
		
		//System.out.println(queue);

		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");
		
		System.out.println(queue);
		

		//읽기
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);

		//개수
		System.out.println(queue.size());

		//확인
		System.out.println(queue.peek());
//		System.out.println(queue.peek());
//		System.out.println(queue.size());

//		//크기 조절
//		queue.trimToSize();

		//초기화
		queue.clear();
		System.out.println(queue.size());
		
	}

	private static void m2() {
		
		//Queue - 인터페이스 => 객체 생성 못함 
		
		Queue<String> queue = new LinkedList<String>(); // 자식 객체
		
		//1. 요소 추가하기
		//- boolean add(T value) => 어레이리스트와 같음
		queue.add("빨강"); //enqueue();
		queue.add("노랑");
		queue.add("파랑");
		
//		//2. 요소 개수
//		System.out.println(queue.size());
//		
//		//3. 요소 읽기 (읽고 사라짐)
//		System.out.println(queue.poll()); //dequeue()
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll()); 
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll()); 
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll()); //에러 안나고 null 돌려줌 !
		
//		//요소 전체 다 보기
//		while(queue.size() >0 ) {
//			System.out.println(queue.poll());
//		}
//		
		//4. 요소 미리보기
		System.out.println(queue.peek());
		
	}

	private static void m1() {
		
		//Stack - 클래스
		Stack<String>stack = new Stack<String>();
		
		//1. 요소 추가하기
		// - T push(T value) 타입변수
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
//		//2. 요소 개수
//		//- int size()
//		System.out.println(stack.size()); // 결과 : 3
//		
//		//3. 요소 읽기(꺼내고 바로 제거) = remove
//		//- T pop()
//		System.out.println(stack.pop());
//		System.out.println(stack.size()); // 결과 : 2
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.size()); // 결과 : 1
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.size()); // 결과 : 0
//		
//		//System.out.println(stack.pop()); //에러! stack 비어있음
		
//		//stack.size가 줄어든다는 것을 생각해야함!
//		for (int i=0; i<stack.size();i++) {
//			System.out.println(stack.pop());			
//		}
//		
//		//결과 : 파랑 노랑
		
		//3. 빈배열
		System.out.println(stack.isEmpty());
		
		//4. 이번에 pop()을 하면 가져오게 될 요소 미리보기
		System.out.println(stack.peek());
		System.out.println(stack.size()); //사이즈가 줄어들지 않음
		
//		while(stack.size() >0 ) {
//			System.out.println(stack.pop());
//		}
	}

}
