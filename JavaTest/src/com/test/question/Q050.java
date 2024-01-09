package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q050 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		  
		  요구사항] 별찍기 
		  
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행: ");
		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			for(int k = i; k <n; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	
	}
}
