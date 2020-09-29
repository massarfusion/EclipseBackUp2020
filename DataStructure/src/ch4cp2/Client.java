package ch4cp2;

import java.util.Scanner;


public class Client {

	public static void main(String[] args) {
		// TODO 
		Scanner in =new Scanner (System.in);
		String raw=in.nextLine();
		String [] rawCase=raw.split(" ");
		int size=rawCase.length;
		int[] seq=new int [size];
		for (int i=0;i<size;i++)
		{
			
			seq[i]=Integer.parseInt(rawCase[i]);
			
		}
		
		int main=seq[0];
		int count=0;
		int lengther=seq.length;
		for (int index=1;index<seq.length;index++) {
			
			if (main==seq[index]) {
				count++;
				continue;
			}
			else {
				if (count>0) {
					
					count--;
				}
				else {
					main=seq[index];
				}
				
				
				
			}
			
			
		}
		int acc=0;
		for (int tmp:seq) {
			
			if (tmp==main) {acc++;}
			else {;}
		}
		if (acc>seq.length/2) {System.out.println(main);}
		else {
			System.out.println(-1);
		}
}
}