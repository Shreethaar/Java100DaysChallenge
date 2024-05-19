/* Write a Java program to implement a stack with push and pop operations. Find the top element of the stack and check if it is empty or not */

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stackNum = new Stack<>();
		stackNum.push(5);	
		stackNum.push(7);
		stackNum.push(9);
		stackNum.push(4);
		stackNum.push(2);
		stackNum.push(1);
		stackNum.push(10);
		stackNum.push(23);
		stackNum.push(34);
		stackNum.push(50);
		stackNum.push(23);
		stackNum.push(120);
		stackNum.push(522);
		stackNum.push(2345);
		stackNum.push(1234132);

		System.out.println(stackNum);

		for(int i=0;i<=stackNum.size();i++) {
			System.out.println("Pop: " + stackNum.pop());
		}
		System.out.println("Empty stack: " + stackNum.empty());

	}
}


