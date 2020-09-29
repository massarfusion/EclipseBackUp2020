package main;

public class CircleLink {
	
	
//	class Node{
//		int data;
//		Node next;
//		public Node(int data, Node next) {
//			super();
//			this.data = data;
//			this.next = next;
//		}
//		public Node(int data) {
//			super();
//			this.data = data;
//		}
//		public int getData() {
//			return data;
//		}
//		public Node getNext() {
//			return next;
//		}
//		public void setData(int data) {
//			this.data = data;
//		}
//		public void setNext(Node next) {
//			this.next = next;
//		}
//		
//		
//	}
//	
	public CircleLink() {
		head=new Node(114514810);
		head.next=head;
		
	}
	
	Node head;
	
	
	
	int size()
    {
		if (head.next==head) {return 0;}
		else {;}
        Node temp = head;
        int size=0;
        while(temp.next!=head)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }
	
	public boolean delete(int index) {
		if (index>this.size()) {return false;}
		else {
			int i=1;
			Node tmp=head;
			Node tmp_aft=head.next;
			while (tmp_aft!=head) {
				if (i==index) {
					System.out.print(tmp_aft.getData());
					tmp.next=tmp_aft.next;
					return true;
				}
				else {
					i++;
					tmp=tmp.next;
					tmp_aft=tmp_aft.next;
				}
				
			}
			
			
			
		}
		return false;
		
	}
	
	
	
	public boolean delete(Node tar) {
		if (this.size()==0) {
			return false;
			
		}
		else {
			Node tmp=head;
			Node tmpAft=head.next;
			if (head.next==tar) {
				System.out.print(tmpAft.data);
				
				tmp.next=tmpAft.next;
				
				return true;
			}
			else {
				tmp=tmp.next;
				tmpAft=tmpAft.next;
			}
			
			
		}
		return false;
	}
	
	public void printme() {
		if (head.next==head) {return;}
		Node tmp=head.next;
		System.out.print(tmp.data+" ");
		while (tmp.next!=head) {
			tmp=tmp.next;
			System.out.print(tmp.data+" ");
			
		}
		
		
		
	}
	
	
	
	public boolean add(int i) {
		Node target=new Node(i);
		if (head.next==head) {
			head.next=target;
			target.next=head;
			return true;
		}
		else {
			Node tmp=head;
			while (tmp.next!=head) {
				
				tmp=tmp.next;
				
			}
			tmp.next=target;
			target.next=head;
			return true;
		}
		
		
		
	}// add to the tail
	
	public boolean joseph(int outSignal) {
		int length=this.size();
		if (length==0) {
			
			return false;
			
			
		}
		else {;}
		outSignal=outSignal%length;
		Node tmp=head.next;
		/////new a doppelganger////////
		CircleLink cl2=new CircleLink();
		while (tmp!=this.head) {
			cl2.add(tmp.data);
			tmp=tmp.next;	
		}
		Node tempo=cl2.head;
		Node tempo_next=cl2.head.next;
		
		Node tool=cl2.head;
		while (tool.next!=cl2.head) {
			
			tool=tool.next;
			
		}
		tempo=tool;
		tool.next=head.next;
		//////////tail bites the next of head///////////////
		//tempo is at the original tail while tempo_next is at the original first/////
		while (tempo!=tempo_next) 
		{
			
			
		for (int i=1;i<outSignal;i++) {
			tempo_next=tempo_next.next;
			tempo=tempo.next;
			
		}
		System.out.print(tempo_next.data+" ");
		tempo_next=tempo_next.next;
		tempo.next=tempo_next;
		
		}
		System.out.print(tempo.data);
		return true;
	}
	
	
	
	
	
	
	
	
	
	
}
