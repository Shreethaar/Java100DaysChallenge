// Write a Java program to convert a hexadecimal value into a decimal number. 

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hex;
		int deci;
		System.out.println("Enter Hexadecimal Number:");
		hex=sc.nextLine();
		deci=Integer.parseInt(hex,16);
		System.out.printf("Equivalent decimal number is: %d",deci);
	}
}

