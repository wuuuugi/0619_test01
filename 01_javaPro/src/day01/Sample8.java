package day01;

import java.util.Arrays;

public class Sample8 {
	public static void main(String[] args) {
		int arr[] = { 7, 6, 9, 3, 5 };
		int min = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
				}

			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
