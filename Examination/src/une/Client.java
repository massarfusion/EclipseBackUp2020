package une;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		SingleLink sl=new SingleLink();
		System.out.println("�������֣�");
		int total=in.nextInt();
		System.out.println("��ʼ����,�س��ֿ�");
		for (int i=0;i<total;i++) {
			
			sl.addNodeInt(in.nextInt());
		}
		System.out.println("Ҫ����ģ�");
		int rcv=in.nextInt();
		sl.printme();
		System.out.println();
		sl.addToMax(rcv);
		sl.printme();
	}

}
