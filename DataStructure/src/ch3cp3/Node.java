package ch3cp3;


class Node{
	int data;
	int num;
	int score;
	Node next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public Node(int num,int score) {
		this.data=8933;////////////might problem here/////////////
		this.num=num;
		this.score=score;
		
	}
	
	public String toString()
	{
		String result=null;
		result=String.format("[num=%d,score=%d]", num,score);
		return result;
		
	}	
	
	
	
	
	
	
	public Node(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}