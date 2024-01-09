package com.test.question;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q040 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		System.out.print("시작 숫자: ");
		int startNum = Integer.parseInt(reader.readLine());
	
		int sum2=0;

		System.out.print("종료 숫자: ");
		int endNum = Integer.parseInt(reader.readLine());
		 

	      for(int i=startNum; i<=endNum; i++) {

	          if(i%2==0) {
	             System.out.print(i + " + ");
	             sum -= i;

	          } else {
	             System.out.print(i + " - ");
	             sum2 += i;

	          }

	       }
	       System.out.println("\b\b= " + (sum + sum2));
	    }



}