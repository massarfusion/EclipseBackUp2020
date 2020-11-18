package leetcode2;

import java.util.Scanner;

class ListNode {
   int val;
   ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode op1=l1;
        ListNode op2=l2;
        ListNode result=new ListNode(114514);
        ListNode head=result;
        int remanant=0;
        int adv=0;
       
        while (op1!=null||op2!=null){
            if (op1!=null&&op2!=null){
               remanant=(op1.val+op2.val+adv)%10;
               adv=(op1.val+op2.val+adv)/10;
            //    result=result.next;
            //    result=new ListNode(remanant);
               result.next=new ListNode(remanant);
               result=result.next;
               op1=op1.next;
               op2=op2.next;
            }
            else if (op1==null&&op2!=null){
                remanant=(op2.val+adv)%10;
                adv=(op2.val+adv)/10;
                // adv=0;
                result.next=new ListNode(remanant);
                result=result.next;
                op2=op2.next;
            }
            else if(op2==null&&op1!=null){
                remanant=(op1.val+adv)%10;
                adv=(op1.val+adv)/10;
                // adv=0;
                result.next=new ListNode(remanant);
                result=result.next;
                op1=op1.next;
            }
            else{;}
        }
        if (adv!=0){result.next=new ListNode(adv);}
        else{;}
        return head.next;
    }
}
public class L2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		while(true) {
		System.out.println("现在开始输入吧");
		String str=in.nextLine();
		char[] col=str.toCharArray();
		int sum=0;
		for (char a:col) {
			sum+=(int)a-(int)'0';
		}
		System.out.println(sum);
		}
	}

}
