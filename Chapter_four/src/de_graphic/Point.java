package de_graphic;

public class Point {
	
		@Override
	public String toString() {
		return "Point(" + axisx + "," + axisy + ")";
	}

		//Point(8,8) is in the Circle((3,5),6.78)
		int axisx=0;int axisy=0;
		public Point(int x,int y){
			this.axisx= x;
			this.axisy=y;
			
		}
		
		public Point(int x)
		{
			this.axisx=x;
			this.axisy=x;
			
			
			
		}
		
		public Point()
		{
			this.axisx=0;
			this.axisy=0;
			
		}
		
		
		public double distance()
		{
			double dis=0;
			dis=Math.sqrt((axisx*axisx)+(axisy*axisy));
			
			return dis;
			
			
		}
		
		public double distance(int a,int b  )
		{
			double dis;
			
			double dis2=(axisx-a)*(axisx-a)+(axisy-b)*(axisy-b);
			
			dis=Math.sqrt(dis2);
			
			return dis;
			
			
			
		}
		
		public double distance(Point p1)
		{
			double dis=0;
			double dis2=0;
			dis2=(this.axisx-p1.axisx)*(this.axisx-p1.axisx)+(this.axisy-p1.axisy)*(this.axisy-p1.axisy);
			
			dis=Math.sqrt(dis2);
			
			return dis;
			
			
			
		}
		
		
		
	}


