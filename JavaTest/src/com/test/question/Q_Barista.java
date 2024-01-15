package com.test.question;

public class Q_Barista {
	

	public Q_Espresso makeEspresso(int bean) {
		
		Q_Espresso espresso = new Q_Espresso(bean);
		Q_Coffee.countCoffee(espresso);
		
		return espresso;
	}
	
	public Q_Latte makeLatte(int bean, int milk) {
		
		Q_Latte latte = new Q_Latte(bean, milk);
		Q_Coffee.countCoffee(latte);;
		
		return latte;
	}
	
	public Q_Americano makeAmericano(int bean, int water, int ice) {
		
		Q_Americano americano = new Q_Americano(bean, water, ice);
		Q_Coffee.countCoffee(americano);;
		
		return americano;
	}
	
	public Q_Espresso[] makeEspressoes(int bean,int count) {
		
		Q_Espresso[] espressoes = new Q_Espresso[count];
		for(int i =0; i< espressoes.length;i++) {
			Q_Espresso espresso = new Q_Espresso(bean);
			Q_Coffee.countCoffee(espresso);
			espressoes[i]=espresso;
		}
		
		return espressoes;
	}
	
	public Q_Latte[] makeLattes(int bean,int milk,int count) {
		
		Q_Latte[] Lattes = new Q_Latte[count];
		for(int i =0; i< Lattes.length;i++) {
			Q_Latte latte = new Q_Latte(bean,milk);
			Q_Coffee.countCoffee(latte);
			Lattes[i]=latte;
		}
		
		return Lattes;
	}
	
	public Q_Americano[] makeAmericanos(int bean,int water,int ice,int count) {
		
		Q_Americano[] americanos = new Q_Americano[count];
		for(int i =0; i< americanos.length;i++) {
			Q_Americano americano = new Q_Americano(bean,water,ice);
			Q_Coffee.countCoffee(americano);
			americanos[i]=americano;
		}
		
		return americanos;
	}
	
	public void result() {
		System.out.println("==========================================");
		System.out.println("판매결과");
		System.out.println("==========================================");
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("음료 판매량");
		System.out.println("-------------------------------------------");
		System.out.printf("에스프레소 : %d잔\n",Q_Coffee.getEspresso());
		System.out.printf("아메리카노 : %d잔\n",Q_Coffee.getAmericano());
		System.out.printf("라떼 : %d잔\n",Q_Coffee.getLatte());
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("-------------------------------------------");
		System.out.printf("원두 : %,dg\n",Q_Coffee.getBean());
		System.out.printf("물 : %,dml\n",Q_Coffee.getWater());
		System.out.printf("얼음 : %,d개\n",Q_Coffee.getIce());
		System.out.printf("우유 : %,dml\n",Q_Coffee.getMilk());
		System.out.println("-------------------------------------------");
		System.out.println("매출액");
		System.out.println("-------------------------------------------");
		System.out.printf("원두 : %,d원\n",Q_Coffee.getBeanTotalPrice());
		System.out.printf("물 : %,d원\n",Q_Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원\n",Q_Coffee.getIceTotalPrice());
		System.out.printf("우유 : %,d원\n",Q_Coffee.getMilkTotalPrice());
	}
	
	

}
