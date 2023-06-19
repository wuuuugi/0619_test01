package day03;

import java.util.Scanner;

public class Sample05 {

	public int mul2(int num1, int num2) {
		return num1 * num2;
	}

	public int mul2(int x, int y, int z) {
		return x * y * z;
	}

	public double max(double a, double b, double c, double d) {
		double x = Math.max(a, b);
		double y = Math.max(c, d);
		return Math.max(x, y);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		scan.close();
	}

}
