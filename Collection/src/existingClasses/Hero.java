package existingClasses;

public class Hero {
	String name;
	int Hitpoint;
	public Hero(String name, int hitpoint) {
		super();
		this.name = name;
		Hitpoint = hitpoint;
	}
	public Hero() {
		super();
		this.name = "default";
		Hitpoint = 810;
	}
	public String getName() {
		return name;
	}
	public int getHitpoint() {
		return Hitpoint;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHitpoint(int hitpoint) {
		Hitpoint = hitpoint;
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", Hitpoint=" + Hitpoint + "]";
	}
	
}
