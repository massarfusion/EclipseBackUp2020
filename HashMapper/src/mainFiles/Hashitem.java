package mainFiles;

public class Hashitem {
	String phoneNumber;
	String userName;
	String address;
	int HarshCode;
	Hashitem next;
	public Hashitem(String userName, String phoneNumber, String address) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.HarshCode=this.HashId();
		
	}
	
	public int HashId() {
		int length=this.phoneNumber.length();
		int deposit=0;
		for (int i=0;i<length;i++) {
			char tempo=this.phoneNumber.charAt(i);
			if (Character.isDigit(tempo)){  // 判断是否是数字
			    int num = Integer.parseInt(String.valueOf(tempo));
			    deposit+=num;
			}
			else {
				System.out.println("Wrong Number!");
			}
			
			
		}
		// room for refinement
		deposit=deposit % 7;
		return deposit;
	}
	
	public void printmoi() {
		System.out.println("姓名："+this.userName+" 电话号码："+this.phoneNumber+" 地址："+this.address);
	}
	
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public String getAddress() {
		return address;
	}

	public Hashitem getNext() {
		return next;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNext(Hashitem next) {
		this.next = next;
	}
	
	
	
	
}
