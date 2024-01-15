package com.test.question;

public class Q_Time { //Q099
	
	private int hour;
	private int minute;
	private int second;
	
	public Q_Time() {
		
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		
	}
	//1,70,30
	public Q_Time(int hour, int minute, int second) {
		this.second = (second % 60); //30초
		this.hour = (second / 60 + minute) / 60 ; //1시간
		this.minute = (second / 60 + minute) % 60; //10분
		this.hour += hour;
	}
	
	//90,10
	public Q_Time(int minute, int second) {
		this.second = (second % 60); //30초
		this.minute = (second / 60 + minute) % 60;
		this.hour = (second / 60 + minute) / 60 ; //1시간
	}
	
	//10000
	public Q_Time(int second) {
		this.second = (second % 60); //나머지 40초, 몫 16
		this.minute = (second / 60 ) % 60; //나머지 16
		this.hour = (second / 60 ) / 60 ; //1시간
	}
	
	public String info() {
		 return String.format("%02d:%02d:%02d", 
				 this.hour != 0 ? this.hour : 0 ,
				 this.minute !=0 ? this.minute : 0, 
				 this.second !=0 ? this.second : 0);
	}

}

