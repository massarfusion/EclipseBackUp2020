package package01_dynamicPlot;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] w={0,2,3,4,5};
		int[] v={0,3,4,5,6};
		int total=4;
		int capacity=8;
		Package01 test=new Package01(w, v, total, capacity);
		test.planner();
		test.printme();
	}

}
