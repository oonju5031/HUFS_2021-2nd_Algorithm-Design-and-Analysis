package assignment01_02_Queue;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int length = 10;  // The size of the array was arbitrarily set to 10.
		Integer[] queue = new Integer[length];
		
		int head = 0;
		int tail = 0;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'enque' for enqueue.");
		System.out.println("Enter 'deque' for dequeue.");
		System.out.println("Enter 'exit' to terminate the program.");
		
		
		while (true) {
			String input = scan.nextLine();
			if (input.toLowerCase().equals("exit"))
				return;
			
			if (input.toLowerCase().equals("enque")) {  // Enqueue algorithm
				System.out.print("Input an integer: ");
				int enque = scan.nextInt();
				
				queue[tail] = enque;
				if (tail + 1 == length)
					tail = 0;
				else
					tail += 1;
				
				System.out.printf("Queue: %s\n",Arrays.toString(queue));
			
			} else if (input.toLowerCase().equals("deque")) {  // Dequeue algorithm
				if (queue[head] == null) { 
					System.out.println("The queue is empty.");
				} else {
					System.out.printf("Dequeued integer: %d\n", queue[head]);
					if (head + 1 == length)
						head = 0;
					else
						head += 1;
					queue[head - 1] = null;
				}
				System.out.printf("Queue: %s\n",Arrays.toString(queue));
			}
		}
	}
}
