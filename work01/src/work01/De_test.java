package work01;
class X{
	void do1() {System.out.println("do1");}
	int ini;
	public X(int ini) {
		super();
		this.ini = ini;
	}
}
class Y extends X {
	
	public Y(int ini) {
		super(ini);
		// TODO Auto-generated constructor stub
	}

	void do2() {System.out.println("do2");}
	
}
public class De_test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		X x2=new Y();
//		((Y)x2).do2();
		X [] xcol=new X[10];
		for (int i=0;i<xcol.length-1;i++) {
			
			xcol[i]=new X(5);
			
		}
for (int i=0;i<xcol.length;i++) {
			
			xcol[i].do1();
			
		}
	}

}
