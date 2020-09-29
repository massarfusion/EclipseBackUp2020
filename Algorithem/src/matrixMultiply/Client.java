package matrixMultiply;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []tester= {5,6,3,4,5};
		MatrixMultiplier mx1=new MatrixMultiplier(tester);
		mx1.Planner();
		mx1.printme();
		mx1.giveDistance();
		mx1.bestRoute(1, 4);
	}
}
