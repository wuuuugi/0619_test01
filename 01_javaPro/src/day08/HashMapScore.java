package day08;

import java.util.*;

public class HashMapScore {
	public static void main(String[] args) {
		
		HashMap<String, Object> hong =
				new HashMap<String, Object>();
		 hong.put("name","ȫ�浿");
		 hong.put("age","30");
		 hong.put("addr","����");
		 hong.put("phone","010-1234-5678");
		 
		 HashMap<String, Object> yu =
					new HashMap<String, Object>();
			 yu.put("name","���缮");
			 yu.put("age","40");
			 yu.put("addr","��õ");
			 yu.put("phone","010-5678-9101");

		ArrayList<HashMap<String, Object>> list 
			= new ArrayList<HashMap<String, Object>>();

		list.add(hong);
		list.add(yu);
		
		for (int i=0;i<list.size();i++){
			System.out.print("�̸� : "+list.get(i).get("name"));
			System.out.print(", ���� : "+list.get(i).get("age"));
			System.out.println();
		}
		

	}

}
