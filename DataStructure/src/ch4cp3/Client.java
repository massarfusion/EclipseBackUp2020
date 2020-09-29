package ch4cp3;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Scanner in =new Scanner (System.in);
		int target=in.nextInt();
		Round rd=new Round(target);
		rd.spin();
		rd.printme();
		
	}

}
