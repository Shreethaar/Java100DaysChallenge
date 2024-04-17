//Write a Java method to compute the average of three numbers. 

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int first,second,third;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers to compute the average:");
		first=sc.nextInt();
		second=sc.nextInt();
		third=sc.nextInt();
		double average=avgThree(first,second,third);
		System.out.printf("The average of three numbers are %f", average);

	}

	public static double avgThree(int a, int b, int c) {
		return (double)(a+b+c)/3;	
	}
}



