package ch3cp3;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		SingleLink sg1=new SingleLink();
		String raw=in.nextLine();
		String [] rawCase=raw.split(" ");
		int size=rawCase.length;
		int[] seq=new int [size];
		for (int i=0;i<size;i++)
		{
			
			seq[i]=Integer.parseInt(rawCase[i]);
			
		}
		for (int i=0;i<seq.length;i+=2) {
			int num=seq[i];
			int score=seq[i+1];
			
			sg1.addNode(new Node(num,score));
			
		}
		
		sg1.printme();
		
	}

}
