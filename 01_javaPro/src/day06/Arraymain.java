package day06;

import java.util.Arrays;

public class Arraymain implements ArrayInterface {

	@Override
	public int MaxSubMin(int[] a) {
		int max = 0;
		int min = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[max] < a[i]) {
				max = i;
			}
			if (a[min] > a[i]) {
				min = i;
			}
		}
		return a[max] - a[min];
	}

	@Override
	public void MaxChange(int[] a) {
		int MaxIndex = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[MaxIndex] < a[i]) {
				MaxIndex = i;
			}

		}
		int temp = a[MaxIndex];
		a[MaxIndex] = a[a.length - 1];
		a[a.length - 1] = temp;
		System.out.println(Arrays.toString(a));

	}

}
