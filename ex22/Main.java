//Write a Java program to convert a binary number to a decimal number. 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bin = sc.nextLine();
		int deci = Integer.parseInt(bin,2);
		System.out.println("Decimal number: " + deci);
	}
}
