package mainFiles;

public class HashMap {
	
	Hashitem [] basic =new Hashitem[8];
	
	
	
	public HashMap() {
		super();
	}



	public void store(Hashitem item) {
		if (this.basic[item.HarshCode]==null) {
			this.basic[item.HashId()]=item;
		}
		else {
			Hashitem header=this.basic[item.HashId()];
			while (header.next!=null) {header=header.next;}
			header.next=item;
		}
		
	}
	
	
	public void printme() {
		for (int i=0;i<basic.length;i++) {
			if (basic[i]==null) {;}
			else {
				Hashitem header=this.basic[i];
				header.printmoi();
				while (header.next!=null) {
					header=header.next;
					header.printmoi();
				}
			}
		}
		
		
	}
	
	public void delete(String phoneNumber) {
		int account=0;
		for (int i=0;i<basic.length;i++) {
			if (basic[i]==null) {;}
			else {
				Hashitem header=this.basic[i];
				if (header.next==null) {
					if(header.getPhoneNumber().equals(phoneNumber)) {basic[i]=null;account++;}
					else {;}
				}
				else if (header.getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
					basic[i]=header.getNext();
					account++;
				}
				else 
				{
					Hashitem header_next=header.next;
					while (header_next.next!=null) {
						if(header_next.getPhoneNumber().equals(phoneNumber)) {header.next=header_next.next;account++;}
						else{;}
						
						header_next=header_next.next;
						header=header.next;
					}
					if(header_next.getPhoneNumber().equals(phoneNumber)) {header.next=null;account++;}
					else {;}
				}
				
				
			}
	}
	
	if (account==0) {System.out.println("No result returned Check your number");}
	else {System.out.println(account+" result(s) deleted");}
		
	
	}/////////////////////////
	
	public void search(String phoneNumber) {
		int account=0;
		int length=phoneNumber.length();
		int deposit=0;
		for (int i=0;i<length;i++) {
			char tempo=phoneNumber.charAt(i);
			if (Character.isDigit(tempo)){  // ÅÐ¶ÏÊÇ·ñÊÇÊý×Ö
			    int num = Integer.parseInt(String.valueOf(tempo));
			    deposit+=num;
			}
			else {
				System.out.println("Wrong Input!");
				return;
			}
			
			
		}
		// room for refinement
		deposit=deposit % 7;
		if (basic[deposit]==null) {
			System.out.println("Wrong Input!");
		}
		else {
			Hashitem kicker=basic[deposit];
			if (kicker.getPhoneNumber().equals(phoneNumber)) {
				kicker.printmoi();
				account++;
			}
			else {
				;
			}
			while (kicker.next!=null) {
				kicker=kicker.next;
				if (kicker.getPhoneNumber().equals(phoneNumber)) {
					kicker.printmoi();
					account++;
				}
				else {
					;
				}
			}
		}
		
		
		
		
		
//		int account=0;
//		for (int i=0;i<basic.length;i++) {
//			if (basic[i]==null) {;}
//			else {
//				if (basic[i].getPhoneNumber().equals(phoneNumber)) {
//					basic[i].printmoi();account++;
//				}
//				
//				else {
//					Hashitem header=basic[i];//CRITICAL BUGS
//					while (header.next!=null) {
//						if (header.getPhoneNumber().equals(phoneNumber)) {
//							header.printmoi();account++;
//						}
//						else {;}
//						header=header.next;
//					}
//					
//					
//					
//				}
//			}
//			
//		}
		if (account==0) {System.out.println("No result returned Check your number");}
		else {System.out.println(account+" result(s) located");}
		
		
		
		
		
		
		
		
	}/////////////////////////
	
	public void insert() {
		
		
		
		
	}
	
	
	
	
}
