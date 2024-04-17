//Write a Java method to find the smallest number among three numbers.
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.printf("The smallest number among three numbers is: %d", maxInt(a,b,c));



	}

	public static int maxInt(int a, int b, int c) {
		int min;
		if(a<b&&a<c) {
			min=a;
		}
		else if(b<a&&b<c) {
			min=b;
		}
		else {
			min=c;
		}
		return min;
	}
}

