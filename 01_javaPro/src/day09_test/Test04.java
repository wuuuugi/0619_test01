package day09_test;

import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("������  " + (i + 1) + " ������ ");
			int a = r.nextInt(8) + 2;
			int b = r.nextInt(9) + 1;
			System.out.println(a + " * " + b + " = ??");
			System.out.println("������ �Է��ϼ���");
			int ab = s.nextInt();
			if (ab == a * b) {
				System.out.println("�����Դϴ� ^^");
				cnt++;
			} else {
				System.out.println("�����Դϴ�.�̤�");
			}

		}
		System.out.println("�������� ���� �Ǿ����ϴ�.");
		System.out.println("�� " + cnt * 20 + " �� �Դϴ�.");
		s.close();

	}

}
