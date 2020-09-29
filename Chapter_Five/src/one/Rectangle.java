package one;

public class Rectangle extends Shape {

	public Rectangle(int axisx, int axisy, int length, int width) {
		super(axisx, axisy, length, width);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.length*this.width);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	@Override
	public boolean contains() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
