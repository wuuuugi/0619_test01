package day03;

import java.util.Scanner;

public class Test01 {
	int num1;
	int num2;
	double num3;

	double sum() {
		return num1 + num2 + num3;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Test01 test = new Test01();
		System.out.println("ù��° ���� �Է�");
		test.num1 = scan.nextInt();
		System.out.println("�ι�° ���� �Է�");
		test.num2 = scan.nextInt();
		System.out.println("������ �Ǽ� �Է�");
		test.num3 = scan.nextDouble();
		System.out.println(" ������  " + test.sum());
		scan.close();

	}
}
