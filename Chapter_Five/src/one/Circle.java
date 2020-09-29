package one;

public class Circle  extends Shape{

	public Circle(int axisx, int axisy, int radius) {
		super(axisx, axisy, radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ( Math.PI*this.radius*this.radius  );
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Circle";
	}

	@Override
	public boolean contains() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
}
