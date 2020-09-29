package mainFiles;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("请告诉我一共统计多少人。输入整数后回车。");
		int total=in.nextInt();
		Hashitem[] list =new Hashitem[total];
		for (int i=0;i<total;i++) {
			System.out.println("依次输入姓名 电话号码 地址 两两中间空格隔开。请注意在复制完内容后按下回车键完成输入");
			list[i]=new Hashitem(in.next(), in.next(), in.next());
			
		}
		
		HashMap map1=new HashMap();
		
		for (int i=0;i<list.length;i++) {
			
			map1.store(list[i]);
			
		}
		
		System.out.println("\n\n\n s or S means U would like to search for some with the number"+"\n"+
		"d or D means That U could delete someone.\n"+
		"e or E means ending this program instantly"+
		"\n p or P means printing every single user recorded"+
		"\n a or A means adding another record to the whole db"+
		"\n Press Enter Every Time You Complete Your Command And Follow Instructions\n\n\n");/////////////here to complete////////////
		
		while (true) {
			String instruction=in.next();
			if (instruction.equalsIgnoreCase("S")) {
				System.out.println("Enter your number for searching.Finish with pressing ENTER");
				map1.search(in.next());
				System.out.println("End of the operation, gone back to top");
				continue;
			}
			else if (instruction.equalsIgnoreCase("D")) {
				System.out.println("Enter your number for deleting.Finish with pressing ENTER");
				map1.delete(in.next());
				System.out.println("End of the operation, gone back to top");
				continue;
			}
			else if (instruction.equalsIgnoreCase("P")) {
				map1.printme();
				System.out.println("End of the operation, gone back to top");
				continue;
			}
			else if (instruction.equalsIgnoreCase("E")) {
				System.exit(0);
			}
			else if (instruction.equalsIgnoreCase("A")) {
				map1.store(new Hashitem(in.next(),in.next(),in.next()) );
			}
			else {System.out.println("Check your command and refer to the command\nBack To Top");}
		}
	}
}
