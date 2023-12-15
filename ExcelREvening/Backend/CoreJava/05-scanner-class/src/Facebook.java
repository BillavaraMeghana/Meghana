import java.util.Scanner;
class Facebook
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Facebook! Please Register");
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter your First Name");
		String firstName = sc.next();

        System.out.println("Enter your Sur Name");
		String surName = sc.next();

		System.out.println("Enter your Mobile Number");
		long mobileNumber = sc.nextLong();

		System.out.println("Enter your Email ID");
		String emailId = sc.next();

		System.out.println("Enter New Password");
		String newPassword = sc.next();

		System.out.println("Enter Date Of Birth");
		String dateOfBirth = sc.next();

		System.out.println("Enter your Gender");
		String gender = sc.next();

		System.out.println("Enter your Salary");
		double salary = sc.nextDouble();

		System.out.println("Enter your First Initials");
		String firstInitials = sc.next();

        System.out.println("Enter your Favorite Quote");
		sc.nextLine();
		String quote = sc.nextLine();

		System.out.println("are you Alive?");
		boolean status = sc.nextBoolean();

		System.out.println("\n_________________\nYour details are listed below\n" + 
		"First Name: " + firstName + "\n" +
	    " Sur Name: " + surName + "\n" +
		" Mobile Number: " + mobileNumber + "\n" +
		"Email ID: " + emailId + "\n" +
		"Password: " + newPassword + "\n" +
		"Date Of Birth: " + dateOfBirth + "\n" +
		"Salary: " + salary + "\n" +
		"First Initials: " + firstInitials + "\n" +
		"Quote: " + quote + "\n" +
		"Are you Alive? " + status);

		sc.close();
	}
}
