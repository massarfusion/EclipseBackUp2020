package tree;

import java.util.Scanner;

public class Test {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node baseNode;
		baseNode=input();
		Preorder(baseNode);
		System.out.println();
		Midorder(baseNode);
		System.out.println();
		Postorder(baseNode);
	}
	
	static Node input() {
		
		Node base = new Node(114514);
		int target=in.nextInt();
		if (target==0) {base=null;}
		else {
			
			base.setData(target);
			base.leftChild=input();
			base.rightChild=input();
			
		}
		return base;
		
	}
	
	static void Preorder(Node tar){
		if (tar!=null) {
			System.out.print(tar.getData()+" ");
			
			Preorder(tar.leftChild);
			Preorder(tar.rightChild);
		}
		
		
	}
	
	static void Midorder(Node tar){
		if (tar!=null) {
			
			Preorder(tar.leftChild);
			System.out.print(tar.getData()+" ");
			
			Preorder(tar.rightChild);
		}
		
		
	}
	
	static void Postorder(Node tar){
		if (tar!=null) {
			
			Preorder(tar.leftChild);
			Preorder(tar.rightChild);
			System.out.println(tar.getData()+" ");
		}
		
		
	}
	
}
