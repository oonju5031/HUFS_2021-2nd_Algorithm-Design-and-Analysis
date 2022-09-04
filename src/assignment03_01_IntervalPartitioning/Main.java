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
		// 강의실의 배열을 만들어 각 강의실에 할당된 시간을 기록한다. float[][] classroom = new float[임의의 강의실 수][];
		// 한 과목의 시간이 현재 생성된 모든 강의실의 시간과 '겹친다면' 새 강의실을 할당하고, -> How?
		// 겹치지 않는다면 강의실 중 하나에 해당 과목을 할당한다.
		for (int i = 0; i < nLecture; i++) {
			
		}
	}

}
