package package01_dynamicPlot;

public class Package01 {
	int [][] plot;
	int [] route;
	int [] weights;
	int [] values;
	int total;
	int capacity;
	public Package01(int[] weights, int[] values,int total,int capacity) {
		super();
		this.weights = weights;
		this.values = values;
		this.total=total;
		this.capacity=capacity;
		this.plot=new int [total+1][capacity+1];
		this.route=new int [total+1];//all starts from 1
	}
	public void planner() {
		for (int i=1;i<=total;i++) {
			for (int j=1;j<=capacity;j++) {
				if (weights[i]>j) {plot[i][j]=plot[i-1][j];}//�ų�һ����
				else {
					int a=plot[i-1][j];
					int b=plot[i-1][j-weights[i]]+values[i];
					if (a>b) {plot[i][j]=a;}//�Ƚϣ���ľ͸�������λ��
					else {plot[i][j]=b;}
				}
			}
		}
	}
	public void printme() {
		for (int i=1;i<=total;i++) {
			for (int j=1;j<=capacity;j++) {
				System.out.print(plot[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
}
