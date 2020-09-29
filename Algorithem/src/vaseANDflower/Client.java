package vaseANDflower;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] basedata= new int [][] {
			{0,0,0,0,0,0},
			{0,7,23,-5,-24,16},
			{0,5,21,-4,10,23},
			{0,-21,5,-4,-20,20}
		};
		Vase vs1=new Vase(basedata);
		vs1.printme();
		vs1.planner();
		vs1.printme();
	}

}
