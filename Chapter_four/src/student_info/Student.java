package student_info;

public class Student {
	String ID;
	String Name;
	String Gender;
	int age;
	
	public Student(String iD, String name, String gender, int age) {
		super();
		ID = iD;
		Name = name;
		Gender = gender;
		this.age = age;
		StudentTest.total+=1;
	}
	@Override
	public String toString() {
		return ID + "," + Name + "," + Gender + "," + age ;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
