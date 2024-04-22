/*  Write a Java recursive method to calculate the sum of all numbers from 1 to n. */

public class Main {
	public static void main(String[] args) {
		int n = 10;
		int output = intSumAllN(n);
		System.out.println(output);


	}

	public static int intSumAllN(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n+intSumAllN(n-1);
		}
	}
}
