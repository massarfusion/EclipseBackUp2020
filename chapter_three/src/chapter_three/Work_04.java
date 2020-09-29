package chapter_three;

import java.util.Scanner;

public class Work_04 {
	
	public static void detect(int [][] target,int row ,int column)
	{
		int compare=target[row][column];
		int minrow=target[row][column];
		int mincolumn=target[row][column];
		for (int i=0;i<target.length;i++)
		{
			
			if (target[i][column]<minrow)
			{
				mincolumn=target[i][column];
				
			}
			else
				;
			
		}
		
		for (int j=0;j<target[0].length;j++)
		{
			
			if (target[row][j]<minrow)
			{
				minrow=target[row][j];
			}
			
			
		}
		
		if (minrow==compare&&mincolumn==compare)
		{
			
			System.out.println(compare+" "+(row+1)+" "+(column+1));
			
		}
		else 
		{
			
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int totalrow=in.nextInt();
		int totalcolumn=in.nextInt();
		int [][] receive=new int [totalrow][totalcolumn];
		for (int i=0;i<totalrow;i++)
		{
			for (int j=0;j<totalcolumn;j++)
			{
				
				receive[i][j]=in.nextInt();
				
			}
			
			
		}
		
		
		
		for (int i=0;i<totalrow;i++)
		{
			for (int j=0;j<totalcolumn;j++)
			{
				
				detect(receive,i,j);
				
			}
			
			
		}
		
		
		
		
		
	}

}
