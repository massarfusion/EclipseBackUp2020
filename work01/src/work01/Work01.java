package work01;


import java.util.Scanner;
public class Work01 {
	
	public static int qiuzuida(int[] comparison)
	{
		int max;
		max=comparison[0];
		for (int j = 1; j < comparison.length; j++) {
			if (max<comparison[j])
			{
				max=comparison[j];
			}
			else if (comparison[j]==max)
				;
			else 
				;
			
		}
		return max;
		
		
	}
	public static int qiuzuixiao(int[] comparison)
	{
		int min;
		min=comparison[0];
		for (int j = 1; j < comparison.length; j++) {
			if (min>comparison[j])
			{
				min=comparison[j];
			}
			else if (comparison[j]==min)
				;
			else 
				;
			
		}
		return min;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int times=in.nextInt();
		
		int [] receiver= new int[times];
		for (int i=0;i<times;i++)
		{
			
			receiver[i]=in.nextInt();
			
		}
		int max=qiuzuida(receiver);
		int min=qiuzuixiao(receiver);
		System.out.println(max+" "+min);
		
	}

}
