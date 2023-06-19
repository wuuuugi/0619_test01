package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class VectorEx02 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 ");
			a.add(sc.nextInt());
		}
		int minindex = a.get(0);
		int cnt =1 ;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(minindex) > a.get(i)) {
				minindex = i;
				cnt=1;
			}else if (a.get(minindex)==a.get(i)){
				cnt++;
			}

		}
//		int cnt = 0;
//		for (int i = 0; i < a.size(); i++) {
//			if (a.get(minindex) == a.get(i)) {
//				cnt++;
//			}
//		}
		System.out.println("가장작은수 : " + a.get(minindex) + ", 개수: " + cnt);

	}

}
