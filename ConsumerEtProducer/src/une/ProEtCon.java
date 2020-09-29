package une;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProEtCon {
	public BlockingQueue<Object> storage=new LinkedBlockingQueue<Object>(5);
	private final int max=10;
	public void initiate() {
		Producer p1=new Producer();
		Producer p2=new Producer();
		Producer p3=new Producer();
		Consumer c1=new Consumer();
		Consumer c2=new Consumer();
		p1.setNom("p1");
		p2.setNom("p2");
		p3.setNom("p3");
		c1.setNom("c1");
		c2.setNom("c2");
		p1.start();p2.start();p3.start();c1.start();c2.start();
		
	}
	class Consumer extends Thread
	{
		String nom;
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		///////////////////////
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {this.consumer();}
		}
		////////////////////
		public void consumer() {
			try {
                storage.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者"+this.nom+"消费一次，仓库含有" + storage.size());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
		////////////////////
	}
	class Producer extends Thread
	{
		String nom;
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {this.producer();}
		}
		public void producer() {
			try {
                Object obj=new Object();
				storage.put(obj);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产者"+this.nom+"生产一次，仓库含有" + storage.size());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}

