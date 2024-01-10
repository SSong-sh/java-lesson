package com.test.question;

import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Q064 {

	public static void main(String[] args) {
		/*
		 * 요구사항] 1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
		 * 
		 * - 조건 : 난수는 20개 발생 후 배열에 넣는다 : 난수는 1~20개 사이
		 * 
		 */

		int[] randomArray = new int[20];
		int max = 1;
		int min = 20;

		for (int i = 0; i < randomArray.length; i++) {

			int random = (int) (Math.random() * 20) + 1; // *가 범위 조정 0부터 시작이라 +1
			randomArray[i] = random;
			
		}

		for (int i = 0; i < randomArray.length; i++) {
			
			if (randomArray[i] < min) {
				min = randomArray[i];
			}

			if (randomArray[i] > max) {
				max = randomArray[i];
			}
			

		}
		
		System.out.print("원본: ");
		for(int i=0;i<randomArray.length;i++) {
			System.out.print(randomArray[i] + ",");
		}
		System.out.println();
		System.out.printf("최댓값: %d\n" , max);
		System.out.printf("최솟값: %d\n" , min);
	}

}
