package day09;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear(); // 현재 날짜와 시간 정보를 모두 지운다.
		firstDate.set(2016, 11, 25); // 2016년 12월 25일. 12월은 11로 설정
		firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시로 설정
		firstDate.set(Calendar.MINUTE, 30); // 30분으로 설정
		
	}
}
