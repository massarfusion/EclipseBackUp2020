package de_calss;

public class StudentInfo {
	String name;
	int grade;
	int totalCourses;
	public StudentInfo(String name, int grade, int totalCourses) {
		super();
		this.name = name;
		this.grade = grade;
		this.totalCourses = totalCourses;
	}
	
	
	
	protected Declass[] coursecolony=new Declass[99];
	public int getTotalCourses() {
		return totalCourses;
	}
	public void setTotalCourses(int totalCourses) {
		this.totalCourses = totalCourses;
	}
	public Declass[] getCoursecolony() {
		return coursecolony;
	}
	public void setCoursecolony(Declass[] coursecolony) {
		this.coursecolony = coursecolony;
	}
	
	
	
	public void printcourse()
	{
		int numberofcourses=this.totalCourses;
		int totalhours=0;
		for (int i=1;i<=numberofcourses;i++)
		{
			String nameofcourse=this.coursecolony[i].getName();
			int hour=this.coursecolony[i].getHours();
			totalhours+=hour;
			System.out.println("("+i+")"+nameofcourse+":"+hour+" hour");
			
		}
		System.out.println("hours:"+totalhours);
		System.out.println();
	}
	
	
	
	public StudentInfo() {
		super();
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
	
	
	
	
	
}
