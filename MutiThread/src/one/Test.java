package one;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero green =new Hero("����",660,50);
		Hero teemo =new Hero("��Ī",300,30);
		Hero bh =new Hero("�ͽ�����",500,65);
//		KillThread kh1=new KillThread(green,teemo);
////		KillThread kh2=new KillThread(green,bh);
//		KillThread kh3=new KillThread(teemo,green);
////		kh1.start();
//////		kh2.start();
////		kh3.start();
//		new Thread(kh1).start();
//		new Thread(kh3).start();
//		��ͨ������
//		Thread t1=new Thread() {
//			public void run() {
//				while(!teemo.isDead()) {
//					green.AttackHero(teemo);
//				}
//			}
//		};
//		Thread t2=new Thread() {
//			public void run() {
//				while(!green.isDead()) {
//					teemo.AttackHero(green);
//				}
//			}
//		};
//		t1.start();
//		t2.start();
//		�������
//		Thread t1=new Thread() {
//			public void run() {
//				while((!teemo.isDead())&&(!green.isDead())) {
//					green.AttackHero(teemo);
//				}
//				String corpse=teemo.isDead()?"teemo":"green";
//				System.out.println(corpse+" �Ѿ�������");
//			}
//		};
//		Thread t2=new Thread() {
//			public void run() {
//				while((!bh.isDead())&&(!green.isDead())) {
//					bh.AttackHero(green);
//				}
//				String corpse=bh.isDead()?"bh":"green";
//				System.out.println(corpse+" �Ѿ�������");
//			}
//		};
//		t1.start();
//		try{ t1.join();}
//		catch(InterruptedException e) {}
//		t2.start();
//		�̲߳�����
//		Thread t1=new Thread() {
//		public void run() {
//			while((!teemo.isDead())&&(!green.isDead())) {
//				green.AttackHero(teemo);
//			}
//			String corpse=teemo.isDead()?"teemo":"green";
//			System.out.println(corpse+" �Ѿ�������");
//		}
//	};
//	Thread t2=new Thread() {
//		public void run() {
//			while((!bh.isDead())&&(!green.isDead())) {
//				bh.AttackHero(green);
//			}
//			String corpse=bh.isDead()?"bh":"green";
//			System.out.println(corpse+" �Ѿ�������");
//		}
//	};
//	t1.setPriority(Thread.MAX_PRIORITY);
//	t2.setPriority(Thread.MIN_PRIORITY);
//	t1.start();t2.start();
//		�̲߳���2��
//	Thread t1=new Thread() {
//		public void run() {
//			while((!teemo.isDead())&&(!green.isDead())) {
//				green.AttackHero(teemo);
//			}
//			String corpse=teemo.isDead()?"teemo":"green";
//			System.out.println(corpse+" �Ѿ�������");
//		}
//	};
//	Thread t2=new Thread() {
//		public void run() {
//			while((!bh.isDead())&&(!green.isDead())) {
//				Thread.yield();
//				bh.AttackHero(green);
//			}
//			String corpse=bh.isDead()?"bh":"green";
//			System.out.println(corpse+" �Ѿ�������");
//		}
//	};
//	
//	t1.setPriority(5);
//	t2.setPriority(5);
//	t1.start();t2.start();
//	�̲߳���3��
	Thread td=new Thread() {
		public void run() {
			int sec=0;
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sec++;
				System.out.println("�Ѿ�����"+sec+"��");
			}
		}
	};
	td.setDaemon(true);
	td.start();
	Thread t1=new Thread() {
	public void run() {
		while((!teemo.isDead())&&(!green.isDead())) {
			green.AttackHero(teemo);
		}
		String corpse=teemo.isDead()?"teemo":"green";
		System.out.println(corpse+" �Ѿ�������");
	    }
    };
    Thread t2=new Thread() {
	public void run() {
		while((!bh.isDead())&&(!green.isDead())) {
			bh.AttackHero(green);
		}
		String corpse=bh.isDead()?"bh":"green";
		System.out.println(corpse+" �Ѿ�������");
	}
    };
    t1.start();t2.start();
    //	�ػ��̡߳�
	
	}//public static void main(String[] args)

}