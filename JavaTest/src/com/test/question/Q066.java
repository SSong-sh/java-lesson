package com.test.question;

public class Q066 {

	public static void main(String[] args) {

		int[] list = new int[6];
		String temp = "";

		for (int i = 0; i < list.length; i++) {

			int random = (int) (Math.random() * 45) + 1; // *가 범위 조정 0부터 시작이라 +1
			
			list[i] = random;
			
			
			for (int j = 0; j < i; j++) {
				if (list[j] == list[i]) {
					i--;
					break;
				}
			}

		}

		temp = "[ ";
		
		for(int i=0;i<list.length;i++) {
			temp += list[i]+", ";
		}
		
		temp += "]";
		System.out.println(temp);
	}

}