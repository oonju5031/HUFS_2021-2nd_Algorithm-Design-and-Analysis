package assignment03_02_Dijkstra;

public class Main {
	public static void main(String[] args) {
		// Generate a graph
		// Use an example from the lecture material.
		Graph g = new Graph(8);
		
		g.putEdge(0, 1, 9);
		g.putEdge(0, 5, 14);
		g.putEdge(0, 6, 15);
		g.putEdge(1, 2, 24);
		g.putEdge(2, 4, 2);
		g.putEdge(2, 7, 19);
		g.putEdge(3, 2, 6);
		g.putEdge(3, 7, 6);
		g.putEdge(4, 3, 11);
		g.putEdge(4, 7, 16);
		g.putEdge(5, 2, 18);
		g.putEdge(5, 4, 30);
		g.putEdge(5, 6, 5);
		g.putEdge(6, 4, 20);
		g.putEdge(6, 7, 44);
		
		// Test
		g.printGraph();
		System.out.println(g.getWeight(0, 1));  // 간선 있음
		System.out.println(g.getWeight(0, 7));  // 간선 없음(예외처리)
		
		// Execute Dijkstra algorithm
		g.dijkstra(0);
	}

}
