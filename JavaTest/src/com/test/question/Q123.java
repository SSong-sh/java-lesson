package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.runtime.TemplateRuntime;
import java.util.Scanner;

public class Q123 {

	public static void main(String[] args) {
		/*
		 * 
		 * 요구사항 이름을 입력받아 회원 정보를 검색 후 출력하시오.
		 * 
		 */

		try {

			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\파일 입출력 문제\\단일검색.dat"));
			Scanner scan = new Scanner(System.in);

			System.out.print("이름: ");
			String name = scan.nextLine();

			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");

				if (temp[1].equals(name)) {
					System.out.printf("[%s]\n", temp[1]);
					System.out.printf("번호: %s\n", temp[0]);
					System.out.printf("주소: %s\n", temp[2]);
					System.out.printf("전화: %s\n", temp[3]);
					break;

				}
			}

			reader.close();

			System.out.println("완료");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
