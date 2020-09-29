package chapter_three;

import java.util.Scanner;

public class Work06 {
	
	
	
	public static boolean judge(int[][]big , int[][]small,int a,int b)
	{
		//a&b stands for location in big array
		int basea=a;int baseb=b;
		
		boolean issubarray=true;
		
		for (int i=0;i<small.length;i++)
		{
			for (int j=0;j<small.length;j++ )
			{
				if (small[i][j]!=big[a][b])
				{
					
					issubarray=false;
					
				}
				else 
				{	;}
				
				b++;
			}
			b=baseb;
			
			a++;
		}
		if (issubarray)
		{
			
			return true;
			
		}
		else
		{return false;}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int bigstep=in.nextInt();
		int [][] big=new int[bigstep][bigstep];
		for (int i=0;i<bigstep;i++)
		{
			for (int j=0;j<bigstep;j++)
			{
				
				big[i][j]=in.nextInt();
			}
			
		}
		int smallstep=in.nextInt();
		int [][] small=new int[smallstep][smallstep];
		for (int i=0;i<smallstep;i++)
		{
			for (int j=0;j<smallstep;j++)
			{
				
				small[i][j]=in.nextInt();
			}
			
		}
		
		int r=-1;
		int c=-1;
		int panduan=0;
		
		
		for (int row=0;row<bigstep-smallstep;row++)
		{
			for (int column=0;column<bigstep-smallstep;column++)
			{
				
				if (judge(big ,small,row,column))
				{
					r=row+1;
					c=column+1;
					panduan=1;
				}
				else 
					;
				
				
			}
			
		}
		
		if (panduan!=0)
		{
			
			System.out.println(r+","+c);
			
		}
		else
			System.out.println(-1);
		
		
	}

}
