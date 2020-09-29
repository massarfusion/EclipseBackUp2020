package student_info;

import java.util.Scanner;

public class StudentTest {
	public static int total=0;
	
	public static void main(String[] args) {
	
		Student s1=new Student ("007","Bang","m",40);
		Student s2=new Student ("009","Rose","f",41);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("Student Count: "+total);
		total=0;
		
		
		
		Student[] colony= new Student[2];
		colony[0]=new Student ("007","Bang","m",40);
		colony[1]=new Student ("009","Rose","f",41);
		System.out.println(colony[0].toString());
		System.out.println(colony[1].toString());
		System.out.println("Student Count: "+total);
	}

}
