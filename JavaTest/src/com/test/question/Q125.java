package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Q125 {
	
	public static void main(String[] args) {
		
		/*
		 
		 요구사항
		 모든 괄호가 서로 짝이 맞는지 검사하시오.
		 
		 */
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\파일 입출력 문제\\괄호.dat"));
			
			Stack<Character> stack = new Stack<>();
			
			String line = null;
			String java = "";
			
			while((line = reader.readLine()) != null) {
				java += line + "\r\n";
			}
			
			reader.close();
			
			for(int i=0; i<java.length();i++) {
				
				char c = java.charAt(i);
				
				if(c == '(' || c == '{') {
					stack.push(c);
				}
				
				if(c == ')' || c == '}') {
					stack.pop();
				}
			}
			
			if(stack.size() == 0) {
				System.out.println("올바른 소스입니다.");
			}else {
				System.out.println("올바르지 않은 소스입니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
