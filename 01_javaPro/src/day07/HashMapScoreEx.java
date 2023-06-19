package day07;

import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap =
				new HashMap<String, Integer>();

		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("이름을 입력하세요 : ");
			String name = sc.nextLine();
			if(name.equals("exit")){
				System.out.println("종료");
				break;
			}
			if(!scoreMap.containsKey(name)){
				System.out.println("그런사람 없음");
			}else {
				System.out.println(scoreMap.get(name));
			}
			
		}
		sc.close();

	}

}
