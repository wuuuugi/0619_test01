package day04test;

import java.util.Scanner;

public class Km2Mile {
	private double rate;
	Scanner s = new Scanner(System.in);

	public Km2Mile(double rate) {
		this.rate =rate;
	}

	void run() {
		System.out.println("km�� mile �� �ٲߴϴ�");
		System.out.print("km�� �Է��ϼ��� >>");
		double km = s.nextDouble();
		double mile = km/rate;
		System.out.println("��ȯ ��� " + mile + "mile �Դϴ�.");
	}

}
