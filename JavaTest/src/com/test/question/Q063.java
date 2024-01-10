package com.test.question;

import java.lang.invoke.StringConcatFactory;
import java.util.EnumSet;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Q063 {

	public static void main(String[] args) {
			
		/*
		 요구사항] int 배열을 매개변수로 받아 내용을 문자열로 반호나하는 dump 메소드를 구현하시오.
		 
		 - 조건
		 : String dump(int[] list)
		 
		 
		 */
		
		int[] list = new int[4];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
		
	}

	private static String dump(int[] list) {
		
		String temp = "[ ";
		
		for(int i=0;i<list.length;i++) {
			
			temp += list[i];
			
			if(i<list.length-1) {
				temp+= ",";
			}
			
		} //for문 리스트 내역까지 반복
		
		temp += " ]";
		
		return temp;
	}
}
