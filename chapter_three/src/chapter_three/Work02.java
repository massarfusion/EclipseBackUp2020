package chapter_three;
import java.util.Scanner;
public class Work02 {
	public static void printarray(int[][] target)
	{
		for (int row=0;row<target.length;row++)
		{
			
			for(int column=0;column<target[0].length;column++)
			{
				
				
				System.out.print(target[row ][column]+" ");
				
			}
			System.out.print("\n");
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int [][]map=new int[m+2][n+2];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		
		int tm=sc.nextInt();
		int tn=sc.nextInt();
		int tmap[][]=new int[tm+2][tn+2];
		for(int ti=1;ti<=tm;ti++) {
			for(int tj=1;tj<=tn;tj++) {
				tmap[ti][tj]=sc.nextInt();
			}
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
	
		int mx=0,ny=0;
		mx=x-tm+1;
		ny=y-tn+1;
		int ii,jj,ai=1,aj=1;
		//|
		//6 3 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 4 4 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 4
		//(n-ny)<(tn-1)?(n-ny):(tn-1))
		for(ii=mx;ii<=mx+((m-mx)<(tm-1)?(m-mx):(tm-1));ii++) {
			jj=ny;
			do {
				map[ii][jj]=tmap[ai][aj];
				aj++;
				jj++;
			}while(jj<=(n<(tn+ny-1)?n:(tn+ny-1)));
			aj=1;
			ai++;
		}
		
		for(int a=1;a<=m;a++) {
			for(int b=1;b<=n;b++) {
				System.out.print(map[a][b]+" ");
				
			}
			System.out.println();
		}
		

	
	
	
	}
	

}
