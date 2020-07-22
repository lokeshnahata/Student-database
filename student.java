package studentdatabaseapp;

import java.util.Scanner;

public class student 
{
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentid;
	private String courses="";
	private int balance =0;
	private  static  int cost = 600;
	private static int id =1000;
     //constructor
	 student()
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter student firstname - ");
		 this.firstname = sc.nextLine();
		 
		 System.out.println("Enter student lastname - ");
		 this.lastname = sc.nextLine();
		 
		 System.out.println("1 - Freshers\n2 - Second year\n3 - Third year\n4 - Final year\nenter students grade level - ");
		 this.gradeyear = sc.nextInt();
		 
		 setstudentid();
		 
		 
		
	 }
	//generate ID
	private void setstudentid()
	{
		id++;
		this.studentid=  gradeyear +""+id ;
		
	}
	//enroll in courses
	public void enroll() {
		do
		{
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner sc = new Scanner (System.in);
			String course = sc.nextLine();
			if (!course.equals("Q"))
			{ 
			
				courses = courses+ "\n "+course;
			    balance = balance + cost;
		}
			else
				break;
			
		}while(1!=0);
 	}
	//view balance 
	public void viewbalance()
	{
		System.out.println("Your balance is: $ "+balance );
	}
	
	public void paytution()
	{
		viewbalance();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the payment : $ ");
		int payment = sc.nextInt();
        
		balance = balance - payment;
		System.out.println("Thank you for your payment : $ "+ payment);
		viewbalance();
	}
	//show status
	public String toString ()
	{
		return "Name : "+firstname+" "+ lastname+"\nGrade level : "+gradeyear+
				"\nStudent ID : "+studentid+"\nCourses enrolled: "+courses+
				"\nBalanace : $ "+balance ;
	}
}
