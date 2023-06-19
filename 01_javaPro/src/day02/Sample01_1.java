package day02;

import java.util.Arrays;
import java.util.Scanner;

public class Sample01_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int num = s.nextInt();
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				arr[i] = -arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		s.close();
	}

}
