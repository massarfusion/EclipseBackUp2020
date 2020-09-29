package pileSort2;

import java.util.Arrays;

public class Pile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,9,8,36};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void Heapify(int []target,int length,int init) {
		int parent=init;
		int left=2*parent+1;
		
		while (left<length) {
			int max=parent;
			if ( ((left+1)<length)  &&target[left]<target[left+1]) {left++;}
			if (target[left]>target[parent]) {max=left;}else {;}
			//COMPARE AND SWAP
			if (max==parent) {return;}else {;}
			swap(target,parent,max);
			parent=max;
			left=2*max+1;
		}
		
		
		
	}
	public static void sort(int []target) {
		int length=target.length;
		for (int i=(length-1)/2;i>=0;i--) {
			
			Heapify(target,length,i);
			
		}
		
		for (int i=length-1;i>=0;i--) {
			swap(target,0,i);
			Heapify(target,i,0);
			
		}
		
		
	}
	public static void swap(int [] target,int index1,int index2) {
		//all indexes follows the in-array-index-order
		int temp;
		temp=target[index1];
		target[index1]=target[index2];
		target[index2]=temp;
		
	}
}
