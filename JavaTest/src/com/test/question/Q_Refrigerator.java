package com.test.question;

import org.w3c.dom.ls.LSOutput;

public class Q_Refrigerator {


		private Q_item[] list = new Q_item[100];
		private int index =0;

		//아이템 냉장고에 넣기
		public void add(Q_item item) {
			
			this.list[index] = item;
			this.index++;
			
			System.out.printf("'%s'를 냉장고에 넣었습니다.\n",item.getName());
			
			
		}
		
	

		//아이템 냉장고에서 빼고 배열에서 제거
		public Q_item get(String name) {
			
			Q_item item = null;
			int itemindex =-1;
			
			for(int i=0;i<index;i++) {
				if(this.list[i].getName().equals(name)) {
					
					item = this.list[i];
					itemindex = i; //찾은 아이템의 인덱스를 저장
					break;
				}
			}
			
			//아이템을 찾았을 경우
			if(item !=null) {
				for(int i=itemindex; i<index-1;i++) {
					this.list[i]= this.list[i+1]; //뒤쪽 배열 값을 앞으로 이동
				}
				index--; //배열 크기를 줄임
			}
			
			return item;
		}
		
		
		//아이템 개수 확인
		public int count() {
			
			return this.index;
		}
		
		//아이템 확인
		public void listItem() {
			System.out.println("[냉장고 아이템 목록]");
			
			for(int i=0;i<index;i++) {
				
				Q_item item =this.list[i];
				System.out.printf("%s(%s)\n",item.getName(), item.getExpiration());
			}
		}
	}



