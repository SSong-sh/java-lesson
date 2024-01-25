package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex71_File {
	
	private static String data;
	
	static {
		data = "dat\\data.txt";
	}
	
	//파일 입출력 => 무조건 처음부터 끝까지 확인 (중간을 확인할 수 있는 방법이 없음, 거꾸로 올라가는 것도 안됨)
	//- 읽기
	//- 쓰기
	//- 수정하기(x) => 덮어쓰기 하는 중 
	
	public static void main(String[] args) {
		
		//m1();
		//m2();
		
		//하지 못하는 행동들
		//m3();
		m4();
	}

	private static void m4() {
		
			//둘을 찾아서 two로 수정하기 (수정 안됨)
		
			try {
		
			BufferedReader reader = new BufferedReader(new FileReader(data));
			
			String txt = "";
			String line = null;
			
			while((line = reader.readLine()) != null) {
					txt += line.replace("둘","two") + "\r\n";
								
			}
			System.out.println(txt);
			
			//새로 만든 txt를 덮어쓰기
			BufferedWriter writer = new BufferedWriter(new FileWriter(data)); 
			
			writer.write(txt);
			
			writer.close();
			System.out.println("complete");
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m3");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		try {
			
			//중간에 있는거 삭제하기 (셋)을 삭제 
			//=> 파일 읽기를 통해서 원하는 txt를 만들고 쓰기를 통해 txt를 덮어쓰기 
			//왜? 수정하기가 따로 없기 때문에
			BufferedReader reader = new BufferedReader(new FileReader(data));
			
			String txt = "";
			String line = null;
			
			while((line = reader.readLine()) != null) {
				if(!line.equals("셋")) {
					txt += line + "\r\n";
					
				}
			}
			System.out.println(txt);
			
			//새로 만든 txt를 덮어쓰기
			BufferedWriter writer = new BufferedWriter(new FileWriter(data)); 
			
			writer.write(txt);
			
			writer.close();
			System.out.println("complete");
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m3");
			e.printStackTrace();
		}
	}

	private static void m2() {
		
		try {
			//편집(=수정) => 일부 내용 추가/삭제
			BufferedWriter writer = new BufferedWriter(new FileWriter(data ,true)); //이어쓰기 모드로 전환 
			
			writer.write("넷");
			writer.newLine();
			writer.write("다섯");
			writer.newLine();
			
			writer.close();
			System.out.println("complete");
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m2");
			e.printStackTrace();
		}
	}

	private static void m1() {
		
		try {
			//쓰기
			//-Create 
			BufferedWriter writer = new BufferedWriter(new FileWriter(data));
			
			writer.write("하나");
			writer.newLine();
			
			writer.write("둘");
			writer.newLine();
			
			writer.write("셋");
			writer.newLine();
			
			writer.close();
			
			System.out.println("complete");
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m1");
			e.printStackTrace();
		}
		
		
	}

}
