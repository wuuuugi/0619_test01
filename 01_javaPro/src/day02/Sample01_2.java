package day02;



public class Sample01_2 {
	public static void main(String[] args) {
		int arr[] = { 15, 22, 33, 50, 19, 2 };
		int sum1 = 0, sum2 = 0, c1 = 0, c2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum1 += arr[i];
				c1++;
			} else {
				sum2 += arr[i];
				c2++;
			}
		}
		System.out.println("Â¦¼öÆò±Õ:" + (double) sum1 / c1);
		System.out.println("È¦¼öÆò±Õ:" + (double) sum2 / c2);

	}

}
