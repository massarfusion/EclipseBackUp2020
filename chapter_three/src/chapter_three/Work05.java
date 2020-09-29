package chapter_three;

import java.util.Arrays;
import java.util.Scanner;

public class Work05 {
//	public static void maxtrim(int [] sequence)
//	{
//		int max=sequence[0];
//		int index=0;
//		for (int i=1;i<sequence.length;i++)
//		{
//			
//			if (sequence[i]>max)
//			{
//				max=sequence[i];
//				index=i;
//			}
//			else 
//				;
//			
//		}
//		sequence[index]=0;
//		
//	}
//
//	public static void mintrim(int [] sequence)
//	{
//		int min=sequence[0];
//		int index=0;
//		for (int i=1;i<sequence.length;i++)
//		{
//			
//			if (sequence[i]<min)
//			{
//				min=sequence[i];
//				index=i;
//			}
//			else 
//				;
//			
//		}
//		sequence[index]=0;
//		
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int numberOfReferees=in.nextInt();
		int [] target=new int [numberOfReferees];
		for(int i=0;i<target.length;i++)
		{
			
			target[i]=in.nextInt();
			
			
			
		}
		Arrays.sort(target);
		target[0]=0;
		target[1]=0;
		target[numberOfReferees-1]=0;
		target[numberOfReferees-2]=0;
		double total=0;
		for (int i=0;i<numberOfReferees;i++)
		{
			
			total+=target[i];
		}
		System.out.printf("%.2f",(total/(numberOfReferees-4)));
				
		
	}

//	private static void average(int[] target) {
//		// TODO Auto-generated method stub
//		double total=0;
//		int count=0;
//		for (int i:target)
//		{
//			if (i!=0)
//			{
//				count ++;
//				total+=i;
//				
//			}
//			else if (total==0)
//			{
//				;
//			}
//			else 
//				;
//			
//		}
//		System.out.println((total/count));	
//		
		
	}


