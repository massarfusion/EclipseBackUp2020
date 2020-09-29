package package01_rollback;

public class Pack {
	int total;
	int [] weights;
	int [] values;//���������ʾ
	int capacity;
	int maxValue;
	int tempValue;
	int tempWeight;//TEMPXXXX������ʱ����
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
				maxValue=tempValue;//¼�����Ž��
				for (int i=0;i<total;i++) {
					bestRoute[i]=tempRoute[i];//�Ѿ�����Ҷ�ڵ㣬����д��·��
				}//for
			}//if
		}//if
		else {
			for (int i=0;i<=1;i++) {
				tempRoute[t]=i;
				if (i==0) {
					trace(t+1);//��ʾ�����룬ֱ�ӽ�����һ����
				}
				else {
					if (tempWeight+weights[t]<=capacity) {
						tempWeight+=weights[t];
						tempValue+=values[t];
						trace(t+1);//������һ�����ӵĵ�
						tempWeight-=weights[t];
						tempValue-=values[t];//��ȫ�ֱ�������Ҫ�ָ��ֳ�
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
