package com.test.question;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Q_Note {
	
	
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;

	
	

	//크기 쓰기 전용
	public void setSize(String size) {
		
		if(size.equals("A3")
				|| size.equals("A4")
				|| size.equals("A5")
				|| size.equals("B3")
				|| size.equals("B4")
				|| size.equals("B5")) {
				this.size = size;
		} else {
			System.out.println("잘못된 사이즈를 입력했습니다.");
		}
	}


	
	//표지 색상 쓰기 전용
	public void setColor(String color) {

		if (color.equals("검정색") 
				|| color.equals("흰섹") 
				|| color.equals("노란색") 
				|| color.equals("파란색")) {
			this.color = color;

		} else {
			System.out.println("잘못된 색상을 입력했습니다.");
		}
	}
			


	//페이지수 쓰기 전용
	public void setPage(int page) {
		if (page>=10 && page<200) {
			this.page = page;
		}else {
			System.out.println("잘못된 페이지수를 입력했습니다.");
		}
	}
		
	


	//소유자이름 쓰기 전용
	public void setOwner(String owner) {
		if(checkLength(owner) && checkName(owner)) {
			this.owner = owner;
		}else {
			System.out.println("잘못된 이름을 입력했습니다.");
		}
	}


	private boolean checkName(String owner) {

		// 한글인지 검사
		for (int i = 0; i < owner.length(); i++) {
			char c = owner.charAt(i);

			if (c < '가' || c > '힣') {
				return false;
			}
		}

		return true;

	}


	private boolean checkLength(String owner) {
		   if(owner.length( )>=2 && owner.length()<=5) {
			   return true;
		   }else {
			   return false;
		}

	}


	public String info() {
	    // 기본 노트 가격
	    this.price = 500;

	    // 크기 변경에 따른 추가 가격
	    if (this.size.equals("A3")) {
	    	this.price += 400;
	    } else if (this.size.equals("A4")) {
	    	this.price += 200;
	    } else if (this.size.equals("B3")) {
	    	this.price += 500;
	    } else if (this.size.equals("B4")) {
	    	this.price += 300;
	    } else if (this.size.equals("B5")) {
	    	this.price += 100;
	    }

	    // 색상 변경에 따른 추가 가격
	    if (this.color.equals("검정색")) {
	    	this.price += 100;
	    } else if (this.color.equals("노란색")) {
	    	this.price += 200;
	    } else if (this.color.equals("파란색")) {
	    	this.price +=200;
	    }

	    // 페이지수 변경에 따른 추가 가격
	    this.price += (this.page -10) * 10;
	    
	    //두께별 분류
	    
	    String countPage = "";
	    
	    if(this.page >=10 && this.page<=50) {
	    	countPage = "얇은";
	    }else if(this.page >=51 && this.page <=100) {
	    	countPage ="보통";
	    }else if (this.page >=101 && this.page <=200) {
			countPage = "두꺼운";
		}

	    
	    String temp = "";
	    
	    temp += "■■■■■■ 노트 정보 ■■■■■■■\n";
	    
	    //소유주는 필수값
	    //페이지수는 클래스 맴버 변수가 아님
	    if(this.owner != null) {
	    	temp += String.format("소유자: %s\n", this.owner);
	    	temp += String.format("특성: %s %s %s노트\n", this.color, countPage, this.size);
	    	temp += String.format("가격: %,d\n", this.price);
	    	
	    }else {
	    	temp += "주인없는 노트\n";
	    }
	    temp +=  "■■■■■■■■■■■■■■■■■■■■■■\n";
	    
	    return temp;
	}

}
