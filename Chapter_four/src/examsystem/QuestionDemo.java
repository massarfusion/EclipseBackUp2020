package examsystem;

public class QuestionDemo {
	String question;
	String [] choices;
	protected char[] correctanswerarray;
	protected char correctansweritem;
	
	public QuestionDemo(String question, String[] choices, char[] correctanswerarray) {
		super();
		this.question = question;
		this.choices = choices;
		this.correctanswerarray = correctanswerarray;
	}


	public QuestionDemo(String question, String[] choices, char correctansweritem) {
		super();
		this.question = question;
		this.choices = choices;
		this.correctansweritem = correctansweritem;
	}


	
	
	public QuestionDemo(){
		
		;
		
	}
	
	public void printme()
	{
		System.out.println(this.question);
		for (String i:this.choices)
		{
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Please choose:");
		System.out.println();
		
	}
	
	

}
