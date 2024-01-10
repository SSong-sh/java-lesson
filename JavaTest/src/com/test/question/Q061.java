package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Q061 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] nums = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			int num = scan.nextInt();
			
				nums[i]= num;
		
		}
		
		System.out.println();
		
		for(int i=nums.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n", i , nums[i]);
		}
		
	}
	
}
