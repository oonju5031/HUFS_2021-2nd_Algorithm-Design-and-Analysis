package assignment03_02_Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;

//���� ����Ʈ�� �̿��� ����ġ�� �ִ� �ܹ��� �׷��� ����
public class Graph {
	private ArrayList<ArrayList<Node>> adjList;
	private int size;
	
	// ������
	public Graph(int size) {
		this.adjList = new ArrayList<ArrayList<Node>>();
		this.size = size;
		for (int i = 0; i < size; i++) {
			this.adjList.add(new ArrayList<Node>());
		}
	}
	
	// Node�� �߰�
	public void putEdge(int vertex_x, int vertex_y, int weight) {
		this.adjList.get(vertex_x).add(new Node(vertex_y, weight));
	}
	
	// vertex ���� ��ȯ
	public int numVertex() {
		return this.size;
	}
	
	// vertex_x���� vertex_y�� ���� ����ġ ��ȯ(����� ������ ���� ��� INFINITY ��ȯ)
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
			sb.append("���� ").append(i).append("�� ���� ���� ����Ʈ");
			for (int j = 0; j < this.adjList.get(i).size(); j++) {
				sb.append(" > ").append(this.adjList.get(i).get(j).getVertex());
				sb.append("(").append(this.adjList.get(i).get(j).getWeight()).append(")");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	// Dijkstra's shortest path algorithm
	public int INFINITY = 10000;
	public int UNDEFINED = 10000;
	
	public void dijkstra(int source) {
		// Initialize
		int[] distance = new int[size];
		int[] check = new int[size];
		ArrayList<ArrayList<Node>> queue = adjList;  // clone() ���?
		
		for (int i = 0; i < size; i++) {
			distance[i] = INFINITY;
			check[i] = UNDEFINED;
		}
		distance[source] = 0;
		
		while (!queue.isEmpty()) {
			// distance[u]�� �ּڰ��� vertex u�� ã�´�.
			int u = 0;
			int minDist = distance[u];
			for (int i = 1; i < size; i++) {
				if (distance[i] < minDist) {
					minDist = distance[i];
					u = i;
				}
			}
			
			// vertex u�� queue���� �����Ѵ�.
			queue.remove(u);
			
			for (int i = 0; i < queue.size(); i++) {
				if (getWeight(u, i) != UNDEFINED) {  // neighbor vertex of u still in queue
					int alt = distance[u] + getWeight(u, i);
					if (alt < distance[i]) {
						distance[i] = alt;
						check[i] = u;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(distance));
		System.out.println(Arrays.toString(check));
	}
}
