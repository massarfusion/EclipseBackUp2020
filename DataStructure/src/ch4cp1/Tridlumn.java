package ch4cp1;

public class Tridlumn {
	Trid [] column;
	int length=0;
	int index=0;
	
	public Tridlumn(int size) {
		
		column=new Trid[size];
		
	}
	
	
	public boolean addTrid(int x, int y, double data) {
		
		
		Trid tmp=new Trid(x,y,data);
		if (this.length==0) {
			this.column[index]=tmp;
			index++;
			length++;
			return true;
		}
		else {;}
		
		
		
		
		
		for (Trid cmp : column) {
			
//			if (cmp==null) {continue;}
//			else {;}
//			
//			
//			
//			if (cmp.covers(tmp)) {
//				
//				cmp.addUp(tmp);
//				return true;
//			}
//			else {
//				column[index]=tmp;
//				index++;
//				length++;
//				return true;
//				
//			}
			
			if (cmp==null) {continue;}
			else {;}
			
			if (cmp.covers(tmp)) {
				
				cmp.addUp(tmp);
				return true;
			}
			else {continue;}
			
		}
		
		column[index]=tmp;
		index++;
		length++;
		return true;
		
		
		
		
	}
	
	
	
	public boolean printme() {
		
		
			
//		System.out.println(tmp.getAxisx()+" "+tmp.getAxisy()+" "+tmp.getData());
		int point=0;
		for (Trid tmp:column) {
			if (tmp==null) {continue;}
			else {;}
			
			
			if (tmp.getData()==0) {point++;}
			else {;}
		}
		if (point==this.length) {
			System.out.println("-1 -1 -1");
			return true;
		}
		else {;}
		
		int maxX=this.column[0].getAxisx();
		int maxY=this.column[0].getAxisy();
		for (Trid tmp : column) {
			if (tmp==null) {
				continue;
			}
			else {;}
			
			if (tmp.getAxisx()>maxX) {
				maxX=tmp.getAxisx();
			}
			else {;}
			if (tmp.getAxisy()>maxY) {
				maxY=tmp.getAxisy();
			}
			else {;}
			
		}	
		
		Trid [][] store=new Trid [maxX][maxY];	
		for (Trid tmp : column) {
			if (tmp==null) {continue;}
			else {
				
				store[tmp.getAxisx()-1][tmp.getAxisy()-1]=tmp;
				
				
			}
			
			
			
		}
		
		for (int indx=0;indx<maxX;indx++) {
			for(int indy=0;indy<maxY;indy++) {
				
				if (store[indx][indy]==null) {
					;
				}
				else {store[indx][indy].printmoi();}
				
				
			} 
			
			
			
		}
		
		
		
		return true;
		
	}
	
	
	
}
