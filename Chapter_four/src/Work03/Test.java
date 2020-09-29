package Work03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int xpoint;
		
		int xcircle;
		int ycircle;
		double rcircle;
		String r;
		xcircle=in.nextInt();
		ycircle=in.nextInt();
		r=in.next();
		xpoint=in.nextInt();
		
		rcircle=Double.parseDouble(r);
		Circle yuan=new Circle(xcircle,ycircle,rcircle);
		Point p1=new Point (xpoint);
		
		
		System.out.printf( "Area of Circle((%d,%d),%s) is:%.2f", yuan.axisx,yuan.axisy,r,yuan.getArea(rcircle));
		
		System.out.println();
		if (yuan.isInCircle(p1))
		{
			
			System.out.printf( "Point(%d,%d) is in the Circle((%d,%d),%s)",p1.axisx,p1.axisy,yuan.axisx,yuan.axisy,r );
			
		}
		else 
		{
			
			System.out.printf( "Point(%d,%d) is not in the Circle((%d,%d),%s) %n",p1.axisx,p1.axisy,yuan.axisx,yuan.axisy,r );
			
		}
		
		
	
		
	
	}
	

}
