package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.naming.spi.DirStateFactory.Result;

public class Q027 {
	
public static void main(String[] args) throws IOException {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	
	System.out.print("문자: ");
	String txt = reader.readLine();	
	
	String result = "";
	
	if (txt.equals("f") || txt.equals("F")) {
		result = "Father";
	}else if (txt.equals("m") || txt.equals("M")) {
		result = "Mother";
	}else if (txt.equals("s") || txt.equals("S")) {
		result = "Sister";
	}else if (txt.equals("b") || txt.equals("B")) {
		result = "Brother";
	}else {
		System.out.println("");
	}
	
	System.out.println(result);
	
	
}

}
