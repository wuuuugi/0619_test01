package day09_test;

import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list =
				new ArrayList<HashMap<String, Object>>();
		while (true) {
			System.out.print("(1)�Է�, (2)����, (3)���, (4)���� : ");
			int num = s.nextInt();
			if (num == 1) {
				HashMap<String, Object> map = 
						new HashMap<String, Object>();
				System.out.println("�̸��Է�");
				map.put("name", s.next());
				System.out.println("�ڹ�����");
				map.put("java", s.nextInt());
				System.out.println("����Ŭ����");
				map.put("oracle", s.nextInt());
				System.out.println("html����");
				map.put("html", s.nextInt());
				list.add(map);
			} else if (num == 2) {
				System.out.println("������ �̸� �Է�");
				String name = s.next();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)) {
						list.remove(i);
						System.out.println("�����Ϸ�");
					} else {
						System.out.println("ã���� ���� �̸��Դϴ�");
					}
				}
			} else if (num == 3) {
				for (int i = 0; i < list.size(); i++) {
					System.out.print("�̸� : " + list.get(i).get("name"));
					int java = (int) list.get(i).get("java");
					int oracle = (int) list.get(i).get("oracle");
					int html = (int) list.get(i).get("html");
					int sum = java + oracle + html;
					System.out.println(" ���� : " + sum);
				}
			}  else {
				System.out.println("����");
				break;
			}

		}
		s.close();

	}

}
