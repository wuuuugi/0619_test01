package day02;

// 0�� �Է� �Ǳ� ������ �Էµ� ���ڵ� ���ϱ� (���� �Է½� �ٽ� �Է�)
import java.util.Scanner;

public class Sample02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("���ڸ� �Է��Ͻÿ� 0������ ���� , �����̸� �ٽ�");
			int a = s.nextInt();
			if (a > 0) {
				sum += a;
			} else if (a == 0) {
				System.out.println("����");
				System.out.println(sum);
				break;
			} else if (a < 0) {
				System.out.println("���Է�");
			}
		}
	}
}
