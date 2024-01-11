package com.test.java.obj;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;

public class Person {
	
	private String name;
	private int age;
	private String address;
	
	
	//별명 > 다수 > 배열
	private String[] nick = new String[3];
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public String getNick() {
//		return nick;
//	}
//
//	public void setNick(String nick) {
//		this.nick = nick;
//	}
	
	
	//dump 메소드 
	public String info() {
		
		String temp = "";
		
		temp += "이름: " + name + "\r\n";
		temp += "나이: " + age + "\r\n";
		temp += "주소: " + address + "\r\n";
		temp += "별명: " + Arrays.toString(nick) + "\r\n";
		
		return temp;
	}

//	public String[] getNick() {
//		return nick;
//	}
//
//	public void setNick(String[] nick) {
//		this.nick = nick;
//	}
	
	private int index = 0;
	
	public void addNick(String nick) {
		
		this.nick[index] = nick;
		index++;
		
	}
	
	public String getNick(int index) {
		
		return nick[index];
	}
	
}
