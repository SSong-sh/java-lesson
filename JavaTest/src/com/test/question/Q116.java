package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q116 {
	
	public static void main(String[] args) {
		
		/*
		  
		 요구사항
		 MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
		 
		 1. 두개의 폴더 경로 설정
		 2. 두개의 폴더로 객체 생성
		 3. 두개 폴더 각각 파일 리스트 배열 만들기
		 4. 두개 폴더 속 같은 파일 배열 만들기
		 5. 같은 이름을 가진 파일만 새로운 배열에 넣어주기
		 6. 반복 출력
		 
		 */
		
		String pathA = "C:\\class\\code\\파일 디렉토리 문제\\동일 파일\\MusicA";
		String pathB = "C:\\class\\code\\파일 디렉토리 문제\\동일 파일\\MusicB";
		
		File dirA = new File(pathA);
		File dirB = new File(pathB);
		
		File[] listA = dirA.listFiles();
		File[] listB = dirB.listFiles();
		
		ArrayList<File> sameList = new ArrayList<>();
		
		for(File fileA : listA) {
			for(File fileB : listB) {
				if(fileA.getName().equals(fileB.getName())) {
					sameList.add(fileA);
				}
			}
		}
		
		for (File sameFile : sameList) {
			System.out.println(sameFile.getName());
		}
	}

}
