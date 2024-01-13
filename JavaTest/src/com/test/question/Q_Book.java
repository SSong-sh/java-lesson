package com.test.question;

public class Q_Book {

	private String title;
	private int price;
	private String author;
	private String publisher;
	private final String pubYear = "2019";
	private String isbn;
	private int page;

	// Getter and Setter methods

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		// 최대 50자 이내의 문자열만 허용
		if (title != null && title.length() <= 50) {
			this.title = title;
		} else {
			System.out.println("제목은 50자 이내로 설정해주세요.");
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		// 가격은 0 ~ 1,000,000원까지 허용
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("가격은 0에서 1,000,000원 사이로 설정해주세요.");
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		// 저자에 대한 제한 없음
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	// 출판사는 쓰기 전용으로 설정
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubYear() {
		return pubYear;
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
		// 페이지는 1 이상의 값만 허용
		if (page >= 1) {
			this.page = page;
		} else {
			System.out.println("페이지 수는 1 이상이어야 합니다.");
		}
	}

	// Book 객체의 모든 정보를 문자열로 반환하는 메소드
	public String info() {
		return String.format("제목: %s\n가격: %,d원\n저자: %s\n출판사: %s\n발행년도: %s\nISBN: %s\n페이지: %,d장", title, price, author,
				publisher, pubYear, isbn, page);
	}
}
