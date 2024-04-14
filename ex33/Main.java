// Write a Java program and compute the sum of an integer's digits.
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two digits to compute the sum");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("The sum of the digits is: " + sum);
	}
}

