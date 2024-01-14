package com.test.question;

import javax.swing.DefaultBoundedRangeModel;

public class Q_Employee {
		
		
		
			/*
			 
			 조건..
			Employee 객체의 정보
			이름, 부서, 직책, 연락처, 직속상사
			모든 멤버 변수의 접근 지정자는 private으로 한다.
			멤버 접근을 위한 Setter와 Getter를 정의한다.
			이름 : 읽기/쓰기, 한글 2~5자 이내
			부서 : 읽기/쓰기, 영업부, 기획부, 총무부, 개발부, 홍보부
			직잭 : 읽기/쓰기, 부장, 과장, 대리, 사원
			연락처 : 읽기/쓰기, 010-XXXX-XXXX 형식 확인
			직속상사 : 읽기/쓰기, 다른 직원 중 한명, 같은 부서가 아니면 될 수 없음(유효성 검사)
			Employee 객체 메소드
			void info() : 직원 정보 확인
			
			
			 */
		
		
		   private String name;
		   private String department;
		   private String position;
		   private String tel;
		   private Q_Employee boss;

		   //getter, setter 구현

		   public String getName() {
			return name;
		}

		public void setName(String name) {
			if (name.length() > 2 && name.length() < 5) {
				for (int i = 0; i < name.length(); i++) {
					char c = name.charAt(i);
					if (c < '가' || c > '힐') {
						return;
					}
				}
				this.name = name; 
			}
		}


		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			if(!department.equals("영업부")&&!(department.equals("기획부"))
					&&(!department.equals("총무부"))&&!department.equals("개발부")
					&&!(department.equals("홍보부"))) {
				return;
			}
			this.department=department; 
			
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			if(!position.equals("부장")&&!(position.equals("과장"))
					&&(!position.equals("대리"))&&!position.equals("사원")) {
				return;
			}
			this.position=position; 
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			//첫번쨰 -이 3번째가 아니거나 마지막 인덱스 -기 6반째에 있지 않은 경우
			if(tel.indexOf("-") !=3 || tel.lastIndexOf("-")!=tel.length()-5) {
				return;
			}
			
			String number=tel.replace("-","");
			for(int i=0;i<number.length();i++) {
				char c =number.charAt(i);
				if(c<'0'|| c>'9') {
					return;
				}
			}
			this.tel =tel;
		}

		public Q_Employee getBoss() {
			return boss;
		}
		
		
		//같은 부서가 아니면 안됨
		public void setBoss(Q_Employee boss) {
			//boss가 없으면 반환
			if(boss==null) {
				return;
			}
			//
			//상사는 선택된 직원이 다른 직원 중 하나여야 함
			if(this.name.equals(boss.getName())&&this.department.equals(boss.getDepartment())
					&&this.position.equals(boss.getPosition()) &&this.tel.equals(boss.getTel())){
				return;
			}
			//선택한 직원과 동일한 부서에 속해있으면 안됨
			if(!this.department.equals(boss.getDepartment())) {
				return;
			}
			this.boss=boss;
		}

		public void info() {
			System.out.printf("[%s]\n",this.name);
			System.out.printf("-부서: %s\n",this.department);
			System.out.printf("-직위: %s\n",this.position);
			System.out.printf("-연락처: %s\n",this.tel);
			
			if(this.boss != null) {
				System.out.printf("-직속상사: %s(%s %s)\n",this.boss.getName(),this.boss.getDepartment(),this.boss.getPosition());
			}else {
				System.out.printf("-직속상사: 없음\n");
			}

		   }
		


		
}
