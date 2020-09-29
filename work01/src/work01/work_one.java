package work01;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;





public class work_one {
	public static void removeReplicate(List list)
	{
		for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                }
            }
        }
		for (int i=0;i<list.size();i++)
		{
	        System.out.print(list.get(i)+" ");
		}
		
//		for (int i=0;i<list.size()-1;i++)
//		{
//			for (int j=list.size()-1;j>0;j--)
//			{
//				if (list.get(i).equals(list.get(i)))
//				{
//					list.remove(j);
//					
//				}
//				
//				
//			}
//			
//		}
        
		
	}
		
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
			
			for (int i=2;i<x;i++)
			{
				if (x%i==0)
				{
					return false;
				}
				else 
					;
				
				
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
			ArrayList primeList=new ArrayList();
			for (int i:rcv)
			{
				if (isPrime(i))
					primeList.add(i);
				else
					;
				
			}
			
			for (int raw:rcv)
			{
				if (!isPrime(raw))
				{
					for (int i=2;i<=raw;i++)
					{
						while (raw%i==0)
						{
							raw/=i;
							if (isPrime(i))
							{primeList.add(i);}
							else 
								;
						}
						
					}
					
					
				}
					
				else 
					;
				
				
				
			}
			Collections.sort(primeList);
			removeReplicate(primeList);
//			System.out.println(primeList);
//			int length=primeList.size();
//			int [] result =new int[length];
//			for (int i=0;i<length;i++)
//			{
//				result[i]=primeList;
//				
//			}
			
			
//			System.out.println(isPrime(number));
//			int [] primeList = new int[200];
//			int index=0;
//			for (int i=2;i<=500;i++)
//			{
//				if (isPrime(i))
//				{
//					primeList[index]=i;
//					index++;
//					
//				}
//				else 
//					;
//				
				
			}
//			ArrayList tar=new ArrayList();
//			tar.add(primeList[0]);
//			int position=0;
//			for (int point=0;point<number;point++)
//			{
//				if (isPrime(rcv[point]))
//				{
//					tar.add(rcv[point]);
//					
//				}
//				else 
//				{
////					if (rcv[point]%primeList [position]==0)
////					{
////						rcv[point]/=primeList[position];
////						
////					}
//					while (rcv[point]!=0)
//					{
//						if ((rcv[point]%primeList [position])==0)
//							{
//								rcv[point]/=primeList[position];
//								
//							}
//						else 
//							{
//							
//							tar.add(primeList[position]);
//							position++;
//							}
//						
//						
//					}
//					
//					
//					
//				}
//				
//				
//			}
//			System.out.println(tar);
		}

			
			
		

	
	


