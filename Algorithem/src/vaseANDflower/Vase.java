package vaseANDflower;

public class Vase {
	int basedata[][];
	int plan[][];
	int rowLength;
	int colLength;
	public Vase(int[][] basedata) {
		super();
		this.basedata = basedata;
		rowLength=basedata.length;
		colLength=basedata[0].length;
		this.plan=new int [rowLength][colLength];
		if (this.basedata[1][1]>0) {plan[1][1]=this.basedata[1][1];}else {plan[1][1]=0;}
	}
	public void planner() {
		for (int i=1;i<this.rowLength;i++) {
			for (int j=i;j<this.colLength;j++) {
			int a=plan[i][j-1];
			int b=plan[i-1][j-1]+basedata[i][j];
			if (a>=b) {plan[i][j]=a;}
			else {plan[i][j]=b;}
			}
		}
		
	}
	
	public void printme() {
		for (int i=1;i<this.rowLength;i++) {
			for (int j=1;j<this.colLength;j++) {
			System.out.print(plan[i][j]);System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	
	
}
