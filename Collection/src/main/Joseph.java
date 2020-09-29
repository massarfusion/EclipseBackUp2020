package main;

import java.util.Scanner;

public class Joseph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleLink cl=new CircleLink();
		Scanner in = new Scanner(System.in);
		int outSignal=in.nextInt();
		int total=in.nextInt();
		for (int i=0;i<total;i++) {
			
			cl.add(in.nextInt());
			
		}
		
		cl.delete(outSignal%total);
		
		
		
		
	}

}
