package seekMinimum;

import java.util.Scanner;

public class SeekMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How many numbers?");
		int length=in.nextInt();
		int [] receive=new int [length];
		System.out.println("Enter them.Avec Division");
		for (int i=0;i<length;i++) {
			receive[i]=in.nextInt();
		}
		System.out.println("minimum is "+min(receive,0,length-1));
	}
	
	public static int  min(int [] target,int start,int end) {
		int length=target.length;
		if (start==end) {return target[start];}
		else if (end-start==1) {
			if (target[end]<target[start]) {return target[end];}
			else {return target[start];}
		}
		else if (end-start>1) {
			int mid=(end+start)/2;
			int une;
			int deus;
			une=min(target,start,mid);
			deus=min(target,mid+1,end);
			if (une<deus) {return une;}
			else {return deus;}
		}
		
		else {
		return 114514;}
	}
	
	
	
}
