package examsystem;

import java.util.ArrayList;
import java.util.List;

public class Single extends QuestionDemo {

	public Single() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	


	public Single(String question, String[] choices, char correctansweritem) {
		super(question, choices, correctansweritem);
		// TODO Auto-generated constructor stub
	}

	




	public String verify(String answ)
	{
		List<String> sequence= new ArrayList<>();
		String[] answer=answ.split("");
		for (int i=0;i<answer.length;i++)
		{
			
			if (answer[i].equals(" ")||answer[i].equals("\n")||answer[i].equals("\t")||answer[i].equals("\r"))
			{
				;
				
			}
			else 
			{
				sequence.add(answer[i]);
			}
		}
		if (sequence.size()!=1)
		{
			
			
			return "NO";
			
			
			
		}
		else
		{
			
			if (sequence.get(0).equalsIgnoreCase(String.valueOf(correctansweritem)))
			{
				
				return "OK";
			}
			else
			{return "NO";}
			
		}		
		
	}
	
	
}
