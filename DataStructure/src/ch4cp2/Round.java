package ch4cp2;

public class Round {
	int tar;
	int column[][];
	int ininum=1;
	public Round(int tar) {
		super();
		this.tar = tar;
		column=new int [tar][tar];
	}
	Position posi=new Position(0,0);
	public boolean upRoll(int size,Position start) {
		for (int i=0;i<size;i++) {
			column[start.getAxisx()][start.getAxisy()]=ininum;
			start.axisx--;
			ininum++;
		}
		for (int j=0;j<size-1;j++) {
			column[start.getAxisx()][start.getAxisy()]=ininum;
			start.axisy--;
			ininum++;
		}
		return true;
		
		
	}
	
	public boolean downRoll(int size,Position start) {
		for (int i=0;i<size;i++) {
			column[start.getAxisx()][start.getAxisy()]=ininum;
			start.axisx++;
			ininum++;
			
		}
		for (int j=0;j<size-1;j++) {
			column[start.getAxisx()][start.getAxisy()]=ininum;
			start.axisy++;
			ininum++;
		}
		
		return true;
		
	}

	public boolean spin() {
		int size=this.tar;
		while (size>0) {
			
			this.downRoll(size, posi);
			ininum++;
			posi.axisx--;
			size--;
			if (size==0) {break;}
			else {;}
			
			this.downRoll(size, posi);
			ininum--;
			posi.axisx++;
			size--;
			
			
			
		}
		
		return true;
		
	}
	
	public void printme() {
		
		for (int i=0;i<this.tar;i++) {
			for (int j=0;j<this.tar;j++)
			{
				
				System.out.println(this.column[i][j]);
				
				
			}
		}
		
		
	}
	
	
	
	
}
