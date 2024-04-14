// Write a Java program to compare two numbers.
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2) {
			System.out.printf("%d != %d\n",num1,num2);
			System.out.printf("%d > %d\n",num1,num2);
			System.out.printf("%d >= %d\n",num1,num2);
		}
		else {
			System.out.printf("%d != %d\n",num1,num2);
			System.out.printf("%d < %d\n",num1,num2);
			System.out.printf("%d <= %d\n",num1,num2);
		}
	}
}
