package com.test.question2;

public class BookClass {
	
	/*
		요구사항
		Book 클래스를 설계하시오.
	 
	 	조건..
		Book 객체의 정보
		제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수
		모든 멤버 변수의 접근 지정자는 private으로 한다.
		멤버 접근을 위한 Setter와 Getter를 정의한다.
		제목 : 읽기/쓰기, 최대 50자 이내(한글, 영어, 숫자, 공백)
		가격 : 읽기/쓰기, 0 ~ 1000000원
		저자 : 읽기/쓰기, 제한 없음
		페이지수 : 읽기/쓰기, 1~무제한
		출판사 : 쓰기 전용
		발행년도 : 읽기 전용(2019년)
		ISBN : 읽기/쓰기
		Book 객체의 모든 정보를 문자열로 반환하는 메소드를 구현한다.
		String info()
		클래스가 잘 설계되었는지 객체를 가지고 사용해본다.
		Book 객체 생성
		멤버 값 넣기 + 값 출력
		유효성 검사 테스트
		
		----------------------------------------------------------
		
		호출..
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);
		
		System.out.println(b1.info())
	 
	 */
	
	public static void main(String[] args) {
		
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
		
	}

}

class Book {
	   private String title;
	   private int price;
	   private String author;
	   private String publisher;
	   private String pubYear = "2019";
	   private String isbn;
	   private int page; 
	   
	   
	   
	   
	   public String getTitle() {
		return title;
	}




	public  void setTitle(String title) {
		//50자를 벗어나면  메서드 종료
		if (title.length() > 50) {
			return;
		}
		
		// 한글, 영문자, 공백 문자가 아니면 메서드 종료
		for (int i =0 ; i<title.length(); i++) {
			char c = title.charAt(i);
			
			if( (c <'가' || c > '힣') && (c < 'A' || c >'Z') && (c <'a' || c >'z') && c != ' ' ) {
				
				return;
			}
		}
		
		//제한을 다 통과하면 객체에 title 값 저장
		this.title = title;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		
		if (price < 0 || price > 1000000) {
			return;
		}
		
		this.price = price;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public String getIsbn() {
		return isbn;
	}




	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}




	public int getPage() {
		return page;
	}




	public void setPage(int page) {
		
		if(page < 1) {
			return;
		}
		
		this.page = page;
	}




	public String getPubYear() {
		return pubYear ;
	}




	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}




	public String info() {
		   
		   return String.format("제목: %s\n" 
				   				+ "가격: %,d원\n"
				   				+ "저자: %s\n"
				   				+ "출판사: %s\n"
				   				+ "발행연도: %s년\n"
				   				+ "ISBN: %s\n"
				   				+ "페이지: %,d장\n"
				   				, this.title
				   				, this.price
				   				, this.author
				   				, this.publisher
				   				, this.pubYear
				   				, this.isbn
				   				, this.page);
		   
	   }
}