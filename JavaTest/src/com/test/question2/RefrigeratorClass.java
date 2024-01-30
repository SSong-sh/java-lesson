package com.test.question2;

import java.util.ArrayList;

import com.test.question.Q_Refrigerator;
import com.test.question.Q_item;

public class RefrigeratorClass {
	
	/*
	 	조건..
		Refrigerator 객체의 정보
		Item을 최대 100개까지 담을 수 있다.(멤버 변수 = Item 배열)
		Refrigerator 객체의 사용
		Item을 냉장고에 넣는다. void add(Item item);
		Item을 냉장고에서 꺼낸다. Item get(String name);
		냉장고에 있는 Item의 개수를 확인한다. int count();
		냉장고에 있는 Item을 확인한다. void listItem();
		Item 객체의 정보
		식품명, 유통기한
	 
	 */
	
	public static void main(String[] args) {
		 
		
		//m1();//클래스로 풀어봄
		m2(); //ArrayList
	}

	private static void m2() {
		
		ArrayList<item2> list = new ArrayList<item2>();
		
		list.add(new item2("김치","2024-01-30"));
		list.add(new item2("사과","2024-01-30"));
		list.add(new item2("포도","2024-01-30"));
		
		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", list.size());
		
		for(item2 item2 : list) {
			System.out.println(item2);
		}
		
	}

	private static void m1() {
		Refrigerator r = new Refrigerator();

		item item1 = new item();
		item1.setName("김치");
		item1.setExpiration("2024-01-30");
		r.add(item1);//냉장고에 넣기

		item item2 = new item();
		item2.setName("깍두기");
		item2.setExpiration("2024-01-23");
		r.add(item2);//냉장고에 넣기

		item item3 = new item();
		item3.setName("멸치볶음");
		item3.setExpiration("2024-01-25");
		r.add(item3);//냉장고에 넣기
		
		System.out.println();

		item item4 = r.get("깍두기");//냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.println();
		
		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();
	}

}

class Refrigerator {
	
	//item 100개만 넣을 수 있음.
	private item[] list = new item[100];
	private int index = 0;
	
	public void add(item item) {
		this.list[index] = item;
		index++;
		
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
		
		
	}
	
	public item get(String name) {
		
		item item = null;
		int itemindex = -1;
		
		for (int i=0; i<index;i++) {
			if(this.list[i].getName().equals(name)) {
				
				item = this.list[i];
				itemindex = i ;
				break;
			}
		}
		
		if(item != null) {
			for(int i=itemindex; i<index-1; i++) {
				this.list[i]=this.list[i+1];
			}
			index--;
			
		}
		
		
		return item;
	}
	
	public int count(){
		
		return this.index;
	}
	
	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		
		for(int i=0; i<index; i++) {
			item item = this.list[i];
			System.out.printf("%s(%s)\n", item.getName(), item.getExpiration());
		}
	}
	
	
}

class item{
	
	private String name;
	private String expiration;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
}

class item2 {
	
	private String name;
	private String expiration;
	
	public item2(String name, String expiration) {
		this.name = name;
		this.expiration = expiration;
	}

	@Override
	public String toString() {
		return String.format("%s(%s)", name, expiration);
	}
	
	
	
}
