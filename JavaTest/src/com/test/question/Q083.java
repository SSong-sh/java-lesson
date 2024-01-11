package com.test.question;

import java.util.Scanner;

public class Q083 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String fileName ="";
		
		int index = 0;
		
		int mp3 = 0;
		int jpg = 0;
		int java = 0;
		int hwp = 0;
		int doc = 0;
		
		
		for(int i=0;i<10;i++ ) {
			System.out.print("파일명: ");
			fileName = scan.nextLine();
			
			index = fileName.indexOf(".");
			
			
			if(fileName.substring(index).equals(".mp3")) {
				mp3++;
			}else if (fileName.substring(index).equals(".jpg")) {
				jpg++;
			}else if (fileName.substring(index).equals("java")) {
				java++;
			}else if (fileName.substring(index).equals(".hwp")) {
				hwp++;
			}else if (fileName.substring(index).equals(".doc")) {
				doc++;
			}
			
		}//for문 끝
		
		System.out.printf("mp3: %d개\n",mp3);
		System.out.printf("jpg: %d개\n",jpg);
		System.out.printf("java: %d개\n",java);
		System.out.printf("hwp: %d개\n",hwp);
		System.out.printf("doc: %d개\n",doc);
	}

}
