package main;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		System.out.println("Enter Your Two Paras,Divided With Blank");
		int outSig=in.nextInt();
		int max=in.nextInt();
		CircleLink cl=new CircleLink();
		for  (int i=1;i<=max;i++) {
			
			cl.add(i);
			
		}
		cl.joseph(outSig);
	}

}
