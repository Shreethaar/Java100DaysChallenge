//Write a Java program to convert an integer number to a binary number. 

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Input a decimal number:");
		num=sc.nextInt();
		
		if(num!=0) {
			String bin=Integer.toBinaryString(num);
			System.out.println("Binary number is: " + bin);
		}
	}
}


