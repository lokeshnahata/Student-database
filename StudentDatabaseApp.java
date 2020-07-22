package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
      // ask how many students to add
		System.out.println("enter the number of students to enroll: ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		student[] students = new student[n];
		
		for(int i =0;i<n;i++)
		{
			students[i] = new student();
			  students[i].enroll();
			  students[i].paytution();
			 
		}
		for(int i =0;i<n;i++) {
		 System.out.println(students[i].toString());
		}
	}

}
