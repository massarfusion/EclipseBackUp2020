package one;

public class KillThread implements Runnable {
	Hero h1;
	Hero h2;
	public KillThread(Hero h1, Hero h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	public void run() {
		while ((!h2.isDead())&&(!h1.isDead())) {
			h1.AttackHero(h2);
		}
	}
}
