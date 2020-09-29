package work01;
import java.util.Scanner;
public class Work06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int course=in.nextInt();
		int price =0;
		if (course<=6)
			price=3;
		else if (course >6&&course<=12)
			price=4;
		else if (course >12&&course<=22)
			price=5;
		else if (course >22&&course<=32)
			price=6;
		else if (course>32)
		{
//			price=7+((course-33)/20);
			if ((course-32)%20==0)
			{
				price=7+((course-32)/20)-1;
				
			}
			else 
				price=7+((course-32)/20);
		}
		else 
			;
		System.out.println("price="+price);
	}

}
