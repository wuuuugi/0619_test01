package day01;

import java.util.Scanner;
import java.util.Random;

public class Sample2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			System.out.println("�������� �Է��ϼ���");
			int num = s.nextInt();

			for (int i = 1; i <= num; i++) {
				System.out.println(i + " �� ����");
				int a = r.nextInt(8) + 2; // 0 ~ 9
				int b = r.nextInt(9) + 1;
				System.out.println(a + " X " + b + " = ");
				int ag = s.nextInt();

				if (ag == a * b) {
					System.out.println("�����Դϴ�");
				} else {
					System.out.println("�����Դϴ�");
				}
			}
			System.out.println("����Ͻðڽ��ϱ�? 0������ ����");
			int end = s.nextInt();  
			if (end == 0) {
				break;
			}

		}s.close();

	}

}
