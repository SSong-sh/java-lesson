package com.test.java;

import java.lang.invoke.StringConcatFactory;
import java.util.Random;

public class Ex50_Random {
	
	public static void main(String[] args) {
		
		//1. Math.random()
		//2. Random 클래스
		
		
		//m1();
		m2();
		
		
	}

	private static void m2() {
		
		//프로젝트
		//- 주제 선정
		// 레시피 제공
		// 재활용 시스템 !
		
		//학생 정보 > 프로그램 
		//- 학교 규모?
		//- 500여명 > 1년 생활 > 데이터
		//- 성적, 출결, 기타 등...
		//- 이름, 나이, 성별, 주소, 키
		
		//문자열 난수 > 배열
		
		Random rnd = new Random();
		
		String[] name1 = {"김","이","박","최","정","유","민","차","장","조","전"};
		String[] name2 = {"길","동","재","석","명","수","세","원","호","미","경"};
		
		String[] address1 = {"서울시","인천시","부산시","강릉시","대구시","광주시","제주시"};
		String[] address2 = {"강남구","강동구","강서구","강북구","중구"};
		String[] address3 = {"역삼동","대치동","압구정동","천호동","길동","명일동"};
		
		
		for(int i=0; i<200; i++) {
			
			String name = name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)] 
					+name2[rnd.nextInt(name2.length)];
			
			int age = rnd.nextInt(2) + 13; //13~14
			
			String gender = rnd.nextInt(2) == 0 ? "남자" : "여자";
			
			String address = address1[rnd.nextInt(address1.length)]+ " "
						   + address2[rnd.nextInt(address2.length)]+ " "
						   + address3[rnd.nextInt(address3.length)]+ " "
						   +(rnd.nextInt(300)+100)+"번지";
			
			System.out.printf("%s(%d세) %s %s\n",name,age,gender, address);
			
		}
		
		
	}

	private static void m1() {
		
		Random rnd = new Random();
		
		//각 자료형별 > 난수 발생
		//rnd.nextXXX()
		
		for(int i=0; i<10; i++) {
			//System.out.println(rnd.nextInt());
			//System.out.println(rnd.nextDouble()); //==Math.random() 0~1사이의 값
			//System.out.println(rnd.nextInt(10)); //0~9까지 정수 반환 / 가장 많이 사용
			//System.out.println(rnd.nextBoolean());
			
			
		}
		
	}

}
