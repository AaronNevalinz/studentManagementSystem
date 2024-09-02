package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
//		ask how many users we wanna add
		System.out.print("Enter number of students to enroll");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];

//		create n number of students
		for( int n = 0; n < numOfStudents; n++){
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		System.out.println("THESE ARE THE STUDENTS WHO HAVE SO FAR ENROLLED:\n");
		for( int n = 0; n < numOfStudents; n++){
			students[n].showStatus();
		}

	}

}
