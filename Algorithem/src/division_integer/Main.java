package division_integer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Type your number to split");
		int divisant=in.nextInt();//the number to split
		System.out.println(divide(divisant,divisant));
	}
	public static int divide(int tosplit,int diviser) {
		if (tosplit<1||diviser<1) {return 0;}
		else if (diviser==1) {return 1;}
		else if (tosplit==diviser) {return divide(tosplit,diviser-1)+1;}
		else if (tosplit<diviser) {return divide(tosplit,tosplit);}
		else if(tosplit>diviser) {return divide(tosplit-diviser,diviser)+divide(tosplit,diviser-1);}
		else {return -1;}
		//diviser is the largest int we assume to split "tosplit"
		//"tosplit"is the int we want to split
		
		
	}
}
