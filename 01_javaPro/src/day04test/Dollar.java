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
		System.out.println("���� �޷��� �ٲߴϴ�.");
		System.out.println("���� �Է��ϼ���.");
		int won = s.nextInt();
		dollar = won/rate;
		System.out.println("��ȯ ���: "+dollar+"�޷� �Դϴ�.");
		
		
	}

}
