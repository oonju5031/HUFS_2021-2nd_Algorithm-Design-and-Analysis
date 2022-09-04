package assignment04_01_WeightedIntervalScheduling;

/**
 * @author JunYoung Lee
 * I used an example presented in our class.
 */
public class Main {
	public static int NUM_INTERVAL = 8;
	
	private static int[][]interval = new int[NUM_INTERVAL + 1][3];
	// interval[i] = {startTime, finishTime, weight}
	// 이 때 가상의 interval I[0]을 포함해 NUM_INTERVAL + 1개의 interval이 만들어진다.
	private static int[] numPrevious = new int[NUM_INTERVAL + 1];
	// numPrevious[i]는 I[i]의 predecessors 개수
	
	public static void main(String[] args) {
		// Input intervals
		interval[0] = new int[] {0, 0, 0};  // Imaginary interval I[0]
		interval[1] = new int[] {1, 5, 1};
		interval[2] = new int[] {2, 9, 2};
		interval[3] = new int[] {8, 11, 3};
		interval[4] = new int[] {10, 13, 4};
		interval[5] = new int[] {14, 15, 5};
		interval[6] = new int[] {12, 16, 6};
		interval[7] = new int[] {6, 17, 7};
		interval[8] = new int[] {7, 18, 8};
		
		// Get the number of predecessors
		numPrevious[0] = 0;  // Imaginary interval I[0]
		
		for (int i = 1; i < NUM_INTERVAL; i++) {
			// 해당 interval의 start time을 모든 interval의 finish time과 비교한다. s가 더 크면 num에 +1.
			int count = 0;
			for (int j = 1; j < NUM_INTERVAL; j++) {
				if (interval[i][0] > interval[j][1])
					count += 1;
			}
			numPrevious[i] = count;
			
			// debug
			System.out.printf("The number of predecessors I[%d]: %d\n", i, count);
		}
		
		// Run the algorithm.
		int result = weightedInterval(NUM_INTERVAL);
		System.out.println(result);
	}
	
	// Weighted interval scheduling algorithm
	public static int weightedInterval(int i) {
		if (i == 0)
			return 0;
		else {
			int t1 = interval[i][2] + weightedInterval(numPrevious[i]);// (i의 weight) + (p[i]의 weightedInterval값)
			int t2 = weightedInterval(i - 1);
			// debug
			System.out.printf("\nT[%d]: \n", i);
			System.out.printf("t1 = %d + %d\n", interval[i][2], weightedInterval(numPrevious[i]));
			System.out.printf("t2 = %d\n",t2);
			return Math.max(t1, t2);
		}
	}
}
