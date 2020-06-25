// BISMILLAHIR RAHMANIR RAHIM
package courseenrollment;
import java.util.Scanner;
public class Student {
	//variable
	private String firstName;
	private String lastName;
	private int batchYear;
	private String studentId;
	private String courses ="";
	private String section;
	private int tutionBalance = 0;
	private static int costOfCourse = 3000;
	private static int initialId = 2000;
	
	
	//constructor
	public Student()
	{
		
		Scanner in = new Scanner(System.in);
		System.out.print("Student First Name:");
		this.firstName = in.nextLine();
		System.out.print("Student Last Name:");
		this.lastName = in.nextLine();
		System.out.print("Section:");
		this.section = in.nextLine();
		System.out.print("Batch:");
		this.batchYear = in.nextInt();
		
		//calling setStudentId() in order to call itself at the initial time
		setStudentId();
		
	}
	// set student id dynamically
	public void setStudentId()
	{
		initialId++;
		this.studentId = batchYear+""+initialId;
	}
	// enrollment method
	public void enroll()
	{
		do{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter Course To Enroll(Press Q to Quit) : ");
			String course = in.nextLine();
			if(!course.equals("Q"))
			{
				courses = courses +" | "+course;
				tutionBalance = tutionBalance + costOfCourse;
			}
			else {
				break;
			}
		}while( 1 != 0);
	}
	
	// show balance method
	public void viewBalance()
	{
		System.out.println("Your Balance: "+tutionBalance+" BDT");
	}
	
	// payment method
	public void payTution()
	{
		viewBalance();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Your Payment: ");
		int payment = in.nextInt();
		tutionBalance = tutionBalance  - payment;
		System.out.println("Thank You For Your Payment "+payment+" BDT");
		viewBalance();
	}
	
	// show info method
	public String showInfo()
	{
		
		return "Name:"+firstName+" "+lastName+"\nID:"+studentId+"\nSection:"+section+"\nCourses:"+courses+"\nDue Payment:"+tutionBalance+" BDT";
		
	}

	
	
}
