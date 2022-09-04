package assignment04_03_MergeSort;

public class Main {
	public static int[] source;
	public static int[] temp;
	
	public static void main(String[] args) {
		source = new int[] {10, 9, 20, 5, 35, 8, 7, 4, 29, 1, 13};
		temp = new int[source.length];
		
		System.out.print("Original array: ");
		printResult();
		
		// Run the algorithm.
		mergeSort(0, source.length - 1);
		
		System.out.print("Sorted array: ");
		printResult();
	}
	
	public static void mergeSort(int start, int finish) {
		if (start < finish) {
			int middle = (start + finish) / 2;
			
			mergeSort(start, middle);
			mergeSort(middle + 1, finish);
			
			// Sub array
			int s1 = start;
			int s2 = middle + 1;
			int index = s1;
			
			while (s1 <= middle || s2 <= finish) {
				// elements in the latter를 이미 다 가져온 경우
				// or the former에서 가져오지 않은 원소가 있으며 the former의 first element가 the latter의 first element보다 작은 경우
				if (s2 > finish || (s1 <= middle && source[s1] < source[s2]))
					temp[index++] = source[s1++];
				else
					temp[index++] = source[s2++];
			}
			for (int i = start; i <= finish; i++)
				source[i] = temp[i];
		}
	}
	
	public static void printResult() {
		for (int i = 0; i < source.length; i++)
			System.out.print(source[i] + " ");
		System.out.println();
	}
}
