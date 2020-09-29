package matrixMultiply;

public class MatrixMultiplier {
	int []p;
	int [][]m;int [][]s;//m存放路径长度，s存放局部最优解的乘法分解点

	public MatrixMultiplier(int[] p) {
		super();
		this.p = p;//不会涉及到改动原数组
	}
	public void Planner() {
		int number=p.length-1;//
		m=new int [number+1][number+1];
		s=new int [number+1][number+1];//使得其从1开始
		for (int i=1;i<=number;i++) {
			m[i][i]=0;
		}//initialize
		for (int leap=2;leap<=number;leap++) {//表示跨度，如LEAP=3则表示有连续3个需要进入处理
			for (int i=1;i<=number-leap+1;i++) {//需要保证右界不会越数组界
				int j=i+leap-1;//J表示右界
				m[i][j]=m[i+1][j]+p[i-1]*p[i]*p[j];//先初始化一个最大的，方便以后比较取代。
				s[i][j]=i;//S[][]是路径规划存储
				for (int k=i+1;k<j;k++) {
					int temp=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];//对于这个区间跨度内所有可能的矩阵连乘组合进行遍历
					if (temp<m[i][j]) {
						m[i][j]=temp;
						s[i][j]=k;//发现更好的方案，则更新
					}//IF
					else {;}
				}//FOR
			}//I	
		}//LEAP	
	}//planner
	public void bestRoute(int init,int end) {
		if (init==end) {System.out.print("("+init+")");return;}
		if (end-init==1) {System.out.print("("+init+"X"+end+")");return;}
		int divis=s[init][end];
		
		this.bestRoute(init,divis);
		System.out.print("X");
		this.bestRoute(divis+1,end);//用于输出可读的结果。
		
	}//bestRoute
	public void printme() {
		System.out.println("Here's the planner");	
		for (int i=1;i<m[0].length;i++) {
			for (int j=1;j<m[0].length;j++) {
				System.out.print(s[i][j]);
				
//				System.out.print(m[i][j]);
				System.out.print("          ");
			}
			System.out.println();	
		}
		System.out.println("Here's the Memory Book");	
		for (int i=1;i<m[0].length;i++) {
			for (int j=1;j<m[0].length;j++) {
//				System.out.print(s[i][j]);
				
				System.out.print(m[i][j]);
				System.out.print("          ");
			}
			System.out.println();	
		}
		System.out.println();	
		
		
	}//printMe
	public void giveDistance() {
		System.out.println("You need at least "+m[1][this.p.length-1]+" times of multies.");
	}
	
}
