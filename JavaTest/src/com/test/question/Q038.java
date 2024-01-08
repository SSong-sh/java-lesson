package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;

import org.w3c.dom.events.Event;

public class Q038 {
	
public static void main(String[] args) throws NumberFormatException, IOException {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int num =0 ;
	int sumEven = 0;
	int sumOdd = 0;
	int even = 0;
	int odd = 0;
	
	System.out.print("입력 횟수: ");
	int count = Integer.parseInt(reader.readLine());
	
	for(int i=1; i<=count; i++) {
		System.out.print("숫자: ");
		num = Integer.parseInt(reader.readLine());
		
		if(num % 2 == 0) {
			sumEven = sumEven + num;
			even ++;

		} else {
			sumOdd = sumOdd + num;
			odd++;
		
		}
		
	}
	System.out.printf("짝수 %d개의 합: %d\n",even,sumEven);
	System.out.printf("홀수 %d개의 합: %d\n",odd,sumOdd);

	
	
	}
}

