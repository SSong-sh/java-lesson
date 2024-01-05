package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_if {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 
		 제어문
		 - 수많은 명령어들의 집합 > 명령어들이 실행되는 순서 > 위 -> 아래
		 - 제어의 흐름을 통제하는 도구
		 - 조건 제어, 반복 제어, 분기 제어
		 
		 
		 1. 조건문
		 	- 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
		 	a. if
		 	b. switch
		 	
		 2. 반목문
		 	- 특정 코드를 원하는 횟수만큼 반복 제어
		 	a. for
		 	b. do while
		 	c. do while
		 	d. for
		 	
		 3. 분기문
		 	- 코드의 흐름을 원하는 곳으로 이동
		 	a.break
		 	b.continue
		 	c.goto(JDK 1.5 폐기 - 없음)
		 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
	}//main

	private static void m5() throws NumberFormatException, IOException {
		//성적(0~100) 입력 > 합격/불합격 
		//+ 유효성 검사
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("성적: ");
		
		int score = Integer.parseInt(reader.readLine());
		
		//1. 합격일때
		//2. 불합격일때
		
		//로직이 다르기 떄문에 1,2번과 3번은 분리 해줘야 함
		//3. 잘못 읿력(유효성)
		
		if(score >= 60 && score <=100) {
			System.out.println("합격");
		}else if (score >=0 && score < 60) {
			System.out.println("불합격");
		}else {
			System.out.println("점수는 0~100 이내로 입력하세요");
		}
		
		
		//조건을 의도에 맞게 잘 분리 해줘야 함
		// 중첩 if문 
		if(score >= 0 && score <= 100) {
			
			if (score >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			
		} else {
			System.out.println("점수는 0~100 이내로 입력하세요");
		}
		
	}

	private static void m4() throws NumberFormatException, IOException {
		//심리 테스트
		
		int sum = 0 ; //누적 변수 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1. 어떤 개발툴을 선호합니까? ");
		System.out.println("a. 메모장"); // +1
		System.out.println("b. 이클립스"); // +3
		System.out.println("c. 인텔리제이");// +5
		
		System.out.print("선택: ");
		
		String seq = reader.readLine();
		
		if(seq.equals("a")) {
			sum = 1;
		} else if(seq.equals("b")) {
			sum = 3;
		} else if(seq.equals("b")) {
			sum = 5;
		}
		
		System.out.println();
		
		System.out.println("2. 어떤 프로그래밍 언어을 선호합니까? ");
		System.out.println("a. Java"); // +7
		System.out.println("b. C#"); // +3
		System.out.println("c. Kotlin");// +2
		
		System.out.print("선택: ");
		
		seq = reader.readLine();
		
		if(seq.equals("a")) {
			sum += 7;
		} else if(seq.equals("b")) {
			sum += 3;
		} else if(seq.equals("b")) {
			sum += 2;
		}
		
		System.out.println();
		
		System.out.println("3. 하루에 얼마나 코딩을 합니까?");
		System.out.println("a. 4시간"); // +7
		System.out.println("b. 2시간"); // +3
		System.out.println("c. 1시간");// +2
		
		System.out.print("선택: ");
		
		seq = reader.readLine();
		
		if(seq.equals("a")) {
			sum += 7;
		} else if(seq.equals("b")) {
			sum += 3;
		} else if(seq.equals("b")) {
			sum += 2;
		}
		
		
		System.out.println("설문이 완료되었습니다.");
		
		System.out.print("[결과]");
		
		if (sum > 10) {
			System.out.println("당신은 개발자의 자질이 있습니다.");
		} else if (sum >6) {
			System.out.println("개발자가 되려면 조금 더 노력하세요.");
		} else {
			System.out.println("다른거 하세요~");
		}
		
	}

	private static void m3() throws NumberFormatException, IOException {
		//출근 > 기상?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("기상 시간(시): ");
		
		int hour = Integer.parseInt(reader.readLine());
		
		if (hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour >= 6 && hour <= 7) {
			System.out.println("버스를 타고 출근한다");
		} else if (hour >= 7 && hour <= 8) {
			System.out.println("택시를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다.");
		}
		
		//순서대로 질문하기 떄문에 조건을 단순하게 만들 수 있음 
		if (hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour < 7) {
			System.out.println("버스를 타고 출근한다");
		} else if (hour < 8) {
			System.out.println("택시를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다.");
		}
		
	}

	private static void m2() throws NumberFormatException, IOException {
		//나이 입력 > 판단
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이: ");
		
		int age = Integer.parseInt(reader.readLine());
		
		//삼항연산자 버전 String result = (age >= 18) ? "성인" : "미성년자";
		
		if (age <= 18) {
			System.out.println("미성년자 입니다.");
		} else {
			System.out.println("성인입니다.");
		}
		
	}

	private static void m1() {
		/*
		  
		  if문
		  - 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
		  -조건식 > boolean 값을 가지는 표현식
		  
		  if(조건식) {
		  	문장;
		  	
		  }
		  
		  --------------------------------------------------------------
		  
		  if(조건식) {
		  	문장;
		  	
		  } else {
		  	문장;
		  }
		  
		  
		  ------------------------------------------------------------------
		  다중 조건문 => else if는 원하는 만큼 
		  
		  if(조건식) {
		  	문장;
		  	
		  } else if (조건식){
		  	문장;
		  }
		  
		  ---------------------------------------------------------------------
		  if(조건식) {
		  	문장;
		  	
		  } 
		  [else if (조건식){
		  	문장;
		  }] x N
		  [else {
		  	문장;
		  }]
		  
		  
		 */
		
		
		int num = 0;
		if (num > 0) { //참일 때 실행
			System.out.println("num은 양수입니다."); //false 일때는 실행이 안됨
		}
		
		
		if (num > 0) {//참일 때 실행
			System.out.println("num은 양수입니다."); //false 일때는 실행이 안됨
		} else { //거짓일 떄 실행
			System.out.println("nume은 음수입니다.");
		}
		
		if (num > 0) {//참일 때 실행
			System.out.println("num은 양수입니다."); //false 일때는 실행이 안됨
		} else if (num < 0 ) { //거짓일 떄 실행
			System.out.println("nume은 음수입니다.");
		} else  {
			 System.out.println("num은 0입니다.");
		}
		
		System.out.println("종료");
	
		
	}//m1
	
	
	

}


