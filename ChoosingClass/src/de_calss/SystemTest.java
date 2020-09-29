package de_calss;

import java.util.Scanner;

public class SystemTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input student count:");
		int totalStudents=in.nextInt();
		StudentInfo[] list=new StudentInfo[totalStudents+1]; 
//		for (int i=0;i<totalStudents;i++)
//		{
//			list[i]=new StudentInfo(in.next(),in.nextInt(), in.nextInt());
//			int courses=list[i].getTotalCourses();
//			for (int j=0;j<courses;j++)
//			{
//				Declass[] coursecolony=new Declass[courses];
//				coursecolony[j]=new Declass(in.next(), in.nextInt());
//				list[i].setCoursecolony(coursecolony);
//				
//			}
//			
//			//info-recording
//		}
//		
//		//System.out.println();
//		//printing information
//		for (int i=0;i<totalStudents;i++)
//		{
//			System.out.println("no "+ (i+1) +" student information");
//			System.out.println(list[i].getName()+" "+list[i].getGrade()+" grade");
//			System.out.println("courses:");
//			list[i].printcourse();
//		}
//		
		/*
		 input student count:2

input no 1 student name:Lucy

input no 1 student grade:2

input no 1 student course count:2

____________________________
input no 1 course name:C

input no 1 course hour:2

input no 2 course name:DS

input no 2 course hour:3
_________________________________
input no 2 student name:Hellen

input no 2 student grade:3

input no 2 student course count:3
______________________________________
input no 1 course name:Java

input no 1 course hour:3

input no 2 course name:linux

input no 2 course hour:2

input no 3 course name:html

input no 3 course hour:2*/
		
		
		for (int i=1;i<=totalStudents;i++)
		{
			
			
			System.out.print("input no "+i+" student name:");
//			list[i].setName(in.next());
			String name=in.next();
			System.out.print("input no "+i+" student grade:");
//			list[i].setGrade(in.nextInt());
			int grade=in.nextInt();
			System.out.print("input no "+i+" student course count:");
//			list[i].setTotalCourses(in.nextInt());
			int coursecount=in.nextInt();
			int loop=coursecount;
			
			list[i]=new StudentInfo(name, grade, coursecount);
			
			
			
			for (int j=1;j<=loop;j++)
			{
				list[i].coursecolony[j]=new Declass();
				System.out.print("input no "+j+" course name:");
				list[i].coursecolony[j].setName(in.next());
				System.out.print("input no "+j+" course hour:");
				list[i].coursecolony[j].setHours(in.nextInt());
				
			}
			
			
		}
		
	for (int i=1;i<=totalStudents;i++)
	{
		System.out.println("no "+ i +" student information:");
		System.out.println(list[i].getName()+" "+list[i].getGrade()+" grade");
		System.out.println("courses:");
			list[i].printcourse();
		
		
		
		
		
		
	}

}
}