package com.test.question2;

public class EmployeeClass {
	/*
	 	요구사항
		직원(Employee) 클래스를 설계하시오.
		
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
	
	public static void main(String[] args) {
		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("부장");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); //직속 상사 없음

		e1.info();


		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); //직속 상사 e1(홍길동)

		e2.info();
	}
	
	 
}
class Employee {
	   private String name;
	   private String department;
	   private String position;
	   private String tel;
	   private Employee boss;

	   public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name.length() < 2 || name.length() > 5) {
			return;
		}
		for(int i =0; i< name.length(); i++) {
			char c = name.charAt(i);
			if(c <'가'|| c >'힣') {
				return;
			}
				
		}
		this.name = name;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		
		if(!department.equals("영업부") && !department.equals("기획부") && !department.equals("총무부") && !department.equals("개발부") &&!department.equals("홍보부") ) {
			return;
		}
		
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		
		if(!position.equals("부장") && !position.equals("과장") && !department.equals("총무부") && !position.equals("대리") &&!position.equals("사원") ) {
			return;
		}
	
		this.position = position;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		
		if(tel.indexOf("-") !=3 || tel.lastIndexOf("-") != tel.length() - 5) {
			
			return;
		}
		
		String temp = tel.replace("-", "");
		
		for (int i=0; i<temp.length(); i++) {
			char c = temp.charAt(i);
			
			if( c < '0' || c > '9') {
				return;
			}
		}
		
		this.tel = tel;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		
		if(boss == null ) {
			return;
		}
		
		//예를 들어 사원 홍길동이랑 대표랑 이름이 같으면서 부서까지 같으면 안됨 -> 다른 직원 중 한명이어야 하니까
		if(this.name.equals(boss.getName()) && this.department.equals(boss.getDepartment())) {
			return;
		}
		
		//근데 홍길동이 홍보부인데, 보스가 홍보부가 아니면 안됨 
		if(!this.department.equals(boss.getDepartment())) {
			return;
		}
		
		this.boss = boss;
	}


	   //getter, setter 구현

	   public void info() {
		   
		   System.out.printf("[%s]\n",this.name);
		   System.out.printf("-부서: %s\n", this.department);
		   System.out.printf("-직위: %s\n", this.position);
		   System.out.printf("-연락처: %s\n" ,this.tel);
		   
		   if (this.boss != null) {
			   System.out.printf("- 직속상사: %s(%s %s)",this.name, this.boss.getName(), this.boss.getPosition());
		   }else {
			   System.out.println("-직속상사: 없음");
		   }
		   

	   }
	   
	   

}