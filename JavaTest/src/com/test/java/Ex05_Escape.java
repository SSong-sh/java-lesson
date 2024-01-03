package com.test.java;

public class Ex05_Escape {
	
	public static void main(String[] args) {
		
		
		//특수문자 > Escape Sequence
		// - 컴파일러가 번역을 할 때, 소스의 문자를 그대로 출력하지 않고 미리 약솓된 표현으로 바꿔서 출력하는 요소
		
		// 1. \n > 한 글자로 취급 
		// - new line, line feed
		// - 개행 문자 (엔터)
		
		char c1 = '\n';
		String s1 = "\n";
		
		// 요구사항 ] "안녕하세요. 홍길동입니다." 출력해주세요.
		// 수정사항 ] "안녕하세요." "홍길동입니다." 각각 다른 줄에 출력. 중간에 엔터 쳐주세요~
		
		// ** 문자열 리터널내에는 엔터를 작성할 수 없다. 
		String msgString = "안녕하세요.\n홍길동입니다.";
		System.out.println(msgString);
		
		//빈줄 입력
		System.out.println();
		
		
		// 2. \r
		// - carriage return
		// - 캐럿의 위치를 현재 라인의 맨 앞으로 이동
		// - 키보드 > Home 키 역할
		
		msgString = "안녕하세요.\r홍길동";
		System.out.println(msgString);
		
		//운영체제의 엔터
		// 1. 윈도우 > \r\n
		// 2. 맥 os > \r
		// 3. 리눅스 > \n
		
		System.out.println("하나\r\n둘");//정석
		System.out.println("하나\n둘");//잘 사용
		
		// 3. tab
		// - 탭 문자, tab
		// - 탭이 뭐에요? > 4칸 띄기
		
		msgString ="하나	둘		셋";
		System.out.println(msgString);
		
		msgString = "하나\t둘\t\t셋";
		System.out.println(msgString);
		
		// 4. \b
		// - backspace => 이클립스는 지원 안 함
		
		// 5. \", \', \\
		// - 이미 역할이 있는 문자를 역할이 없게 만드는 작업 
		
		// 요구사항 ] 화면 > 홍길동 : "안녕하세요."
		msgString = "홍길동: \"안녕하세요.\"";
		System.out.println(msgString);
		
		// 요구사항] 수업 폴도의 경로를 출력하시오.
		// C:\class\code\java
		
		//Invalid escape sequence 
		//(valid ones are \b \t \n \f \r \" \' \\ )
		System.out.println("C:\\class\\code\\java");
		
		
		
		
	}

}
