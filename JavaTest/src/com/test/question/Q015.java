package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q015 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("맑은 날: ");
		String input1 = reader.readLine();
		int sunnnyGrow = Integer.parseInt(input1);
		
		System.out.print("흐린 날: ");
		String input2 = reader.readLine();
		int foggyGrow = Integer.parseInt(input2);
		
		int result = 0;
		
		result = getApple(sunnnyGrow,foggyGrow);
		
		System.out.printf("사과가 총 %d개 열렸습니다.",result);
		
	} //main
	
	public static int getApple(int sunny, int foggy) {
		
		int result = 0 ;
		
		int total = sunny * 5 + foggy * 2;
		
		result = total >= 100 ? (total-100)/10 : 0 ;   
		
		return result;
		
	}

}
