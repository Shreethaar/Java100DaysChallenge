// Write a program to add binary numbers
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long bin1, bin2;
		int i=0,remainder=0;
		Scanner sc = new Scanner(System.in);

		int[] sum = new int[20];
		System.out.println("Input first binary number: ");
		bin1=sc.nextLong();
		System.out.println("Input second binary number: ");
		bin2=sc.nextLong();

		while(bin1!=0||bin2!=0) {
			sum[i++]=(int)((bin1%10+bin2%10+remainder)%2);
			remainder=(int)((bin1%10+bin2%10+remainder)/2);
			bin1=bin1/10;
			bin2=bin2/10;
		}
		if(remainder!=0) {
			sum[i++]=remainder;
		}
		--i;
		System.out.println("Sum of two binary numbers:");
		while(i>=0) {
			System.out.print(sum[i--]);
		}
		System.out.println("\n");
	}
}

