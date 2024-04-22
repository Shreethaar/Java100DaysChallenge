/* Write a Java recursive method to find the length of given string */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to calculate the length");
		String input = sc.nextLine();
		char[] inputString = input.toCharArray();
		int output = arrLength(inputString);
		System.out.println("Length of the string: " + output);
	}

	public static int arrLength(char[] arr) {
		return arrLength(arr,0);
	}

	public static int arrLength(char[] arr, int index) {
		if(index==arr.length) {
			return 0;
		}
		else {
			return 1+arrLength(arr,index+1);
		}
	}

}

