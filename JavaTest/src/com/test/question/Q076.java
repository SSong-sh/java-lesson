package com.test.question;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Q076 {
	
	public static void main(String[] args) {
		
		String[][] score = new String[10][3];
		
		String mark = "■";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();
		
		
		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		
		
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		
		
		for(int i=0;i<score.length;i++) { //i=0,1,2,3,4,5,6,7,8,9
			
	
			if(kor >= (i + 1) * 10 ) { //i=0 50 >= 10 
				score[i][0] = "■";
			}else {
				score[i][0] =" ";
			}
		
			
	
			if(eng >= (i + 1) * 10) {
				score[i][1] = "■";
			}else {
				score[i][1] =" ";
			}
		
			
			
			if(math >= (i + 1) * 10) {
				score[i][2] ="■";
			}else {
				score[i][2] =" ";
			}
		}
		
		
		array(score);
		
	}//main


	private static void array(String[][] score) {
		
		
		for (int i = score.length-1; i >=0; i--) {

			for (int j = 0; j < score[0].length; j++) {

				System.out.print(" "+score[i][j] + "\t"); //90,91,92
			} // 하나의 층에 있는 배열 출력
			System.out.println();
		}
		
		System.out.println("---------------------");
		System.out.println("국어\t영어\t수학");
	}

	
}
