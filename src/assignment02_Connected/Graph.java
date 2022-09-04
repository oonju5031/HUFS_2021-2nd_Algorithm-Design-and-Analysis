package assignment02_Connected;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	private int numVertex;  // vertex 개수
	private LinkedList<Integer> adjList[];
	
	public Graph(int n) {
		numVertex = n;
		adjList = new LinkedList[numVertex];
		for (int i = 0; i < numVertex; ++i)
			adjList[i] = new LinkedList();
	}
	
	public void addEdge(int n, int m) {
		adjList[n].add(m);
		adjList[m].add(n);
	}
	
	public void showGraph() {
		
	}
	
	public void connectedComponents() {
		int num = 1;
		boolean visited[] = new boolean[numVertex];
		
		for (int i = 0; i < numVertex; i++) {
			if (visited[i] == false) {
				System.out.printf("Component %d: ", num);
				num++;
				
				// BFS ---------------		
				LinkedList<Integer> queue = new LinkedList<Integer>();
				
				visited[i] = true;
				queue.add(i);
				
				while (queue.size() != 0) {
					i = queue.poll();
					System.out.print(i + " ");  // 
					
					Iterator<Integer> iterate = adjList[i].listIterator();
					while (iterate.hasNext()) {
						int n = iterate.next();
						if (!visited[n]) {
							visited[n] = true;
							queue.add(n);
						}
					}
				}
				// ----------------
				
				
				System.out.println();
			}
		}
	}
	
	public void bfs(int node) {
		boolean visited[] = new boolean[numVertex];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		// 시작 노드를 방문함
		visited[node] = true;
		queue.add(node);
		
		while (queue.size() != 0) {
			node = queue.poll();
			System.out.print(node + " ");  // 
			
			Iterator<Integer> i = adjList[node].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

}
