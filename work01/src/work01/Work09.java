package work01;
import java.util.Scanner;
public class Work09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		double a=in.nextInt();
		double b=in.nextInt();
		double c=in.nextInt();
		double s=(a+b+c)/2;
		double result =0;
		result =Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(String.format("%.3f", result));
	
	
	}

}
