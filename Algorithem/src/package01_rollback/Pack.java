package package01_rollback;

public class Pack {
	int total;
	int [] weights;
	int [] values;//两个数组表示
	int capacity;
	int maxValue;
	int tempValue;
	int tempWeight;//TEMPXXXX用于暂时保存
	int[] tempRoute;
	int[] bestRoute;
	public Pack(int total, int[] weights, int[] values, int capacity) {
		super();
		this.total = total;
		this.weights = weights;
		this.values = values;
		this.capacity = capacity;
		this.maxValue=0;
		this.tempValue=0;
		this.tempWeight=0;
		tempRoute=new int [total];
		bestRoute=new int [total];
	}
	
	public void trace(int t) {
		if (t>=total) {
			if (tempValue>=maxValue) {
				maxValue=tempValue;//录入最优结果
				for (int i=0;i<total;i++) {
					bestRoute[i]=tempRoute[i];//已经到达叶节点，于是写入路线
				}//for
			}//if
		}//if
		else {
			for (int i=0;i<=1;i++) {
				tempRoute[t]=i;
				if (i==0) {
					trace(t+1);//表示不放入，直接进入下一个点
				}
				else {
					if (tempWeight+weights[t]<=capacity) {
						tempWeight+=weights[t];
						tempValue+=values[t];
						trace(t+1);//遍历下一个链接的点
						tempWeight-=weights[t];
						tempValue-=values[t];//是全局变量，需要恢复现场
					}
				}
			}//for
		}//else
	}//trace
	
	public void printme() {
		for (int i=0;i<total;i++) {
			System.out.print(this.bestRoute[i]+" ");
		}
		System.out.println("\n"+this.maxValue);
	}
	
	
	
}
