package com.test.java;

import javax.imageio.event.IIOReadWarningListener;

public class Ex06_Output {
	
	public static void main(String[] args) {
		
		/*
		 
		 콘솔 입출력, Console Input Output > IO
		 - 기본 입력 장치 : 키보드
		 - 기본 출력 장치 : 모니터 
		 
		 콘솔 출력 
		 - 클래스.필드.메서드(인자,파라메타);
		 
		 1. System.out.println(값);
		 	- println 메서드
		 	- print line > 값을 행단 위로 출력한다. 
		 				 > 값을 출력한 뒤 엔터를 친다.
		 				 
		 2. System.out.print(값);
		 	- print 메서드
		 	- 값을 출력하고 엔터를 친다.
		 	
		 	
		 3. System.out.printf(값);
		 	- print 메서드
		 	- print format > 출력 형식을 제공한다. => 엄청 편함. 의존도가 높음
		 
		 */
		
		// 성적표 출력하기
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;
		
		String name2 = "아무개";
		int kor2 = 95;
		int eng2 = 89;
		int math2 = 87;
		
		System.out.println("===============================");
		System.out.println("           성적표");
		System.out.println("===============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.println("-------------------------------");
		
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 +  "\t");
		System.out.print(eng1 +  "\t");
		System.out.print(math1 +  "\r\n");
		
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//printf()
		// - 형식 문자(PlaceHolder)제공
		// - 가독성 행상 (***)
		
		//1. %s > String
		//2. %d > Decimal(정수) > byte.short, int, long
		//3. %f > Float(실수) > float, double
		//4. %c > Char
		//5. %b > Boolean
		
		
		
		// [요구사항] "안녕하세요. 홍길동님" 문장을 출력하시오.
		String name = "홍길동"; // 사용자가 키보드로 입력한 이름 
		
		System.out.println("안녕하세요. "+ name +"님");
		
		System.out.printf("안녕하세요. %s님\r\n",name);
		
		//[요구사항] "안녕하세요. 홍길동님. 안녕하세요. 홍길동님"
		System.out.println("안녕하세요. " + name + "님." + " 안녕하세요. " + name + "님.");
		System.out.printf("안녕하세요. %s님. 안녕하세요. %s님" , name,name);
		
		System.out.println();
		
		System.out.printf("문자열 : %s\n" , "문자열");
		System.out.printf("정수 : %d\n", 100);
		System.out.printf("실수 : %f\n", 3.14);
		System.out.printf("문자 : %c\n",'A');
		System.out.printf("논리 : %b\n", true);
		System.out.println();
		
		
		// 형식문자 확장기능
		//1. %숫자d, %숫자s, %숫자f, %숫자c, %숫자b
		//- 출력할 내용의 너비를 지정한다.
		//- 탭 문자처럼 열을 맞추기 위한 기능
		// (+) : 우측 정렬
		// (-) : 좌측 정렬
		
		int num =123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n",num); //7칸 띄어짐 
		System.out.printf("[%-10d]\n",num);
		
		
		//2. %.숫자f
		//- 소수점 이하 자릿 수 지정
		double num2 = 3.14;
		
		System.out.println(num2);
		System.out.printf("%.2f\n",num2);
		System.out.printf("%.1f\n",num2);
		System.out.printf("%.0f\n",num2);
		System.out.printf("%.3f\n",3.4567); //반올림 되는 지 꼭 확인 후 작업하기(***)
		
		
		
		//3. %,d , %,f
		//- 자릿수 표기 (천단위 표기)
		int price =1234567;
		
		System.out.printf("금액: %d원\n", price);
		System.out.printf("금액: %,d원\n", price);
	}

}
