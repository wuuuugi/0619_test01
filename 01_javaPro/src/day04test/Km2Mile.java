package day04test;

import java.util.Scanner;

public class Km2Mile {
	private double rate;
	Scanner s = new Scanner(System.in);

	public Km2Mile(double rate) {
		this.rate =rate;
	}

	void run() {
		System.out.println("km를 mile 로 바꿉니다");
		System.out.print("km를 입력하세요 >>");
		double km = s.nextDouble();
		double mile = km/rate;
		System.out.println("변환 결과 " + mile + "mile 입니다.");
	}

}
