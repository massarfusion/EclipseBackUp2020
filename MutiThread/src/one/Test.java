package one;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero green =new Hero("盖伦",660,50);
		Hero teemo =new Hero("提莫",300,30);
		Hero bh =new Hero("赏金猎人",500,65);
//		KillThread kh1=new KillThread(green,teemo);
////		KillThread kh2=new KillThread(green,bh);
//		KillThread kh3=new KillThread(teemo,green);
////		kh1.start();
//////		kh2.start();
////		kh3.start();
//		new Thread(kh1).start();
//		new Thread(kh3).start();
//		普通方案↑
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
//		匿名类↑
//		Thread t1=new Thread() {
//			public void run() {
//				while((!teemo.isDead())&&(!green.isDead())) {
//					green.AttackHero(teemo);
//				}
//				String corpse=teemo.isDead()?"teemo":"green";
//				System.out.println(corpse+" 已经阵亡！");
//			}
//		};
//		Thread t2=new Thread() {
//			public void run() {
//				while((!bh.isDead())&&(!green.isDead())) {
//					bh.AttackHero(green);
//				}
//				String corpse=bh.isDead()?"bh":"green";
//				System.out.println(corpse+" 已经阵亡！");
//			}
//		};
//		t1.start();
//		try{ t1.join();}
//		catch(InterruptedException e) {}
//		t2.start();
//		线程操作↑
//		Thread t1=new Thread() {
//		public void run() {
//			while((!teemo.isDead())&&(!green.isDead())) {
//				green.AttackHero(teemo);
//			}
//			String corpse=teemo.isDead()?"teemo":"green";
//			System.out.println(corpse+" 已经阵亡！");
//		}
//	};
//	Thread t2=new Thread() {
//		public void run() {
//			while((!bh.isDead())&&(!green.isDead())) {
//				bh.AttackHero(green);
//			}
//			String corpse=bh.isDead()?"bh":"green";
//			System.out.println(corpse+" 已经阵亡！");
//		}
//	};
//	t1.setPriority(Thread.MAX_PRIORITY);
//	t2.setPriority(Thread.MIN_PRIORITY);
//	t1.start();t2.start();
//		线程操作2↑
//	Thread t1=new Thread() {
//		public void run() {
//			while((!teemo.isDead())&&(!green.isDead())) {
//				green.AttackHero(teemo);
//			}
//			String corpse=teemo.isDead()?"teemo":"green";
//			System.out.println(corpse+" 已经阵亡！");
//		}
//	};
//	Thread t2=new Thread() {
//		public void run() {
//			while((!bh.isDead())&&(!green.isDead())) {
//				Thread.yield();
//				bh.AttackHero(green);
//			}
//			String corpse=bh.isDead()?"bh":"green";
//			System.out.println(corpse+" 已经阵亡！");
//		}
//	};
//	
//	t1.setPriority(5);
//	t2.setPriority(5);
//	t1.start();t2.start();
//	线程操作3↑
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
				System.out.println("已经运行"+sec+"秒");
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
		System.out.println(corpse+" 已经阵亡！");
	    }
    };
    Thread t2=new Thread() {
	public void run() {
		while((!bh.isDead())&&(!green.isDead())) {
			bh.AttackHero(green);
		}
		String corpse=bh.isDead()?"bh":"green";
		System.out.println(corpse+" 已经阵亡！");
	}
    };
    t1.start();t2.start();
    //	守护线程↑
	
	}//public static void main(String[] args)

}
