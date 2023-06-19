package day09;
import java.util.*;
public class CalendarPrac {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hour=now.get(Calendar.HOUR_OF_DAY);
		
		if(hour>=4&&hour<12){
			System.out.println("good Morning");
		}else if (hour<18){
			System.out.println("good Afternoon");
		}else if(hour<22){
			System.out.println("good Evening");
		}else {
			System.out.println("good Night");
		}
	}

}
