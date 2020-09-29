package work01;
import java.math.BigDecimal;
import java.util.Scanner;
public class Work05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		double tar=in.nextDouble();
		double comp=tar;
		if (comp<1000)
		{
			;
			
		}
		else if (comp>=1000&&comp<2000)
		{
			tar*=0.9;
			
		}
		else if (comp>=2000&&comp<3000)
		{
			
			tar*=0.85;
		}
		else if (comp>=3000&&comp<4000)
		{
			tar*=0.8;
		}
		else if (comp>=4000)
		{
			tar*=0.75;
		}
		System.out.println(String.format("%.2f", tar));
		
	}

}
