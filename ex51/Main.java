/* Write a Java program that throws an exception and catch it using a try-catch block. */


public class Main {
	public static void main(String[] args) {
		try {
			int a=5,b=0;
			int div=a/b;
			System.out.println(div);
		}
		catch (Exception e) {
			System.out.println((e.getMessage()));
		}
	}

}

