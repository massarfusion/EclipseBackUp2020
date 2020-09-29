package reload;
public class Main {
	static int [] w= {0,2,3,4,5,9};
	static int [] v= {0,3,4,5,8,10};
	static int length=21;static int width=6;
	static int[][] storage=new int [width][length];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<width;i++) {
			for (int j=0;j<length;j++) {
				storage[i][j]=0;
			}
		}
		
		
		for (int k=1;k<width;k++) {
			for (int c=1;c<length;c++) {
				if (w[k]>c) {storage[k][c]=storage[k-1][c];}
				else {
					int val1=storage[k-1][c-w[k]]+v[k];
					int val2=storage[k-1][c];
					if (val1>val2) {
						storage[k][c]=val1;
					}else {storage[k][c]=val2;}
				}
			}
		}
		
		System.out.println(storage[width-1][length-1]);
	}//end of main function

}
