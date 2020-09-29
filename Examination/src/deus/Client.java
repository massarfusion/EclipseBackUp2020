package deus;

import java.util.Arrays;
import java.util.Scanner;





public class Client {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入有几个数字");
		int total=in.nextInt();
		BinTree bt=new BinTree();
		System.out.println("输入数字，输完回车");
		for (int i=0;i<total;i++) {
			bt.add(in.nextInt());
		}
		
		bt.print();
		
		
		
	}
	
	
	
	
}
