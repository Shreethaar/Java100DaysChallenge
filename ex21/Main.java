//Write a Java program to convert a decimal number to an octal number. 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int num = sc.nextInt();
		String octa = Integer.toOctalString(num);
		System.out.println("Octal number is: " + octa);
	}
}

