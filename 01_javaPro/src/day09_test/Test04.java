package day09_test;

import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("구구단  " + (i + 1) + " 번문제 ");
			int a = r.nextInt(8) + 2;
			int b = r.nextInt(9) + 1;
			System.out.println(a + " * " + b + " = ??");
			System.out.println("정답을 입력하세요");
			int ab = s.nextInt();
			if (ab == a * b) {
				System.out.println("정답입니다 ^^");
				cnt++;
			} else {
				System.out.println("오답입니다.ㅜㅜ");
			}

		}
		System.out.println("구구단이 종료 되었습니다.");
		System.out.println("총 " + cnt * 20 + " 점 입니다.");
		s.close();

	}

}
