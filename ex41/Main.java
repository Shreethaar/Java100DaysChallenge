/* Write a Java program to get a number from the user and print whether it is positive or negative. */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int input=sc.nextInt();
		if(input>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}
}

