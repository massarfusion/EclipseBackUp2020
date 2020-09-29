package package01_rollback;

import java.util.Scanner;

public class Client {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] weights= {2,3,4,5};
		int [] values= {3,4,5,6};
		int capacity=8;
		int total=4;
		Pack test1=new Pack(total,weights,values,capacity);
		test1.trace(0);
		test1.printme();
	}
	
	 
	
	
	
}
