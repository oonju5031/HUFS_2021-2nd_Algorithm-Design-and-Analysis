package assignment01_03_LinkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LinkedList list = new LinkedList();
		
		System.out.println("Enter 'insert' to insert the string.");
		System.out.println("Enter 'delete' to delete the last string.");
		System.out.println("Enter 'print' to see the linked list.");
		System.out.println("Enter 'exit' to terminate the program.");
		
		while (true) {
			String input = scan.next();
			if (input.equals("exit"))
				break;
			
			if (input.toLowerCase().equals("insert"))
				list.insert(scan.next());
			else if (input.toLowerCase().equals("delete"))
				list.delete();
			else if (input.toLowerCase().equals("print"))
				list.print();			
		}
		
		scan.close();
	}

}
