package une;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		SingleLink sl=new SingleLink();
		System.out.println("几个数字？");
		int total=in.nextInt();
		System.out.println("开始输入,回车分开");
		for (int i=0;i<total;i++) {
			
			sl.addNodeInt(in.nextInt());
		}
		System.out.println("要插入的？");
		int rcv=in.nextInt();
		sl.printme();
		System.out.println();
		sl.addToMax(rcv);
		sl.printme();
	}

}
