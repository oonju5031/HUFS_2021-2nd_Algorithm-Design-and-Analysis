package assignment01_01_Stack;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int length = 10;  // The size of the array was arbitrarily set to 10.
		Integer[] stack = new Integer[length];
		
		int top = -1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'push' to push an integer onto the stack.");
		System.out.println("Enter 'pop' to pop a value off the stack.");
		System.out.println("Enter 'exit' to terminate the program.");
		
		while (true) {
			String input = scan.nextLine();
			if (input.toLowerCase().equals("exit"))
				return;
			
			if (input.toLowerCase().equals("push")) {  // Push algorithm
				System.out.print("Input an integer: ");
				int push = scan.nextInt();
				
				top += 1;
				stack[top] = push;
				
				System.out.printf("Stack: %s\n", Arrays.toString(stack));
				
			} else if (input.toLowerCase().equals("pop")) {  // Pop algorithm
				if (top == -1) {
					System.out.println("The stack is empty.");
				} else {
					top -= 1;
					System.out.printf("Popped integer: %d\n", stack[top + 1]);
					stack[top + 1] = null;
					System.out.printf("Stack: %s\n", Arrays.toString(stack));
				}
			}
		}
	}
}
