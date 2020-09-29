package Sequence;



/*
 * this is a sequence joseph circle
 * 
 * 
 * 
 */
public class Joseph extends Queue {
	
	//CORE OF THE PROGRAM
	public boolean joseph(int outSignal) {
		outSignal=outSignal%this.realLength();//in case it's larger
		if(this.isEmpty()) {
			System.out.println("No empty sequence allowed");
			return false;
		}//fliter the empty seq out
		else {;}
		int tool=this.front;
		while (this.isEmpty()!=true) {
			for (int i=0;i<outSignal-1;i++) {
				
				tool=(tool+1)%this.realLength();
				
				
			}		//i goes "outsignal" steps before it reaches its destination at "delete.func"
			
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
		System.out.print(this.deQueue());//print out the target numero and remove it 
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
		
		//origin: |012345|temp: ||  ->ori:|012| detected:3 temp:|45|->ori:|01245| temp:||
		
		
		
		
		
		
		
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
