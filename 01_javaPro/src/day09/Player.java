package day09;

import java.util.*;

public class Player {
	int Player(String name) {
		Scanner s = new Scanner(System.in);
		System.out.print(name + " ���� ������ ����");
		s.nextLine();
		Calendar now = Calendar.getInstance();
		int s1 = now.get(Calendar.SECOND);
		System.out.print("���� �� : " + s1);
		s.nextLine();
		Calendar now2 = Calendar.getInstance();
		int s2 = now2.get(Calendar.SECOND);
		System.out.println("������ �� : " + s2);
		int result1 = 0;
		if (s2 > s1) {
			result1 = s2 - s1;
		} else {
			result1 = (60 + s2) - s1;
		}
		System.out.println(name + " ����� : " + result1);
		return result1;
	}
}
