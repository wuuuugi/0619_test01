package day09;

import java.util.*;

public class Player {
	int Player(String name) {
		Scanner s = new Scanner(System.in);
		System.out.print(name + " 엔터 누르면 시작");
		s.nextLine();
		Calendar now = Calendar.getInstance();
		int s1 = now.get(Calendar.SECOND);
		System.out.print("현재 초 : " + s1);
		s.nextLine();
		Calendar now2 = Calendar.getInstance();
		int s2 = now2.get(Calendar.SECOND);
		System.out.println("마지막 초 : " + s2);
		int result1 = 0;
		if (s2 > s1) {
			result1 = s2 - s1;
		} else {
			result1 = (60 + s2) - s1;
		}
		System.out.println(name + " 결과는 : " + result1);
		return result1;
	}
}
