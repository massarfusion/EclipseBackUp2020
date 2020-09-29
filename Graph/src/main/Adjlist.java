package main;

import java.util.Scanner;

public class Adjlist {
	Node [] Adjlist;
	Scanner in = new Scanner (System.in);
	int Vernum;// how many nodes U have
	int Linknum;//How many sides U have
	public void initialize() {
		System.out.println("输入顶点数以及边数,空格分开");
		this.Vernum=in.nextInt();
		this.Linknum=in.nextInt();
		this.Adjlist=new Node [this.Vernum+1];
		for (int i=1;i<this.Vernum+1;i++) {
			Adjlist[i]=new Node (114514,null);
			Adjlist[i].info=i;
			Adjlist[i].link=null;
			
		}/*
		
		*
		*
		*请注意数组的起始位置是 1  
		*
		*
		*/
		System.out.println("输入顶点对,一行一个");
		for (int j=0;j<this.Linknum*2;j++) {
			System.out.println("输入起始点");
			int start=in.nextInt();
			System.out.println("输入抵达点");
			int end=in.nextInt();
			Node index=Adjlist[start];
			while (index.link!=null) {
				index=index.getLink();
			}
			index.link=new Node (end,null);
		}
		
		
	}// le progress of initialization,end of the function
	
	public void traversal_depth() {
		int [] reached =new int [this.Vernum+1];
		for (int i=0;i<this.Vernum+1;i++) {
			reached[i]=0;
		}//U start from 1 !
		Stack<Node> receiver=new Stack<Node>(this.Vernum);
		for (int i=1;i<reached.length;i++) {
			if (reached[i]!=114514) {
				receiver.push(this.Adjlist[i]);
				reached[i]=114514;
			}else {;}
			Node index=this.Adjlist[i];
			while (index.getLink()!=null) {
				if (reached[index.getLink().info]==0) {
					receiver.push(index.getLink());
				}else {;}
				index=index.getLink();
				}
			
		}
		while (receiver.isEmpty()!=true) {
			
			System.out.print(receiver.pop().getInfo()+" ");
			
		}
		
		
		
		
	}//the function is used to go through every data set in Deep♂Dark♂Fantasy order
	
	public void traversal_width() {
		
		
		
		
		
		
		
	}//the function is used to go through every data set in Width order
	
}
