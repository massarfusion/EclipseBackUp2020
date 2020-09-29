package basics;

public class Node {
	
	int data;
	Node parent;
	Node leftChild;
	Node rightChild;
	void printme() {
		
		System.out.println(this.data);
		
	}
	
	
	public Node(int data) {
		super();
		this.leftChild=null;
		this.rightChild=null;
		this.data = data;
	}

	
	public int getData() {
		return data;
	}


	public Node getParent() {
		return parent;
	}


	public Node getLeftChild() {
		return leftChild;
	}


	public Node getRightChild() {
		return rightChild;
	}


	public void setData(int data) {
		this.data = data;
	}


	public void setParent(Node parent) {
		this.parent = parent;
	}


	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}


	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}


	void filment(int target,Node start) {
		
//		if (this.leftChild!=null&&this.rightChild!=null) {
//			
//			this.getParent().filment(target);
//			return;
//		}else {;}
//		if (this.leftChild==null) {
//			this.leftChild=new Node (target);
//			this.leftChild.setParent(this);
//			return;
//		}else {;}
//		if (this.rightChild==null) {
//			this.rightChild=new Node(target);
//			this.rightChild.parent=this;
//			return;
//		}else {;}
		if (start.leftChild!=null&&start.rightChild!=null) {
			
			start=start.getParent();
			start.filment(target, start);
			
		}else {;}
		if (start.leftChild==null) {
			start.leftChild=new Node (target);
			start.leftChild.setParent(start);
			if (target==0) {
				;
			}
			else {start=start.leftChild;}
			return;
		}else {;}
		if (start.rightChild==null) {
			start.rightChild=new Node(target);
			start.rightChild.setParent(start);
			if (target==0) {
				;
			}else {start=start.rightChild;}
			return ;
		}else {;}
		
	}
	
	
	
}
