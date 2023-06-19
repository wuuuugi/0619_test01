package day06;

import java.util.Scanner;

public class Jumin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		sc.close();
		if(jumin.length() !=14){
			System.out.println("다시입력");
			return;
		}

		if ((jumin.subSequence(7, 8)).equals("1")
				|| jumin.subSequence(7, 8).equals("3")) {
			System.out.println("남자");
		} else if ((jumin.subSequence(7, 8)).equals("2")
				|| jumin.subSequence(7, 8).equals("4")) {
			System.out.println("여자");

		}
		

	}

}
