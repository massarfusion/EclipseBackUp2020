package work01;

import java.util.Scanner;
public class Work03 {
	
//	public static void gongyinshu(int a,int b)
//	{
//		if ((b<=a)&&(a%b==0)) {
//			System.out.println(b);
//		}
//		else if (b>a)
//		{
//			System.out.println(gcd(b,a));
//		}
//		else 
//		{
//			
//			System.out.println(gcd(b,(a % b)));
//			
//		}
//		
//		
//	}
//	
//	public static int gcd(int a,int b)
//	{
//		int r=0;
//		
//		do{
//			r=a%b;
//			a=b;
//			b=r;
//			
//		}while (r!=0);
//		return b;
//	}
	public static int calc(int basic,int one,int two)
	{
		if (basic==1||(one%basic==0&&two%basic==0))
		{
			return basic;
		}
		else 
		{
			return calc(--basic,one,two);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int one=in.nextInt();
		int two=in.nextInt();
		int min=one>two?two:one;
		int result=calc(min,one, two);
		System.out.println(result);
		
		
	}

}
