// Write a Java program to print the area and perimeter of a circle
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double radius = sc.nextDouble();
		double pi = Math.PI;
		double perimeter = 2*pi*radius;
		double area = pi*(Math.pow(radius,2));
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
	}
}

