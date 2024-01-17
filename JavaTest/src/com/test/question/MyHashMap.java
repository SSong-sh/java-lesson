package com.test.question;

public class MyHashMap {

	//key + value
	//Case 1.
	private String[] keys;
	private String[] values;
	private int index;
	
	
	public MyHashMap() {
		
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	
	public boolean put(String key, String value) {

		this.keys[this.index] = key;
		this.values[this.index] = value;
		
		//System.out.println(value);

		this.index++;

		return true;
	}

//	public String get(String s) {
//
//		String keyValue = "";
//		
//		if(this.keys[this.index] == s) {
//			keyValue = this.key;
//		}
//
//		return "";
//	}
	
	
	//Case 2/
//	private Entry[] list;
//	private int index;

}

//class Entry {
//	private String key;
//	private String value;	
//}
