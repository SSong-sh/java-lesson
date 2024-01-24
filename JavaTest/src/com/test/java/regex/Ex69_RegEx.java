package com.test.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex69_RegEx {
	
	public static void main(String[] args) {
		
		/*
		 
		 	정규 표현식, Regular Express
		 	
		 	- 정규식 > "[특정패턴]의 문자열을 검색하는 도구"
		 	
		 	정규식 표현식 요소(=문법)
		 	
		 	1. x
		 		- x는 임의의 문자 1개
		 		ex) a 로 무언가를 찾아라 > a 찾아줌
		 		ex) abc > abc
		 		
		 	2. .
		 		- 임의의 문자 1개
		 		ex) . > 문자 1개
		 		ex) .. > 문자 2개
		 		ex) a.c => a로 시작해서 c로 끝나는 글자 찾기(한글자씩)
		 				> abc, aac, acc,adc, azc, a1c, a홍c
		 		ex) a..c > abbc, a길동c, a11c
		 		ex) a.?c > abc, adc, ac
		 		
		 	3. 출현횟수
		 		- 바로 앞의 문자(집합)의 출현 횟수를 표현 
		 		3.1 생략
		 			- 바로 앞의 대상의 출현 횟수가 생략x, 중복x
		 			- 출현 횟수: 1
		 			ex) abc > ab, abc, abb,ac, bc, bbc, aabc
		 			
		 		3.2 ?
					- 바로 앞의 대상의 출현 횟수가 생략o, 중복x
		 			- 출현 횟수: 0~1
		 			- ?앞에 a가 있을 수도 있고 없을 수 있다 => bc,abc를 찾아라
		 			ex) a?bc > ab, abc, abb,ac, bc, bbc, aabc
		 			ex) 홍?길동 > 안녕 ~ 길동아 네 이름은 홍길동이지?
		 			ex) (자바)?코드 > 자바코드가 있습니다. 그런데 코드에 에러가 있어요.
		 			추가로 자코드가 있습니다.
		 			
		 		3.3.+
		 			- 바로 앞의 대상의 출현 횟수가 생략x, 중복o
		 			- 출현 횟수: 1 ~ 무한대
		 			ex) a+bc > ab, abc, abb,ac, bc, bbc, aabc => abc, aabc, aaaabc...
		 			ex) 홍+길동 > 안녕 ~ 길동아 네 이름은 홍길동이지? 홍홍길동, 홍홍홍홍홍홍길동
		 			ex) (자바)+코드 > 자바코드가 있습니다. 그런데 코드에 에러가 있어요.
		 			추가로 자코드가 있습니다. 자바자바코드, 자바자바자바자바코드
		 			
		 		3.4 *
		 			- 바로 앞의 대상의 출현 횟수가 생략o, 중복o
		 			- 출현 횟수: 0 ~ 무한대
		 			ex) a*bc > ab, abc, abb,ac, bc, bbc, aabc =>  bc, abc, aabc, aaaabc...
		 			ex) 홍*길동 > 안녕 ~ 길동아 네 이름은 홍길동이지? 길동, 홍길동, 홍홍길동, 홍홍홍홍홍홍길동
		 			
		 			//홍길동과 홍홍길동만 찾고 싶을때
		 			ex) 홍?홍길동 > 안녕 ~ 길동아 네 이름은 홍길동이지? 길동, 홍길동, 홍홍길동, 홍홍홍홍홍홍길동
		 		
		 	
		 	4. 선택, Choice
		 		- 연산자 or 역할
		 		- [] 안의 문자 중 1개를 검색
		 	
		 			
		 		4.1 [열거값]
		 			ex) [012] > 제 나이는 12살입니다. 제 동생은 10살이에요. 키는 160cm입니다. 몸무게는 50kg이에요.
		 			ex) [나생는] > 제 나이은 12살입니다. 제 동생은 10살이에요. 키는 160cm입니다. 몸무게는 50kg이에요.
		 			ex) [김이박]길동 > 홍길동, 김길동, 이길동, 박길동, 정길동, 최길동
		 			ex) [김이박]?길동 > 홍길동, 김길동, 이길동, 박길동, 정길동, 최길동
		 			ex) [0123456789]+ > 숫자가 최소 연속으로 1개 이상 나온 숫자들을 찾아라
		 			
		 			ex) 주민등록번호
		 				980101-1234567
		 				[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]
		 			
		 			ex) 전화번호
		 				010-1234-5687
		 				010-7894-2415
		 				010-8421-4671
		 				010-384-9837
		 				
		 				010-[0123456789]?[0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789]
		 				
		 			ex) 영어 소문자 > [abcdefghijklmnopqrstuvwxyz]+	
		 			
		 				영어 대문자 > [ABCDEFGHIJKLMNOPQRSTUVWXYZ]+
		 				
		 				영어 >[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]+
		 				
		 				한글 > [가강간감각나난]
		 				
		 				*** 선택에서 연속된 문자를 간단하게 표현하는 방법
		 				
		 				ex) 숫자 > [0123456789] > [0-9]
		 				ex) 영어소문자 > [a-z]
		 				ex) 영어대문자 > [A-Z]
		 				ex) 영문자 [A-Za-Z]
		 				ex) 한글 > [가-힣]
		 			
		 				ex) [c-f]
		 				
		 				ex) 전화번호> 010-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]
		 				ex) 주민번호 > [0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]
		 				
		 				ex) 홍씨 사람들 ? > 홍[가-힣][가-힣]
		 				
		 				
		 		4.2 [^열거값]
		 			- 4.1의 부정형태
		 			- 열거값을 제외한 나머지 검색
		 			
		 			ex) [0-9] > [^0-9] > 숫자가 아닌것만 찾음
		 			
		 		
		 		5. 출현 횟수
		 			- 바로 앞의 문자(집합)의 출현 횟수를 표현 
		 			- ?, + , * 보다 더 세밀한 패턴 지정이 가능
		 			
		 			5.1 {n}
		 				- n : 출현 횟수
		 				ex) a{1}bc > ab, bc, abc, ac, abbc, abcc, aabc, aaabc > abc
		 				ex) a{2}bc > ab, bc, abc, ac, abbc, abcc, aabc, aaabc > aabc
		 				ex) a{3}bc > ab, bc, abc, ac, abbc, abcc, aabc, aaabc > aabc
		 				
		 			5.2 {n,m}
		 				- n : 최소 출현 횟수
		 				- m : 최대 출현 횟수
		 				ex) a{1,2}bc > ab, bc, abc, ac, abbc, abcc, aabc, aaabc > abc, aabc
		 				ex) a{2,3}bc > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		 				ex) a{0,1}bc > ab, bc, abc, ac, abbc, abcc, aabc, aaabc > ?와 같음
		 				
		 				
		 			5.3 {n, }
		 				- n : 최소 출현 횟수
		 				- 생략 : 무한대
		 				ex) a{1,}bc > ab, bc, abc, ac, abbc, abcc, aabc, aaabc > + 와 동일
		 				ex) abc{0,} > ab, bc, abc, ac, abbc, abcc, aabc, aaabc > * 과 동일
	
						ex) 주민번호 > [0-9]{6}-[0-9]{7} //현역에서 쓰는 모습
						ex) 전화번호 > 010-[0-9]{3,4}-[0-9]{4}
				
						ex) 한글 2~4자 > [가-힣]{2,4}
				
						ex) 영문자 5자 이상 > [A-Za-z]{5,}
				
						ex) 영문자 5자 이상 + 첫문자가 대문자로 시작 >
				 			[A-Z]{1}[A-Za-z]{4,}
				 			[A-Z][A-Za-z]{4,}
				 			
				 	6. 처음과 끝
				 		- 입력 컨트롤 or 입력 값을 대상으로 사용
				 		
				 		6.1 ^
				 			- 뒤의 표현으로 반스시 시작
				 			- str.startsWith("홍")
				 			ex) ^홍길동
				 			
				 		6.2 $
							- 앞의 표현으로 반드시 끝
							- str.endsWith("동")
							ex) 홍길동$
							
					7. 줄임표현
						7.1 \d or \D
							- Digital > 숫자
							- [0-9] == \d 
							- [^0-9] == \D
							ex) 주민번호 > \d{6}-\d{7}
							
						7.2 \w or \W
							- Word > 영어대소문자 + 숫자 + '_' 조합
							ex) \w{2,5}  == [A-Za-z0-9_]{2,5}
							
						7.3 \s or \S
							- 공백 문자 (스페이스, 탭, 엔터)
							ex) \s+ > 공백이 한개 이상을 찾아라
							ex) \S+ > 공백이 아닌 모든 문자
				 			
	
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();

		
	}

	private static void m6() {
		
		
		//유효성 검사
		
		//상황] 회원가입
		//1. 아이디 > 필수값, 4~12자 이내, 영문자 + 숫자 + '_', 숫자시작 x
		//2. 암호 > 필수값, 4 ~12자 이내
		//3. 이름 > 필수값, 2 ~ 4자이내, 한글만
		//4. 나이 > 필수값 , 숫자만, 1~120
		
		Scanner scan = new Scanner(System.in);
		
		//register1(scan);
		register2(scan);
		
	}

	private static void register2(Scanner scan) {
		
		System.out.println("[회원가입]");
		
		String id ="";
		String pw ="";
		String name ="";
		int age =0;
		
		while(true) {
			System.out.print("아이디: ");
			id = scan.nextLine();
			
			if(invalidateId2(id)) {
				
				System.out.println("필수값, 4~12자이내, 영문자+숫자+_, 숫자시작 x");
				
			} else {
				break;
			}
			
		}
		
		while(true) {
			System.out.print("암호: ");
			pw = scan.nextLine();
			
			if(invalidatePw2(pw)) {
				System.out.println("필수값, 4 ~12자 이내");
			}else {
				break;
			}
		}
		
		while (true) {
			System.out.print("이름: ");
			name = scan.nextLine();
			
			if(invalidateName2(name)) {
				System.out.println("필수값, 2 ~ 4자이내, 한글만");
			}else {
				break;
			}
		}
		
		
		while (true) {
			System.out.print("나이: ");
			age = scan.nextInt();
			scan.nextLine();
			
			if(invalidateAge2(age)) {
				System.out.println("필수값 , 숫자만, 1~120");
			}else {
				break;
			}
		}
		
		System.out.println("회원가입 처리...");
		System.out.println("종료");
		
	}

	private static boolean invalidateAge2(int age) {
		//숫자 > 범위 유효성 검사 > 정규식 x
		
		//4. 나이 > 필수값 , 숫자만, 1~120
		String regex ="^[01]?[0-2]?[0-9]";

		
		return true;
	}

	private static boolean invalidateName2(String name) {
		//3. 이름 > 필수값, 2 ~ 4자이내, 한글만
		
		String regex = "^[가-힣]{2,4}$";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(name);
		
		return !m1.find();
		
	}

	private static boolean invalidatePw2(String pw) {
		//2. 암호 > 필수값, 4 ~12자 이내
		//정규식 의미 없음 => 일단 만들어봄 
		//invalidatePw() 방식 추천!!
		
		String regex =".{4,12}";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(pw);
		
		return !m1.find();
	}

	//정규식
	private static boolean invalidateId2(String id) {
		
		//1. 아이디 > 필수값, 4~12자 이내, 영문자 + 숫자 + '_', 숫자시작 x
		
		String regex = "^[A-Za-z_][A-Za-z0-9_]{3,11}$"; //^와 $을 붙임으로써 앞뒤에 원치 않은 것이 붙은 채로 넘어가는 것을 방지
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(id);
		
//		if(m1.find()) 
//			return false;
//		}else {
//			return true;
//		}
		
		return !m1.find();
		
		
		
	}

	private static void register1(Scanner scan) {
		
		System.out.println("회원가입");
		
		String id ="";
		String pw ="";
		String name ="";
		int age =0;
		
//		System.out.print("아이디: ");
//		id = scan.nextLine();
//		
//		if(invalidateId(id)) {
//			
//			System.out.println("필수값, 4~12자이내, 영문자+숫자+_, 숫자시작 x");
//			
//		} else {
//			
//			System.out.println("올바른 아이디");
//		}
		
		while(true) {
			System.out.print("아이디: ");
			id = scan.nextLine();
			
			if(invalidateId(id)) {
				
				System.out.println("필수값, 4~12자이내, 영문자+숫자+_, 숫자시작 x");
				
			} else {
				break;
			}
			
		}
		
		
		while(true) {
			System.out.print("암호: ");
			pw = scan.nextLine();
			
			if(invalidatePw(pw)) {
				System.out.println("필수값, 4 ~12자 이내");
			}else {
				break;
			}
		}
		
		while (true) {
			System.out.print("이름: ");
			name = scan.nextLine();
			
			if(invalidateName(name)) {
				System.out.println("필수값, 2 ~ 4자이내, 한글만");
			}else {
				break;
			}
		}
		
		while (true) {
			System.out.print("나이: ");
			age = scan.nextInt();
			scan.nextLine();
			
			if(invalidateAge(age)) {
				System.out.println("필수값 , 숫자만, 1~120");
			}else {
				break;
			}
		}//while
		
		System.out.println("회원가입 처리...");
		System.out.println("종료");
	}

	private static boolean invalidateAge(int age) {
		//4. 나이 > 필수값 , 숫자만, 1~120
		//필수값
		if(age < 1 || age > 120) {
			return true;
		}
		
		return false;
	}

	private static boolean invalidateName(String name) {
		//3. 이름 >  필수값, 2 ~ 4자이내, 한글만
		
		//필수값
		if(name.equals("")||name == null) {
			return true;
		}
		// 2~4자 이내
		if(name.length() < 2 || name.length() > 4) {
			return true;
		}
		
		//한글만
		for(int i=0; i<name.length();i++) {
			char c = name.charAt(i);
			
			if(c < '가' || c > '힣') {
				return true;
			}
		}
		
		
		
		return false;
	}

	private static boolean invalidatePw(String pw) {
		//2. 암호 > 필수값, 4 ~12자 이내
		
//		if(pw.equals("")||pw == null) {
//			return true;
//		} //아래와 겹쳐서 있으나 마나
		// 4~12자 이내
		if(pw.length() < 4 || pw.length() >12) {
			return true;
		}
		
		
		
		
		return false;
	}

	private static boolean invalidateId(String id) {
		//1. 아이디 > 필수값, 4~12자 이내, 영문자 + 숫자 + '_', 숫자시작 x
		//- hong
		
		if(id.equals("")||id == null) {
			return true;
		}
		// 4~12자 이내
		if(id.length() < 4 || id.length() >12) {
			return true;
		}
		//잘못된 걸 찾기
		//영문자 + 숫자 + '_'
		for(int i=0; i<id.length();i++) {
			char c = id.charAt(i);
			if((c <'A'|| c > 'Z' ) && ( c < 'a' || c > 'z') && (c <'0' && c >'9') && c!='_'){
				
			}
		
		}
		
		//숫자시작 x 
		char c = id.charAt(0);
		if(c >='0' && c <='9') {
			return true;
		}
			
		return false;
		
		//올바른 검사
		
//		if(id != null && id.length() > 0) {
//			if(id.length() >=4 && id.length() <= 12) {
//				
//				for(int i=0; i<id.length(); i++){
//					
//					char c = id.charAt(i);
//					if((c >='A'|| c <= 'Z' ) || ( c >= 'a' || c <= 'z') || (c >='0' && c <='9') || c=='_'){
//						
//					} else {
//						return false;
//					}
//				}
//				
//				char c = id.charAt(0);
//				if(c<='0' || c>= '9') {
//					return true;
//				} else {
//					return false;
//				}
//			}
//		}
	}

	private static void m5() {

		String txt = "안녕하세요. 홍길동입니다. 네? 당신 이름도 길동이라구요? 아~ 김길동이요? 저쪽에 최길동도 있어요. 그 옆에 남궁길동도 있습니다";
		
		// 요구사항] 모든 길동이 찾기!!
		// String regex = "[홍김최(남궁)]길동"; => 남궁길동 못 찾음 ㅜㅜ
		
		String regex = "(홍|김|최|남궁)(길동)"; //두 글자 찾을 때 
		
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(txt);
		
		while(m1.find()) {
			System.out.println("찾은 이름: " + m1.group());
			System.out.println("성: " + m1.group(1));
			System.out.println("이름: " + m1.group(2));
		}
		
		
		
	}

	private static void m4() {
		
		//http://regexlib.com
		String txt = "주 메뉴위키백과검색계정 만들기로그인개인 도구숨기기 고려 에디터톤이 2월 4일까지 열립니다. 사용자:용인 학생에 대한 관리자 선거가 1월 28일 (일) 17:51 (KST)까지 진행됩니다.목차 토글전자 우편 주소문서토론읽기편집역사 보기도구위키백과, 우리 모두의 백과사전.전자 우편 주소의 예.전자 우편 주소(電子 郵便 住所) 또는 이메일 주소(email address)는 전자 우편 메시지가 전달될 전자 메일 상자를 식별한다. 초기 이메일 시스템에서는 여러 형태의 포맷이 사용되었지만 오늘날에는 1980년대부터 인터넷 메일 시스템을 위해 개발된 표준에 따라 오직 하나의 포맷만이 사용된다.John.Smith@example.com와 같은 전자 메일 주소는 로컬 파트인 @ 기호와 대소문자를 구분하는 도메인으로 이루어진다. 표준에서는 로컬 파트가 대소문자를 구별하지만, 실제로 example.com의 메일 시스템은 John.Smith를 JohnSmith, 심지어는 johnsmith과도 동등하게 취급하며[1], 메일 시스템들은 종종 기술적으로 유효한 문자들의 부분 집합으로 사용자의 이름을 지정하도록 제한한다. 일부의 경우, 메일 도착지의 주소를 제한하기도 한다.국제화 도메인 네임의 도입과 함께 ASCII가 아닌 문자를 전자 우편 주소에 허용하는 노력이 진행 중이다.문법로컬 파트전자 우편 주소의 로컬 파트는 아래의 ASCII 문자 중 어느 것이든 올 수 있다:대소문자 로마자 기본 A부터 Z, a부터 z숫자 0부터 9특수 문자 !#$%&'*+-/=?^_`{|}~점 (.)공백과 (),:;<>@[\\] 문자괄호 안에 사용되는 주석 (예: john.smith(comment)@example.com, (comment)john.smith@example.com)도메인이메일 주소 중 도메인 이름은 명확한 지침을 따라야 한다. 호스트명의 요구 사항, 점(.)으로 구분되는 DNS 레이블의 목록, 각 레이블이 63자를 넘지 않는 등의 요구 사항을 충족해야 하며, 다음으로 구성되어야 한다:[2]대소문자 로마자 기본 A부터 Z, a부터 z숫자 0부터 9 (최상위 도메인 이름이 모두 숫자가 아닌 경우)하이픈 - (처음 또는 마지막 글자가 아닌 경우)예유효한 전자 우편 주소prettyandsimple@example.comvery.common@example.comdisposable.style.email.with+symbol@example.comother.email-with-dash@example.comx@example.com (1문자 로컬 파트)much.more unusual@example.comvery.unusual.@.unusual.com@example.comvery.(),:;<>[]\\.VERY.\\very@\\\\ \\very\\.unusual@strange.example.comexample-indeed@strange-example.comadmin@mailserver1 (TLD이 없는 로컬 도메인 네임)#!$%&'*+-/=?^_`{}|~@example.org()<>[]:,;@\\\\\\!#$%&'-/=?^_`{}| ~.a@example.org @example.org (인용 부호 사이의 공백)example@localhost (localhost로부터의 송신)example@s.solutions (인터넷 최상위 도메인 목록 참조)user@localserveruser@tt (ICANN [1]이 점이 없는 이메일 주소의 사용을 권장하지 않지만 허용됨)user@[IPv6:2001:DB8::1]유효하지 않은 전자 우편 주소Abc.example.com (@ 문자 없음)A@b@c@example.com (인용 부호 밖에서는 오직 @만이 허용됨.)ab(c)d,e:f;g<h>i[j\\k]l@example.com (인용 부호 밖에서 로컬 부분에 특수 문자가 허용되지 않음)justnotright@example.comthis isnot\\allowed@example.comthis\\ still\\not\\\\allowed@example.com1234567890123456789012345678901234567890123456789012345678901234+x@example.com (너무 긺)john..doe@example.com (@ 이전의 점 두 개)john.doe@example..com (@ 뒤의 점 두 개)뒤에 공백이 있는 유효한 주소앞에 공백이 있는 유효한 주소표준 문서RFC 821 – Simple Mail Transfer Protocol (Obsoleted by RFC 2821)RFC 822 – Standard for the Format of ARPA Internet Text Messages (Obsoleted by RFC 2822) (Errata)RFC 1035 – Domain names, Implementation and specification (Errata)RFC 1123 – Requirements for Internet Hosts, Application and Support (Updated by RFC 2821, RFC 5321) (Errata)RFC 2142 – Mailbox Names for Common Services, Roles and Functions (Errata)RFC 2821 – Simple Mail Transfer Protocol (Obsoletes RFC 821, Updates RFC 1123, Obsoleted by RFC 5321) (Errata)RFC 2822 – Internet Message Format (Obsoletes RFC 822, Obsoleted by RFC 5322) (Errata)RFC 3696 – Application Techniques for Checking and Transformation of Names (Errata)RFC 4291 – IP Version 6 Addressing Architecture (Updated by RFC 5952) (Errata)RFC 5321 – Simple Mail Transfer Protocol (Obsoletes RFC 2821, Updates RFC 1123) (Errata)RFC 5322 – Internet Message Format (Obsoletes RFC 2822) (Errata)RFC 5952 – A Recommendation for IPv6 Address Text Representation (Updates RFC 4291) (Errata)RFC 6530 – Overview and Framework for Internationalized Email (Obsoletes RFC 4952, 5504, 5825)같이 보기이메일 클라이언트각주 ...you can add or remove the dots from a Gmail address without changing the actual destination address; and they'll all go to your inbox..., Google.com RFC 3696, section 2. Restrictions on domain (DNS) names분류: 전자 우편이 문서는 2022년 12월 23일 (금) 13:42에 마지막으로 편집되었습니다.모든 문서는 크리에이티브 커먼즈 저작자표시-동일조건변경허락 4.0에 따라 사용할 수 있으며, 추가적인 조건이 적용될 수 있습니다. 자세한 내용은 이용 약관을 참고하십시오.Wikipedia®는 미국 및 다른 국가에 등록되어 있는 Wikimedia Foundation, Inc. 소유의 등록 상표입니다.개인정보처리방침위키백과 소개면책 조항행동 강령개발자통계쿠키 정책모바일 보기Wikimedia FoundationPowered by MediaWiki";
		
		String regex = "(\\w+)@([a-zA-Z_]+?\\.[a-zA-Z]{2,3})";
		
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
		
		while(m1.find()) {
			System.out.println(m1.group());
			System.out.println("아이디: "+m1.group(1));
			System.out.println("도메인: " + m1.group(2));
		}
		
	}

	private static void m3() {
		
		//자바 + 정규식 지원 > 정규식 클래스 제공
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-7894-5612입니다. 연락주세요. 혹시 연락이 안되면 다른 번호 010-1234-4567로 연락주세요";
		
		//txt안에 전화번호가 포함되어 있는가?
		String regex = "([0-9]{3})-([0-9]{3,4})-([0-9]{4})";
		//String regex = "\\d{3}-\\d{3,4}-\\d{4}";
		
		//Pattern java.util.regex.Pattern.compile(String regex)
		//패턴 객체 == 정규표현식 객체
		Pattern p1 = Pattern.compile(regex);
		
		//검사 결과
		Matcher m1 = p1.matcher(txt);
		
		//System.out.println(m1.find()); //검색된 결과에 일치되는 항목이 있느냐? => true
		
//		if(m1.find()) {
//			System.out.println("txt내에서 전화번호 발견!!");
//			
//		}else {
//			System.out.println("txt내에서 전화번호 없음 ㅜㅜ");
//		}
		
		//find() 횟수 의미
//		System.out.println(m1.find()); //010-7894-5612
//		System.out.println(m1.find()); //010-1234-4567
//		System.out.println(m1.find()); //false
		
		
//		int count = 0;
//		
//		while(m1.find()) {
//			count++;
//		}
//		
//		System.out.printf("전화번호를 총 %d회 발견했습니다.\n", count);
//		
//	}
		while (m1.find()) {
			//찾은 전화번호 보여줌 //m1.group() == m1.group(0)
			System.out.println("[전화번호 발견]");
			System.out.println("전화번호 : " + m1.group(0)); 
			System.out.println("통신사 : " + m1.group(1)); //소괄호 첫번째
			System.out.println("앞자리 : " + m1.group(2));
			System.out.println("뒷자리 : " + m1.group(3));
			System.out.println();
		}
	}
		

	private static void m2() {
		
		String name = "홍길동,,아무개;강아지,고양이 멍멍이";
		

		//String[] java.lang.String.split(String regex)
		//Splits this string around matches of the given regular expression. 

		String[] list = name.split("[,;\\s]+");
		
		for(String item : list) {
			
			System.out.println(item);
			
//			if(item.contains(";")) {
//				String[] sublist = item.split(";");
//				System.out.println(Arrays.toString(sublist));
//			} else {
//				System.out.println(item);
//			}
			
		}
		
	}

	private static void m1() {
		
		//자바 > 여러 메서드의 인자값으로 정규 표현식을 지원한다.
		//게시판 > 글쓰기 > 개인정보 (전화번호) 마스킹
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-7894-5612 010.4567.8456입니다. 연락주세요. 혹시 연락이 안되면 다른 번호 010-1234-4567 01012344567로 연락주세요";
		
		System.out.println(txt.replaceAll("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "xxx-xxxx-xxxx")
								.replaceAll("[0-9]{3}.[0-9]{3,4}.[0-9]{4}", "xxx-xxxx-xxxx")
								.replaceAll("[0-9]{3}[0-9]{3,4}[0-9]{4}", "xxx-xxxx-xxxx"));
		
		System.out.println(txt.replaceFirst("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "xxx-xxxx-xxxx"));
				
		
	}

}
