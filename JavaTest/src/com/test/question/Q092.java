package com.test.question;

public class Q092 {

	public static void main(String[] args) {

		/*
		 * 조건.. Book 객체의 정보 제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수 모든 멤버 변수의 접근 지정자는
		 * private으로 한다. 멤버 접근을 위한 Setter와 Getter를 정의한다. 제목 : 읽기/쓰기, 최대 50자 이내(한글, 영어,
		 * 숫자, 공백) 가격 : 읽기/쓰기, 0 ~ 1000000원 저자 : 읽기/쓰기, 제한 없음 페이지수 : 읽기/쓰기, 1~무제한 출판사 :
		 * 쓰기 전용 발행년도 : 읽기 전용(2019년) ISBN : 읽기/쓰기 Book 객체의 모든 정보를 문자열로 반환하는 메소드를 구현한다.
		 * String info() 클래스가 잘 설계되었는지 객체를 가지고 사용해본다. Book 객체 생성 멤버 값 넣기 + 값 출력 유효성 검사
		 * 테스트
		 */

		// Book 객체 생성
		Q_Book b1 = new Q_Book();

		// 멤버 값 설정
		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		// 값 출력
		System.out.println(b1.info());

	}// main

}// Ex92
