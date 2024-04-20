/* Write a Java program to create and display a unique three-digit number using 1,2,3,4.
 * Also, count how many three-digit numbers are there
 */

public class Main {
	public static void main(String[] args) {
		int num[] = new int[4];
		int i,j,k;
		int count = 0;
		for(i=1;i<=4;i++) {
			num[1]=i;
			for(j=1;j<=4;j++) {
				num[2]=j;
				for(k=1;k<=4;k++) {
					num[3]=k;
					if(isUnique(num)){
						count++;
						System.out.println(num[1]+""+num[2]+""+num[3]);
					}
				}
			}
		}
		System.out.println("Total unique numbers: " + count);

	}
	public static boolean isUnique(int[] num) {
		return (num[1] != num[2] && num[2] != num[3] && num[1] != num[3]); 
	}
}

