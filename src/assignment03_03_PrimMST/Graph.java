package assignment03_03_PrimMST;

import java.util.ArrayList;

//인접 리스트를 이용해 가중치가 있는 단방향 그래프 구현
public class Graph {
	private ArrayList<ArrayList<Node>> adjList;
	private int size;
	
	// 생성자
	public Graph(int size) {
		this.adjList = new ArrayList<ArrayList<Node>>();
		this.size = size;
		for (int i = 0; i < size; i++) {
			this.adjList.add(new ArrayList<Node>());
		}
	}
	
	// Node를 추가(양방향)
	public void putEdge(int vertex_x, int vertex_y, int weight) {
		this.adjList.get(vertex_x).add(new Node(vertex_y, weight));
		this.adjList.get(vertex_y).add(new Node(vertex_x, weight));
	}
	
	// vertex 개수 반환
	public int numVertex() {
		return this.size;
	}
	
	// vertex_x에서 vertex_y로 가는 가중치 반환
	public int getWeight(int vertex_x, int vertex_y) {
		int weight;
		try {
			weight = this.adjList.get(vertex_x).get(vertex_y).getWeight();
		} catch (IndexOutOfBoundsException e) {
			weight = INFINITY;
		}
		return weight;
	}
	
	// Print
	public void printGraph() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.size; i++) {
			sb.append("정점 ").append(i).append("의 인접 정점 리스트");
			for (int j = 0; j < this.adjList.get(i).size(); j++) {
				sb.append(" > ").append(this.adjList.get(i).get(j).getVertex());
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	// Prim's MST Algorithm
	private int INFINITY = 10000;
	
	public void prim(int source) {
		ArrayList<ArrayList<Node>> reachSet = new ArrayList<ArrayList<Node>>();
		ArrayList<ArrayList<Node>> unreachSet = adjList;
		ArrayList<ArrayList<Node>> spanningTree = new ArrayList<ArrayList<Node>>();
		
		
		
		while (!unreachSet.isEmpty()) {
			int minCost = unreachSet.get(source).get(0).getWeight();
			for (int i = 0; i < reachSet.size(); i++) {  // reachSet loop
				for (int j = 0; j < unreachSet.size(); j++) {
					// if () {  // reachSet to unreachSet is not INFINITY
						
					}
				}
			}
		}
		
		// reachSet.add(unreachSet.get(source));
		// unreachSet.remove(source);
	// }
	/*
	 * while ( UnReachSet ≠ empty ) {
      	Find edge e = (x, y) such that:
				1. x ∈ ReachSet
				2. y ∈ UnReachSet
				3. e has smallest cost

      	SpanningTree = SpanningTree ∪ {e}

      	ReachSet   = ReachSet ∪ {y}
      	UnReachSet = UnReachSet - {y}
   		}

	 */
	
}
