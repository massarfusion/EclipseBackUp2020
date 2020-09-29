package cp2pg2;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int length=in.nextInt();
		Queue<Integer> tar=new Queue<Integer>(length+1);
		Stack<Integer> outprint= new Stack <Integer>(length);
		for (int i=0;i<length;i++) {
			
			tar.enQueue(in.nextInt());
			
		}
		while(tar.isEmpty()!=true) {
			
			outprint.push(tar.deQueue());
			
			
		}
		
		while (outprint.isEmpty()!=true)
		{
			
			System.out.print((outprint.pop()).toString()+" ");
			
		}
		
		
		
	}

}
