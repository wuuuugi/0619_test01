package day01;


public class Sample5_1 {
	public static void main(String[] args) {
		int arr[] = { 4, -3, 5, -2, 1, -9, 7, -8 };
		int min = arr[0];		
		
		if (arr[0] > 0) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > 0 && min > arr[i]) {
					min = arr[i];
				}
			}
			System.out.println(min);
		}

	}
}
