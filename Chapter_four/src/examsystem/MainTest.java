package examsystem;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Multiple m1=new Multiple("Characteristics of object-oriented program design is ", new String[]{"A.package","B.derive","C.polymorphism","D.Static"},new char[]{'A','B','C'});
		Single s1=new Single("Default value of int type is",new String[]{"A.0","B.1","C.2","D.3"},'A');
		m1.printme();
		System.out.println(m1.verify(in.nextLine()));
		s1.printme();
		System.out.println(s1.verify(in.nextLine()));
//		String[] text="t n	test".split("");
//		
//		for (String i:text) {System.out.println(  i    );}
		
		
		
	}

}
