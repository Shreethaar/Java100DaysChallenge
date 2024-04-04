//Write a Java program to print the area and perimeter of a rectangle. 
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of rectangle");
		double width = sc.nextDouble();
		System.out.println("Enter the height of rectangle");
		double height = sc.nextDouble();
		double area = height*width;
		double perimeter = 2*height+2*width;
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
			}
}

