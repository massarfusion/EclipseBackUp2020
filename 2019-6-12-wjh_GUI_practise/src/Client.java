
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
		System.out.println("����ָ��:���������Ŀadd �����Ʋ���searchname ����Ų���searchnum �б�list ����save ��ȡload ����help �˳�exit");
		while(true){
			String a=scn.nextLine();
			if(a.equalsIgnoreCase("exit")) break;
			else if(a.equalsIgnoreCase("help")) System.out.println("����ָ��:���������Ŀadd �����Ʋ���searchname ����Ų���searchnum �б�list ����save ��ȡload ����help �˳�exit");
			else if(a.equalsIgnoreCase("add")){
				System.out.println("������");
				String num=scn.nextLine();
				while (chachong2(num,s,count)) {
					 System.out.println("������������������"); 
					 num=scn.nextLine();
				}
				System.out.println("��������");
				String name=scn.nextLine();
				while (chachong1(name,s,count)) {
					 System.out.println("������������������"); 
					 name=scn.nextLine();
				}
				System.out.println("��������(�Ҿ�a������b���豸c)");
				String type=scn.nextLine().toLowerCase();
				while(!type.equals("a")&&!type.equals("b")&&!type.equals("c")) {
					System.out.println("������Ҿ�a������b���豸c��");
					type=scn.nextLine();
				}
				System.out.println("���뱣����");
				String people=scn.nextLine();
				System.out.println("�����ֵ");
				String x=scn.nextLine();
				while(!canParse(x)){
					System.out.println("������Double���ͣ�");
					x=scn.nextLine();
				}
				double value=Double.parseDouble(x);
				s[count].setName(name);
				s[count].setNum(num);
				s[count].setPeople(people);
				s[count].setType(type);
				s[count].setValue(value);
				count++;
				System.out.println("����ɹ�");	
			}
			else if(a.equalsIgnoreCase("searchnum")){
				System.out.println("������Ҫ��ѯ�ı��");
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
				if(pan==0) System.out.println("û�д˱��");
			}
			else if(a.equalsIgnoreCase("searchname")){
				System.out.println("������Ҫ��ѯ������");
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
				if(pan==0) System.out.println("û�д�����");
			}
			else if(a.equalsIgnoreCase("save")){
				System.out.println("ȷ�ϱ���?(Y/N)");
				String judge=scn.nextLine();
				while(!judge.equalsIgnoreCase("Y")&&!judge.equalsIgnoreCase("N")) {
					System.out.println("������Y/N��");
					judge=scn.nextLine();
				}
				if(judge.equalsIgnoreCase("N")) System.out.println("��ȡ��");
				else if(judge.equalsIgnoreCase("Y")){
					raf.writeInt(count);
					for(int i=0;i<count;i++){
						s[i].write(raf);
					}
					raf.seek(0);
					System.out.println("����ɹ�");
				}
			}
			else if(a.equalsIgnoreCase("load")){
				System.out.println("ȷ�϶�ȡ����������?(Y/N)");
				String judge=scn.nextLine();
				while(!judge.equalsIgnoreCase("Y")&&!judge.equalsIgnoreCase("N")) {
					System.out.println("������Y/N��");
					judge=scn.nextLine();
				}
				if(judge.equalsIgnoreCase("N")) System.out.println("��ȡ��");
				else if(judge.equalsIgnoreCase("Y")){
					count=raf.readInt();
					for(int i=0;i<count;i++){
						    s[i].read(raf);
					}
					System.out.println("��ȡ�ɹ�");
				}
			}
			else if(a.equalsIgnoreCase("list")){
				System.out.println("�������б����Ŀ���Ҿ�a������b���豸c��ȫ��d");
				a=scn.nextLine();
				if(a.charAt(0)=='d'||a.charAt(0)=='D') {
					int co=0;
					for(int i=0;i<count;i++){
							System.out.print(s[i].toString());
							System.out.printf("%.2f",s[i].getValue());
							System.out.println();
							co++;
					}
					if(co==0) System.out.println("��");
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
					if(co==0) System.out.println("��");
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
					if(co==0) System.out.println("��");
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
						if(co==0) System.out.println("��");
				}
				else System.out.println("��ʽ����");
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
