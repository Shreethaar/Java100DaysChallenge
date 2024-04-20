/* Write a java program to reverse a string. */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse it:");
		String input = sc.nextLine();
		char[] alph = input.toCharArray();
		for(int i=alph.length-1;i>=0;i--) {
			System.out.print(alph[i]);
		}
	}
}

