package assignment03_03_PrimMST;

public class Node {
	private int vertex;  // vertex number
	private int weight;  // weight of this vertex
	
	// ������
	public Node(int vertex, int weight) {
		this.vertex = vertex;
		this.weight = weight;
	}
	
	// �ش� vertex�� ��ȣ�� ��ȯ
	public int getVertex() {
		return this.vertex;
	}
	// �ش� vertex�� ����ġ�� ��ȯ
	public int getWeight() {  
		return this.weight;
	}

}
