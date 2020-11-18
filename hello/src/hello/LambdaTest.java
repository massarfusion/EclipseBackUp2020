package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Hero{
	int hp;
	String name;
	int damage;
	public Hero(int hp, String name, int damage) {
		super();
		this.hp = hp;
		this.name = name;
		this.damage = damage;
	}
	@Override
	public String toString() {
		return "Hero [hp=" + hp + ", name=" + name + ", damage=" + damage + "]";
	}
	
}

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random a=new Random();
		List<Hero> heros = new ArrayList<Hero>();
		for (int i=0;i<5;i++) {
			heros.add(new Hero(a.nextInt(),"HeroNum."+i,a.nextInt()));
		}
		HeroChecker hkc=new HeroChecker() {
			public boolean test(Hero h) {
				return h.hp>100&&h.damage<50;
			}
		};
		System.out.println("lambda����ֱ�ӵ���");
		filter(heros, h->h.hp>100 && h.damage<50);
		System.out.println("������������");
		filter(heros,hkc);
		System.out.println("���þ�̬��������");
		filter(heros,LambdaTest::testHero);
		System.out.println("lambda����ʹ�þ�̬����");
		filter(heros,h->LambdaTest.testHero(h));
		
		
	}
	
	 public static boolean testHero(Hero h) {
	        return h.hp>100 && h.damage<50;
	 }
	
	public static void filter(List<Hero> ls, HeroChecker hc) {
		for (Hero hero : ls) {
            if (hc.test(hero))
                System.out.print(hero.toString());
        }
	}

}
