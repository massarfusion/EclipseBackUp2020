package one;
import java.io.Serializable;
public class Hero {
	String name;
	int hitPoint;
	int damage;
	private byte[] lock = new byte[0];
	public Hero(String name, int hitPoint, int damage) {
		super();
		this.name = name;
		this.hitPoint = hitPoint;
		this.damage = damage;
	}
	public void AttackHero(Hero target) {
		try{Thread.sleep(1000);}
		catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//		���ȼ��Ѿ�ȥ��
		if (target.isDead()) {System.out.println(target.name +"���ˣ�"); return;}
		else if (this.isDead()) {System.out.println(this.name +"���ˣ�"); return;}
		else {;}
		target.hitPoint-=this.damage;
		System.out.format("%s ���ڹ��� %s ǰ��Ѫ����%d ����Ѫ����%d \n",this.name,target.name,this.hitPoint,target.hitPoint);
	}
	public boolean isDead() {
		if (this.hitPoint<=0) {return true;}
		else {return false;}
	}
	public void recover() {
		// TODO Auto-generated method stub
		synchronized(lock) {
		this.hitPoint++;}
	}
	public void loseHP() {
		// TODO Auto-generated method stub
		synchronized(lock){
		this.hitPoint--;}
	}
}