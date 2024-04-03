import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Input first number: ");
	       int n1=sc.nextInt();
	       System.out.println("Input second number: ");
	       int n2=sc.nextInt();
	       System.out.println(add(n1,n2)+'\n'+sub(n1,n2)+'\n'+mul(n1,n2)+'\n'+div(n1,n2)+'\n'+mod(n1,n2));

       }

       public static String add(int num1, int num2) {
		String nu1=Integer.toString(num1);
		String nu2=Integer.toString(num2);
		return(nu1+" + "+nu2+" = "+ (num1+num2));
       }

       public static String sub(int num1, int num2) {
		String nu1=Integer.toString(num1);
		String nu2=Integer.toString(num2);
		return(nu1+" - "+nu2+" = "+ (num1-num2));
       }

       public static String mul(int num1, int num2) {
		String nu1=Integer.toString(num1);
		String nu2=Integer.toString(num2);
		return(nu1+" * "+nu2+" = "+ (num1*num2));
       }

       public static String div(int num1, int num2) {
		String nu1=Integer.toString(num1);
		String nu2=Integer.toString(num2);
		return(nu1+" / "+nu2+" = "+ (num1/num2));


       }

       public static String mod(int num1, int num2) {
		String nu1=Integer.toString(num1);
		String nu2=Integer.toString(num2);
		return(nu1+" % "+nu2+" = "+ (num1%num2));
	
       }
	

}
