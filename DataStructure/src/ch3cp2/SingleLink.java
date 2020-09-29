package ch3cp2;

public class SingleLink {
	
	Node head=new Node(114514810);
	
	
	/////////////safe to swap the type////////////////
	public SingleLink() {
		this.head.data=114514893;
		this.head.next=null;
	}
	
	///////////heads are always smelly///////////
	
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
			System.out.println("Not Found");
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
		///////以表头的NEXT为1，最大THIS.SIZE/////////
		
		
		
		
	}
	public void printme() {
		
		Node tmp=this.head;
		while (tmp.next!=this.head) {
			tmp=tmp.next;
			System.out.println(tmp.data);
			
			
			
		}
		
	}
	
	
	
	
}
