package com.test.java.obj.inheritance;

import java.util.Scanner;

import com.test.java.test;

public class Ex40_object {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 object 클래스
		 - 개발자가 선언한 모든 클래스는 자동으로 object 클래스를 상속받는다.
		 - 모든 클래스의 근원 클래스 > 유일무일한 클래스 
		 - 루트 클래스 (Root Class)
		 - object 클래스는 멤버를 9개를 구현 > 상속에 의해서 모든 클래스에게 물려진다.
		 	> 모든 클래스는 9개의 메서드를 가지고 있다. > 공통 기능 
		 	
		 - Class Object is the root of the class hierarchy.
		 - Every class has Object as a superclass. 
		 - All objects,including arrays, implement the methods of this class.
		 	
		 	
		 */
		
		Object o1 = new Object();
		
		Test t1 = new Test();
		
		Scanner scan = new Scanner(System.in);
		
		//배열도 상속됨
		int[] nums = new int[3];
		
		
		
		
		
		
		
	}//main
	
}//Ex40


//명시적으로 상속하지 않았으면 컴파일러가 extends object를 써줌 -> object가 부모가 됨
class Test {
	
	public int a;
	public int b;
	
}
