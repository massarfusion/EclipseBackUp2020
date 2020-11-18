package existingClasses;

import java.util.LinkedList;
import java.util.Queue;
class Node{
	Node lNode;
	Node rNode;
	Object value;
	public void Add(Object tar) {
		if (this.value==null) {
			this.value=tar;
			return;
		}
		else {;}
		if ((Integer)tar<(Integer)value) {
			if (this.lNode==null) {
				this.lNode=new Node();
				
			}
			else {;}
			lNode.Add(tar);
		}
		else {
			if (this.rNode==null) {
				this.rNode=new Node();
			}else {;}
			rNode.Add(tar);
		}
	}
	public void midSeq(Node starter) {
		if (starter==null) {return;}
		else {
			if (starter.lNode!=null) {
				midSeq(starter.lNode);
			}else {;}
			System.out.println(this.value.toString());
			if (starter.rNode!=null) {
				midSeq(this.rNode);
			}else {;}
		}
	}
	
}


public class Panel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Hero> heroQueue=new LinkedList<Hero>();
		LinkedList<Hero> people=new LinkedList<Hero>();
		heroQueue.offer(new Hero("yjsp",810));
		heroQueue.offer(new Hero("kmr",114));
		heroQueue.offer(new Hero("mur",514));
		heroQueue.offer(new Hero("tnok",200));
		heroQueue.poll();
		System.out.println(heroQueue.peek());
		people.addFirst(new Hero("akys",1919));	
		people.addFirst(new Hero("kbtit",364));	
		people.addFirst(new Hero("pukiHide",114514));	
		people.removeFirst();
		people.addLast(new Hero("lzj",60));
		//addfirst:顶入到0位，addLast:置入最高位上一位
		int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
		  
        Node roots = new Node();
        for (int number : randoms) {
            roots.Add(number);
        }
        midSeq(roots);
		
	}
	public static void midSeq(Node starter) {
		if (starter==null) {return;}
		else {
			if (starter.lNode!=null) {
				midSeq(starter.lNode);
			}else {;}
			System.out.println(starter.value.toString());
			if (starter.rNode!=null) {
				midSeq(starter.rNode);
			}else {;}
		}
	}

}
