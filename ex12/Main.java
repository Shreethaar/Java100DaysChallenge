/*Write a Java program that takes three numbers as input to calculate and print the average of the numbers. */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter three numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		sc.close();
		double average = (x+y+z)/3;
		System.out.println("Average of three numbers entered:" + average);
	}
}

