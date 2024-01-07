package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q013 {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어: ");
		String input1 = reader.readLine();
		int kor = Integer.parseInt(input1);
		
		System.out.print("영어: ");
		String input2 = reader.readLine();
		int eng = Integer.parseInt(input2);
		
		System.out.print("수학: ");
		String input3 = reader.readLine();
		int math = Integer.parseInt(input3);
		
		
		String result = "";
		result = test(kor,eng,math);
		
		System.out.printf(result + "입니다.");
		
	} //main
	
	public static String test(int kor, int eng, int math) {
		
		String result = "";
		int avg = (kor + eng + math)/3; 
		result = (avg >= 60) ? "합격" : "불합격" ;
		result = (kor < 40 || eng < 40 || math < 40) ? "불합격" : result;
		
		return result;
		
	}

}
