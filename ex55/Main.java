/* Write a Java program to sort the elements of a given stack in ascending order */

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> sortingStack = new Stack<>();
		sortingStack.push(5);	
		sortingStack.push(7);
		sortingStack.push(9);
		sortingStack.push(4);
		sortingStack.push(2);
		sortingStack.push(1);
		sortingStack.push(10);
		sortingStack.push(23);
		sortingStack.push(34);
		sortingStack.push(50);
		sortingStack.push(23);
		sortingStack.push(120);
		sortingStack.push(522);
		sortingStack.push(2345);
		sortingStack.push(1234132);

		System.out.println(sortingStack);
		sortingStack.sort();


	}
}




