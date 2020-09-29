package ch3cp2;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLink sg1=new SingleLink();
		Scanner in =new Scanner (System.in);
		String raw=in.nextLine();
		String [] rawCase=raw.split(" ");
		int size=rawCase.length;
		int[] seq=new int [size];
		for (int i=0;i<size;i++)
		{
			
			seq[i]=Integer.parseInt(rawCase[i]);
			
		}
		
		for (int i=0;i<seq.length;i++) {
			
			
			sg1.addNode(new Node(seq[i]));
			
			
		}
		int index=seq[0];
		sg1.deleteNode(sg1.length()-index+1);
		
		
		
		
		
	}

}
