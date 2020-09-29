package de_graphic;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int xpoint;
		int ypoint;
		int xcircle;
		int ycircle;
		int rcircle;
		xcircle=in.nextInt();
		ycircle=in.nextInt();
		rcircle=in.nextInt();
		xpoint=in.nextInt();
		ypoint=in.nextInt();
		Circle yuan=new Circle(xcircle,ycircle,rcircle);
		Point p1=new Point (xpoint,ypoint);
		if (yuan.isInCircle(p1))
		{
			
			System.out.printf( "point(%d,%d) is in the Cirlce((%d,%d),%d) %n",p1.axisx,p1.axisy,yuan.axisx,yuan.axisy,yuan.radius );
			
		}
		else 
		{
			
			System.out.printf( "point(%d,%d) is not in the Cirlce((%d,%d),%d) %n",p1.axisx,p1.axisy,yuan.axisx,yuan.axisy,yuan.radius );
			
		}
		
		
	
		
	
	}
	

}
