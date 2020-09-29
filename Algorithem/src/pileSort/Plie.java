package pileSort;

public class Plie {
	int [] a;
	int length;
	
	public Plie(int[] a) {
		super();
		this.a = a;
		length=a.length;
	}
	
	public  void heapify(int []target,int length ,int starter) {
		//length means the real length of target,while starter means where to start the  heapify,
		//starter follows the in-array-index-order
		//this will go all way down to the last node
		if (starter>(length-1)) {return;}
		int parent_index=starter;
		int left_index=starter*2+1;
		int right_index=starter*2+2;
		int max_index=parent_index;
		if (left_index<length&&target[left_index]>target[max_index]) {max_index=left_index;}
		if (right_index<length&&target[right_index]>target[max_index]) {max_index=right_index;}
		if (max_index!=parent_index) {
			
			swap(target,max_index,parent_index);
			heapify(target,length,max_index);
			
		}
//		else {return;}
	}
	
	
	public void swap(int [] target,int index1,int index2) {
		//all indexes follows the in-array-index-order
		int temp;
		temp=target[index1];
		target[index1]=target[index2];
		target[index2]=temp;
		
	}
	
	public void build_heap(int []target,int length) {
		int last_index=length-1;
		int parent_index=(int) Math.floor((last_index-1)/2);
		for (int i=parent_index;i>=0;i--) {
			
			heapify(target, target.length, i);
		}
		
		
	}
	public void sort(int []target,int length) {
		build_heap(target, length);
		for (int i=length-1;i>=0;i--) {
			swap(target,i,0);
			heapify(target,i,0);
			
		}
		
		
	}
}
