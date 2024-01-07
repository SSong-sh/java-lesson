package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q014 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("역의 개수: ");
		String input1 = reader.readLine();
		int station = Integer.parseInt(input1);
		
		System.out.print("환승역의 횟수: ");
		String input2 = reader.readLine();
		int changeStation = Integer.parseInt(input2);
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		String input3 = reader.readLine();
		int time = Integer.parseInt(input3);
		
		int result = 0;
		
		result = getTime(station,changeStation,time);
		
		System.out.printf("총 소요 시간은 %d분입니다.\n",result);
		
	} //main
	
	public static int getTime(int station, int changeStation, int time) {
		
		int result = 0 ;
		
		result = (station * 2) + changeStation *((time == 1 ) ? 3 : (time == 2) ? 4 : 5 );   
		
		return result;
		
	}
}
