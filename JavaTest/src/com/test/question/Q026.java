package com.test.question;

import java.awt.GraphicsDevice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q026 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("점수: ");
		String input1 = reader.readLine();	
		int score = Integer.parseInt(input1);
		
		String grade ="";
		
		if (score >= 0 && score <= 100) {
			
			if (score >= 90) {
				grade = "A";
			} else if(score >= 80) {
				grade = "B";
			} else if (score > 69) {
				grade = "C";
			} else if (score > 59) {
				grade = "D";
			} else {
				grade = "F";
			}
			
			System.out.printf("입력하나 %d점은 성적 %s입니다.\n", score, grade);
	
		} else {
			System.out.println("점수는 0~100점 사이 점수를 입력해주세요.");
		}
	}

}
