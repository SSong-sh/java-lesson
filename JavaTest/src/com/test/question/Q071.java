package com.test.question;

public class Q071 {
	
	public static void main(String[] args) {

		int[][] nums = new int[5][5];

//		int n = 25;

//
//
//		for (int i = 0; i < nums.length; i++) {
//			
//			for(int j=0; j<nums[i].length;j++) {
//				
//				nums[i][j] = n;
//				n --;
//			}
//			
//		}
		
		int n =1;
		
		for(int i =nums.length-1; i>=0 ;i--) {
			
			for(int j=nums[0].length-1; j>=0; j--) {
				
				nums[i][j] = n;
				n++;
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
