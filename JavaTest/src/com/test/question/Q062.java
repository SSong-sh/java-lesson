package com.test.question;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.ldap.SortControl;

public class Q062 {
	public static void main(String[] args) {
		
		String name = "";

		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
	
		int student = scan.nextInt();
		
		String[] list = new String[student];
		
		scan.nextLine();
		
		for(int i=0; i<student; i++) {
			System.out.print("학생명: ");
			name = scan.nextLine();
			
			list[i] = name ;
		}
		
		System.out.println();
		
		sort(list);
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n",student);
		
		
		for(int i=0; i<list.length; i++) {

			System.out.printf("%d. %s\n",i+1, list[i]);
		}
		
		scan.close();
	}

	private static void sort(String[] list) {
		
		String temp = "";
		
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - i-1; j++) {
				
				if (list[j].compareTo(list[j + 1]) > 0) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		
	}


}
