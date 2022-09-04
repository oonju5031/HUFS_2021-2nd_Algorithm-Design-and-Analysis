package assignment03_03_PrimMST;

public class Node {
	private int vertex;  // vertex number
	private int weight;  // weight of this vertex
	
	// 생성자
	public Node(int vertex, int weight) {
		this.vertex = vertex;
		this.weight = weight;
	}
	
	// 해당 vertex의 번호를 반환
	public int getVertex() {
		return this.vertex;
	}
	// 해당 vertex의 가중치를 반환
	public int getWeight() {  
		return this.weight;
	}

}
