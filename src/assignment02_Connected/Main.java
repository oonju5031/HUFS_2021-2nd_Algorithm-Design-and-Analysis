package assignment02_Connected;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("The number of vertex: ");
		int vertex = scan.nextInt();
		Graph g = new Graph (vertex);
		
		System.out.println("1. Input 'add n m' to make an edge between n and m.");
		System.out.println("2. Input 'BFS' to run breath search algorithm.");
		System.out.println("3. Input 'connect' to identify connected components.");
		
		while (true) {
			String input = scan.next();
			
			if (input.equals("add")) {
				int n = scan.nextInt();
				int m = scan.nextInt();
				g.addEdge(n, m);
			}
			else if (input.equals("BFS")) {
				System.out.print("Input start node: ");
				int start = scan.nextInt();
				g.bfs(start);
			}
			else if (input.equals("connect")) {
				g.connectedComponents();
			}
		}
		
		
	}
}
