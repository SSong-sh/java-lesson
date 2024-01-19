package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_File {
	
	public static void main(String[] args) {
		
		/*
		 
		 1. 파일/디렉토리 조작
		 
		 2. 파일 > (내용) 입출력
		 	a. 텍스트 입출력 > 수업내용
		 		- 메모장
		 		- 이클립스 
		 	
		 	b. 비텍스트 입출력(바이너리)
		
		 파일 입출력
		 - 자바 프로그램 <-> (데이터) <-> 보조기억장치(HDD,SSD,USB)
		 - 데이터 흐름: 
		 -                 ->           ->                         : 쓰기(저장)
		 -                 <-          <-                          : 읽기           
		 
		   
		 저장 장치
		 - 데이터 1,0으로 저장
		 - 데이터의 자료형 규칙 없음 (자바로 만들든 C로 만들든 다 배제하고 저장)
		 
		 
		 인코딩, Encoding
		 - 문자 코드(응용 프로그램 데이터)를 부호화(0,1) 시키는 작업
		 - 자바 프로그램("홍길동", String) > 텍스트 파일 (1000100100) 자신만의 방법 대로 저장 => 1과 0으로 저장하는 작업 = 인코딩
		 
		 디코딩, Decoding
		 - 저장장치 규칙대로 저장된 데이터를 자바 프로그램이 읽기 위해서는 부호화 된 데이터를 자바 형식으로 바꾸는 작업
		 - 부호 데이터를 문자 코드로 변환하는 작업
		 - 텍스트 파일 (1000100100) > 자바 프로그램("홍길동", String)
		 
		 인코등/ 디코딩 규칙
		 - 저장 장치 or 네트워크 상에서 데이터를 표현하는 규칙
		 
		 1. ANSI
		 2. UTF
		 	2.1 UTF-8
		 	2.2 UTF-16
		 3.ISO-8859-1
		 4. EUC-KR
		 5. MS949
		 
		 
		 ANSI(ISO-8859-1, EUC-KR, MS959) 같은 규칙을 가짐 (세부적인 규칙은 다름)
		 - 영어(숫자, 특수문자, 서유럽 문자 등 ASCII(~255)/ 한글 뺸 모든것) : 1BYTE
		 - 한글(한자, 일본어 등 / 위에 문자 제외 한 것) : 2BYTE
		 
		 UTF-8 > 국제 표준 역할 > 자바/오라클 UTF-8 사용
		 - 영어: 1BYTE
		 - 한글: 3BYTE
		 
		 UTF-16 > 모든 문자를 2바이트로 저장 , 정말 잘 안 쓰임
		 - 영어: 2BYTE
		 - 한글: 2BYTE
		 
		 */
		
		//m1(); 스트림 쓰기 작업
		//m2(); 스트림 읽기 작업
		
		//m3();
		//m4(); //메모장 구현(쓰기)
		//m5();
		
		//m6();
		//m7();
		
		m8();//TODO 프로젝트와 비슷한 결
	}

	private static void m8() {
		
		//성적 관리
		//- 성적표 출력
		//- 성적 파일(score.txt)
		
		//*****************아주 중요한 작업!! 데이터 구조 설계
		//- 이름, 국어, 영어, 수학
		
		System.out.println("===========================================");
		System.out.println("              성적표");
		System.out.println("===========================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\score.txt"));
			
			//경로 확인하는법!
//			File file = new File(".\\dat\\score.txt");
//			System.out.println(file.exists());
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
//				System.out.println(line); //==학생 1명
				//홍길동,100,90,80 > 조각조각 내는 작업 Parsing > 데이터 변환
				
				String[] temp = line.split(",");
				
				String name = temp[0];
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				int total = kor + eng + math;
				double avg = total /3.0;
				
				System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n",name,kor,eng,math,total,avg);
				
			}
			
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m8");
			e.printStackTrace();
		}
		
	}

	private static void m7() {
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("자바 파일명: "); //Ex01_DataType.java
			String filename = scan.nextLine();
			
			//C:\class\code\java\JavaTest\src\com\test\java\파일명
			
			String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\" + filename;
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1 ; //줄번호
			
			while((line = reader.readLine()) != null){
				System.out.printf("%3d: %s\n",number,line);
				number++;
				
			}
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m7");
			e.printStackTrace();
		}
		
	}

	private static void m6() {
		
		//FileOutputStream > FileWriter > BufferedWriter (file이라고 안 붙여 있음 > 범용 도구 > 키보드 입출력 & 파일 입출력 & 네트워크 입출력 가능)
		//FileInputStream > FileReader > BufferedReader
		
		try {
			
//			//스스로 어떤 장치에 기록하는 지 알 수 없음! => 따로 지정해줘야함
//			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\list.txt"));
//			
//			writer.write(65);
//			writer.newLine(); //==writer.write("\r\n") 띄어쓰기(엔터)
//			writer.write("문자열");
//			
//			writer.close();
			
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //키보드 입력
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\list.txt"));
			
			//문장전체를 읽을 수 있음
//			String line = reader.readLine();
//			System.out.println(line); //더이상 없으면 null 반환
			
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m6");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m5() {
		
		try {
			
			//파일 읽기
			//FileInputStream > FileReader
			//1. 문자 단위 읽기 (2byte)
			
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\data.txt"); 
			
			//한글 읽을 수 있음
//			int code = reader.read();
//			System.out.println((char)code);
//			
//			code = reader.read();
//			System.out.println((char)code);
//			
//			code = reader.read();
//			System.out.println((char)code);
			
			int code = -1;
			
			while((code = reader.read())!= -1) {
				System.out.print((char)code);
			}
			
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m5");
			e.printStackTrace();
		}
		
	}

	private static void m4() {
		
		//메모장 구현 > 콘솔 버전
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("저장할 파일명: ");
			String filename = scan.nextLine();
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\" + filename);
			
			boolean loop = true;
			
			while (loop) {
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if(line.equals("q!")) {
					break;
				}
				
				writer.write(line); //한줄 입력 > 한줄 쓰기
				writer.write("\r\n");
			}
			
			writer.close();
			System.out.println("end");
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m4");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		try {
			
			//파일 쓰기
			//FileOutputStream > 업그레이드 버전: FileWriter
			//1. 문자열 쓰기 지원
			//2. 문자 단위 쓰기 (2byte)
			
			//모든 스트림은 파일이 없으면 무조건 만들어줌 !! 
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt",true);
			
			writer.write("홍길동"); //문자코드 뿐만 아니라 문자열 넣을 수 있는 기능이 생김!
			
			
			writer.close(); // 스트림 만들자 마자 닫는 거 만들어 놓기 => 까먹지 않게
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		
		//파일 읽기 == 파일 입력
		try {
			
			//FileOutputStream <-> FileInputStream
			
			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\file\\data.txt");
			
//			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex28_Scanner.java");
			
//			//System.in.read()
//			//reader.read()
//			int code = stream.read(); // code 값
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println((char)code);
//
//			code = stream.read(); 
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println((char)code);
//			
//			code = stream.read(); 
//			System.out.println(code); //아무것도 없으면 문자코드 값으로 사용되지 않은 -1로 반환함
			
			
			//자동으로 읽기
			//로직 기억!!
			
			int code = -1;
			
			while((code = stream.read()) != -1) {
				System.out.print((char)code); //결과 : Hello Java
			}
			
			
			stream.close(); // 입출력 상관없이 모든 스트림은 마지막에 종료
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m2");
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		//파일 입출력
		
		//파일 쓰기 == 파일 출력
		
		//쓰기 스트림 객체
		
		try {
			
			//텍스트 파일 참조
			File file = new File("C:\\class\\code\\java\\file\\data.txt");
			
			//파일 객체 > 스트림 생성
			//쓰기 스트림 모드
			//1. Create Mode > 기본값(덮어쓰기)
			//2. Append Mode > 이어쓰기 
			
			//FileOutputStream
			//- 바이트 단위 쓰기(1byte) => 한글은 2바이트 깨짐, 영어는 뒤에 1바이트에 유효한 문자라서 괜춘
			
			FileOutputStream stream = new FileOutputStream(file, true); //true = append 모드
			
			/*
			 * char c = 'A';
			 * 
			 * stream.write((int)c); //문자코드를 사용해서 파일에 문자를 작성 stream.write('B');
			 * stream.write('C');
			 * 
			 * stream.close(); //스트림 닫기(실제 저장) => 습관적으로 기록을 다 마치면 닫아주기
			 * 
			 * //스트림이 닫히고 난 후 입력 못함 => 뒤에 만들고 싶으면 스트림을 다시 만들면 됨
			 * 
			 * stream = new FileOutputStream(file, true); stream.write('가');
			 */
			
			String txt = "\r\nHello Java";
			
			for(int i=0;i<txt.length();i++) {
				char c = txt.charAt(i);
				stream.write(c);
			}
			
			stream.close();
			
			System.out.println("end");
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m1");
			e.printStackTrace();
		}
		
		
	}

}
