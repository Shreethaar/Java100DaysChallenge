// Write a Java method to display the middle character of a string. 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		if(input.length()%2!=0){
			System.out.printf("This string has odd numbers characters.");
			System.out.printf("The middle character of a string is: %c",oddString(input));
		}
		else {
			System.out.printf("This string has even numbers characters.");
			System.out.printf(evenString(input));
		}


	}
	//hello
	public static char oddString(String input) {
		int middle = input.length()/2;
		return input.charAt(middle);
	}


	public static String evenString(String input) {
		int middle = input.length()/2;
		char middleChar1 = input.charAt(middle-1);
		char middleChar2 = input.charAt(middle);
		return String.format("The middle characters of the string is %c and %c",middleChar1,middleChar2);
	}
}


