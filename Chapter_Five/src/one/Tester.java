package one;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int  total=in.nextInt();
		Circle c1=new Circle(in.nextInt(),in.nextInt(),in.nextInt());	
		Rectangle r1=new Rectangle(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
		/*
		 the Circle area is:3.14

			the Rectangle area is:1.00*/
		System.out.print("the "+c1.getName()+" area is:");
		System.out.printf("%.2f",c1.getArea());
		System.out.println();
		System.out.print("the "+r1.getName()+" area is:");
		System.out.printf("%.2f",r1.getArea());
		System.out.println();
	}

}
