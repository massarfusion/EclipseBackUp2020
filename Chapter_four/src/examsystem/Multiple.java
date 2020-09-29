package examsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Multiple extends QuestionDemo {





	public Multiple() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Multiple(String question, String[] choices, char[] correctanswer) {
		super(question, choices, correctanswer);
		// TODO Auto-generated constructor stub
	}

	String[] correct=new String [correctanswerarray.length];
	
	
	
	public String check(String answ) 
	{
		for (int i=0;i<correctanswerarray.length;i++)
		{
			
			correct[i]=String.valueOf(this.correctanswerarray[i]);
			
			
		}
		String[] answer=answ.split("");
		
		char[] answerchar=answ.toCharArray();
		char[] correctchar=(this.correct.toString()).toCharArray();
		Arrays.parallelSort(answerchar);
		Arrays.sort(correctchar);
		
		
		
		HashSet set= new HashSet();
		for (int i=0;i<answer.length;i++)
		{
			set.add(answer[i]);
		}
		
		
		
		
//		Arrays.parallelSort(answer);
		//answer and correct
		if (answ.length()==correctanswerarray.length)
		{
			for (int i=0;i<answer.length;i++)
			{
				for (char a:correctchar)
				{
					if (Character.toUpperCase(a)==Character.toUpperCase(answerchar[i]))
					{}
					else {}
						
				}
				
				
			}
			
			
			
			
		}
		else 
		{
			return "NO";
		}
		
		
		
		return "NO";
	}
	
	
	
	
	
	
	
	
	
	
	public String verify(String answ)
	{
		for (int i=0;i<correctanswerarray.length;i++)
		{
			
			correct[i]=String.valueOf(correctanswerarray[i]);
			
		}
		
		
		
		
		String[] answer=answ.split("");
		List<String> sequence= new ArrayList<>();
		for (String i:answer)
		{
			
			if (i.equals(" ")||i.equals("\n")||i.equals("\t")||i.equals("\r"))
			{
				;
			}
//			else if(i.equalsIgnoreCase("A")==false||i.equalsIgnoreCase("a")==false||i.equalsIgnoreCase("B")==false||i.equalsIgnoreCase("b")==false||i.equalsIgnoreCase("C")==false||i.equalsIgnoreCase("c")==false||i.equalsIgnoreCase("D")==false||i.equalsIgnoreCase("D")==false) 
//			{
//				;
//			}
			else 
			{
				
				sequence.add(i);
				
			}
		}
//		//de
//		for (String i:sequence)
//		{
//			System.out.print(i);
//		}
//		//de
		
		// removing doppelgangers 
		sequence.sort(null);
		for (int i=0;i<sequence.size()-1;i++)
		{
			for (int j=(i+1);j<sequence.size();j++)
			{
				
				if (sequence.get(i).equalsIgnoreCase(sequence.get(j)))
				{
					
					sequence.remove(j);
					
				}
				
			}
			
			
		}
//		//de
//		for (String i:sequence)
//		{
//			System.out.print(i);
//		}
//		//de
		
		if (sequence.size()<answer.length||sequence.size()>answer.length)
		{
			return "NO";
		}
		else
			;
		//sequence is a purified array of answers
		
		
//		if (sequence.size()==correct.length)
//		{
//			int count =0;
//			for (int i=0;i<sequence.size();i++)
//			{
//				for (int j=0;j<correct.length;j++)
//				{
//					if (sequence.get(i).equalsIgnoreCase(  (correct[j]) )  )
//					{
//						
//						count++;
//						
//					}
//					else 
//					{
//						return "NO";
//					}
//					
//				}
//					
//				
//				
//			}
//			if (count!=correct.length)
//			{
//				
//				return "NO";
//			}
//			else 
//			{
//				return "OK";
//			}
//		}
//		
//		
		StringBuffer str=new StringBuffer();
		for (String a:sequence)
		{
			str.append(a);
		}
		String seq=str.toString();
		
		StringBuffer str2=new StringBuffer();
		for (String a:correct)
		{
			str2.append(a);
		}
		String seq2=str2.toString();
		
		if (seq.equalsIgnoreCase(seq2))
		{
			return "YES";
		}
		else {
		return "NO";}
	}
	
	
	
	
}
