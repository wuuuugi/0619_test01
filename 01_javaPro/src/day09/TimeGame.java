package day09;

import java.util.*;

public class TimeGame {
	public static void main(String[] args) {
		Player p = new Player();
		int r1 = p.Player("hong");
		int r2 = p.Player("kim");
		r1 = Math.abs(10 - r1);
		r2 = Math.abs(10 - r2);
		if (r1 < r2) {
			System.out.println("1P�� �̰���ϴ�");
		} else if (r1 == r2) {
			System.out.println("�����ϴ�");
		} else {
			System.out.println("2P�� �̰���ϴ�");
		}

	}
}
