package com.test.java;

import java.util.Scanner;

public class Ex28_Scanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		//문자열 입력
//		System.out.print("입력: ");
//		String line = scan.nextLine(); //reader.readLine()
//		System.out.println(line);
//		
//		
//		//자료형별로 입력받는 메서드 제공
//		System.out.print("숫자:");
//		int num = scan.nextInt(); //연속으로 숫자를 받을 떄는 엔터를 자동으로 지워주나, 숫자 다음 문자를 받을 때는 엔터를 따로 지워줘야함 
//		System.out.println(num + 10);
//		
//		
//		//편법
//		scan.nextLine(); //nextInt에 남아있는 엔터를 지워줌
//		
//		//정석
//		scan.skip("\r\n");
//		
//		System.out.print("입력: ");
//		line = scan.nextLine(); //nextLine만 홍길동 뒤 엔터(/r/n)을 지워줌
//		System.out.println("마지막: " + line);
		
		System.out.print("입력: ");
		
		
//		String txt = scan.next();//nextline()은 엔터 전까지 모든 문자를 가져옴/ next()는 공백으로 구분되는 첫 단어만을 가져옴 나머지는 범퍼에 남아있음
//		System.out.println(txt);
//		
//		txt = scan.next();
//		System.out.println(txt);
//		
//		txt = scan.next();
//		System.out.println(txt);
		
		
		//TODO 다음에 다시 정리!!
		String txt = "";
		
		//읽을 수 있는 값이 있는지 검사를 함 => 있으면 true, 없으면 false
		while (scan.hasNext()) { 
			txt = scan.next();
			
		}
		
		System.out.println("종료");
	}

}
