import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		int result=multiply(num1,num2);
		System.out.println("Expected Output: " + result);
	}


	public static int multiply(int x, int y) {
		try {
			int sum;
			sum=x*y;
			return sum;
		}

		catch(Exception e) {
			System.out.println("Input invalid"+e.getMessage());
			return 0;
		}
	}
}




		
