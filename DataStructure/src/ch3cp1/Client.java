package ch3cp1;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		String raw=in.nextLine();
		String [] rawCase=raw.split(" ");
		int size=rawCase.length;
		int[] seq=new int [size];
		for (int i=0;i<size;i++)
		{
			
			seq[i]=Integer.parseInt(rawCase[i]);
			
		}
		
		int maxInt=seq[0];
		for (int i:seq) {
			if (i<=maxInt) {
				;
			}
			else {
				
				maxInt=i;
			}
			
			
		}
		//////////to the first
		
		
		CircleLink cl1=new CircleLink();
		for (int i=0;i<size;i++) {
			
			cl1.add(seq[i]);
			
			
		}
		
		cl1.toTail(maxInt);
		cl1.printme();
		
		
		
		
		
		
	}

}
