package dataAccess;

public interface UserDao {
	
	public boolean AddUser(User userToAdd);
	public User GetUser(String name, String password);
	
	
	
	
}
