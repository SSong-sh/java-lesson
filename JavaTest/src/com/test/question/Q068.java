package com.test.question;

import java.awt.Insets;
import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;
import java.util.Scanner;

public class Q068 {

	public static void main(String[] args) {

		int[] list = { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };

		int index= 0;
		int value = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("삭제 위치: ");

		index = scan.nextInt();


		System.out.print("원본: ");

		//for (int i = 0; i < list.length; i++) {
		//	System.out.print(list[i] + ",");
		//}

		array(list);

		//list 삭제
		for (int i = index; i< list.length-1; i++) {
			list[i] = list[i+1];
		}

		list[list.length-1] =0; //배열의 마지막요소를 0으로 초기화 하는 부분 

		
		System.out.print("결과: ");

		//for (int i = 0; i < list.length; i++) {
			//System.out.print(list[i] + ",");
		//}
		array(list);
		
		
	} // main

	private static void array(int[] list) {

		String temp = "[ ";

		for (int i = 0; i < list.length; i++) {
			temp += list[i] + ", ";
		}

		temp += "]";
		System.out.println(temp);
	}

}
