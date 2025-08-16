package scanner;
import java.util.Scanner; // Step : 1

public class Program1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // Step : 2
		System.out.println("Enter the Value : ");
		int val = scn.nextInt(); // Step : 3
		System.out.println("Value : "+val);
		
		
	scn.close();
	}
}