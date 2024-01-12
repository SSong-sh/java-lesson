package com.test.java.obj.inheritance;

public class Ex41_Overriding {
	
	public static void main(String[] args) {
		
		/*
		 
		 //이 두개를 물어보는 면접 질문이 다수 (공통점과 차이점 x - 각각 별개)
		  
		 메서드 오버로딩, Method Overloading
		 - 메서드 이름을 동일 x N 생성
		 
		 메서드 오버라이딩, Method Overring
		 - 클래스 상속할 때 발생
		 - 메서드 재정의 > 상속받은 메서드를 수정하는 기술
		 - 개발자에게 도움 > 또 다른 메서드 이름을 외울 필요가 없음 
		 */
		
		overridingParent hong = new overridingParent();
		
		hong.name = "홍길동";
		hong.hello();
		
		
		
		overridingChild jhong = new overridingChild();
		
		jhong.name ="홍철수";
		//hong.hello();
		//jhong.hi();
		jhong.hello();
		
		
		//overridingParent.hello() -> 길동이꺼
		//overridingChild.hello() -> 철수꺼
	}//main

}//Ex41


//동네 사람
class overridingParent {
	
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
	}
	
}
class overridingChild extends overridingParent {
	
//	public void hi() {
//		System.out.printf("하이~ 방가~ 난 %s야\n", this.name);
//	}
	
	//오버로딩도 아닌데 왜 에러 안남? -> 자식 메서드가 이김 -> 외부에는 자식 메서드 노출 ! 부모 메서드는 볼 수 없음 
	//메서드를 고친게 아님 => 메서드를 재정의 한 것 = 오버라이딩
	
	public void hello() {
		System.out.printf("하이~ 방가~ 난 %s야\n", this.name);
	}
}
