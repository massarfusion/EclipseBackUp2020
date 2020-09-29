package bank_account;

import java.util.Scanner;

public class MajorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		SavingsAccount sa= new SavingsAccount(in.next(),in.nextDouble(),in.nextInt(),in.nextDouble());
		CurrentAccount ca= new CurrentAccount(in.next(),in.nextDouble(),in.nextInt(),in.nextDouble());
		sa.calc();
		ca.calc();
		sa.printmeSA();
		ca.printmeCA();
	
	
	
	}

}
