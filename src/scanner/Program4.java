package scanner;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		long mobileNumber = sc.nextLong();
		System.out.println("Enter Your Height");
		float height = sc.nextFloat();
		System.out.println("Enter your Marital Status (true/false)");
		boolean status = sc.nextBoolean();
		System.out.println("Contact : "+mobileNumber);
		System.out.println("Height : "+height);
		System.out.println("Married : "+status);
	}
}