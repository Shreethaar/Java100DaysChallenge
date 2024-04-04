// Write a java program that takes a number as input and prints its multiplication table up to 10
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = sc.nextInt();

		for(int i=1;i<=10;i++){
			System.out.println(num+"X"+i+"="+(num*i));
		}
	}
}


