package com.test.question;

import java.util.Arrays;
import java.util.EnumSet;

public class Q070 {

	public static void main(String[] args) {

		int[][] nums = new int[5][5];

		int n = 1;
		int value = 0;


		for (int i = 0; i < nums.length; i++) {
			
			//짝수번째 줄일 때
			if (i % 2 == 0) {

				for (int j = 0; j < nums[0].length; j++) {

					nums[i][j] = n;
					n++;

				}
			} else {
				for (int j = nums[0].length-1; j >= 0; j--) {
					
					nums[i][j] = n;
					n++;

				}

			}

		}
		
		array(nums);

	}

	private static void array(int[][] nums) {
		for(int i=0; i<nums.length; i++) {
			
			for(int j=0; j<nums[0].length; j++) {
				
				System.out.print(nums[i][j] + "\t");
			} // 하나의 층에 있는 배열 출력
			System.out.println();
		}
		
	}
}