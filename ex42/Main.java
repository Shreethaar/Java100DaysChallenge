/* Write a Java program that takes three numbers from the user and prints the greatest number */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] num = new int[4];
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=3;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input number " + i + ": ");
			num[i]=sc.nextInt();
			if(num[i]>max){
				max=num[i];
			}
		}
		System.out.println("The greatest number : " + max);
	}
}


