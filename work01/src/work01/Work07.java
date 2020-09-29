package work01;
import java.util.Scanner;
public class Work07 {
	public static boolean isleapyear(int yr)
	//LeapYearJudgment
	{
		if ((yr%4==0&&yr%100!=0)||(yr%400==0))
		{
			return true;
		}
		else 
			return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in= new Scanner(System.in);
	int year=in.nextInt();
	int month=in.nextInt();
	int day=in.nextInt();
	int totalDays=0;
	int []count = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	//make a list for calculation
	
	if (isleapyear(year))
	{
		
		count[2]=29;//LeapYearJudge
	}
	else 
		;
	for (int i=0;i<month;i++)//Add up all days before the selected month
	{
		
		totalDays+=count[i];
	}
	totalDays+=day;
	System.out.println(totalDays);
	
	}

}
