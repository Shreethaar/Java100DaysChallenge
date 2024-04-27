/*  Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd. */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integers");
		int num=sc.nextInt();
		try {
			oddDetect(num);
		}
		catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	public static void oddDetect(int n) {
		if(n%2!=0) {
			throw new IllegalArgumentException("ODD NUMBER DETECTED");
		}
		else {
			System.out.println("Even number is approved");
		}
	}
}
