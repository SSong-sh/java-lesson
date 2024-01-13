package com.test.question;

import java.util.Calendar;

public class Q_Bugles {
	
	/*
	 	조건..
		Bugles 객체의 정보
		가격, 용량, 생산일자, 유통기한
		모든 멤버 변수의 접근 지정자는 private으로 한다.
		멤버 접근을 위한 Setter와 Getter를 정의한다.
		용량 : 쓰기 전용, 300g, 500g, 850g
		가격 : 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
		생산일자 : 쓰기 전용(Calendar)
		남은유통기한 : 읽기 전용, 생산된 제품의 유통기한 기준 : 7일(300g), 10일(500g), 15일(850g)
		Bugles 객체 메소드
		void eat() : 과자 먹기
		먹을수 있는 날짜 = 유통기한 - 현재 - 제조시간
		5 : 먹을 수 있는 날짜가 5일 남음
		-3 : 먹을 수 있는 날짜가 3일 지남
	 */
}
	
	class Bugles {
		   private int price;
		   private int weight;
		   private Calendar creationTime;
		   private int expiration;
		   
		   
		 
		//setSize 메서드
		public void setSize(int weight) {
			if(weight == 300 || weight == 500 || weight == 850) {
				
				this.weight = weight;
						
				if(weight==300) {
					this.price = 850;
					this.expiration=7;
				}else if(weight == 500) {
					this.price = 1200;
					this.expiration=10;
				}else if(weight == 850) {
					this.price = 1950;
					this.expiration=15;
				}
			}
		}
		   
		
		//가격 읽기 전용
		public int getPrice() {
			return price;
		}
		
		
		//생산일자 쓰기 전용
		//생산일자는 2024-01-09 형식으로 받음
		public void setCreationTime(String date) {
			
			//현제 시간 가져옴
			Calendar c = Calendar.getInstance();
			
			//string으로 받은 매개변수를 int로 형변환
			c.set(Integer.parseInt(date.substring(0,4)) //년도 출력
					, Integer.parseInt(date.substring(5,7))-1 //달 출력(달은 0부터 시작)
					, Integer.parseInt(date.substring(8))); //일 출력
			
			this.creationTime = c; 
		}
		
		//남은 유통기한 읽기전용
		public int getExpiration() {

			Calendar now = Calendar.getInstance();
			
		
			return this.expiration - (int)((now.getTimeInMillis()-this.creationTime.getTimeInMillis())
									/ 1000 / 60 / 60 / 24 );
		}
		
		public void eat() {
			
			if(getExpiration() >=0) {
				System.out.println("과자를 맛있게 먹습니다.");
			} else {
				System.out.println("유통기한이 지나 먹을 수 없습니다.");
			}
			
		}
		

	
}
