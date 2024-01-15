package com.test.question;

public class Q_Packer {
	
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;
	
	public void packing(Q_Pencil pencil) {
		
		System.out.printf("포장 전 검수: %s",pencil.info());
		
		if(pencil.getHardness().equals("4B") || pencil.getHardness().equals("3B")||
				pencil.getHardness().equals("2B")||pencil.getHardness().equals("HB")
				||pencil.getHardness().equals("H")||pencil.getHardness().equals("2H")
				||pencil.getHardness().equals("3H")||pencil.getHardness().equals("4H")) {
			
			Q_Packer.pencilCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("포장을 완료하지 못했습니다.");
		}
	}
	
	
	public void packing(Q_Eraser eraser) {
		
		System.out.printf("포장 전 검수: %s",eraser.info());
		
		if(eraser.getSize().equals("Large")||eraser.getSize().equals("Medium")||eraser.getSize().equals("Small")) {
			Q_Packer.eraserCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("포장을 완료하지 못했습니다.");
		}
	}
	
	public void packing(Q_BallPointPen ballPointPen) {
		
		System.out.printf("포장 전 검수: %s",ballPointPen.info());
		
		if(ballPointPen.getThickness() ==0.3 ||ballPointPen.getThickness()==0.5 || ballPointPen.getThickness()==0.7||
				ballPointPen.getThickness()==1||ballPointPen.getThickness()==1.5)  {
			Q_Packer.ballPointPenCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("포장을 완료하지 못했습니다.");
		}
	}
	
	public void packing(Q_Ruler ruler) {
		
		System.out.printf("포장 전 검수: %s",ruler.info());
		
		if(ruler.getLength() == 30 ||ruler.getLength() == 50 || ruler.getLength() == 100){
			Q_Packer.rulerCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("포장을 완료하지 못했습니다.");
		}
	}
	
	
	/*
	 
	 	포장한 내용물 개수를 출력한다.
		int type : 출력할 내용물의 종류
		0 : 모든 내용물
		1 : 연필
		2 : 지우개
		3 : 볼펜
		4 : 자
	 
	 */
	public void countPacking(int type) {
		System.out.println();
		System.out.println("=====================");
		System.out.println("포장결과");
		System.out.println("=====================");

		if (type == 0) {
			System.out.printf("연필 %d회\n",Q_Packer.pencilCount);
			System.out.printf("지우개 %d회\n",Q_Packer.eraserCount);
			System.out.printf("볼펜 %d회\n",Q_Packer.ballPointPenCount);
			System.out.printf("자 %d회\n",Q_Packer.rulerCount);

		}else if(type ==1) {
			System.out.printf("연필 %d회\n",Q_Packer.pencilCount);
		}else if(type ==2) {
			System.out.printf("지우개 %d회\n",Q_Packer.eraserCount);
		}else if(type==3) {
			System.out.printf("볼펜 %d회\n",Q_Packer.ballPointPenCount);
		}else if(type ==4) {
			System.out.printf("자 %d회\n",Q_Packer.rulerCount);
		}
		
	}

}
