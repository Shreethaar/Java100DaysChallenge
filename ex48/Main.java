/* Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).*/

public class Main {
	public static void main(String[] args) {
		int base=2,pow=5;
		int output=exponentCalc(2,5);
		System.out.println(output);
	}

	public static int exponentCalc(int base, int pow) {
		if(pow==0) {
			return 1;
		}

		else {
			return base*exponentCalc(base,pow-1);
		}
	}
}



