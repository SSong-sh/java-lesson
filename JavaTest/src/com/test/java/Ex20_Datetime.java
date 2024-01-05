package com.test.java;

import java.util.Calendar;
import java.util.Date;

import javax.imageio.event.IIOReadWarningListener;
import javax.swing.plaf.metal.MetalInternalFrameTitlePane;

public class Ex20_Datetime {
	public static void main(String[] args) {
		
		
		
		/*
		 
		 자바의 날짜/시간 자료형, DateTime
		 1.Date 클래스
		 2.Calender 클래스 //오랜전 
		 -----------------------
		 3.java.time 패키지 > 추가 클래스 //최신
		 
		 
		
		 
		 - 시각 > 포인트 (2024-01-15 12:30:00)
		 - 시간 > 양  ( 수업시간 8시간)
		 
		 
		 시각, 시간 > 연산
		 
		 시각 + 시각 = X
		 시각 - 시각 = O (시간)
		 
		 시간 + 시간 = O (시간)
		 시간 - 시간 = O (시간)
		 
		 시각 + 시간 = O (시각)
		 시각 - 시간 = O (시각)
		 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		
		m7();
		
	}//main
	

	private static void m7() {
		//현재 시각의 tick
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		//전용 메서드(현재 시각)
		System.out.println(System.currentTimeMillis());
		
	}


	private static void m6() {
		
		//연산 
		//- 시간 + 시간 = 시간
		//- 시간 - 시간 = 시간
		
		//2시간 + 1시간 = 3시간
		
		int h1 =2;
		int h2 =1;
		System.out.println(h1+h2);
		
		
		//2시간 30분 + 10분 = 2시간 40분
		int hour = 2;
		int min = 30;
		
		//min = min + 10;
		min+=10;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		
		//2시간 30분 + 40분 = 2시간 70분 = 3시간 10분
		 hour = 2;
		 min = 30;
				
				
		min +=40;
		
		hour = hour + (min/60); //2시간 + 1시간 > 자리올림
		min = min % 60;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		
	}


	private static void m5() {
		
		
		//연산
		//- 시각 - 시각 = 시간

		//내가 태어나서 살아온 시간?
		
		Calendar nowCalendar = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(1999, 8, 17, 13, 30, 0);
		
		//System.out.println(now - birthday);
		
		//Epoch Time, Tick
		//- 1999년 8월 17일 13시 30분 0초로부터 몇 밀리초가 흘렀는지 누적값(ms)
		System.out.println(birthday.getTimeInMillis());//숫자가 커서 자료 타입이 long
		System.out.println(nowCalendar.getTimeInMillis());
		
		long gap = nowCalendar.getTimeInMillis() - birthday.getTimeInMillis();
		
		System.out.printf("살아온 시간: %,dms\n",gap);
		System.out.printf("살아온 시간: %,d시간\n",gap/1000/60/60);
		System.out.printf("살아온 시간: %,d일\n",gap/1000/60/60/24);
		//System.out.printf("살아온 시간: %,d년\n",gap/1000/60/60/24/365); 년은 정형화가 안되기 때문에 만들 수 없음 (대략적인 값은 추출 가능)
		
		
		
		//수료일까지? 112일
		
		Calendar end = Calendar.getInstance();
		end.set(2024, 5, 17);
		
		System.out.printf("수료일까지 남은 일: %d일\n"
				, (end.getTimeInMillis() - nowCalendar.getTimeInMillis()) / 1000 / 60 / 60 / 24 );
		
		
		//오늘 집에 가려면 몇시간 ?
		Calendar out = Calendar.getInstance();
		
		out.set(Calendar.HOUR_OF_DAY, 17);
		out.set(Calendar.MINUTE, 50);
		
		System.out.printf("남은 시간: %.1f\n"
				,(out.getTimeInMillis()-nowCalendar.getTimeInMillis()) / 1000.0 / 60 /60);
		
		
	}


	private static void m4() {
		
		//연산
		//- 시각 + 시간
		//- 시각 - 시간
		
		//오늘 만난 커플 > 100일?
		//오늘(시각) + 100일(시간) = 기념일(시각)
		
		Calendar now = Calendar.getInstance();
		
		System.out.printf("1일차 : %tF\n", now);
		
		now.add(Calendar.DATE, 99); //수정 (이전 날짜는 사라짐)
		
		System.out.printf("100일차 : %tF\n", now);
		
		
		//1주일전?
		
		now = Calendar.getInstance(); //now에 현재시간 덮어쓰기
		
		now.add(Calendar.DATE, -7);
		
		System.out.printf("일주일전: %tF\n", now);
		
		
		//컵라면 > 3분 뒤?
		
		now = Calendar.getInstance(); 
		
		now.add(Calendar.MINUTE, 3);
		
		System.out.printf("라면 시간 : %tT\n", now);
		
		
		
	}


	private static void m3() {
		// TODO 오후 2시에 이대리에게 질문!! => window - show view - tasks에 요약정리 볼 수 있음
		// XXX 치명적 문제
		// FIXME 오류 해결
		
		
		//calenadar 매서드
		//1. int get(int) : 읽기
		//2. void set(오버로딩) : 쓰기
		
		
		//특정 날짜를 생성하기 > 올해 크리스마스
		
		Calendar christmas = Calendar.getInstance(); //현재 시각
		
		System.out.printf("%tF\n", christmas);
		
		//수정
		//christmas.set(Calendar.MONTH,11); //월은 (0~11)
		//christmas.set(Calendar.DATE,25); //첫 번째는 두번쨰가 뭔지 알려줌, 두번 째가 수정할 것
		
		//christmas.set(2024, 11, 25); //3가지 인수는 년,월,일로 약속되어 있음 
		christmas.set(2024, 11, 25, 18, 30, 0);
		
		System.out.printf("%tF %tT\n", christmas, christmas);
		
	}


	private static void m1() {
		
		//메인보드 > 시계
		
		//Date 클래스
		Date now = new Date(); //now > 컴퓨터의 시각을 가져온다.
		
		//Fri Jan 05 10:43:39 KST 2024
		System.out.println(now);
		
	}

	private static void m2() {
		
		//Calender 클래스
		Calendar c1 = Calendar.getInstance();
		
		System.out.println(c1);
		System.out.println();
		
		//집합 데이터 > 내가 원하는 항목을 추출
		//- int get(int)
		
		System.out.println(c1.get(1)); //년도
		System.out.println(c1.get(2)); 
		System.out.println(c1.get(3));
		System.out.println(c1.get(4));
		System.out.println(c1.get(5));

		//의미 없는 상수에 의미 붙여주기 
		
		int year = 1;
		System.out.println(c1.get(year));//년도
		
		//calendar.YEAR > 캘린더 상수
		System.out.println(Calendar.YEAR);
		System.out.println(c1.get(Calendar.YEAR)); //년도
		
		
		System.out.println(c1.get(Calendar.YEAR)); //2024 년도
		System.out.println(c1.get(Calendar.MONTH)); //0 > 월(0~11) // 지금은 1월
		System.out.println(c1.get(Calendar.DATE)); //5 >일
		System.out.println(c1.get(Calendar.HOUR)); //11 >시 (12H) 표기법
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));// 11 > 시 (24H) 표기법
		System.out.println(c1.get(Calendar.MINUTE)); //8 > 분
		System.out.println(c1.get(Calendar.SECOND)); //51 > 초
		System.out.println(c1.get(Calendar.MILLISECOND)); //0.780 > 밀리초
		System.out.println(c1.get(Calendar.AM_PM));// 0 > 오전(0), 오후(1)
		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); //5 > 일(년) 올해 들어 5일 째 누적값 2/1 => 32
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //5 >일(월)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //6 > 요일.일(1) ~ 토(7)
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //1 > 몇주차
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); //1 > 몇주차
		
		
		System.out.println();
		
		//요구사항] "오늘은 2024년 01월 05일입니다."출력하시오.
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n",
				c1.get(Calendar.YEAR),
				c1.get(Calendar.MONTH)+1,
				c1.get(Calendar.DATE));
		
		System.out.printf("오늘은 %d년 %d월 %s일입니다.\n",
				c1.get(Calendar.YEAR),
				c1.get(Calendar.MONTH)+1,
				c1.get(Calendar.DATE) < 10 ? "0" + c1.get(Calendar.DATE) : c1.get(Calendar.DATE) + "" ); //빈 문자를 더해서 int를 string으로 변환
		
		
		System.out.printf("오늘은 %d년 %02d월 %02d일입니다.\n", //2로 자릿수를 만들어주고 0을 앞에 써주면 2자릿구가 안되면 0을 자동으로 채워줌
				c1.get(Calendar.YEAR),
				c1.get(Calendar.MONTH)+1,
				c1.get(Calendar.DATE));
		
		System.out.println();
		
		//요구사항] "지금은 오전 11시 36분 49초입니다."
		System.out.printf("지금은 %s %02d시 %02d분 %02d초입니다.\n"
				, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, c1.get(Calendar.HOUR)
				, c1.get(Calendar.MINUTE)
				, c1.get(Calendar.SECOND));
		
		
		System.out.println();
		
		//printf() > 형식 문자 (날짜 시간)
		System.out.printf("%tF\n",c1); //2024-01-05
		System.out.printf("%tT\n",c1); //11:32:08
		System.out.printf("%tA\n",c1); //금요일
	}

}
