package courseenrollment;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		System.out.println("\n\t ###STUDENT COURSE ENROLLMENT SYSTEM###\n");
		System.out.print("Number of Student:");
		Scanner in = new Scanner(System.in);
		int numOfStudent = in.nextInt();
		Student[] students = new Student[numOfStudent];
		
		for(int i = 0; i < numOfStudent; i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTution();
		}
		
		System.out.print("\n\n\n");
		System.out.println("********************Student Profile**********************");
		for(int i = 0; i < numOfStudent; i++)
		{
			System.out.println(students[i].showInfo());
		}
		System.out.println("*********************************************************");
		
	
			
	
	}
}
