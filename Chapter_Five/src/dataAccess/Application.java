package dataAccess;

import java.util.Scanner;

public class Application {
	Scanner in=new Scanner(System.in);
	
	private UserDao dao;

	public Application(UserDao dao) {
		super();
		this.dao = dao;
	}
	
	public void login() {
		
		String name=in.next();
		String password=in.next();
		User userToProcess=dao.GetUser(name, password);
		if (userToProcess==null)
		{
			
			System.out.println(name+",login fail!");
			
		}
		else
		{
			
			System.out.println(userToProcess.getName()+",login success!");
			
			
		}
		
		
	}
	
	public void registe()
	{
		System.out.println("get your username");
		String name=in.next();
		System.out.println("get your password");
		String password1=in.next();
		System.out.println("repeat your password");
		String password2=in.next();
		User userToReg;
		if (password1.equals(password2)==false)
		{
			System.out.println("passwords not equal!");
			return;
		}
		else 
		{
			userToReg=new User(name,password1);
		}
		
		
		if (dao.AddUser(userToReg))
		{
			
			
			System.out.println(name+",registe success!");
			
		}
		else 
		{
			System.out.println(name+",Replicater error");
			return;
			
			
		}
		
		
		
		
	}
	
	
	
}
