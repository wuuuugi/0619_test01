package day08;

import java.util.*;

public class PersonMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Person> map = new HashMap<String, Person>();
		while (true) {
			System.out.print("(1)�Է�, (2)����, (3)���, (4)���� : ");
			int num = s.nextInt();
			if (num == 1) {
				System.out.println("�̸��Է�");
				String name = s.next();
				System.out.println("�����Է�");
				int age = s.nextInt();
				System.out.println("�ּ��Է�");
				String addr = s.next();
				Person p = new Person(name, age, addr);
				map.put(name, p);

			} else if (num == 2) {
				System.out.println("������ �̸� �Է�");
				String name = s.next();
				if (map.containsKey(name)) {
					map.remove(name);
				}
			} else if (num == 3) {
				Set<String> Keys = map.keySet();
				Iterator<String> it = Keys.iterator();

				while (it.hasNext()) {
					Person p = map.get(it.next());
					System.out.print("�̸�: " + p.getName());
					System.out.print(" ����: " + p.getAge());
					System.out.println(" �ּ�: " + p.getAddr());
				}

			} else {
				System.out.println("���� �Ǿ����ϴ�.");
				break;
			}
		}

	}

}
