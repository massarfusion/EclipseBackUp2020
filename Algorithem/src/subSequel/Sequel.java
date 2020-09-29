package subSequel;

public class Sequel {
	char [] one;
	char[] two;
	int [][] lengthMap;
	char[][] plan;
	public Sequel(char[] one, char[] two) {
		super();
		this.one = one;
		this.two = two;
		lengthMap=new int [one.length+1][two.length+1];
		plan=new char[one.length+1][two.length+1];
	}
	public void planner() {
		int row=one.length;
		int column=two.length;
		for (int i=0;i<=row;i++) {
			for (int j=0;j<=column;j++)
			{
				lengthMap[i][j]=0;
				plan[i][j]='G';
			}
			
		}
		for (int i=1;i<=row;i++) {
			
			for (int j=1;j<=column;j++) {
				if (one[i-1]==two[j-1]) {
					lengthMap[i][j]=lengthMap[i-1][j-1]+1;plan[i][j]='¨I';
				}
				else {
					if (lengthMap[i-1][j]>=lengthMap[i][j-1]) 
					{lengthMap[i][j]=lengthMap[i-1][j];plan[i][j]='¡ü';}
					else {lengthMap[i][j]=lengthMap[i][j-1];plan[i][j]='¡û';}
				}	
			}	
		}
	}
	public void printme() {
		int row=one.length;
		int column=two.length;
		for (int i=0;i<=row;i++) {
			for (int j=0;j<=column;j++)
			{
				System.out.print(lengthMap[i][j]+" ");
//				System.out.print(plan[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
