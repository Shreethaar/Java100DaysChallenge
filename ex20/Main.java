//Write a Java program to convert a decimal number to hexadecimal number

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a decimal number: ");
		int num=sc.nextInt();
		String hex=Integer.toHexString(num);
		System.out.println("Hexadecimal num is " + hex);
	}
}

