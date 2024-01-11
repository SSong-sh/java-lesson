package com.test.question;

public class Q073 {

	public static void main(String[] args) {
		int[][] nums = new int[5][5];

		int n = 1;

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length - i; j++) {

				nums[i][j] = n;
				n++;
				
				
			}

		}

		array(nums);

	}

	private static void array(int[][] nums) {
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[0].length; j++) {

				System.out.print(nums[i][j] + "\t");
			} // 하나의 층에 있는 배열 출력
			System.out.println();
		}
	}

}
