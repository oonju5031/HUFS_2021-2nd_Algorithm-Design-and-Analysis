package assignment03_03_PrimMST;

public class Main {
	public static void main(String[] args) {
		// Generate a graph
		// Use an example from the lecture material.
		Graph g = new Graph(8);
		
		g.putEdge(0, 1, 3);
		g.putEdge(0, 3, 2);
		g.putEdge(0, 8, 4);
		g.putEdge(1, 7, 4);
		g.putEdge(2, 3, 6);
		g.putEdge(2, 5, 1);
		g.putEdge(2, 7, 2);
		g.putEdge(3, 4, 1);
		g.putEdge(4, 8, 8);
		g.putEdge(5, 6, 8);
		
		// Execute Prim MST algorithm
		//g.prim(0);
	}
	
}
