package com.test.question;

import java.awt.FocusTraversalPolicy;
import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q114 {
	
	public static void main(String[] args) {
		
		/*
		 
		 요구사항
		 이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
		 
		 조건..
		 새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
         'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
         
         
		 
		 */
		
		String path = "C:\\class\\code\\파일 디렉토리 문제\\확장자별 카운트";
		
		File dir = new File(path);
		
		HashMap<String, Integer> count = new HashMap<>();
		
		File[] list = dir.listFiles();
		
		for(File file : list) {
			
			String ext = file.getName().substring(file.getName().lastIndexOf(".")+1);
			
			if(count.get(ext) ==null){
				count.put(ext, 0);
			}else {
				count.put(ext, count.get(ext) + 1);
			}
		}
		
		System.out.println(count);
		
		Set<String>keys = count.keySet();
		
		for(String key : keys) {
			System.out.printf("*.%s: %d개\n",key,count.get(key));
		}
		
	}

}
