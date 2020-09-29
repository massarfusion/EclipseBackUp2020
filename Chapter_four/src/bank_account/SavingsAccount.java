package bank_account;

public class SavingsAccount {
	String ID;
	double balance;
	int Months;
	double Rate;
	double interest;
	public SavingsAccount(String iD, double balance, int months, double rate) {
		super();
		ID = iD;
		this.balance = balance;
		Months = months;
		Rate = rate;
	}
	
	public void calc()
	{
		
		this.interest=balance*Rate*((double)Months/12);
		
		
	}

	public void printmeSA()
	{
		Rate*=100;
		String balan=String.format("%.2f", balance);
		String rat=String.format("%.2f", Rate);
		String intere=String.format("%.2f", interest);;
		StringBuilder result=new StringBuilder("ID:Balance:Months:Rate:");
		result.append("account:").append(ID).append(" balance:");
		result.append(balan).append(" months:").append(Months);
		result.append(" interest:").append(intere).append(" (rate:");
		result.append(rat).append("%)");
		System.out.println(result);
	}
	
	
	
}
