package day04test;

import java.util.Scanner;

public class Dollar {
	private double dollar;
	private int rate;
	Scanner s = new Scanner(System.in);
	
	Dollar(int rate){
		this.rate=rate;
	}
	void run(){
		System.out.println("원을 달러로 바꿉니다.");
		System.out.println("원을 입력하세요.");
		int won = s.nextInt();
		dollar = won/rate;
		System.out.println("변환 결과: "+dollar+"달러 입니다.");
		
		
	}

}
