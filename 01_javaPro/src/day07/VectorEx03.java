package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class VectorEx03 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요");
			a.add(sc.nextInt());
		}
		int max = 0;
		int min = 0;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(max) < a.get(i)) {
				max = i;
			}
			if (a.get(min) > a.get(i)) {
				min = i;
			}
		}
		int temp =a.get(max);
		a.add(max,a.get(min));
		a.remove(max+1);
		a.add(min,temp);
		a.remove(min+1);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i));
		}

	}
}
