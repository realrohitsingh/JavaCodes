package scanner;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number 1");
		double num1 = scn.nextDouble();
		System.out.println("Enter Number 2");
		double num2 = scn.nextDouble();
		double sum = num1 + num2;
		System.out.println("Sum : "+sum);
	}
}