package work01;

import java.util.Scanner;

public class DigPow {
	
	public static long digPow(int n, int p) {
		// your code
    int initar=n;
    int digit=0;
    while (initar!=0) {
    	
    	initar/=10;
    	digit++;
    	
    	
    }
		
	int massdigit=digit+(p-1);
	
	int tar=n;
	int rcv=0;
	while(tar!=0) {
		rcv+=Math.pow((tar%10),massdigit);
		massdigit--;
		tar/=10;
	}
	
		
	
    
    
    if (rcv%n !=0){
      return -1 ;
    }
    else{
      return (rcv/n);
    }
    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=(int) digPow(in.nextInt(), in.nextInt());
		System.out.println(a);
		
	}

}

