package day03;

import java.util.Arrays;

public class Sample04 {
	public static void main(String[] args) {
		int arr[] = { 5, 3, 10, 2, 9, 8 }; // in rear[] = new int[arr.length];
		int ch = 0;
		// rear[index++] = arr[i]
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] % 2 == 0) {
					ch = arr[i];
					arr[i] = arr[j];
					arr[j] = ch;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		Arrays.sort(arr, 0, 3);
		Arrays.sort(arr, 3, 6);
		System.out.println(Arrays.toString(arr));

	}

}
