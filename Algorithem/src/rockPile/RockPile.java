package rockPile;

public class RockPile {
	int [] pile;
	int [][] planner;
	int [][] save;
	int lengthC;
	public RockPile(int[] pile) {
		super();
		this.pile = pile;
		this.planner=new int [this.pile.length][this.pile.length];
		this.save=new int [this.pile.length][this.pile.length];
		this.lengthC=pile.length-1;//有几个可用数字
	}
	public void Planner() {
		for (int i=1;i<=lengthC;i++) {
//			planner[i][i]=this.pile[i];
			planner[i][i]=0;
		}
		
		
		for (int leap=2;leap<=lengthC;leap++) {
			for (int i=1;i<=this.lengthC-leap+1;i++) {
				int j=i+leap-1;
				planner[i][j]=planner[i+1][j]+planner[i][i]+this.sumUp(pile, i, i)+this.sumUp(pile, i+1, j);
				save[i][j]=i;
				for (int k=1+i;k<j;k++) {
					int temp=planner[i][k]+planner[k+1][j]+this.sumUp(pile, i, k)+this.sumUp(pile, k+1, j);
					if (temp<planner[i][j]) {
						planner[i][j]=temp;
						save[i][j]=k;
					}
					
				}
			}
		}
		
		
	}
	
	public void printme() {
		System.out.println("Here's the planner");	
		for (int i=1;i<planner[0].length;i++) {
			for (int j=1;j<planner[0].length;j++) {
				System.out.print(save[i][j]);
				
//				System.out.print(m[i][j]);
				System.out.print("          ");
			}
			System.out.println();	
		}
		System.out.println("Here's the Memory Book");	
		for (int i=1;i<planner[0].length;i++) {
			for (int j=1;j<planner[0].length;j++) {
//				System.out.print(s[i][j]);
				
				System.out.print(planner[i][j]);
				System.out.print("          ");
			}
			System.out.println();	
		}
		System.out.println();	
		
		
	}
	
	public void bestRoute(int init,int end) {
		if (init==end) {System.out.print("("+init+")");return;}
		if (end-init==1) {System.out.print("("+init+"+"+end+")");return;}
		int divis=save[init][end];
		this.bestRoute(init,divis);
		System.out.print("+");
		this.bestRoute(divis+1,end);
	}
	
	protected int sumUp(int []a,int init,int end) {
		int sum=0;
		for (int i=init;i<=end;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public void printSol() {
		System.out.println("\n下面输出最佳值");	
		System.out.println(this.planner[1][this.lengthC]);	
	}
	
}
