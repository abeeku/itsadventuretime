/*
 * AP CS MOOC
 * 
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class student_runner_Student
{
	public static void main(String str[]) throws IOException
	{
		Student s1 = new Student();
		System.out.println(s1);

		Student s2 = new Student();
		System.out.println(s2);

		Student s3 = new Student();
		System.out.println(s3);

		Student s4 = new Student("Mrs.", "Dovi", 7, 3.4);
		System.out.println(s4);
		
		ArrayList<Student> goodStudents = new ArrayList<Student>();
		ArrayList<Student> lowStudents = new ArrayList<Student>();
		
		goodStudents.add(s1);
		goodStudents.add(s2);
		goodStudents.add(s3);
		goodStudents.add(s4);
		
		for(int i=goodStudents.size()-1;i>=0;i--) {
			//System.out.println(goodStudents.get(i).getGpa());
			if(goodStudents.get(i).getGpa()<2.0){
				lowStudents.add(goodStudents.get(i));
				
				goodStudents.remove(i);
			}
		}

		System.out.println("Good Students\n "+goodStudents);
		
		System.out.println("Students that need some work\n"+lowStudents);
		Scanner scan = new Scanner(System.in);
		System.out.println("Make a new Student...");
		System.out.print("First Name: ");
		String fname = scan.nextLine();
		System.out.print("Last Name: ");
		String lname = scan.nextLine();
		System.out.print("Grade Level: ");
		int gL = scan.nextInt();
		System.out.print("GPA: ");
		double gpa = scan.nextDouble();
		System.out.println(new Student(fname,lname,gL,gpa));
	}

}