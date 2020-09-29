package basics;

import java.util.Scanner;

public class Test {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("All numeros should be divided with blank,DO NOT USE ZERO AS HEAD");
		Node baseNode = null;
		baseNode=input(baseNode);
		System.out.println("PRE");
		Preorder(baseNode);
		System.out.println();
		System.out.println("MID");
		Midorder(baseNode);
		System.out.println();
		System.out.println("POS");
		Postorder(baseNode);
	}
	
	static Node input(Node btnode) {
		int value=in.nextInt();
		if (value!=0) {
			btnode=new Node(114514);
			btnode.setData(value);
			btnode.setLeftChild(input(btnode.getLeftChild()));
			btnode.setRightChild(input(btnode.getRightChild()));
		}
		else {btnode=null;}
		return btnode;
	}
	
	static void Preorder(Node tar){
		if (tar!=null) {
			visit(tar);
			Preorder(tar.leftChild);
			Preorder(tar.rightChild);
		}
	}
	
	static void Midorder(Node tar){
		if (tar!=null) {
			Midorder(tar.getLeftChild());
			visit(tar);			
			Midorder(tar.getRightChild());
		}
	}
	
	static void Postorder(Node tar){
		if (tar!=null) {
			
			Postorder(tar.getLeftChild());
			Postorder(tar.getRightChild());
			visit(tar);
		}
		
		
	}
	
	static void visit(Node btnode) {
		if(btnode!=null)
			System.out.print(btnode.getData() + " ");
	}
	
	
}
