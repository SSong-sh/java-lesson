package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("파일 경로: ");
	
	String path = scan.nextLine();
	
	File file = new File(path);
	
	System.out.printf("파일명: %s\n", file.getName());
	//뒤에서부터 . 을 찾은 후 그 다음 인덱스부터 끝까지
	System.out.printf("종류: %s\n", file.getName().substring(file.getName().lastIndexOf(".")+1));
	System.out.printf("파일크기: %s\n", getSize(file.length()));

	
	}

	private static String getSize(long length) {
		
		if(length <1024) {
			return length + "B";
		}else if(length <1024*1024){
			return String.format("%.1f", length/1024.0) + "KB";
		}else if(length <1024*1024*1024){
			return String.format("%.1f", length/1024.0/1024.0) + "MB";
		}else if(length <1024*1024*1024*1024){
			return String.format("%.1f", length/1024.0/1024.0/1024.0) + "GB";
		}else {
			return String.format("%.1f", length/1024.0/1024.0/1024.0/1024.0) + "TB";
		}

	}

}
