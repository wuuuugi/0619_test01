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
		System.out.println("첫번째 정수 입력");
		test.num1 = scan.nextInt();
		System.out.println("두번째 정수 입력");
		test.num2 = scan.nextInt();
		System.out.println("세번재 실수 입력");
		test.num3 = scan.nextDouble();
		System.out.println(" 총합은  " + test.sum());
		scan.close();

	}
}
