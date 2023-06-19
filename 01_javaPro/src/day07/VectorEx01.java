package day07;

import java.util.ArrayList;

import java.util.Scanner;

public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("문자 입력");
			a.add(sc.next());
		}
		// for (int i = 0; i < a.size(); i++) {
		// System.out.println(a.get(i) + "  ");
		// }
		int list = 0;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(list).length() < a.get(i).length()) {
				list = i;
			}
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.get(list).length() == a.get(i).length()) {
				System.out.println(a.get(i));
			}
		}

		sc.close();

	}

}
