package day02;

import java.util.Arrays;

public class Sample06 {

	public static void main(String[] args) {
		int arr[] = { 30, 20, 60, 0, 25, 20, 60, 0, 10, 30 };
		int[] uniqueArr = new int[arr.length];
		int uniqueIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < uniqueIndex; j++) {
				if (arr[i] == uniqueArr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueArr[uniqueIndex++] = arr[i];
			}
		}

		// 중복이 제거된 배열을 출력합니다.
		for (int i = 0; i < uniqueIndex; i++) {
			System.out.print(uniqueArr[i] + " ");
		}

		System.out.println(Arrays.toString(uniqueArr));
	}

}