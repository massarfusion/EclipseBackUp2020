package chess;

public class ChessBoard {
	int xmax;
	int ymax;
	int tempx;
	int tempy;//一开始的位置
	int targetx;
	int targety;
	int[] bestRoute;
	int[] tempRoute;
	int[][] action= {{1,2},{-1,2},{2,1},{-2,1}};
	int deo;
	public ChessBoard(int xmax, int ymax, int tempx, int tempy, int targetx, int targety) {
		super();
		this.xmax = xmax;
		this.ymax = ymax;
		this.tempx = tempx;
		this.tempy = tempy;
		this.targetx = targetx;
		this.targety = targety;
		bestRoute=new int[50];
		tempRoute=new int[50];
		deo=1;
	}
	public void trace(int x,int y,int index) {
		int tempx,tempy;
		if ((x==this.targetx)&&(y==this.targety)) {
			for (int i=0;i<index;i++) {
				System.out.print(tempRoute[i]+"->");
			}
			System.out.print("Finn"+"\n");
			return;
		}
		else {;}
		for (int i=0;i<4;i++) {
				tempx=x+this.action[i][0];
				tempy=y+this.action[i][1];
				if (this.inBound(tempx, tempy)==false) {
					continue;
				}//if
				else {;}
				this.tempRoute[index]=i+1;
				trace(tempx,tempy,index+1);
			}//for
		
	}//trace() 
	public boolean inBound(int x,int y) {
		if( (x<0)||(x>=this.xmax)||(y<0)||(y>=this.ymax)) {
			return false;
		}
		else {return true;}
	}//inBound
	public void execute() {
		this.trace(this.tempx,this.tempy,deo);
	}
	
}
