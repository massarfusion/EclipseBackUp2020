package main;

public class SingleLink {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
		}
		
		
		
	}
	
	Node head;
	
	
	/////////////safe to swap the type////////////////
	public SingleLink() {
		
		
	}
	
	
	
	public boolean addNodeInt(int i) {
		Node tar=new Node(i);
		if (head==null) {
			head.next=tar;
			return true;
			
		}
		else {
			Node tmp=head;
			while (tmp.next!=null) {tmp=tmp.next;}
			tmp.next=tar;
			tar.next=head.next;
			return true;
			
			
		}
		
	}
	public int length() {
		int i=0;
		Node tmp=this.head;
		while (tmp.next!=null) {
			tmp=tmp.next;
			i++;
		}
		return i;
	}
	////////////return the length///////////////////
	public boolean isEmpty() {
		if (this.head.next==null) {
			return true;
		}
		else {
			return false;
		}
		
	}
//	public int peak(int index) {
//		if (index<1||index>this.length()) {
//			System.out.println(114514);
//			return -1;
//			
//		}
//		else {
//			int i=1;
//			Node bse=head;
//			Node nxt=head.next;
//			while (nxt!=null) {
//				if (i==index) {
//					
//					return nxt.data;
//				}
//				else {
//					bse=bse.next;
//					nxt=nxt.next;
//					i++;
//					
//				}
//				
//			}
//		
//		}
//		return 893;
//		
//		
//	}
//	
	
	public boolean addNode(Node tar) {
		if (head==null) {
			head=tar;
			return true;
		}
		else {
		Node tmp=head;
		while (tmp.next!=null) {tmp=tmp.next;}
		tmp.next=tar;
		return true;
		
		}
		
	}
	/////////////add to the end///////////////
	public boolean deleteNode(int index) {
		if (index<1||index>this.length()) {
			System.out.println(114514);
			return false;
			
		}
		else {
			int i=1;
			Node bse=head;
			Node nxt=head.next;
			while (nxt!=null) {
				if (i==index) {
					System.out.println(nxt.data);
					bse.next=nxt.next;
					return true;
				}
				else {
					bse=bse.next;
					nxt=nxt.next;
					i++;
					
				}
				
			}
			
			return false;
			
		}
		////////////delete a certain node////////////////
		
		
		
		
	}
	
	
	
	
	
}
