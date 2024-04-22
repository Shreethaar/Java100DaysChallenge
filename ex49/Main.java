/*Write a Java recursive method to find the sum of all odd numbers in an array. */

public class Main {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int oddSum = sumOddArr(num);
		System.out.println(oddSum);	
	}

	public static int sumOddArr(int[] num) {
		return sumOddArr(num,0);
	}

	public static int sumOddArr(int[] num, int index) {
		if(index>=num.length) {
			return 0;
		}
		if(num[index]%2!=0) {
			return num[index]+sumOddArr(num,index+1);
		}
		else {
			return sumOddArr(num,index+1);
		}
	}
}
