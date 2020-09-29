package chapter_three;

import java.util.Scanner;

public class Work07 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int step=in.nextInt();
		int number=in.nextInt();
		int [] one =new int [number+1];
		int [] two=new int [number+1];
		int [][] tarone=new int[step+1][step+1];
		int [][] tartwo=new int[step+1][step+1];
		int [][] receive=new int[step+1][step+1];
		for (int i=1;i<=number;i++)
		{
			one [i]=in.nextInt();
		}
		for (int i=1;i<=number;i++)
		{
			two [i]=in.nextInt();
		}
		int index=1;
		for (int i=1;i<=step;i++)
		{
			for (int j=1;j<=i;j++)
			{
				
				tarone [i][j]=one[index];
				tarone[j][i]=tarone[i][j];
				
				tartwo[i][j]=two[index];
				tartwo[j][i]=tartwo[i][j];
				
				index++;
			}
			
		}
		
//		for (int i=1;i<=step;i++)
//		{
//			for (int j=1;j<=step;j++)
//			{
//				
//				System.out.print(tartwo[i][j]+" ");
//				
//			}
//			System.out.println();
//		}

		for (int i=1;i<=step;i++) {
			for (int j=1;j<=step;j++)
			{
				for (int k=1;k<=step;k++)
				{
					receive[i][j]+=(tarone[i][k]*tartwo[k][j]);
					
					
				}
				
			}
		}
		for (int i=1;i<=step;i++)
		{
			for (int j=1;j<=step;j++)
			{
				
				System.out.print(receive[i][j]+" ");
				
			}
			System.out.println();
		}
	
	
	}

}
