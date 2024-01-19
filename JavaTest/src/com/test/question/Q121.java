package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {
	
	public static void main(String[] args) {
		
		try {
			
		BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\파일 입출력 문제\\숫자.dat"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\파일 입출력 문제\\숫자_변환.dat"));
			
			String line = null;
			
			while((line = reader.readLine())!= null) {
				line = line.replace("0", "영")
						.replace("1", "일")
						.replace("2", "이")
						.replace("3", "삼")
						.replace("4", "사")
						.replace("5", "오")
						.replace("6", "육")
						.replace("7", "칠")
						.replace("8", "팔")
						.replace("9", "구");

				writer.write(line);
				writer.write("\r\n");
			}
			
			reader.close();
			writer.close();
			
			System.out.println("완료");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
