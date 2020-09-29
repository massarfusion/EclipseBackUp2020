
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
		int count=0;
		Scanner scn=new Scanner(System.in);
		Account [] s= new Account [10000];
		for(int i=0;i<10000;i++) s[i]=new Account();
		RandomAccessFile raf=null;
		raf=new RandomAccessFile("d:/data.txt","rw");
		System.out.println("常用指令:添加数据项目add 按名称查找searchname 按编号查找searchnum 列表list 保存save 读取load 帮助help 退出exit");
		while(true){
			String a=scn.nextLine();
			if(a.equalsIgnoreCase("exit")) break;
			else if(a.equalsIgnoreCase("help")) System.out.println("常用指令:添加数据项目add 按名称查找searchname 按编号查找searchnum 列表list 保存save 读取load 帮助help 退出exit");
			else if(a.equalsIgnoreCase("add")){
				System.out.println("输入编号");
				String num=scn.nextLine();
				while (chachong2(num,s,count)) {
					 System.out.println("重名，请重新起名！"); 
					 num=scn.nextLine();
				}
				System.out.println("输入名称");
				String name=scn.nextLine();
				while (chachong1(name,s,count)) {
					 System.out.println("重名，请重新起名！"); 
					 name=scn.nextLine();
				}
				System.out.println("输入类型(家具a，仪器b或设备c)");
				String type=scn.nextLine().toLowerCase();
				while(!type.equals("a")&&!type.equals("b")&&!type.equals("c")) {
					System.out.println("请输入家具a，仪器b或设备c！");
					type=scn.nextLine();
				}
				System.out.println("输入保管人");
				String people=scn.nextLine();
				System.out.println("输入价值");
				String x=scn.nextLine();
				while(!canParse(x)){
					System.out.println("请输入Double类型！");
					x=scn.nextLine();
				}
				double value=Double.parseDouble(x);
				s[count].setName(name);
				s[count].setNum(num);
				s[count].setPeople(people);
				s[count].setType(type);
				s[count].setValue(value);
				count++;
				System.out.println("输入成功");	
			}
			else if(a.equalsIgnoreCase("searchnum")){
				System.out.println("请输入要查询的编号");
				int pan=0;
				a=scn.nextLine();
				for(int i=0;i<count;i++){
					if(s[i].getNum().equals(a)){
						System.out.print(s[i].toString());
						System.out.printf("%.2f",s[i].getValue());
						System.out.println();
						pan++;
					}
				}
				if(pan==0) System.out.println("没有此编号");
			}
			else if(a.equalsIgnoreCase("searchname")){
				System.out.println("请输入要查询的名称");
				int pan=0;
				a=scn.nextLine();
				for(int i=0;i<count;i++){
					if(s[i].getName().equals(a)){
						System.out.print(s[i].toString());
						System.out.printf("%.2f",s[i].getValue());
						System.out.println();
						pan++;
					}
				}
				if(pan==0) System.out.println("没有此名称");
			}
			else if(a.equalsIgnoreCase("save")){
				System.out.println("确认保存?(Y/N)");
				String judge=scn.nextLine();
				while(!judge.equalsIgnoreCase("Y")&&!judge.equalsIgnoreCase("N")) {
					System.out.println("请输入Y/N！");
					judge=scn.nextLine();
				}
				if(judge.equalsIgnoreCase("N")) System.out.println("已取消");
				else if(judge.equalsIgnoreCase("Y")){
					raf.writeInt(count);
					for(int i=0;i<count;i++){
						s[i].write(raf);
					}
					raf.seek(0);
					System.out.println("保存成功");
				}
			}
			else if(a.equalsIgnoreCase("load")){
				System.out.println("确认读取并覆盖数据?(Y/N)");
				String judge=scn.nextLine();
				while(!judge.equalsIgnoreCase("Y")&&!judge.equalsIgnoreCase("N")) {
					System.out.println("请输入Y/N！");
					judge=scn.nextLine();
				}
				if(judge.equalsIgnoreCase("N")) System.out.println("已取消");
				else if(judge.equalsIgnoreCase("Y")){
					count=raf.readInt();
					for(int i=0;i<count;i++){
						    s[i].read(raf);
					}
					System.out.println("读取成功");
				}
			}
			else if(a.equalsIgnoreCase("list")){
				System.out.println("请输入列表的项目：家具a，仪器b，设备c，全部d");
				a=scn.nextLine();
				if(a.charAt(0)=='d'||a.charAt(0)=='D') {
					int co=0;
					for(int i=0;i<count;i++){
							System.out.print(s[i].toString());
							System.out.printf("%.2f",s[i].getValue());
							System.out.println();
							co++;
					}
					if(co==0) System.out.println("无");
				}
				else if(a.charAt(0)=='a'||a.charAt(0)=='A') {
					int co=0;
					for(int i=0;i<count;i++){
						if(s[i].getType().startsWith("a")){
							System.out.print(s[i].toString());
							System.out.printf("%.2f",s[i].getValue());
							System.out.println();
							co++;
						}
					}
					if(co==0) System.out.println("无");
				}
				else if(a.charAt(0)=='b'||a.charAt(0)=='B') {
						int co=0;
						for(int i=0;i<count;i++){
							if(s[i].getType().startsWith("b")){
								System.out.print(s[i].toString());
								System.out.printf("%.2f",s[i].getValue());
								System.out.println();
								co++;
							}
						}
					if(co==0) System.out.println("无");
				}
				else if(a.charAt(0)=='c'||a.charAt(0)=='C') {
						int co=0;
						for(int i=0;i<count;i++){
							if(s[i].getType().startsWith("c")){
								System.out.print(s[i].toString());
								System.out.printf("%.2f",s[i].getValue());
								System.out.println();
								co++;
							}
						}
						if(co==0) System.out.println("无");
				}
				else System.out.println("格式错误");
			}
		}
	}
	private static boolean chachong2(String num, Account[] s, int count) {
		for(int i=0;i<count;i++) if(num.equalsIgnoreCase(s[i].getNum())) return true;
		return false;
	}

	private static boolean chachong1(String name, Account[] s, int count) {
		for(int i=0;i<count;i++) if(name.equalsIgnoreCase(s[i].getName())) return true;
		return false;
	}

	private static boolean canParse(String x) {
		if(x.matches("\\d+"+"."+"\\d+")||x.matches("\\d+"))return true;
		return false;
	}

}
