package assignment04_02_FloydWarshall;

/**
 * @author JunYoung Lee
 */
public class Main {
	// Create a graph using 2-dimension adjancy matrix.
	public static final int numNode = 4;
	public static int[][] graph = new int[numNode][numNode];
	
	public static final int INFINITY = 1000;
	
	public static void main(String[] args) {
		/* Case #1:
		 * (numNode = 4)
		 * {0, 5, INF, 8}  //  This means that the unidirectional weight from node 0 to node 1/2/3 is 5/INF/8.
		 * {7, 0, 9, INF}
		 * {2, INF, 0, 4}
		 * {INF, INF, 3, 0}
		 */
		
		graph[0][0] = 0; graph[0][1] = 1; graph[0][2] = INFINITY; graph[0][3] = 8;
		graph[1][0] = 7; graph[1][1] = 0; graph[1][2] = 9; graph[1][3] = INFINITY;
		graph[2][0] = 2; graph[2][1] = INFINITY; graph[2][2] = 0; graph[2][3] = 4;
		graph[3][0] = INFINITY; graph[3][1] = INFINITY; graph[3][2] = 3; graph[3][3] = 0;
		
		
		/* Case #2:
		 * (numNode = 8)
		 * An example presented in our class.
		 */
		/*
		graph[0] = new int[] {0, 4, INFINITY, INFINITY, INFINITY, INFINITY, 7, 4};
		graph[1] = new int[] {INFINITY, 0, 9, INFINITY, INFINITY, 6, 8, 1};
		graph[2] = new int[] {INFINITY, INFINITY, 0, INFINITY, 10, INFINITY, INFINITY, INFINITY};
		graph[3] = new int[] {INFINITY, INFINITY, INFINITY, 0, INFINITY, INFINITY, INFINITY, INFINITY};
		graph[4] = new int[] {INFINITY, INFINITY, 8, 6, 0, 5, INFINITY, INFINITY};
		graph[5] = new int[] {INFINITY, INFINITY, INFINITY, INFINITY, 6, 0, INFINITY, INFINITY};
		graph[6] = new int[] {INFINITY, 4, INFINITY, INFINITY, INFINITY, 7, 0, INFINITY};
		graph[7] = new int[] {INFINITY, INFINITY, 3, INFINITY, INFINITY, INFINITY, INFINITY, 0};
		*/
		
		// Print the original graph.
		System.out.println("Original graph: ");
		printGraph();
		System.out.printf("  * %d is the value substituted for INFINITY.\n\n", INFINITY);
		
		// Run the algorithm.
		floyd_warshall();
		
		// Print the result.
		System.out.println("Floyd-Warshall reslut: ");
		printGraph();
		System.out.printf("  * An INFINITY value(%d) in this table means that the destination node cannot be reached through the path.\n", INFINITY);
	}
	
	public static void floyd_warshall() {
		for(int visit = 0; visit < numNode; visit++) {
			for (int start = 0; start < numNode; start++) {
				for (int finish = 0; finish < numNode; finish++) {
					if (graph[start][visit] + graph[visit][finish] < graph[start][finish])
						graph[start][finish] = graph[start][visit] + graph[visit][finish];
				}
			}
		}
	}
	
	public static void printGraph() {
		System.out.print("      ");
		for (int a = 0; a < numNode; a++)
			System.out.printf("%5d", a);
		System.out.printf("\n      ");
		for (int a = 0; a < numNode; a++)
			System.out.print("-----");
		System.out.println();
		for (int i = 0; i < numNode; i++) {
			System.out.printf("%5d|", i);
			for (int j = 0; j < numNode; j++) {
				System.out.printf("%5d", graph[i][j]);
			}
			System.out.println();
		}
	}

}
