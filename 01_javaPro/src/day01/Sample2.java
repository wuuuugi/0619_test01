package day01;

import java.util.Scanner;
import java.util.Random;

public class Sample2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			System.out.println("문제수를 입력하세요");
			int num = s.nextInt();

			for (int i = 1; i <= num; i++) {
				System.out.println(i + " 번 문제");
				int a = r.nextInt(8) + 2; // 0 ~ 9
				int b = r.nextInt(9) + 1;
				System.out.println(a + " X " + b + " = ");
				int ag = s.nextInt();

				if (ag == a * b) {
					System.out.println("정답입니다");
				} else {
					System.out.println("오답입니다");
				}
			}
			System.out.println("계속하시겠습니까? 0누르면 종료");
			int end = s.nextInt();  
			if (end == 0) {
				break;
			}

		}s.close();

	}

}
