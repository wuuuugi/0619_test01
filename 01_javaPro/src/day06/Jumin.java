package day06;

import java.util.Scanner;

public class Jumin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		sc.close();
		if(jumin.length() !=14){
			System.out.println("�ٽ��Է�");
			return;
		}

		if ((jumin.subSequence(7, 8)).equals("1")
				|| jumin.subSequence(7, 8).equals("3")) {
			System.out.println("����");
		} else if ((jumin.subSequence(7, 8)).equals("2")
				|| jumin.subSequence(7, 8).equals("4")) {
			System.out.println("����");

		}
		

	}

}
