package day08;

import java.util.*;

public class HashMapEx01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list =
				new ArrayList<HashMap<String, Object>>();
		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.println((i + 1) + "��° ����� ���� �Է�");
			System.out.print("�̸� : ");
			map.put("name", s.next());
			System.out.print("���� : ");
			map.put("age", s.nextInt());
			System.out.print("���� : ");
			map.put("gender", s.next());
			System.out.print("�ּ� : ");
			map.put("addr", s.next());
			list.add(map);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print("�̸� : " + list.get(i).get("name"));
			System.out.print(" ���� : " + list.get(i).get("age"));
			System.out.print(" ���� : " + list.get(i).get("gender"));
			System.out.println(" �ּ� : " + list.get(i).get("addr"));
		}
		s.close();

	}

}
