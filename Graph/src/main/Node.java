package main;

public class Node {
	int info;
	Node link;
	public int getInfo() {
		return info;
	}
	public Node getLink() {
		return link;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	public Node(int info, Node link) {
		super();
		this.info = info;
		this.link = link;
	}
	
	
}
