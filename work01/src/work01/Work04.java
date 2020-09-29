package work01;
import java.util.Scanner;
public class Work04 {

	public static boolean shuixianhua(int a)
	{
		int []chai=new int[3];
		int cpy=a;
		for (int i=0;i<3;i++)
		{
			chai[i]=cpy%10;
			cpy/=10;
			
		}
		int comparison=0;
		for (int i=0;i<3;i++)
		{
			comparison+=Math.pow(chai[i], 3);
		}
		if (comparison==a)
		{return true;}
		else 
		{return false;}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner (System.in);
	int tar=in.nextInt();
	for (int i=101;i<=tar;i++)
	{
		if (shuixianhua(i))
		{
			System.out.println(i);
		}
		else 
			;
		
	}
	
	}

}
