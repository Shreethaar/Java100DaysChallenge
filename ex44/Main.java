/* Write a Java recursive method to calculate the factorial of a given positive integer. 
 */

public class Main {
	public static void main(String[] args) {
		int factNum = 5;
		int output = factorial(5);
		System.out.println(output);


	}

	public static int factorial(int num) {
		if (num==0 || num==1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}
}



