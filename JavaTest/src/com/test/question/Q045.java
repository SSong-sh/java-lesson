package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.test.java.Ex10_Casting;

//1의 자리 : 3 6 9 
//10의 자리 : 13 16 19 23 26 29 30 31 33 36 
//100의 자리 : 103 106 109

public class Q045 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("최대 숫자: ");
		int maxNumber = Integer.parseInt(reader.readLine());
		
		
		if (maxNumber < 1000) {
			
			for (int i=1; i<= maxNumber; i++) { 
				
				System.out.print(check369(i) + " ");
				
			}
		} else {
			System.out.println("1000 아래 숫자를 입력해주세요.");
		}
		
		
	} //main
	
	public static String check369(int i) {
		
		String clap = "";
		int num = i;
		
		for(; num>0;) {
			if(num % 10 %3 == 0 && num % 10 !=0) {
				clap += "짝";
			}
			
			num /= 10;
		
		}
		
		if(clap.equals("")) {
			
			return i + "";
			
		} else {
			
			return clap;
		}
	}
	
	
} 
