// Write a Java program to convert a hexadecimal number into a binary number. 

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hex;
		System.out.println("Enter Hexadecimal number:");
		hex=sc.nextLine();
		BigInteger hexBigInt = new BigInteger(hex,16);
		String bin = hexBigInt.toString(2);
		System.out.printf("Equivalent Binary Number is: %s",bin);
	}
}	
 					
