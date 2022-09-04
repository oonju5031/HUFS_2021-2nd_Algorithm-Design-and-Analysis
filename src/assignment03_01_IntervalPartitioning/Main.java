package assignment03_01_IntervalPartitioning;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int d = 0; // The number of classrooms
		
		Scanner scanNumLecture = new Scanner(System.in);
		System.out.print("The number of lectures: ");
		int nLecture = scanNumLecture.nextInt();
		float[][] lecture = new float[nLecture][];
		scanNumLecture.close();
		
		System.out.println("Enter the lectures in order of starting time.");
		System.out.println("Enter each lecture in the order START_TIME END_TIME");
		System.out.println("For example: 9.5 10.5 means a lecture from 9:30AM to 10:30AM");
		
		Scanner scanLectureTime = new Scanner(System.in);
		for (int i = 0; i < nLecture; i++) {
			lecture[i][1] = scanLectureTime.nextFloat();  // Get start time
			lecture[i][2] = scanLectureTime.nextFloat();  // Get end time
		}
		scanLectureTime.close();
		
		// Interval Partitioning Algorithm
		// ���ǽ��� �迭�� ����� �� ���ǽǿ� �Ҵ�� �ð��� ����Ѵ�. float[][] classroom = new float[������ ���ǽ� ��][];
		// �� ������ �ð��� ���� ������ ��� ���ǽ��� �ð��� '��ģ�ٸ�' �� ���ǽ��� �Ҵ��ϰ�, -> How?
		// ��ġ�� �ʴ´ٸ� ���ǽ� �� �ϳ��� �ش� ������ �Ҵ��Ѵ�.
		for (int i = 0; i < nLecture; i++) {
			
		}
	}

}
