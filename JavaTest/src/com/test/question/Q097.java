package com.test.question;

public class Q097 {
	
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
		
		Q_Refrigerator r = new Q_Refrigerator();

		Q_item item1 = new Q_item();
		item1.setName("김치");
		item1.setExpiration("2024-01-30");
		r.add(item1);//냉장고에 넣기

		Q_item item2 = new Q_item();
		item2.setName("깍두기");
		item2.setExpiration("2024-01-23");
		r.add(item2);//냉장고에 넣기

		Q_item item3 = new Q_item();
		item3.setName("멸치볶음");
		item3.setExpiration("2024-01-25");
		r.add(item3);//냉장고에 넣기
		
		System.out.println();

		Q_item item4 = r.get("깍두기");//냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.println();
		
		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();
		
	}
	
	
	
	

}
