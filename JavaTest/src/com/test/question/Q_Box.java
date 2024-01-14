package com.test.question;

import java.net.SocketTimeoutException;
import java.util.concurrent.ForkJoinTask;

import javax.imageio.stream.IIOByteBuffer;
import javax.sound.midi.Soundbank;

public class Q_Box {
	
	/*
	 
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
	
	
	//멤버 변수 macaron 배열
	private Q_Macaron[] list = new Q_Macaron[10];

	public void cook() {
		
		String[] color = {"빨강","노랑","파랑","검정","보라","주황"};
		
		for(int i=0;i<list.length;i++) {
			
			//마카롱 객체 생성
			Q_Macaron macaron = new Q_Macaron();
			
			//마카롱 사이즈 - 생산 크기(5cm ~ 15cm) → 판매 유효 크기(8cm ~ 14cm)
			macaron.setSize((int)(Math.random()*11)+5);
			//마카롱 컬러
			macaron.setColor(color[(int)Math.random() * color.length]);
			//마카롱 두꼐 - 생산 샌드 두께(1mm ~ 20mm) → 판매 유효 두께(3mm ~ 18mm)
			macaron.setThickness((int)(Math.random()*20)+1);
			
			this.list[i] = macaron;
			
		}
		System.out.printf("마카롱을 %d개 만들었습니다.\n",this.list.length);
		System.out.println();
		
	}

	
	//박스 체크 결과 - 합격 갯수와 불합격 개수 구하기 - 누적변수 필요
	public void check() {
		
		int pass = 0;
		int failed =0;
		
		for(int i=0;i<list.length;i++) {
			
			//list에 있는 macaron 객체를 참조하는 변수 선언과 초기화
			Q_Macaron macaron = this.list[i];
			
			if(check(macaron)) {
				pass++;
			}else {
				failed++;
			}
			
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수: %d개\n",pass);
		System.out.printf("QC 불합격 개수: %d개\n",failed);
		System.out.println();
		
	}
	
	//마카롱 체크 메소드
	
	private boolean check(Q_Macaron macaron) {
		if(!(macaron.getSize() >=8 && macaron.getSize()<=14)) {
			return false;
		}
		if(macaron.getColor().equals("black")) {
			return false;
		}
		if(!(macaron.getSize() >=3 && macaron.getSize()<=18)) {
			return false;
		}
		
		return true;
	}

	
	//마카롱 목록
	public void list() {
		
		System.out.println("[마카롱 목록]");
		
		for(int i=0; i<list.length;i++) {
			
			Q_Macaron macaron = this.list[i];
			
			System.out.printf("%d번 마카롱 :%dcm(%s, %dmm) : %s\n"
					,i
					,macaron.getSize()
					,macaron.getColor()
					,macaron.getThickness()
					,check(macaron) ? "합격" : "불합격");
		}
		System.out.println();
	}


}

