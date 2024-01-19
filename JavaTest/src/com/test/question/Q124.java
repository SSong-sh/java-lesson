package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q124 {

	public static void main(String[] args) {
		

		try {

			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\파일 입출력 문제\\검색_회원.dat"));
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\class\\code\\파일 입출력 문제\\검색_주문.dat"));
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = scan.nextLine();
			
			String line = null;
			String num = "";
			String address = "";

			while ((line = reader.readLine()) != null) {

				String[] temp = line.split(",");
				
				if(temp[1].equals(name)) {
					num = temp[0];
					address = temp[2];
					break;
					}
					
				}
				
			if(!num.equals("")) {
				System.out.println("====구매내역====");
				System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
					
				while((line = reader2.readLine()) != null) {
					
					String[] temp = line.split(",");
					
					if(temp[3].equals(num)) {
						System.out.printf("%s\t%s\t%s\t%s\t%s\r\n"
								,temp[0]
								,name
								,temp[1]
								,temp[2]
								,address);
					}
				}
			}
			
			

			reader.close();
			reader2.close();

		} catch (Exception e) {
			System.out.println("Ex59_File.m8");
			e.printStackTrace();
		}

	}

}
