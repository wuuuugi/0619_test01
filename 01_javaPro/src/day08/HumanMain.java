package day08;

import java.util.*;

public class HumanMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String,Human> map =
				new HashMap<String, Human>();
		Human hong=new Human("ȫ�浿",30,"����");
		map.put("ȫ�浿",hong); //���Ʒ� ���� ���� �ٸ���� 
		map.put("���缮", new Human("���缮",40,"��õ"));
		
		
//		hong = map.get("ȫ�浿");
//		hong.setJavaScore(s.nextInt());
//		map.put("ȫ�浿",hong);	
//		
//		String addr = map.get("ȫ�浿").getAddr();
//		System.out.println(addr);
		Set<String>keys =map.keySet();
		Iterator<String> it =keys.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
		
	}
}
