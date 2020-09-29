package dataAccess;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao dao=new UserDaoForArray();
		Application app=new Application(dao);
		System.out.println("******registe******");
		app.registe();
		
		System.out.println("******registe******");
		app.registe();
	
		System.out.println("******login******");
		app.login();
	}

}
