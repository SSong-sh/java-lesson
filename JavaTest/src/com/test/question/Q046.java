package com.test.question;

import java.io.InterruptedIOException;
import java.util.Scanner;

public class Q046 {
	
	public static void main(String[] args) {
		
		
		int num = 0;
		String txt ="";
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i =0; i<10;i++) {
			
			System.out.print("숫자: ");
			
			num = scan.nextInt();
			txt += getKorean(num);
			
			
		}
		
		System.out.println(txt);
		
		
		
	} //main
	
	public static String getKorean(int num) {
		
		if(num ==1) {
			return "일";
		}else if (num==2) {
			return "이";
		}else if (num==3) {
			return "삼";
		}else if (num==4) {
			return "사";
		}else if (num==5) {
			return "오";
		}else if (num==6) {
			return "육";
		}else if (num==7) {
			return "칠";
		}else if (num==8) {
			return "팔";
		}else if (num==9) {
			return "구";
		}else if (num==10) {
			return "십";
		}
		return "";
	}

}
