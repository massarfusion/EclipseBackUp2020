package matrixMultiply;

public class MatrixMultiplier {
	int []p;
	int [][]m;int [][]s;//m���·�����ȣ�s��žֲ����Ž�ĳ˷��ֽ��

	public MatrixMultiplier(int[] p) {
		super();
		this.p = p;//�����漰���Ķ�ԭ����
	}
	public void Planner() {
		int number=p.length-1;//
		m=new int [number+1][number+1];
		s=new int [number+1][number+1];//ʹ�����1��ʼ
		for (int i=1;i<=number;i++) {
			m[i][i]=0;
		}//initialize
		for (int leap=2;leap<=number;leap++) {//��ʾ��ȣ���LEAP=3���ʾ������3����Ҫ���봦��
			for (int i=1;i<=number-leap+1;i++) {//��Ҫ��֤�ҽ粻��Խ�����
				int j=i+leap-1;//J��ʾ�ҽ�
				m[i][j]=m[i+1][j]+p[i-1]*p[i]*p[j];//�ȳ�ʼ��һ�����ģ������Ժ�Ƚ�ȡ����
				s[i][j]=i;//S[][]��·���滮�洢
				for (int k=i+1;k<j;k++) {
					int temp=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];//������������������п��ܵľ���������Ͻ��б���
					if (temp<m[i][j]) {
						m[i][j]=temp;
						s[i][j]=k;//���ָ��õķ����������
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
		this.bestRoute(divis+1,end);//��������ɶ��Ľ����
		
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
