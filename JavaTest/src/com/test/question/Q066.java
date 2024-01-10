package com.test.question;

public class Q066 {

	public static void main(String[] args) {

		int[] list = new int[6];
		String temp = "";

		for (int i = 0; i < list.length; i++) {

			int random = (int) (Math.random() * 45) + 1; // *가 범위 조정 0부터 시작이라 +1
			
			list[i] = random;
			
			
			//중복을 확인하는 반복문
			for (int j = 0; j < i; j++) { //인덱스 i 이전값들만 검사 = 채워진 부분까지만 중복 검사
				if (list[j] == list[i]) {
					i--; //중복이 발생하면 i를 줄여서 반복문 빠져나가도록
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