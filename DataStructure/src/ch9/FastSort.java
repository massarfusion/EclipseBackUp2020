package ch9;

import java.util.Arrays;
import java.util.Scanner;

public class FastSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		int total=in.nextInt();
		int [] target=new int [total+1];
		//STart from 1 not 0;
		for (int i=1;i<=total;i++) {
			
			target[i]=in.nextInt();
			
		}
		int pivot=target[1];
		target[0]=114514;
		int front=1;int rear=total;
		while (front!=rear) {
			while (target[rear]>=pivot&&front!=rear) {
				rear--;
			}
			while (target[front]<=pivot&&front!=rear) {
				front++;
			}
			int temp=target[rear];
			target[rear]=target[front];
			target[front]=temp;
			
			
		}
		
		target[1]=target[rear];
		target[rear]=pivot;
		
		for (int i=1;i<=total;i++)
		{
			if (target[i]==pivot) {
				System.out.print(i+" ");
				
			}
			else {;}
		}
		
		Arrays.sort(target);
		for (int i=0;i<=total&&target[i]!=114514;i++)
		{
			System.out.print(target[i]+" ");
		}
		
		
		
		
	}

}
