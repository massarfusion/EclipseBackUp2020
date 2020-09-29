package chapter_three;

import java.util.Scanner;

public class Work09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int total=in.nextInt();
		String[] names=new String[total+1];
		int [] score =new int [total+1];
		for (int i=1;i<=total;i++)
		{
			names[i]=in.next();
			score[i]=in.nextInt();
			
			
		}
		for (int i=1;i<=total;i++)
		{
			for (int j=1;j<total;j++)
			{
				
				if (score[j]<score[j+1])
				{
					int tempscore=score[j];
					String tempname=names[j];
					score[j]=score[j+1];
					score[j+1]=tempscore;
					names[j]=names[j+1];
					names[j+1]=tempname;
				}
				else if (score[j]==score[j+1])
				{
					
					;
				}
				else 
				{
					;
					
				}
			}
			
			
		}
		for (int i=1;i<=total;i++)
		{
			
			System.out.printf("%15s%5d\n",names[i],score[i] );
		}
	}

}
