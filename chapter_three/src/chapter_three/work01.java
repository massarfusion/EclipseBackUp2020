package chapter_three;
import java.util.ArrayList;
import java.util.Scanner;
public class work01 {
	public static boolean isPrime(int x)
	{
		if (x==1)
		{
			return false;
		}
		else 
			;
		if (x==2)
		{
			
			return true;
			
		}
		else 
			;
		if (x>2)
		{
			
			for (int i=2;i<Math.sqrt(x);i++)
			{
				if (x%i!=0)
				{
					return false;
				}
				
				
			}
			return true;
			
		}
		else
			
		
		
			return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int number=in.nextInt();
		int [] rcv=new int[number];
		for (int i=0;i<number;i++)
		{
			
			rcv[i]=in.nextInt();
			
		}
//		System.out.println(isPrime(number));
		int [] primeList = new int[200];
		int index=0;
		for (int i=2;i<=500;i++)
		{
			if (isPrime(i))
			{
				primeList[index]=i;
				i++;
				
			}
			else 
				;
			
			
		}
		ArrayList tar=new ArrayList();
		tar.add(primeList[0]);
		int position=0;
		for (int point=0;point<number;point++)
		{
			if (isPrime(rcv[point]))
			{
				tar.add(rcv[point]);
				
			}
			else 
			{
//				if (rcv[point]%primeList [position]==0)
//				{
//					rcv[point]/=primeList[position];
//					
//				}
				while (rcv[point]!=0)
				{
					if (rcv[point]%primeList [position]==0)
						{
							rcv[point]/=primeList[position];
							
						}
					else 
						{
						
						tar.add(primeList[position]);
						position++;
						}
					
					
				}
				
				
				
			}
			
			
		}
		System.out.println(tar);
		
		
	}

}
