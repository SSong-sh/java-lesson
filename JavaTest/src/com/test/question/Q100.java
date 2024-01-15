package com.test.question;

public class Q100 {
	
	public static void main(String[] args) {
		//포장하는 직원
		Q_Packer packer = new Q_Packer();

		//연필
		Q_Pencil p1 = new Q_Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Q_Pencil p2 = new Q_Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Q_Eraser e1 = new Q_Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		Q_BallPointPen b1 = new Q_BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		Q_BallPointPen b2 = new Q_BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Q_Ruler r1 = new Q_Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
	}

}
