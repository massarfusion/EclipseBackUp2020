package deus;

import java.util.Arrays;
import java.util.Scanner;





public class Client {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����м�������");
		int total=in.nextInt();
		BinTree bt=new BinTree();
		System.out.println("�������֣�����س�");
		for (int i=0;i<total;i++) {
			bt.add(in.nextInt());
		}
		
		bt.print();
		
		
		
	}
	
	
	
	
}
