package com.test.question2;

public class BoxClass {
	
	/*
	 	요구사항
		Box 클래스와 Macaron 클래스를 설계하시오.
		
		조건..
		Box 객체의 정보
		1Box에는 10개의 마카롱을 담을 수 있다.(멤버 변수 = Macaron 배열)
		Box 객체의 사용
		Box 객체를 생성시 Box에 마카롱 객체를 10개 담는다.(무작위)
		품질 검사에 통과하지 못하는 마카롱을 구분한다.
		Macaron 객체의 정보
		생산 크기(5cm ~ 15cm) → 판매 유효 크기(8cm ~ 14cm)
		생산 색상(red, blue, yellow, white, pink, purple, green, black) → 판매 유효 색상(black을 제외한 모든 색상)
		생산 샌드 두께(1mm ~ 20mm) → 판매 유효 두께(3mm ~ 18mm)
	 
	 
	 */
	
	public static void main(String[] args) {
		Box box1 = new Box();

		box1.cook();
		box1.check();
		box1.list();
	}

}
class Box {
	   private Macaron[] list = new Macaron[10];

	   public void cook() {
		   
		   String[] color = {"red", "blue","yellow","white","pink","green","black"};
		   
		   for( int i=0; i<list.length; i++) {
			   
			   Macaron m = new Macaron();
			   
			   m.setSize((int)(Math.random()*11)+5);
			   m.setColor(color[(int)Math.random()*color.length]);
			   m.setThickness((int)(Math.random()*20)+1);
			   
			   this.list[i] = m;
		   }
		   
		   System.out.printf("마카롱을 %d개 만들었습니다.\n", this.list.length);
		   
		   
		   
	   }
	   public void check() {
		   
		   int pass = 0;
		   int fail = 0;
		   
		   for (int i=0; i<list.length; i++) {
			   
			 
			 Macaron macaron = this.list[i];  
			   
			if(check(macaron)) {
				   pass++;
			   } else {
				   fail++;
			   }
			   
		   }
		   
		   
	   }
	   
	   private boolean check(Macaron macaron) {
		   
		   if(!(macaron.getSize() >= 8 && macaron.getSize() <=14)) {
			   return false; 
		   } 
		   
		   if (macaron.getColor().equals("black")) {
			   return false;
		   }
		   if(!(macaron.getThickness() >= 3 && macaron.getThickness() <=18)) {
			   return false;
		   }
		   
		   return true;
		   
	   }
	   
	   public void list() {
		   
		   System.out.println("[마카롱 목록]");
		   
		   for(int i=0; i<list.length;i++) {
			   Macaron macaron = this.list[i];
			   
			   System.out.printf("%d번 마카롱: %dcm(%s,%dmm) : %s\n"
					   			,i
					   			,macaron.getSize()
					   			,macaron.getColor()
					   			,macaron.getThickness()
					   			,check(macaron) ? "합격" : "불합격");
		   }
		   
		   System.out.println();
		   
	   }
}

class Macaron {
		private int size;
		private String color;
		private int thickness;
		
		public int getSize() {
			return size;
		}
		
		public void setSize(int size) {

			this.size = size;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public int getThickness() {
			return thickness;
		}
		
		public void setThickness(int thickness) {
			this.thickness = thickness;
		}
		
		
}
