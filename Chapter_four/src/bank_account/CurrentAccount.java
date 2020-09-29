package bank_account;

public class CurrentAccount {
	String ID;
	double balance;
	int Days;
	double Rate;
	public CurrentAccount(String iD, double balance, int days, double rate) {
		super();
		ID = iD;
		this.balance = balance;
		Days = days;
		Rate = rate;
	}
	double interest;
	public void calc()
	{
		
		this.interest=balance*Rate*((double)Days/365);
		
		
	}
	public void printmeCA()
	{
		Rate*=100;
		String balan=String.format("%.2f", balance);
		String rat=String.format("%.2f", Rate);
		String intere=String.format("%.2f", interest);;
		StringBuilder result=new StringBuilder("ID:Balance:Days:Rate:");
		result.append("account:").append(ID).append(" balance:");
		result.append(balan).append(" days:").append(Days);
		result.append(" interest:").append(intere).append(" (rate:");
		result.append(rat).append("%)");
		System.out.println(result);
	}
}
