package largestX;

import java.util.Scanner;

public class LargestX {

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
		int rank;
		System.out.println("Enter your rank,WARNING rank starts from ONE!");
		rank=in.nextInt();
		
		System.out.println(search(receive,0,length-1,rank));
	}
	public static int parti(int []arr , int start, int end) {
//		if (end-start+1<rank) {return -1000;}else {;}
		int pivot=arr[start];
		int i=start;
		int j=end;
		while (i<j) {
			while(i<j&&arr[j]>=pivot) {
				j=j-1;
			}
			if (i<j) {arr[i]=arr[j];}else {;}
			while(i<j&&arr[i]<=pivot) {
				i++;
			}
			if (i<j) {arr[j]=arr[i];}else {;}
			
			
		}
		arr[i]=pivot;
		return i;
//		else if ((i-start+1)>rank) {return rank(arr,start,i,rank);}
//		else if ((i-start+1)<rank) {return rank(arr,i,end,(rank-(i-start+1)));}
//		else {return 1145141919;}
		
	}
	public static int search(int []arr,int start,int end,int rank) {
		int pivot=parti(arr,start,end);
		if (rank==(pivot-start+1)) {return arr[pivot];}
		else if (rank<(pivot-start+1)) {return search(arr,start,pivot-1,rank);}
		else if (rank>(pivot-start+1)) {return search(arr,pivot+1,end,(rank-(pivot-start+1)));}
		
		else {
		return 114514;}
	}
}
