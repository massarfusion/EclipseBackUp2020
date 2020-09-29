package work01;
import java.util.Scanner;
public class Work08 {
	public static void digitAdd(int a)
	{
		
		int tearup=a;
//		while (a!=0)
//		{
//			a/=10;
//			digitCount+=1;
//		}
		int total=0;
		while (tearup!=0)
		{
			total+=tearup%10;
			tearup/=10;
			
		}
		System.out.println(total);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in= new Scanner(System.in);
	
	int tar=in.nextInt();
	digitAdd(tar);
	
	
	
	
	
	}

}
