package ch01;

import java.util.Arrays;

public class TeTe_first_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 2, 9, 8 };
		int maxindex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxindex] < arr[i]) {
				maxindex = i;
			}
		}
		int temp = arr[maxindex];
		arr[maxindex] = arr[0];
		arr[0] = temp;
		System.out.println(Arrays.toString(arr));
	}

}
