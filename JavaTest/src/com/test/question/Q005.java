package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q005 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사용자가 페달을 밟은 횟수: ");
		String input1 = reader.readLine();
		
		int turn = Integer.parseInt(input1);

		double circumference = 26 * 3.14 * 0.0254;
		
		double distance = turn * circumference;
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.",turn,distance);
		
		
	
		
	}

}
