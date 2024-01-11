package com.test.question;

public class Q074 {
	
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];

		int n = 1;

		for (int i = 0; i < nums.length/2+1; i++) { //i=0,1,2

			for (int j = 2-i; j <=2+i ; j++) {

				nums[i][j] = n;
				n++;
				
			}

		}
		
		for (int i=nums.length/2+1; i<nums.length;i++) { //i=3,4
			for (int j = i-2 ; j <= 6-i; j++) { //i=3 => j=1~3 , i=4 => j=2

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
