package de_graphic;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		
		int xcircle;
		int ycircle;
		double rcircle;
		int xpoint;
		
		xcircle=in.nextInt();
		ycircle=in.nextInt();
		rcircle=in.nextDouble();
		xpoint=in.nextInt();
		
		
		Circle c1=new Circle(xcircle,ycircle,rcircle);
		Point p1=new Point (xpoint);
		System.out.print("Area of "+c1.toString()+ " is:");
		//c1.getArea()
		System.out.printf("%.2f",c1.getArea());
		System.out.println();
		if (c1.isInCircle(p1))
		{
			System.out.println(p1.toString()+" is in the "+c1.toString());
		}
		else 
		{
			System.out.println(p1.toString()+" is not in the "+c1.toString());
			
		}
	}

}
