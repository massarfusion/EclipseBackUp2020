package rockPile;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner (System.in);
		System.out.println("How many Numbers in Your Mind?");
		int count=in.nextInt();
		System.out.println("Type in,Divide Them with ENTER");
		int [] pile=new int [count+1];
		pile[0]=114514;
		for (int i=1;i<=count;i++) {
			pile[i]=in.nextInt();
		}
		
//		int [] pile= {0,13,7,8};//starts from 1 instead of 0
		RockPile rp=new RockPile(pile);
//		System.out.println(rp.sumUp(pile, 1, 2));
		rp.Planner();
		rp.printme();
		rp.bestRoute(1, count);
		rp.printSol();
		
		in.close();
	}

}
