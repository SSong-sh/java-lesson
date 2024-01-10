package com.test.question;

import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;
import java.util.Scanner;

public class Q067 {

	public static void main(String[] args) {

		int[] list = { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };

		int insert = 0;
		int value = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("삽입 위치: ");

		insert = scan.nextInt();

		System.out.print("값: ");

		value = scan.nextInt();

		System.out.print("원본: ");

		//for (int i = 0; i < list.length; i++) {
		//	System.out.print(list[i] + ",");
		//}

		array(list);

		for (int i = list.length - 2; i >= insert; i--) {
			list[i + 1] = list[i];
		}

		list[insert] = value;

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
