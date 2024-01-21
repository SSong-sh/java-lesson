package com.test.question;

import java.io.File;
import java.nio.file.ProviderMismatchException;
import java.util.HashMap;

public class Q117 {

	
	public static void main(String[] args) {
		/*
		 
		 요구사항
		 내용물이 있는 'delete' 폴더를 삭제하시오.
		 
		 조건..
		 재귀 메소드 사용
         삭제된 파일과 자식 폴더 개수를 출력하시오.
		 */
		
		String path = "C:\\class\\code\\파일 디렉토리 문제\\폴더 삭제\\delete";
		
		HashMap<String, Integer> count = new HashMap<>();
		
		count.put("folder", 0);
		count.put("file", 0);
		
		File dir = new File(path);
		
		
		deleteFiles(dir,count);
		
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.",count.get("folder"),count.get("file"));
		
		
	}

	private static void deleteFiles(File dir, HashMap<String, Integer> count) {
		
		File[] list = dir.listFiles();
		
		if(list == null) {
			return;
		}
		
		for(File file : list) {
			if(file.isFile()) {
				count.put("file", count.get("file")+1);
				file.delete();
			}
		}
		
		for(File subFolder : list ) {
			if(subFolder.isDirectory()) {
				deleteFiles(subFolder, count);
			}
		}
		count.put("folder", count.get("folder")+1);
		
		dir.delete();
		
	}
}
