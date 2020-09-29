package Sequence;



/*
 * this is a sequence joseph circle
 * 
 * 
 * 
 */
public class Joseph extends Queue {
	public boolean joseph(int outSignal) {
		outSignal=outSignal%this.realLength();
		if(this.isEmpty()) {
			System.out.println("No empty sequence allowed");
			return false;
		}
		else {;}
		int tool=this.front;
		while (this.isEmpty()!=true) {
			for (int i=0;i<outSignal-1;i++) {
				
				tool=(tool+1)%this.realLength();
				
				
			}		
			
			this.delete(tool);
			
			
		}
		return true;
		
		
		
		
	}

	public Joseph() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joseph(int initialisation) {
		super(initialisation);
		// TODO Auto-generated constructor stub
	}
	
	public boolean delete(int index) {
		////////starts from ZERO////////////
		Queue <Integer> tempoQueue=new Queue<Integer> (this.maxSize);
		if (this.isEmpty()) {
			System.out.print("EMPTY QUEUE WANNA ADD?");
			return false;
		}
		else if (index>this.realLength()-1) {
			System.out.print("Out of border");
			return false;
			
		}
		else {;}
		int counter=this.front;
		for (int i=0;i<index;i++) {
			tempoQueue.enQueue((Integer) this.deQueue());
			counter++;
			
		}
		System.out.print(this.deQueue());
		while(this.isEmpty()!=true) {
			
			tempoQueue.enQueue((Integer) this.deQueue());
			
		}
		this.data = new Object[100];
		this.front = 0;
		this.rear = 0;
		while (tempoQueue.isEmpty()!=true) {
			
			this.enQueue(tempoQueue.deQueue());
			
		}
		return true;
		
		
		
//		else {;}
//		
//		int counter=0;
//		
//		while (counter<index) {
//			tempoStack.push((Integer) this.deQueue());
//			counter++;
//			
//		}
//		
//		System.out.print(this.deQueue());
//		while (tempoStack.isEmpty()!=true) {
//			
//			this.enQueue(tempoStack.pop());
//			
//		}
//		return true;
		
	}
	
}
