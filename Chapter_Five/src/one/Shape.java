package one;

public abstract class Shape {
	int axisx;
	int axisy;
	int radius;
	
	int length;
	
	int width;
	
	double area;
	public Shape(int axisx, int axisy, int radius) {
		super();
		this.axisx = axisx;
		this.axisy = axisy;
		this.radius = radius;
	}
	public Shape(int axisx, int axisy, int length, int width) {
		super();
		this.axisx = axisx;
		this.axisy = axisy;
		this.length = length;
		this.width = width;
	}
	public Shape(int axisx, int axisy) {
		super();
		this.axisx = axisx;
		this.axisy = axisy;
	}
	
	 public abstract double getArea(); 
	 public abstract String getName();
	 public abstract boolean contains();
	 
}
