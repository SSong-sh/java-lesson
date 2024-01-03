package com.test.java;

public class Ex01_DataType {
	
	public static void main(String[] args) {
		/*
		 
		 - 자바의 자료형의 기준
  
		  	1. 형태
		    
		  	2. 길이
    

		- 자료형의 분류
		  
		  1. 기본형, 원시형(Primitive Type), 값형(Value Type)
		    
		    - 8가지
		      
		      (byte, short, int, long ,float, double, char, boolean)
		      
          a. 숫자형
      
		      1. 정수형
		        
		        - byte
		          
		          : 메모리 1칸 = 8비트 = 1byte
		          
		          : 2^8
		          
		          : 자바는 맨 첫 비트를 부호비트로(0은 양수, 1은 음수, 나머지 데이터 비트
		          
		          0은 양수로 , -128~127개 총 256개 조합이 가능
		          
		        - short
		          
		          : 메모리 2칸 = 16비트 = 2byte
		          
		          : 2^16
		          
		          : -32768 ~ 32676
		          
		        - int
		          
		          : 메모리 4칸 = 32비트 = 4byte
		          
		          : 2^32
		          
		          : -21억 ~ 21억
		          
		        - long
		          
		          : 메모리 8칸 =64비트 = 8byte
		          
		          : 2^64
		          
		          : -922경 ~922경
          
        
	      2. 실수형
	        
	        a. 고정소수점 방식
	        
	        : 12.345
	        
	        b. 부동소수점 방식 <- 주로 얘를 씀 (큰 데이터를 저장할 수 있음 / 가수부+비가수부로 구분하기 때문)
	        
	        : 1.23*2e-1
	        
	        : 가수부도 제한된 공간이기 때문에 그 범위를 벗어나면 뒷자리가 짤리는 단점이 있어 정확성이 떨어짐
        
		        - float
		          
		          : 4byte
		          
		          : 무한대
		          
		          : 지수 (8bit ) + 가수(23bit)
		          
		          : 정수 + 소수점 이하 6~7자리를 유효하게 표현
		          
		          : 단정도형(정도는 정밀도를 뜻함)
		          
		        - double
		          
		          : 8byte
		          
		          : 무한대
		          
		          : 지수(11bit) + 가수 (52bit)
		          
		          : 정수 + 소수점 이하 15~16자리를 유효하게 표현
		          
		          : 배정도형(정밀도가 2배 늘었다는 표현)
          
        
      
	      b. 문자형
	      
	      1. 문자형
        
	        - char
	          
	          : 2byte
	          
	          : 숫자형(정수형)
	          
	          : 0 ~ 65535까지 표현가능
	          
	          : 음수 없음 (부호 비트 없음)
	          
	          : 유니코드 unicode (한글자에 2byte를 이용해 한글도 입력가능)
          
      
	      c. 논리형
	      
	      1. 논리형
	        
	        - boolean
	          
	          : 1byte
	          
	          : 참(true), 거짓(false)을 판별
          
      
		  2. 참조형 (Reference Type)
		    
		    - 클래스(class) > 사용자가 정의 가능
		      
		    - 배열(Array)
		      
		    - 열거형(Enum)
		      
		    - 인터페이스(Interface)
		 */
	}
}