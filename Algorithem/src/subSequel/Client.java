package subSequel;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		char [] one;
		char [] two;
		System.out.println("Now for the first Str.End with ENTER");
		String une=in.nextLine();
		System.out.println("Now for the second Str.End with ENTER");
		String deus=in.nextLine();
		one=new char[une.length()];
		two=new char[deus.length()];
		for (int i=0;i<une.length();i++) {
			one[i]=une.charAt(i);
		}
		for (int i=0;i<deus.length();i++) {
			two[i]=deus.charAt(i);
		}
		Sequel s1=new Sequel(one,two);
		s1.planner();
		s1.printme();
		
		
		
		
		
		
		System.out.println("");
	}

}
