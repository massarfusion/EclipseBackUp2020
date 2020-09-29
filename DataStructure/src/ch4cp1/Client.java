package ch4cp1;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO 
		Scanner in =new Scanner(System.in);
		int lengtha=in.nextInt();
		int lengthb=in.nextInt();
		Tridlumn tr1=new Tridlumn(lengtha+lengthb);
//		Tridlumn tr2=new Tridlumn(lengthb);
		
		for (int i=0;i<lengtha+lengthb;i++) {
			
			tr1.addTrid(in.nextInt(), in.nextInt(), in.nextDouble());
			
		}
		
		tr1.printme();
//		for (int i=0;i<lengtha;i++) {
//			
//		}
//		

	}

}
