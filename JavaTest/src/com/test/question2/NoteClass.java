package com.test.question2;

public class NoteClass {
	
	/*
	 	요구사항
		Note 클래스를 설계하시오.
		
		조건..
		Note 객체의 정보
		크기, 표지 색상, 페이지수, 소유자이름, 가격
		모든 멤버 변수의 접근 지정자는 private으로 한다.
		멤버 접근을 위한 Setter와 Getter를 정의한다.
		크기 : 쓰기 전용, A3, A4, A5, B3, B4, B5
		표지 색상 : 쓰기 전용, 검정색, 흰색, 노란색, 파란색
		페이지수 : 쓰기 전용, 10 ~ 200페이지 이내
		(+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
		소유자이름 : 쓰기 전용, 한글 2~5자이내. 필수값
		가격 : Setter,Getter 구현 안함. 추후 info() 메소드에서 사용하기 위해 아래와 같은
		규칙으로 계산
		(+) 기본 노트 : A5 + 흰색 + 10페이지 = 가격(500원)
		(+) 크기 변경 : A3(+400원), A4(+200원), B3(+500원), B4(+300원), B5(+100원)
		(+) 색상 변경 : 검정색(+100원), 노란색(+200원), 파란색(+200원)
		(+) 페이지수 변경 : 페이지 당 x 10원 추가
		Note 객체의 정보를 확인하기 위한 메소드를 구현한다.
		String info()
		Note가 잘 설계되었는지 객체를 가지고 사용해본다.
		Note 객체 생성 → 값 넣기 + 값 출력 등
		
		--------------------------------------------------------------------
		
		호출..
		Note note = new Note();
		
		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		
		System.out.println(note.info());
		
		
		Note note2 = new Note();
		
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		
		System.out.println(note2.info());
			 
	 */
	
	public static void main(String[] args) {
		
	}

}

class Note  {
	   private String size;
	   private String color;
	   private int page;
	   private String owner;
	   private int price;

	   //setter, getter 구현
	   
		public void setSize(String size) {

			if(size.equals("A3") 
					|| size.equals("A4")
					|| size.equals("A5")
					|| size.equals("B3")
					|| size.equals("B4")
					|| size.equals("B4")){
				this.size = size;
			} else {
				System.out.println("잘못된 사이즈 입력입니다.");
			}
			
			
		}

		public void setColor(String color) {
			if (color.equals("검정색")
					||color.equals("흰색")
					||color.equals("노란색")
					||color.equals("파란색")) {
				
				this.color = color;
			} else {
				System.out.println("잘못된 색상 입력입니다.");
			}
			
		}

		public void setPage(int page) {
			
			if(page <= 10 || page >= 200) {
				return;
			}
			
			this.page = page;
		}

		public void setOwner(String owner) {
			if(checkLength(owner) && checkOwner(owner) ) {
				this.owner = owner;
			} else {
				System.out.println("잘못된 이름 입력입니다.");
			}
		}

	   private boolean checkLength(String owner) {
			if(owner.length() > 2 && owner.length() <5) {
				return true;
			}
			return false;
		}

	private boolean checkOwner(String owner) {
		   
		   for(int i=0; i<owner.length(); i++) {
			   char c = owner.charAt(i);
			   if(c <= '가' && c >= '힣') {
				   return true;
			   }
		   }
			return false;
		}

	public String info() {
		
			this.price = 500;
			
			
			
		
	         return String.format("■■■■■■ 노트정보 ■■■■■■\n"
	        		 				+ "소유자 : %s\n"
	        		 				+ "특성: %s %s %s노트"
	        		 				+ "가격: %,d원\n"
	        		 				, this.owner
	        		 				, this.color
	        		 				, this.page
	        		 				, this.size
	        		 				, this.price);
	   }


	}
