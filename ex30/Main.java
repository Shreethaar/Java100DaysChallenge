//  Write a Java program to convert a hexadecimal value into an octal number. 

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hex;
		System.out.println("Enter a Hexadecimal number:");
		hex=sc.nextLine();
		BigInteger hexBigInt = new BigInteger(hex,16);
		String octal = hexBigInt.toString(8);
		System.out.printf("Equivalent octal number is: %s",octal);
	}
}
