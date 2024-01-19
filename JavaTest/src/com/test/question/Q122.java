package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q122 {
	
	public static void main(String[] args) {
		
		/*
		 요구사항
		 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		 
		 조건..
		 합격 조건: 3과목 평균 60점 이상
		 과락 조건: 1과목 40점 미만
		 
		 */
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\파일 입출력 문제\\성적.dat"));
			
			ArrayList<String> pass = new ArrayList<>(); 
			ArrayList<String> fail = new ArrayList<>(); 
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				double avg = (kor + eng + math) / 3.0;
				
				if(avg >= 60 && (kor >= 40 && eng >=40 && math >=60)) {
					pass.add(temp[0]);
				}
				else {
					fail.add(temp[0]);
				}
				
			}

			System.out.println("[합격자]");
			
			for(String name : pass) {
				System.out.println(name);
			}
			
			System.out.println("[불합격자]");
			for(String name : fail) {
				System.out.println(name);
			}
			
			reader.close();
	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
