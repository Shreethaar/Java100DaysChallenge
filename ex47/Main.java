/* Write a Java recursive method to check if a given string is a palindrome. */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome");
		String input=sc.nextLine();
		input=input.toLowerCase();
		if(palindrome(input)) {
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Is not Palindrome");
		}

	}
	public static boolean palindrome(String input) {
		if(input.length()<=1) {
			return true;
		}

		if(input.charAt(0)!=input.charAt(input.length()-1)) {
			return false;
		}

		return palindrome(input.substring(1,input.length()-1));
	}
}


