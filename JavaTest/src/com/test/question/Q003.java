package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("너비(cm): ");
		String input1 = reader.readLine();
		
		System.out.print("높이(cm): ");
		String input2 = reader.readLine();
		
		int width = Integer.parseInt(input1);
		int height = Integer.parseInt(input2);
		
		int area = width * height;
		int round = (width*2) + (height*2);
		
		System.out.printf("사각형의 넓이는 %dcm^2",area);
		System.out.println();
		System.out.printf("사각형의 둘레는 %dcm",round);
		
		
	}

}
