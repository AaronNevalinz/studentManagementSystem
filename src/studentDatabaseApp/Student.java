package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lname;
	private String gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
//	constructor: Prompts user to enter students name and year
	public Student(){
		System.out.print("Enter the student's first name: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		this.firstName = in.nextLine(); 
		
		System.out.print("Enter the student's last name: ");
		this.lname = in.nextLine();
		
		System.out.print("1-freshman \n2-Sophmore \n3-Junior \n4-Senior\nEnter the student's class level: ");
		this.gradeYear = in.nextLine();
		
		setStudentId();
	}
//	Generate an id
	private void setStudentId() {
//		gradeLevel + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
//	enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter the course you would like to enroll to (q to quit):");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);			
			String course = in.nextLine();
			if(!course.equals("Q")) {
				this.courses = this.courses + ", " + course ;
				this.tuitionBalance = this.tuitionBalance + this.costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
	}
	
//	view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + this.tuitionBalance);
	}
//	pay tuition
	public void payTuition() {
		System.out.println("Aa\n");
		viewBalance();
		int amount;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount you wanna pay: $");
		amount = in.nextInt();
		this.tuitionBalance = this.tuitionBalance - amount;
		System.out.println("\n\nThank you for your payment of: $" + amount);
		this.viewBalance();
	}
//	show status
	public void showStatus() {
		System.out.println("\n\n\nName: " + firstName + " " + lname + "\nCourses Enrolled: " + courses + "\nBalance: $" + this.tuitionBalance + "\nStudent ID: " + studentID);
	}
}	
