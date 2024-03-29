package com.test.java;

public class Ex09_Error {
	public static void main(String[] args) {
		
		int a = 0; //사용자 입력
		
		System.out.println(100/a); //사용자가 0을 입력하면 에러가 뜸 (잠재적 에러)
		
		//처음부터 문법이 틀린 오류 = 컴파일 오류
		//실행 중에 오류가 나는 경우 = 런타임 오류
		
		/*
		 
		 에러, Error,
		 - 오류, 버그(Bug), 예외(Exception) 등..
		 
		 1. 컴파일 에러
		 	- 컴파일 작업 중에 발생하는 에러
		 	- 컴파일러 발견!! > 번역하다가.. > 문법이 틀려서!!
		 	- 발생!! > 컴파일 작업 중단 > 프로그램 생성 불가 > 반드시 해결(100%)!!
		 	- 난이도가 가장 낮음 > 컴파일러가 알려줌!! > 에러 메세지 
		 	- 대부분 오타!!
		 	- 빨간 밑줄 모두 컴파일 에러
		 
		 2. 런타임 에러
		 	- 런타임(Runtime) > 실행 중
		 	- 컴파일 작업 중에는 없었는데.. 실행 중에 발생하는 에러 
		 	- 문법에는 오류가 없었는데.. 다른 원인으로 발생하는 에러
		 	- 예외(Exception)
		 	- 난이도 중간 > 발견	O,X(복불복)
		 	
		 
		 3. 논리 에러
		 - 컴파일 성공!! + 실행 성공!! > 결과가 이상..
		 - 에러 메세지가 없기 때문에 안 내는 것이 최선
		 - 난이도 극악!! 
		 
		 */
	}
}
