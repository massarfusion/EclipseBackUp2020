package maxSubSeq;

public class Client {
	public static void MaxSum(int n,int[] a){
		int max=0,b=0;
		int start=b;int end=b;
		for(int i=1;i<=n;i++){//�����1��ʼ
			if(b<0) {b=a[i];start=i;end=i;}
			else {b=b+a[i];}
			if(b>max)
				{max=b;end=i;}
			else {;}
		}
		System.out.println(max+" is max");
		System.out.println(start+" as start "+end+" as end");
	}
	
	
	public static void main(String[] args){
		int n=6;
		int[] a={0,-2,11,-4,13,-5,-2};//�����м���Ԫ�أ�0������ڵ�һλ�����������1�±꿪ʼ
		MaxSum(n,a);
	}

}
