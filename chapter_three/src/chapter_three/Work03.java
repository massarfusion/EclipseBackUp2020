package chapter_three;

import java.util.Arrays;
import java.util.Scanner;

public class Work03 {
	public static void trim(int [][] target)
	{
		int non_zero=0;
		for (int i=0;i<target.length;i++)
		{
				if (target[i][0]==0&&target[i][1]==0 )
				{
					;
				}
				else
					non_zero++;
			
			
		}
		int[] output=new int [non_zero*2];
		int iaa=0;
		for (int i=0;i<target.length;i++)
		{
				if (target[i][0]==0&&target[i][1]==0 )
				{
					;
				}
				else
				{
					
					output[iaa]=target[i][0];
					output[iaa+1]=target[i][1];
					iaa+=2;
				}
				
			
		}
		Arrays.sort(output);
		int count=0;
		for (int index=0;index<output.length;index++)
		{
			System.out.print(output[index]+" ");
			count++;
			if (count%2==0)
			{
				System.out.print("\n");
			}
			else 
				;
			
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int pairs=in.nextInt();
		int [][] receive=new int [pairs][2];
		for (int i=0;i<pairs;i++)
		{
			
			for (int j=0;j<2;j++)
			{
				
				receive[i][j]=in.nextInt();
				
			}
			
		}
		
		
//		for(int i=0;i<receive.length;i++)
//	     {
//	    	 for(int j=0;j<receive[i].length;j++)
//	    	 {
//	    		 System.out.print(receive[i][j]+" ");
//	    	 }
//	    	 System.out.println();	
//	     }
//		System.out.println();
		
		
		
		
		
		
		for (int row=0;row<pairs-1;row++)
		{
			if (receive[row][0]==0&&receive[row][1]==0)
			{
				continue;
			}
			else 
				;
			int min=receive[row][0];int max=receive[row][1];
			for (int crow=row+1;crow<pairs;crow++)//attention for (int crow=row+1;crow<pairs;crow++)
			{
				if (receive[crow][0]==0&&receive[crow][1]==0)
				{
					continue;
				}
				else 
				{;}
				
				if (receive[crow][0]>=min&&receive[crow][1]<=max)//crack here
				{
					receive[crow][0]=0;
					receive[crow][1]=0;
					
				}
				else if(receive[crow][0]<=min&&(receive[crow][1]>=min&&receive[crow][1]<=max))
				{
					min=receive[crow][0];
					receive[row][0]=min;
					receive[crow][0]=0;
					receive[crow][1]=0;
					
				}
				else if (receive[crow][1]>=max&&(receive[crow][0]>=min&&receive[crow][0]<=max))
				{
					max=receive[crow][1];
					receive[row][1]=max;
					receive[crow][0]=0;
					receive[crow][1]=0;
					
				}
				else if (receive[crow][0]<=min&&receive[crow][1]>=max)
				{
					max=receive[crow][1];min=receive[crow][0];
					receive[row][0]=min;receive[row][1]=max;
					receive[crow][0]=0;receive[crow][1]=0;
					
					
				}
				else if (receive[crow][0]>max||receive[crow][1]<min)
				{
					
					;
				}
				else 
					;
			}
			
			
			
			
		}
		
		for (int row=0;row<pairs-1;row++)
		{
			if (receive[row][0]==0&&receive[row][1]==0)
			{
				continue;
			}
			else 
				;
			int min=receive[row][0];int max=receive[row][1];
			for (int crow=row+1;crow<pairs;crow++)//attention for (int crow=row+1;crow<pairs;crow++)
			{
				if (receive[crow][0]==0&&receive[crow][1]==0)
				{
					continue;
				}
				else 
				{;}
				
				if (receive[crow][0]>=min&&receive[crow][1]<=max)//crack here
				{
					receive[crow][0]=0;
					receive[crow][1]=0;
					
				}
				else if(receive[crow][0]<=min&&(receive[crow][1]>=min&&receive[crow][1]<=max))
				{
					min=receive[crow][0];
					receive[row][0]=min;
					receive[crow][0]=0;
					receive[crow][1]=0;
					
				}
				else if (receive[crow][1]>=max&&(receive[crow][0]>=min&&receive[crow][0]<=max))
				{
					max=receive[crow][1];
					receive[row][1]=max;
					receive[crow][0]=0;
					receive[crow][1]=0;
					
				}
				else if (receive[crow][0]<=min&&receive[crow][1]>=max)
				{
					max=receive[crow][1];min=receive[crow][0];
					receive[row][0]=min;receive[row][1]=max;
					receive[crow][0]=0;receive[crow][1]=0;
					
					
				}
				else if (receive[crow][0]>max||receive[crow][1]<min)
				{
					
					;
				}
				else 
					;
			}
			
			
			
			
		}
		
		
		
		
		
		trim(receive);
//			for(int i=0;i<receive.length;i++)
//	     {
//	    	 for(int j=0;j<receive[i].length;j++)
//	    	 {
//	    		 System.out.print(receive[i][j]+" ");
//	    	 }
//	    	 System.out.println();	
//	     }
		
		
		
	}

}
