package day08;

import java.util.*;

public class HumanMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String,Human> map =
				new HashMap<String, Human>();
		Human hong=new Human("홍길동",30,"서울");
		map.put("홍길동",hong); //위아래 같은 선언 다른방법 
		map.put("유재석", new Human("유재석",40,"인천"));
		
		
//		hong = map.get("홍길동");
//		hong.setJavaScore(s.nextInt());
//		map.put("홍길동",hong);	
//		
//		String addr = map.get("홍길동").getAddr();
//		System.out.println(addr);
		Set<String>keys =map.keySet();
		Iterator<String> it =keys.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
		
	}
}
