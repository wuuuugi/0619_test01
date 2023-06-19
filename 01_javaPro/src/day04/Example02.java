package day04;

import java.util.Scanner;

public class Example02 {
	private double avg;
	private int math;
	private int science;
	private int english;

	public Example02(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public double average() {
		avg = (math + science + english) / 3;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Example02 me = new Example02(math, science, english);
		System.out.println("평균은 " + me.average()); // average()는 평균을 계산하여 리턴
		sc.close();
	}

}
