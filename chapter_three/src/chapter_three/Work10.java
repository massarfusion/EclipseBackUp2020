package chapter_three;

import java.util.Arrays;
import java.util.Scanner;

public class Work10 {
//	public static int [] sort(int tar[],int start,int end)
//	{
//		int ini=start;
//		int stop=end
//		
//		
//		
//		
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int delete=0;
		int oneCount=in.nextInt();
		int [] one=new int [oneCount];
		for (int i=0;i<oneCount;i++)
		{
			
			one[i]=in.nextInt();
			
		}
		
		int twoCount=in.nextInt();
		int [] two=new int [twoCount];
		for (int i=0;i<twoCount;i++)
		{
			
			two[i]=in.nextInt();
			
		}
		
		for (int i=0;i<one.length;i++)
		{
			for (int j=0;j<two.length;j++)
			{
				
				if (one[i]==two[j])
				{
					two[j]=114514;
					delete++;
				}
				else if ((one[i]>two[j])&&(one[i]%two[j]==0))
				{
					one[i]=114514;
					delete++;
					
					
				}
				else if ((one[i]<two[j])&&(two[j]%one[i]==0))
				{
					
					two [j]=114514;
					delete++;
					
				}
				
			}
			
			
			
		}
		
		int [] rcv =new int [oneCount+twoCount-delete+1];
		int index=0;
		for (int i:one)
		{
			if (i!=114514)
			{
				rcv[index]=i;
				index++;
				
			}
			else
				;
		}
		for (int i:two)
		{
			if (i!=114514)
			{
				rcv[index]=i;
				index++;
				
			}
			else
				;
		}
		Arrays.sort(rcv);
		for (int i:rcv){if (i!=0) {System.out.print(i+" ");}}
	}

}
