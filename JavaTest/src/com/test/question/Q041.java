package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q041 {
	
public static void main(String[] args) throws NumberFormatException, IOException {
		
	int sum =0;
	
	for(int i=1; ;i++) {
		System.out.print(i + " + ");
		sum += i;
		
		if(sum >=1000) {
			System.out.println("\b\b= " + sum);
			break;
		}
		
		
		
	}
}
}
