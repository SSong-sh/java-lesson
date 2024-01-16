package com.test.question;


//클래스로부터 객체를 생성하지 않고, 클래스 이름을 통해 직접 접근
//클래스로 생성되는 모든 객체들이 동일한 값을 가지는 멤버 변수

public class Q_Coffee {
	
	
	
	private static int bean;
	private static int water;
	private static int ice;
	private static int milk;
	
	private static int beanUnitPrice;
	private static double waterUnitPrice;
	private static int iceUnitPrice;
	private static int milkUnitPrice;
	
	private static int beanTotalPrice;
	private static int waterTotalPrice;
	private static int iceTotalPrice;
	private static int milkTotalPrice;
	
	private static int americano;
	private static int latte;
	private static int espresso;

	
	//static block => 클래스 파일이 로딩되는 순간 가장 먼저 실행
	static {
		
		Q_Coffee.beanUnitPrice =1;
		Q_Coffee.waterUnitPrice = 0.2;
		Q_Coffee.iceUnitPrice = 3;
		Q_Coffee.milkUnitPrice =4;
		
		Q_Coffee.bean = 0;
		Q_Coffee.water = 0;
		Q_Coffee.ice = 0;
		Q_Coffee.milk = 0;
		
		Q_Coffee.beanTotalPrice = 0;
		Q_Coffee.waterTotalPrice = 0;
		Q_Coffee.iceTotalPrice = 0;
		Q_Coffee.milkTotalPrice = 0;
		
		Q_Coffee.americano =0;
		Q_Coffee.latte =0;
		Q_Coffee.espresso =0;
		
	}

	//static method 
	//객체를 생성하지 않고 접근이 가능
	//참조 변수를 통해서만 접근 할 수 있는 일반 멤버 변수는 static method에서 사용불가능
	public static int getBean() {
		return bean;
	}


	public static int getWater() {
		return water;
	}


	public static int getIce() {
		return ice;
	}


	public static int getMilk() {
		return milk;
	}

	
	

	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}


	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}


	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}


	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}

	
	
	

	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}


	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}


	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}


	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}

	
	

	public static int getAmericano() {
		return americano;
	}


	public static int getLatte() {
		return latte;
	}


	public static int getEspresso() {
		return espresso;
	}
	
	
	
	//에소프레소에서 사용한 원수를 전체 커피의 원두에 저장 (=>원자재 소비량에 쓰일 것)
	//+ 원두 총 가격 누적 (=> 매출액에 쓰일 것)
	//+ 에스프레소 잔 수 누적(=>음료 판매량에 쓰일것)
	public static void countCoffee(Q_Espresso espresso) {
		Q_Coffee.espresso++;
		Q_Coffee.bean+= espresso.getBean();
		Q_Coffee.beanTotalPrice += Q_Coffee.beanUnitPrice * espresso.getBean();
	}
	
	public static void countCoffee(Q_Latte latte) {
		Q_Coffee.latte++;
		Q_Coffee.bean+= latte.getBean();
		Q_Coffee.milk+= latte.getMilk();
		Q_Coffee.beanTotalPrice += Q_Coffee.beanUnitPrice * latte.getBean();
		Q_Coffee.milkTotalPrice += Q_Coffee.milkUnitPrice * latte.getMilk();
	}
	
	public static void countCoffee(Q_Americano americano) {
	
		Q_Coffee.americano++;
		Q_Coffee.bean+= americano.getBean();
		Q_Coffee.water+= americano.getwater();
		Q_Coffee.ice+= americano.getIce();
		Q_Coffee.beanTotalPrice += Q_Coffee.beanUnitPrice * americano.getBean();
		Q_Coffee.waterTotalPrice += Q_Coffee.waterUnitPrice * americano.getwater();
		Q_Coffee.iceTotalPrice += Q_Coffee.iceUnitPrice * americano.getIce();
	}
}
