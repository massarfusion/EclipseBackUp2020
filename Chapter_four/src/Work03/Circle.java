package Work03;

public class Circle extends Point  {
	
	int axisx;
	int axisy;
	double radius;
	public Circle(int axisx, int axisy,double radius) {
		
		this.axisx = axisx;
		this.axisy = axisy;
		this.radius=radius;
	}
	public boolean isInCircle(int x,int y)
	{
		if (Math.sqrt(   (this.axisx-x)*(this.axisx-x)+(this.axisy-y)*(this.axisy-y)   )<radius)
		{
			
			return true;
			
		}
		
		else 
			{return false;}
		
		
		
		
	}
	
	public boolean isInCircle(Point p1)
	{
		if (Math.sqrt(   (this.axisx-p1.axisx)*(this.axisx-p1.axisx)+(this.axisy-p1.axisy)*(this.axisy-p1.axisy)   )<radius)
		{
			
			return true;
			
		}
		
		else 
			{return false;}
		
		
	}
	
	public double getArea(double r)
	{
		
		return Math.PI*r*r;
		
	}
	
	
	
	
}
