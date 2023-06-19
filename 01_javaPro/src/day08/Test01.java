package day08;

import java.util.*;

public class Test01 {
	static int score(Scanner s, String kind,int limit) {
		System.out.println(kind + " ������ �Է����ּ���.");
		int num;
		while (true) {
			num = s.nextInt();
			if (num > limit || num < 0) {
				System.out.print("0~"+limit+" ���� �� �Է�");
			} else {
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("(1)�Է�, (2)����, (3)���, (4)���� : ");
			int num = s.nextInt();
			if (num == 1) {
				HashMap<String, Object> map =
						new HashMap<String, Object>();
				System.out.print("�̸��� �Է��ϼ��� ");
				map.put("name", s.next());
				System.out.print("���̸� �Է��ϼ��� ");
				map.put("age", s.next());
				map.put("java", score(s, "�ڹ�",100));
				map.put("oracle", score(s, "����Ŭ",100));
				map.put("html", score(s, "html",50));
				map.put("javascript", score(s, "javascript",80));
				list.add(map);
			} else if (num == 2) {
				System.out.println("������ ����� �̸� �Է� : ");
				String name = s.next();
				System.out.println("������ ����� ���� �Է� : ");
				int age = s.nextInt();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)
							&& (int) map.get("age") == age) {
						list.remove(i);
					}
				}
			} else if (num == 3) {
				for (int i = 0; i < list.size(); i++) {
					System.out.print("�̸� : " + list.get(i).get("name"));
					System.out.print(" ���� : " + list.get(i).get("age"));
					System.out.print(" �ڹ����� : " + list.get(i).get("java"));
					System.out.println(" ����Ŭ���� : " + list.get(i).get("oracle"));
				}

			} else {
				System.out.println("���� �Ǿ����ϴ�.");
				break;

			}

		}

	}

}
