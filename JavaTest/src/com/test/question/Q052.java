package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q052 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		  요구사항] 별로 트리 만들기
		  
		 */
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int n = Integer.parseInt(reader.readLine());

		for (int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			
			char c = 'a';
			
			for (int j=0; j<i*2/2; j++) {
				System.out.print(c);
				c++;
			}
			
			for (int j=0; j<i*2/2; j++) {
				c--;
				System.out.print(c);
				
			}
			System.out.println();
		}
	}
	
}
