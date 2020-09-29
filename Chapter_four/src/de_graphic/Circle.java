package de_graphic;

public class Circle extends Point  {
	
	@Override
	public String toString() {
		return "Circle(("+this.axisx+","+this.axisy+"),"+this.radius+")";
	}

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
	
	public double getArea()
	{
		double area=0;
		area=Math.PI*this.radius*this.radius;
		return area;
		
	}
	
	
	
}
