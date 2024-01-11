package com.test.question;

import java.util.Scanner;

public class Q085 {
	
	/*
	<주민등록번호 유효성 검사>
	
	주민등록번호의 앞 12자리와 가중치 곱하기:

	주민등록번호의 앞 12자리를 각각 가중치와 곱한 값을 모두 더합니다.
	더한 결과의 일의 자리 숫자 확인:
	
	더한 결과에서 일의 자리 숫자를 확인합니다.
	11에서 일의 자리 숫자를 뺀 나머지 확인:
	
	11에서 앞에서 구한 일의 자리 숫자를 뺀 나머지를 구합니다.
	나머지와 주민등록번호 마지막 자리 비교:
	
	가중치 : 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5
	 
	 
	 */
	
	public static void main(String[] args) {
		
		String jumin = "";
		
		int sum = 0; //가중치 더할 변수
		
		int digit = 0;
		
		int[] num  = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호:");
		
		jumin = scan.nextLine();
		
		jumin = jumin.replace("-", "");
		
		for(int i=0; i<12; i++) {
			
			digit = Integer.parseInt(jumin.substring(i,i+1));
			sum += digit*num[i];
			
		}
		
		//11에서 일의 자리 숫자를 뺀 나머지 확인:
		sum = 11 -(sum%10); 
		
		
		//나머지와 주민등록번호 마지막 자리 비교:
		if (sum == Integer.parseInt(jumin.substring(jumin.length()-1, jumin.length()))) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
		
		
	
		
	}

}
