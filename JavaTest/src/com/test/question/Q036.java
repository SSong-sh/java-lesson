package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Enum.EnumDesc;
import java.nio.file.attribute.UserPrincipalLookupService;

public class Q036 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("시작 숫자: ");
		int startNum = Integer.parseInt(reader.readLine());

		System.out.print("종료 숫자: ");
		int endNum = Integer.parseInt(reader.readLine());

		System.out.print("증감치: ");
		int plusNum = Integer.parseInt(reader.readLine());

		for(int i=startNum; i<=endNum; i+=plusNum) {
			System.out.println(i);
		}
	}

}