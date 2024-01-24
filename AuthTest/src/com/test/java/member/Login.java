package com.test.java.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import com.test.java.resource.Path;
import com.test.java.view.View;

public class Login {
	
	//객체 만들꺼야?? => 다른 객체를 만들 필요가 있을 까? 재사용할 일 있어? => 없어? => 정적으로
	//Login login1 = neww Login(); 
	
	public static void login() {
		
		Scanner scan = new Scanner(System.in);
		String id ="";
		String pw = "";
		
		View.title("로그인");

		System.out.print("아이디: ");
		id = scan.nextLine();
		
		System.out.print("암호: ");
		pw = scan.nextLine();
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(Path.MEMBER)); //공통된 자원은 오타나면 안되니까 상수로 만들기
			
			String line = null;
			
			while((line = reader.readLine())!=null) {
				
				String[] temp = line.split(",");
				
				if(temp[0].equals(id) && temp[1].equals(pw)) {
					//로그인 성공 > 계속 유지 > static 메모리 이용
					Member.auth = id; //이 값은 앞으로 언제든지 꺼내볼 수 있는 값 => 나의 고유값을 주기 때문에 로그인한 사람이 누구인지 알 수 있음!
					Member.level = temp[3];
					
				}
				
		
			}
			
			reader.close();
		} catch (Exception e) {
			//System.out.println("Login.login");
			e.printStackTrace();
		}
		
		//로그인 성공 유무?
		if (Member.auth != null) {
			System.out.println("로그인 성공!!");
		}else {
			System.out.println("로그인 실패;;");
		}
		
		//잠시 중단
		View.pause();
		
	}

}
