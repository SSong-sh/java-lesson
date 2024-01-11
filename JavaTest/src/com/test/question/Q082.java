package com.test.question;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Q082 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		
		String num = scan.nextLine();
		
		String num2 = "314";
		System.out.println(num2.substring(0,1));
				
		
		for(int i=0;i<num.length();i++) { 
			 sum += Integer.parseInt(num.substring(i,i+1)); //두번째는 포함되지 않음 => i만 출력됨
			 result += num.substring(i,i+1);
			 
			 if(i < num.length()-1) { 
				 result += " + ";
			 }
		}
		
		System.out.printf("결과: %s = %d\n" ,result,sum );
		
		
		
		
	}

}
