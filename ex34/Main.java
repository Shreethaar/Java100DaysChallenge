//Write a Java program to compute hexagon area. 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side;
		System.out.println("Enter the side of hexagon to compute the area of hexagon:");
		side=sc.nextInt();
		double areaHex = (6*(side*side))/(4*Math.tan(Math.PI/6));
		System.out.println("Area of the hexagon is: " + areaHex);
		//testing 
	}
}

