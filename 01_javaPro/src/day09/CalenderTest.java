package day09;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear(); // ���� ��¥�� �ð� ������ ��� �����.
		firstDate.set(2016, 11, 25); // 2016�� 12�� 25��. 12���� 11�� ����
		firstDate.set(Calendar.HOUR_OF_DAY, 20); // ���� 8�÷� ����
		firstDate.set(Calendar.MINUTE, 30); // 30������ ����
		
	}
}
