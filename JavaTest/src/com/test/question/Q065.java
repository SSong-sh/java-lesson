package com.test.question;

import java.util.Scanner;

public class Q065 {
	

	public static void main(String[] args) {
		


		int[] randomArray = new int[20];

		for (int i = 0; i < randomArray.length; i++) {

			int random = (int) (Math.random() * 20) + 1; // *가 범위 조정 0부터 시작이라 +1
			randomArray[i] = random;
			
		}
		
		Scanner scan = new Scanner(System.in);
		
		//최대 범위 출력
		System.out.print("최대 범위: ");
		int max = scan.nextInt();
		
		//최소 범위 출력
		System.out.print("최소 범위: ");
		int min = scan.nextInt();
		
		System.out.println();
		
		for(int i=0; i<randomArray.length;i++) {
			
			
			
		}

		
		System.out.print("원본: ");
		for(int i=0;i<randomArray.length;i++) {
			System.out.print(randomArray[i] + ",");
		}
		System.out.println();
		
		System.out.print("결과: ");
		for(int i=0;i<randomArray.length;i++) {
			if(randomArray[i]>=min && randomArray[i]<=max) {
				System.out.print(randomArray[i]+",");
			}
		}
		

	}


}
