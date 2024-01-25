package com.test.java.service;

import java.util.Scanner;

import com.test.java.repository.Data;
import com.test.java.repository.Score;

// 주 업무 객체(실무 담장자)
public class Service {

	public void add() {
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		
		System.out.println("---------------------------------");
		System.out.println("         성적추가");
		System.out.println("---------------------------------");
		
		System.out.print("이름: ");
		name = scan.nextLine();
		
		System.out.print("국어: ");
		kor = scan.nextInt();
		
		System.out.print("영어: ");
		eng = scan.nextInt();
		
		System.out.print("수학: ");
		math = scan.nextInt();
		scan.nextLine();
		
		//입력받은 성적 1개 > Score 객체 1개 > list.add();
		Score score = new Score(name, kor, eng, math);
		Data.list.add(score); //성적추가
		
		System.out.println(Data.list);
		
		System.out.println("계속하려면 엔터 입력...");
		scan.nextLine();
		
	}

	public void list() {
		System.out.println("---------------------------------");
		System.out.println("         성적 확인");
		System.out.println("---------------------------------");
		
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		//내림차순
//		Data.list.sort((s1,s2) -> s2.getTotal() - s1.getTotal());
//		
//		for(Score score : Data.list) {
//			
//			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
//								, score.getName()
//								, score.getKor()
//								, score.getEng()
//								, score.getMath()
//								, score.getTotal()
//								, score.getAverage());
//		}
		
		Data.list.stream()
			.sorted( (s1,s2)-> s2.getTotal() -s1.getTotal())
			.forEach(s -> {
				System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
				, s.getName()
				, s.getKor()
				, s.getEng()
				, s.getMath()
				, s.getTotal()
				, s.getAverage());
			
		});
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계속하려면 엔터 입력...");
		scan.nextLine();
		
		
	}

	public void remove() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("         성적 삭제");
		System.out.println("---------------------------------");
		
		System.out.print("[이름]");
		Data.list.stream()
				.forEach(name -> System.out.println(name.getName()));
		
		System.out.println("삭제할 이름: ");
		String name = scan.nextLine();
		
		for (Score score : Data.list) {
			
			if(score.getName().equals(name)) {
				
				Data.list.remove(score);
				break;
			}
			
		}
		
		System.out.println("삭제되었습니다.");
		
		
		System.out.println("계속하려면 엔터 입력...");
		scan.nextLine();
	}
	
	

}

