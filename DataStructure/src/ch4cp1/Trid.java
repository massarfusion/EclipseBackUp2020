package ch4cp1;

public class Trid {

	int axisx;
	int axisy;
	double data;
	
	public Trid(int axisx, int axisy, double data) {
		super();
		this.axisx = axisx;
		this.axisy = axisy;
		this.data = data;
	}
	
	public boolean covers(Trid tempo) {
		if (tempo.getAxisx()==this.axisx&&tempo.getAxisy()==this.axisy) {
			return true;
		}
		else {
			return false;
			
		}
		
		
	}

	public boolean addUp(Trid tmp) {
		if (this.covers(tmp)==false) {
			System.out.println("cannot add");
			return false;
			
		}
		else {
			
			this.data+=tmp.getData();
			return true;
		}
		
		
		
	}
	
	public boolean printmoi() {
		
		System.out.println(this.axisx+" "+this.getAxisy()+" "+(int)this.getData());	
		return true;
		
	}
	
	
	
	public int getAxisx() {
		return axisx;
	}

	public int getAxisy() {
		return axisy;
	}

	public double getData() {
		return data;
	}

	public void setAxisx(int axisx) {
		this.axisx = axisx;
	}

	public void setAxisy(int axisy) {
		this.axisy = axisy;
	}

	public void setData(double data) {
		this.data = data;
	}
	
	
	
	
}
