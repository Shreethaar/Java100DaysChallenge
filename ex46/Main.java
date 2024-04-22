/* Write a Java recursive method to calculate the nth Fibonacci number.*/

public class Main {
	public static void main(String[] args) {
		int num = 5;
		int output = fibb(5);
		System.out.println(output);
		
	}

	public static int fibb(int n) {
		if(n==1) {
			return 0;
		}
		else if(n==2||n==3) {
			return 1;
		}
		else {
			return fibb(n-1) + fibb(n-2);
		}
	}
}
