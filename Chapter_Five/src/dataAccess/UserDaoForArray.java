package dataAccess;

public class UserDaoForArray implements UserDao{
	User[] data;
	int userCount=0;
	
	
	
	
	public UserDaoForArray() {
		super();
		this.data = new User[100];
		userCount=0;
//		for (User c:data)
//		{
//			c=new User();
//		}
		
		
	}

	@Override
	public boolean AddUser(User userToAdd) {
		// TODO Auto-generated method stub
//		return false;
		if (userCount==data.length)
		{
			return false;
		}
		else
		{	;}
		for (int i=0;i<userCount;i++)
		{
			if (data[i].getName().equals(userToAdd.getName()))
			{
				return false;
			}
			else 
				;
			
		}
		data[userCount]=new User(userToAdd.getName(),userToAdd.getPassword());
		userCount++;
		return true;
		
	}

	@Override
	public User GetUser(String name, String password) {
		// TODO Auto-generated method stub
		for(User c:data)
		{
			if (c.getName().equals(name)&&c.getPassword().equals(password))
			{
				
				return c;
			
			}
			else 
			{return null;}
		}
		return null;
		
			
	}
	
}
