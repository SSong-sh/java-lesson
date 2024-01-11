package com.test.question;

public class Q075 {
	

	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];

		int n = 1;

		for (int i = 0; i < nums.length-1; i++) { //i = 0,1,2,3

			for (int j =0 ; j < nums[0].length-1; j++) { //j=0~3
				
				//4로 끝나는 마지막 배열값을 변수 취급
				nums[i][j] = n; 
				nums[i][4] += n; //04,14,24,34,44 
				nums[4][j] += n; //40,41,42,43,44
				nums[4][4] += n; //44
				
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
