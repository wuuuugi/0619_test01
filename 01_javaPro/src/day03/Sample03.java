package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Sample03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < 5; i++) {
			int num = s.nextInt();
			if (num % 2 == 1) {
				arr[i] = num;
			} else {
				System.out.println("Ȧ���� �ƴմϴ� ���Է� �ϼ���");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		s.close();
	}

}
