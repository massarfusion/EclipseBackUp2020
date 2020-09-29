package ch4cp3;

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
//		for (int i=0;i<size;i++) {
//			column[start.getAxisx()][start.getAxisy()]=ininum;
//			start.axisx--;
//			ininum++;
//		}
//
//		for (int j=0;j<size-1;j++) {
//			column[start.getAxisx()][start.getAxisy()]=ininum;
//			start.axisy--;
//			ininum++;
//		}
//
//		return true;
		if (size==1) {column[start.getAxisx()][start.getAxisy()]=tar*tar;}
		else {;}
		column[start.getAxisx()][start.getAxisy()]=ininum;
		for (int i=0;i<size-1;i++) {
			start.axisy--;
			ininum++;
			column[start.getAxisx()][start.getAxisy()]=ininum;
			
		}
		for (int j=0;j<size-1;j++)
		{
			
			start.axisx--;
			ininum++;
			column[start.getAxisx()][start.getAxisy()]=ininum;
		}
		
		return true;
		
		
		
	}
	
	public boolean downRoll(int size,Position start) {
		if (size==1) {column[start.getAxisx()][start.getAxisy()]=tar*tar;}
		else {;}
		
		column[start.getAxisx()][start.getAxisy()]=ininum;
		for (int i=0;i<size-1;i++) {
			
			start.axisy++;
			ininum++;
			column[start.getAxisx()][start.getAxisy()]=ininum;
		}
		for (int j=0;j<size-1;j++) {
			start.axisx++;
			ininum++;
			column[start.getAxisx()][start.getAxisy()]=ininum;
		}
		return true;
		
		
	}

	public boolean spin() {
		int size=this.tar;
		while (size>0) {
			
			this.downRoll(size, posi);
			ininum++;
			posi.axisy--;
			size--;
			if (size==0) {break;}
			else {;}
			
			this.upRoll(size, posi);
			ininum++;
			posi.axisy++;
			size--;
			
			
			
		}
		
		return true;
		
	}
	
	public void printme() {
		
		for (int i=0;i<this.tar;i++) {
			for (int j=0;j<this.tar;j++)
			{
				
				System.out.print(this.column[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
}
