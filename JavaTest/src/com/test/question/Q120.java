package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {

	public static void main(String[] args) {
		
		try {
			
		BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\파일 입출력 문제\\이름수정.dat"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\파일 입출력 문제\\이름수정_변환.dat"));
			
			String line = null;
			
			while((line = reader.readLine())!= null) {
				line = line.replace("유재석", "메뚜기");
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
