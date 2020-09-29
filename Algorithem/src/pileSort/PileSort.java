package pileSort;

public class PileSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,10,3,5,1,2};
		Plie p1=new Plie(a);
		
//		p1.build_heap(a,a.length);
		p1.sort(a, a.length);
		System.out.println(p1.a);
		
		
		
		
	}
}
