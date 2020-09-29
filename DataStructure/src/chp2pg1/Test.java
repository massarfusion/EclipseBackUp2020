package chp2pg1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int digit=in.nextInt();
		int length=in.nextInt();
		int[] receive=new int[length+1];
		for (int i=0;i<length;i++) {
			
			receive[i]=in.nextInt();
			
		}
		digit=digit%length;
		for (int i=0;i<length;i++) {
			
			System.out.print(receive[digit]+" ");
			digit=(digit+1)%length;
		}
		
		
		
		
	}

}
