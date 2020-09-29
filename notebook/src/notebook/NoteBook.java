package notebook;

import java.util.ArrayList;

public class NoteBook {
	 private ArrayList<String> notes=new ArrayList<String>();
	 
	 public void add(String s)
	 {
		 
		 notes.add(s);  
		 
	 }
	 
	 public void add(int index,String s)
	 {
		 
		 notes.add(index, s);
		 
	 }
	 
	 public String getNote(int index) 
	 {
		 
		 return notes.get(index);
		 
	 }

	 public int getSize()
	 {
		 return notes.size();
	 }
	 
	 public boolean deleteNote(int index) 
	 {
		 
		 notes.remove(index);
		 return true;
		 
	 }
	 
	 public String[] list()
	 {
		 String[] s=new String[this.getSize()];
		 for (int i=0;i<this.getSize();i++)
		 {
			 s[i]=getNote(i);
			 
		 }
		 return s;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 NoteBook nb=new NoteBook();
//		 nb.add("first");
//		 nb.add("second");
//		 String[] note1=nb.list();
//		 for (String s : note1)
//		 {
//			 
//			 System.out.println(s);
//			 
//		 }
//		 nb.add(1, "notsecond");
//		 System.out.println(nb.getNote(2));
//		 System.out.println(nb.getNote(1));
		 ArrayList<String> a1=new ArrayList<String>();
		 a1.add("first");
		 a1.add(0, "element");
		 a1.add("second");
		 for (String s : a1)
		 {
			 System.out.println(s);
			 
		 }
	}

}
